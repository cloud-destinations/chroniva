package StepDefinitions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelpMethods {
	static Wait<WebDriver> webDriverCommonWait;

	public static void explicitWait_milliSeconds(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void initiateCommonExplicitWait() {
		webDriverCommonWait = new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(5))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
	}

	public static void waitForElementToBeClickable(WebElement element) {
		webDriverCommonWait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void clickElement(WebElement element) {
		// Simply call the click method on the passed WebElement
		element.click();
	}

	public static boolean isElementPresent(WebElement element) {
		boolean status = true;

		for (int i = 0; i < 3; i++) {
			try {
				explicitWait_milliSeconds(500);
				status = element.isDisplayed();
				break;
			} catch (Exception e) {
				status = false;
				break;
			}

		}
		return status;
	}

	public static void jsClick(WebElement pageElement, WebDriver driver) {
		explicitWait_milliSeconds(500);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", pageElement);
	}

	public static void jsSendKeys(WebElement pageElement, String value, WebDriver driver) {
		if (value == null) {
			return;
		}
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		explicitWait_milliSeconds(1000);
		executor.executeScript("arguments[0].value='" + value + "';", pageElement);
	}

	public static int randomWithRange(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}

	public static String generateRandomString() {
		String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String name = "Test" + alphabets.charAt(randomWithRange(2, 2)) + alphabets.charAt(randomWithRange(11, 11))
				+ alphabets.charAt(randomWithRange(14, 14)) + alphabets.charAt(randomWithRange(20, 20))
				+ alphabets.charAt(randomWithRange(3, 3));
		return name;
	}

	public static WebElement getWebElement(String locator, WebDriver driver) {
		WebElement element = null;
		boolean staleness = true;
		int i = 0;

		do {
			try {
				i++;
				element = driver.findElement(By.xpath(locator));
				staleness = false;
			} catch (StaleElementReferenceException e) {
				staleness = true;
			} catch (NoSuchElementException ex) {
				break;
			}
		} while (staleness && i < 5);
		return element;
	}

	public static <T> T initElements(WebDriver driver, Class<T> pageClass) {
		try {
			T page = pageClass.getDeclaredConstructor().newInstance();
			PageFactory.initElements(driver, page);
			return page;
		} catch (Exception e) {
			throw new RuntimeException("Failed to initialize page elements: " + pageClass.getName(), e);
		}
	}

}
