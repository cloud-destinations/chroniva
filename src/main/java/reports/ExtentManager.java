package reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports createInstance() throws IOException {
		ExtentSparkReporter spark = new ExtentSparkReporter("target/test-output/SparkReport/SparkReport.html");

		// Force Spark to use local files
		// spark.config().setResourceCDN(com.aventstack.extentreports.reporter.configuration.ResourceCDN.EMBEDDED);

		extent = new ExtentReports();
		extent.attachReporter(spark);

		// Copy your custom logo to overwrite the default one
		try {
			File customLogo = new File("src/test/resources/cdlogo.png");
			File defaultLogo = new File("target/test-output/SparkReport/extent-html-resources/commons/img/logo.png");
			FileUtils.copyFile(customLogo, defaultLogo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return extent; // <-- This was missing
	}
}
