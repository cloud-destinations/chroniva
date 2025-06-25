package StepDefinitions;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import utils.AppSettings;

public class Hooks {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return driver.get();
	}

	protected static ExtentReports extent;
	private static boolean isInitialized = false;

	// downloading the application before launching
	// @BeforeAll()
	public static void before_or_after_all() throws IOException {
		if (!isInitialized) {
			isInitialized = true;

			String downloadPath = AppSettings.DOWNLOADS + AppSettings.APP_FOLDER + ".zip";
			String extractPath = AppSettings.DOWNLOADS + AppSettings.APP_FOLDER;
			// downloading the latest version
			AppSettings.setAppDownloadPath();
			String fileURL = AppSettings.APP_DOWNLOAD_PATH;
			System.out.println("download url:" + fileURL);
			String saveDir = AppSettings.DOWNLOADS;

			// deleting previous downloaded files
			File file2 = new File(extractPath);
			if (file2.exists()) {
				System.out.println("Deleting existing file: " + extractPath);
				FileUtils.forceDelete(file2);
			}
			File file = new File(downloadPath);
			if (file.exists()) {
				System.out.println("Deleting existing file: " + downloadPath);
				file.delete();
			}

			try {
				downloadFile(fileURL, saveDir);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			// unzipping the downloaded app
			unzip(downloadPath, extractPath);
		}

	}

	@Before()
	public void launchingApplication() throws Exception {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		options.setBinary(AppSettings.APP_PATH);
		options.addArguments("--remote-allow-origins=*");

		driver.set(new ChromeDriver(options));

		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		getDriver().manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		if (Hooks.getDriver() == null) {
			// Initialization logic
			System.out.println("WebDriver initialized successfully.");
		}
	}

	@After()
	public void teardown(Scenario scenario) {

		if (scenario.isFailed()) {
			byte[] screenshotBytes = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotBytes, "image/png", "Failed Screenshot");
		}

		System.out.println("I am inside teardown");
		if (getDriver() != null) {
			getDriver().quit();
			driver.remove();
		}
	}

	// unzipping the downloaded the files
	public static void unzip(String source, String destination) {
		try {
			ZipFile zipFile = new ZipFile(source);
			zipFile.extractAll(destination);
		} catch (ZipException e) {
			e.printStackTrace();
		}
	}

	public static void downloadFile(String fileURL, String saveDir) throws IOException {
		System.out.println("downloading....");

		URL url = new URL(fileURL);
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		int responseCode = httpConn.getResponseCode();

		// Check HTTP response code
		if (responseCode == HttpURLConnection.HTTP_OK) {
			String fileName = "";

			// Extract file name from headers
			String disposition = httpConn.getHeaderField("Content-Disposition");
			if (disposition != null && disposition.contains("filename=")) {
				int index = disposition.indexOf("filename=");
				fileName = disposition.substring(index + 9).replace("\"", "");
			} else {
				// Extract from URL
				fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1);
			}

			// Open input stream from the HTTP connection
			BufferedInputStream inputStream = new BufferedInputStream(httpConn.getInputStream());
			String saveFilePath = saveDir + File.separator + fileName;

			// Open output stream to save file
			FileOutputStream outputStream = new FileOutputStream(saveFilePath);

			byte[] buffer = new byte[4096];
			int bytesRead = -1;

			// Read from input and write to output
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}

			outputStream.close();
			inputStream.close();

			System.out.println("File downloaded: " + saveFilePath);
		} else {
			System.out.println("No file to download. Server replied HTTP code: " + responseCode);
		}
		httpConn.disconnect();
	}
}
