package pages.config;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefinitions.HelpMethods;
import StepDefinitions.Hooks;

public class UnitSettingsPage {

	WebDriver driver;
	@FindBy(css = ".topic-title")
	WebElement pageTitle;

	@FindBy(xpath = "//div[text()='Unit Settings']")
	WebElement unitSettingsButton;

	@FindBy(xpath = "//div[text()='App Type']")
	WebElement appTypeButton;

	@FindBy(css = ".label-container>div")
	private List<WebElement> pageLables;

	@FindBy(css = "input+label")
	private List<WebElement> pageFieldLables;

	@FindBy(css = "div.label-description-text")
	WebElement appTypeDesciption;

	@FindBy(css = "input[name='Space Control'][type='radio']")
	WebElement spaceControlRadioButton;

	@FindBy(css = "input[name='Standard (Default)'][type='radio']")
	WebElement standardRadioButton;

	@FindBy(css = "input[name='Precision'][type='radio']")
	WebElement precisionRadioButton;

	@FindBy(css = "input[name='VAV Control'][type='radio']")
	WebElement vavControlRadioButton;

	@FindBy(css = "input[name='Outdoor Air Control'][type='radio']")
	WebElement outdoorAirControlRadioButton;

	@FindBy(css = "input[name='Return Air Control'][type='radio']")
	WebElement returnAirControlRadioButton;

	@FindBy(css = "input[name='3rd Party Interface'][type='radio']")
	WebElement thirdPartyInterfaceRadioButton;

	@FindBy(css = ".back-arrow")
	WebElement backArrowButton;

	@FindBy(css = "span.nav-panel")
	WebElement navigationPath;

	@FindBy(css = "img[alt='next page']")
	public static WebElement nextPageButton;

	@FindBy(xpath = "//button[@class='pagination-btn'][2]")
	public static WebElement nextPageLabel;

	@FindBy(css = ".temperature-label")
	WebElement temperatureLabel;

	@FindBy(css = ".temperature-value")
	WebElement temperatureValue;

	@FindBy(css = ".serviceItem-card>.labelDescription")
	private List<WebElement> serviceItemLabels;

	@FindBy(css = ".tempsera>.backdrop input.numbercontainer")
	WebElement numberContainerInput;

	@FindBy(css = "img[alt='Decrease temperature']")
	WebElement decreaseTempButton;

	@FindBy(css = "img[alt='Increase temperature']")
	WebElement increaseTempButton;

	@FindBy(css = ".serviceItem-card>.contentValue.active ")
	WebElement activeCardValue;

	@FindBy(css = ".serviceItem-card>.labelDescription.active ")
	WebElement activeCardLabel;

	@FindBy(xpath = "(//span[text() = 'Done'])[last()]")
	WebElement doneButton;

	@FindBy(css = "button.pagination-btn:last-of-type")
	WebElement nextPageButton_Pagination;

	@FindBy(xpath = "//button[text() = 'Save']")
	WebElement saveButton;

	@FindBy(xpath = "//button[text() = 'Yes']")
	WebElement yesButton;

	@FindBy(xpath = "//button[text() = 'Filter Replaced']")
	WebElement filterReplacedButton;

	@FindBy(xpath = "//button[text() = 'Factory Reset']")
	WebElement factoryResetButton;

	@FindBy(xpath = "//div[text() = 'Min Eco Pos.']/following-sibling::div")
	WebElement minEcoPosDescreption;

	@FindBy(css = ".remaining-lifetime-label")
	WebElement remaining_lifetime_label;

	@FindBy(css = ".remaining-lifetime-value")
	WebElement remaining_lifetime_value;

	@FindBy(xpath = "(//div[@role='alert']/div[2])[last()]")
	WebElement alertBoxText;

	@FindBy(xpath = "//div[text()='Control']")
	WebElement ControlLabel;

	@FindBy(xpath = "//div[text()='Fan Control']")
	WebElement FanControl;

	@FindBy(xpath = "(//div[text()='Bldg Pr Setpoint'])[2]")
	WebElement PrSetpoint;

	public UnitSettingsPage() {
		driver = Hooks.getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	public void clickWebElementByText(String name) {
		String xpath = "//div[normalize-space(text())='" + name + "']";
		HelpMethods.jsClick(HelpMethods.getWebElement(xpath, driver), driver);
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public String actTempValue;

	public void enterTemperatureValueAndValidate(int min, int max) {
		int randomNum = new Random().nextInt((max - min) + 1) + min;
		temperatureValue.click();
		HelpMethods.explicitWait_milliSeconds(500);
		numberContainerInput.clear();
		numberContainerInput.sendKeys(String.valueOf(randomNum));
		HelpMethods.explicitWait_milliSeconds(500);
		doneButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		increaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		increaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		decreaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		saveButton.click();
		HelpMethods.explicitWait_milliSeconds(600);
		assertEquals(temperatureValue.getText(), activeCardValue.getText(),
				"Active card value and Temperature value not matched");
		assertEquals(activeCardValue.getText().substring(0, 2).trim(), String.valueOf(randomNum + 1),
				"Active card Temperature value not matched");
		actTempValue = String.valueOf(randomNum + 1);
	}

//	 float min = -20f;
//     float max = 20f;
//     float raw2 = (float) ThreadLocalRandom.current().nextDouble(min, max);
//     float temp2 = Math.round(raw2 * 10f) / 10f;
//     
//     public void enterTemperatureValueWithDecimals() {
// 		temperatureValue.click();
// 		HelpMethods.explicitWait_milliSeconds(500);
// 		numberContainerInput.clear();
// 		numberContainerInput.sendKeys(String.format("%.1f", temp2));
// 		HelpMethods.explicitWait_milliSeconds(500);
// 		doneButton.click();
// 		HelpMethods.explicitWait_milliSeconds(1000);
// 		increaseTempButton.click();
// 		HelpMethods.explicitWait_milliSeconds(500);
// 		increaseTempButton.click();
// 		HelpMethods.explicitWait_milliSeconds(500);
// 		decreaseTempButton.click();
// 		HelpMethods.explicitWait_milliSeconds(500);
// 		saveButton.click();
// 		HelpMethods.explicitWait_milliSeconds(1000);
// 	}

// 	public void validateTemperatureValueWithDecimals() {
// 		assertEquals(temperatureValue.getText(), activeCardValue.getText(), "Active card value and Temperature value not matched");
// 		assertEquals(activeCardValue.getText().substring(0, activeCardValue.getText().length() - 3), String.format("%.1f", temp2+0.1), "Active card Temperature value not matched");
// 	}
// 	
	private static ThreadLocal<Float> tempValue1 = new ThreadLocal<>();

	public void enterTemperatureValueOncePerLabel(double[] minValues, double[] maxValues, double g) {
		if (minValues.length != maxValues.length) {
			throw new IllegalArgumentException("minValues and maxValues must match in length");
		}
		// Loop through each label index once only
		for (int i = 0; i < Math.min(minValues.length, serviceItemLabels.size()); i++) {
			WebElement label = serviceItemLabels.get(i);
			label.click(); // Click label ONCE
			HelpMethods.explicitWait_milliSeconds(700);
			// Wait randomly (3-7 seconds)
			int delay = ThreadLocalRandom.current().nextInt(3000, 7000);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// Generate temperature
			float raw = (float) ThreadLocalRandom.current().nextDouble(minValues[i], maxValues[i]);
			float temp = Math.round(raw * 100f) / 100f;
			tempValue1.set(temp);
			System.out.println("Label " + (i + 1) + " temp → " + temp);
			// Enter value
			temperatureValue.click();
			HelpMethods.explicitWait_milliSeconds(500);
			numberContainerInput.clear();
			numberContainerInput.sendKeys(String.format("%.2f", temp));
			HelpMethods.explicitWait_milliSeconds(500);
			doneButton.click();
			HelpMethods.explicitWait_milliSeconds(700);
			// Increase + Save
			increaseTempButton.click();
			HelpMethods.explicitWait_milliSeconds(500);
			saveButton.click();
			HelpMethods.explicitWait_milliSeconds(700);
			// Final validations
			assertEquals(temperatureValue.getText(), activeCardValue.getText(),
					"Active card value and Temperature value not matched");
			assertEquals(activeCardValue.getText(), String.format("%.2f", temp + g) + " ” WG",
					"Active card Temperature value not matched");
		}
	}

//	
	private static ThreadLocal<Float> tempValue = new ThreadLocal<>();

	public void enterTemperatureValueWithTwoDecimalsAndValidate(double d, double f, double g) {
		int delay = ThreadLocalRandom.current().nextInt(0, 7000); // 3 to 7 seconds
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		float raw = (float) ThreadLocalRandom.current().nextDouble(d, f);
		float temp = Math.round(raw * 100f) / 100f;
		tempValue1.set(temp);
		System.out.println(temp);
		temperatureValue.click();
		HelpMethods.explicitWait_milliSeconds(500);
		numberContainerInput.clear();
		numberContainerInput.sendKeys(String.format("%.2f", temp));
		HelpMethods.explicitWait_milliSeconds(500);
		doneButton.click();
		HelpMethods.explicitWait_milliSeconds(1000);
		increaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		increaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		decreaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		saveButton.click();
		HelpMethods.explicitWait_milliSeconds(700);
		assertEquals(temperatureValue.getText(), activeCardValue.getText(),
				"Active card value and Temperature value not matched");
		assertEquals(activeCardValue.getText(), String.format("%.2f", temp + g) + " ” WG",
				"Active card Temperature value not matched");
	}

	public void selectWebElementByText(String name) {
		String xpath = "//input[normalize-space(@name)='" + name + "']";
		WebElement element = HelpMethods.getWebElement(xpath, driver);
		if (!element.isSelected()) {
			HelpMethods.explicitWait_milliSeconds(700);
			HelpMethods.jsClick(element, driver);
			HelpMethods.explicitWait_milliSeconds(500);
		}
	}

	public void isCheckboxselected(String name) {
		String xpath = "//input[normalize-space(@name)='" + name + "']";
		WebElement element = HelpMethods.getWebElement(xpath, driver);
		assertTrue(element.isSelected(), "checkbox not selected");
	}

	public String getDescriptionText(String name) {
		HelpMethods.explicitWait_milliSeconds(500);
		String xpath = "//div[@class='label-container'][div[1][text()='" + name
				+ "']]/div[@class='label-description-text']";
		WebElement element = HelpMethods.getWebElement(xpath, driver);
		return element.getText();
	}

	public void clickNextPageByText(String name) {
		String xpath = "//label[normalize-space(text())='" + name
				+ "']/ancestor::div[contains(@class,'selection-item')]//img[@alt='next page']";

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement nextPageIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		HelpMethods.explicitWait_milliSeconds(700);

		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='2px solid red';", nextPageIcon);

		int attempts = 0;
		while (attempts < 3) {
			try {

				// Extra visibility check
				if (nextPageIcon.isDisplayed() && nextPageIcon.isEnabled()) {
					HelpMethods.jsClick(nextPageIcon, driver);
					;
					break;
				}
			} catch (Exception e) {
				// Optional screenshot for each attempt
				System.out.println("Retry attempt " + (attempts + 1) + " for element: " + xpath);
			}
			attempts++;
			HelpMethods.explicitWait_milliSeconds(700); // give time between retries
		}

		// Post-click wait (let UI catch up)
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickUnitSettings() {
		HelpMethods.explicitWait_milliSeconds(500);
		unitSettingsButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public static void clickNextPageButton() {
		nextPageButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public static void clickNextPageLabel() {
		nextPageLabel.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickNextPageButton_pagination() {
		nextPageButton_Pagination.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void selectPrecision() {
		HelpMethods.jsClick(spaceControlRadioButton, driver);
		HelpMethods.explicitWait_milliSeconds(500);
		HelpMethods.jsClick(precisionRadioButton, driver);
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void selectStandard() {
		HelpMethods.jsClick(spaceControlRadioButton, driver);
		HelpMethods.explicitWait_milliSeconds(500);
		HelpMethods.jsClick(standardRadioButton, driver);
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void selectVAVControl() {
		HelpMethods.jsClick(vavControlRadioButton, driver);
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void selectOutdoorAirControl() {
		HelpMethods.jsClick(outdoorAirControlRadioButton, driver);
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void selectReturnAirControl() {
		HelpMethods.jsClick(returnAirControlRadioButton, driver);
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void selectThirdPartyInterface() {
		HelpMethods.jsClick(thirdPartyInterfaceRadioButton, driver);
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickBackButton() {
		backArrowButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickFactoryResetButton() {
		factoryResetButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		yesButton.click();
		HelpMethods.explicitWait_milliSeconds(700);
	}

	public void clickYesButton() {
		yesButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickAppType() {
		HelpMethods.explicitWait_milliSeconds(500);
		appTypeButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickControlLabele() {
		HelpMethods.explicitWait_milliSeconds(500);
		ControlLabel.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickFanControl() {
		HelpMethods.explicitWait_milliSeconds(500);
		FanControl.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public String getPageTitle() {
		return pageTitle.getText();
	}

	public String getTemperatureLableText() {
		return temperatureLabel.getText().trim();
	}

	public String getActiveCaedText() {
		return activeCardLabel.getText().trim();
	}

	public String getAlertBoxText() {
		HelpMethods.explicitWait_milliSeconds(500);
		return alertBoxText.getText().trim();
	}

	public String getNavigationPathText() {
		return navigationPath.getText();
	}

	public String getAppTypeDesc() {
		return appTypeDesciption.getText();
	}

	public String getminEcoPosDescreption() {
		return minEcoPosDescreption.getText();
	}

	public String getReminingLifeTimeLabel() {
		return remaining_lifetime_label.getText();
	}

	public String getReminingLifeTimeValue() {
		return remaining_lifetime_value.getText();
	}

	public void clickPrSetpoint() {
		HelpMethods.explicitWait_milliSeconds(500);
		PrSetpoint.click();
	}

	public void verifyPageLables(List<String> expectedLabels) {
		ArrayList<String> actulaLabels = new ArrayList<String>();

		for (WebElement labelCard : pageLables) {
			actulaLabels.add(labelCard.getText());
		}
		System.out.println(actulaLabels);
		boolean flag = actulaLabels.containsAll(expectedLabels);
		assertTrue(flag, "unit settings page values not matched");
	}

	public void verifyPageFieldLables(List<String> expectedLabels) {
		ArrayList<String> actulaLabels = new ArrayList<String>();

		for (WebElement labelCard : pageFieldLables) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Tab labels not matched", expectedLabels, actulaLabels);
	}

	public void verifyServiceItemLables(List<String> expectedLabels) {
		ArrayList<String> actulaLabels = new ArrayList<String>();

		for (WebElement labelCard : serviceItemLabels) {
			actulaLabels.add(labelCard.getText());
		}
		System.out.println(actulaLabels);
		assertEquals("Tab labels not matched", expectedLabels, actulaLabels);
	}

	public void validateAllTiles(List<String> expectedLabels, int min, int max) {
		ArrayList<String> actulaLabels = new ArrayList<String>();
		while (true) {
			for (WebElement labelCard : serviceItemLabels) {
				labelCard.click();
				actulaLabels.add(getActiveCaedText());
				enterTemperatureValueAndValidate(min, max);
			}
			if (HelpMethods.isElementPresent(nextPageButton_Pagination)) {
				if (!nextPageButton_Pagination.isEnabled()) {
					System.out.println("Next Page button is disabled. Stopping.");
					break;
				}
				nextPageButton_Pagination.click();
			} else
				break;
		}
		System.out.println(actulaLabels);
		assertEquals("Tab labels not matched", expectedLabels, actulaLabels);
	}

	//
	public String actTempValue1;

	public void EnterTemperatureValueAndValidate(double min, double max, boolean isDecimal) {
		double inputValue;
		if (isDecimal) {
			inputValue = Math.round((min + (max - min) * new Random().nextDouble()) * 10.0) / 10.0; // e.g. 6.2
		} else {
			inputValue = new Random().nextInt((int) (max - min + 1)) + min;
		}
		temperatureValue.click();
		HelpMethods.explicitWait_milliSeconds(500);
		numberContainerInput.clear();
		numberContainerInput.sendKeys(String.valueOf(inputValue));
		HelpMethods.explicitWait_milliSeconds(500);
		doneButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		// Try clicking twice; buttons might not work above range
		increaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		increaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		decreaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		saveButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		// Record value (can be used for future validation if needed)
		actTempValue = String.valueOf(inputValue + 1); // Approximation for test logic
	}

	public String actTempValue3;

	public void enterTemperatureValueAndValidate(double min, double max, boolean isDecimal) {
		double inputValue;
		if (isDecimal) {
			inputValue = Math.round((min + (max - min) * new Random().nextDouble()) * 10.0) / 10.0; // e.g. 6.2
		} else {
			inputValue = new Random().nextInt((int) (max - min + 1)) + min;
		}
		temperatureValue.click();
		HelpMethods.explicitWait_milliSeconds(500);
		numberContainerInput.clear();
		numberContainerInput.sendKeys(String.valueOf(inputValue));
		HelpMethods.explicitWait_milliSeconds(500);
		doneButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		// Try clicking twice; buttons might not work above range
		increaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		increaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		decreaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		saveButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		// Basic equality validation
		assertEquals(temperatureValue.getText(), activeCardValue.getText(),
				"Active card value and Temperature value not matched");
		// Record value (can be used for future validation if needed)
		actTempValue = String.valueOf(inputValue + 1); // Approximation for test logic
	}

	public void validateThreeTiles(List<String> expectedLabels) {
		ArrayList<String> actualLabels = new ArrayList<>();
		int index = 0;
		while (true) {
			for (WebElement labelCard : serviceItemLabels) {
				labelCard.click();
				actualLabels.add(getActiveCaedText());
				// Define min/max per index
				double min, max;
				boolean isDecimal = false;

				switch (index) {
				case 0:
					min = -30;
					max = 80;
					break;
				case 1:
					min = 12;
					max = 35;
					break;
				case 2:
					min = 0.3;
					max = 15;
					isDecimal = true;
					break;
				default:
					min = 0;
					max = 10;
				}
				enterTemperatureValueAndValidate(min, max, isDecimal);
				index++;
			}
			if (HelpMethods.isElementPresent(nextPageButton_Pagination)) {
				if (!nextPageButton_Pagination.isEnabled()) {
					System.out.println("Next Page button is disabled. Stopping.");
					break;
				}
				nextPageButton_Pagination.click();
			} else {
				break;
			}
		}
		System.out.println(actualLabels);
		assertEquals("Tab labels not matched", expectedLabels, actualLabels);
	}

	public void validateTwoTiles(List<String> expectedLabels) {
		ArrayList<String> actualLabels = new ArrayList<>();
		int index = 0;
		while (true) {
			for (WebElement labelCard : serviceItemLabels) {
				labelCard.click();
				actualLabels.add(getActiveCaedText());
				double min, max;
				boolean isDecimal = false;
				boolean useActTempValue3 = false;
				switch (index) {
				case 0:
					min = 12;
					max = 35;
					break;
				case 1:
					min = 0.3;
					max = 15;
					isDecimal = true;
					useActTempValue3 = true; // assign to actTempValue3
					break;
				default:
					min = 0;
					max = 10;
				}
				enterTemperatureValueAndValidate(min, max, isDecimal);
				index++;
			}
			if (HelpMethods.isElementPresent(nextPageButton_Pagination)) {
				if (!nextPageButton_Pagination.isEnabled()) {
					System.out.println("Next Page button is disabled. Stopping.");
					break;
				}
				nextPageButton_Pagination.click();
			} else {
				break;
			}
		}
		System.out.println(actualLabels);
		assertEquals("Tab labels not matched", expectedLabels, actualLabels);
	}

	public void validateOneTiles(int defaultMin, int defaultMax) {
		// Define any labels that need special range
		String specialLabel = "ASSIST";
		int specialMin = 5;
		int specialMax = 55;
		for (WebElement labelCard : serviceItemLabels) {
			labelCard.click();
			String currentLabel = getActiveCaedText(); // Get current label

			if (currentLabel.equalsIgnoreCase(specialLabel)) {
				EnterTemperatureValueAndValidate(specialMin, specialMax, false);
			} else {
				EnterTemperatureValueAndValidate(defaultMin, defaultMax, false);
			}
		}
		clickBackButton(); // Exit after processing all
	}

	public void validateForTwoTiles(List<String> expectedLabels, int highRangeMin, int lowRangeMax) {
		ArrayList<String> actualLabels = new ArrayList<>();
		int tileIndex = 1;
		while (true) {
			for (WebElement labelCard : serviceItemLabels) {
				labelCard.click();
				actualLabels.add(getActiveCaedText());
				if (tileIndex == 1) {
					enterTemperatureValueAndValidate(highRangeMin, 8); // First tile gets high range
				} else if (tileIndex == 2) {
					enterTemperatureValueAndValidate(5, lowRangeMax); // Second tile gets low range
				} else {
					System.out.println("Unexpected label index: " + tileIndex);
				}
				tileIndex++;
			}
			if (HelpMethods.isElementPresent(nextPageButton_Pagination)) {
				if (!nextPageButton_Pagination.isEnabled()) {
					System.out.println("Next Page button is disabled. Stopping.");
					break;
				}
				nextPageButton_Pagination.click();
			} else {
				break;
			}
		}
		System.out.println(actualLabels);
		assertEquals("Tab labels not matched", expectedLabels, actualLabels);
	}

}
