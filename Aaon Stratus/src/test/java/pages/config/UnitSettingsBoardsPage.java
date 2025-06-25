package pages.config;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefinitions.HelpMethods;
import StepDefinitions.Hooks;

public class UnitSettingsBoardsPage {

	@FindBy(xpath = "//div[text()='Boards']")
	WebElement BoardsButton;

	@FindBy(css = ".topic-title")
	WebElement pageTitle;

	@FindBy(css = "input+label")
	private List<WebElement> pageFieldLables;

	@FindBy(css = ".label-container")
	private List<WebElement> ListItemLabels;

	@FindBy(xpath = "//label[text()='Unit Manager']")
	WebElement UnitManagerButton;

	@FindBy(xpath = "//label[text()='Power-Comm Board']")
	WebElement PowerCommBoardButton;

	@FindBy(css = ".chevIcon")
	WebElement Submenu;

	@FindBy(xpath = "(//img[@alt='next page'])[2]")
	WebElement CheckboxSubmenu;

	@FindBy(xpath = "//div[text()='Board 1']")
	WebElement Board1Label;

	@FindBy(css = ".label-container>div")
	private List<WebElement> pageLables;

	@FindBy(css = ".back-arrow")
	WebElement backArrowButton;

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement ConfirmPopupElement;

	@FindBy(xpath = "//label[text()='Air Handler Board']")
	WebElement AirHandlerBoard;

	@FindBy(xpath = "//Label[text()='Not Used']")
	WebElement NotUsed;

	@FindBy(xpath = "//label[text()='Supply Fan']")
	WebElement SupplyFan;

	@FindBy(xpath = "//label[text()='None']")
	WebElement None;

	@FindBy(xpath = "//label[text()='Electromagnet Motor (EM)']")
	WebElement ElectromagnetMotorEM;

	@FindBy(xpath = "//label[text()='Permanent Magnet Motor (PMM)']")
	WebElement PermanentMagnetMotorPMM;

	@FindBy(css = ".temperature-value")
	WebElement temperaturvalue;

	@FindBy(xpath = "(//span[text()='HP']/preceding-sibling::input)[2]")
	WebElement SendValue;

	@FindBy(xpath = "(//div[contains(@class,'numberkeyboardinput')]//input)[1]")
	WebElement SendValue2;

	@FindBy(xpath = "(//span[text()='Done'])[2]")
	WebElement Done;

	@FindBy(xpath = "//label[text()='Enable']")
	WebElement Enable;

	@FindBy(xpath = "//label[text()='Enabled']")
	WebElement Enabled;

	@FindBy(xpath = "//label[text()='Disabled']")
	WebElement Disabled;

	@FindBy(css = ".serviceItem-card>.labelDescription")
	private List<WebElement> serviceItemLabels;

	@FindBy(css = "button.pagination-btn:last-of-type")
	WebElement nextPageButton_Pagination;

	@FindBy(css = ".serviceItem-card>.labelDescription.active ")
	WebElement activeCardLabel;

	@FindBy(css = ".temperature-value")
	WebElement temperatureValue;

	@FindBy(css = ".tempsera>.backdrop input.numbercontainer")
	WebElement numberContainerInput;

	@FindBy(css = ".serviceItem-card>.contentValue.active ")
	WebElement activeCardValue;

	@FindBy(xpath = "(//span[text() = 'Done'])[last()]")
	WebElement doneButton;

	@FindBy(css = "img[alt='Increase temperature']")
	WebElement increaseTempButton;

	@FindBy(css = "img[alt='Decrease temperature']")
	WebElement decreaseTempButton;

	@FindBy(css = ".temperature-label")
	WebElement temperatureLabel;

	@FindBy(xpath = "//button[text() = 'Save']")
	WebElement saveButton;

	@FindBy(xpath = "//label[text() = 'BACnet Passthrough']")
	WebElement BACnetPassthrough;

	@FindBy(xpath = "//button[text() = '2']")
	WebElement NextPage;

	@FindBy(xpath = "//button[text() = '1']")
	WebElement PreviousPage;

	@FindBy(xpath = "//label[text() = 'Cooling Board']")
	WebElement CoolingBoard;

	@FindBy(xpath = "(//div[text()='Min Voltage'])[1]")
	WebElement minVoltageField;

	@FindBy(xpath = "(//div[text()='Max Voltage'])[1]")
	WebElement maxVoltageField;

	@FindBy(xpath = "(//label[text()='0-10V'])[2]")
	WebElement NumV;

	@FindBy(xpath = "//label[text()='Heating Board']")
	WebElement HeatingBoard;

	@FindBy(xpath = "//label[text()='Energy Recovery Board']")
	WebElement EnergyRecoveryBoard;

	@FindBy(xpath = "//label[text()='Preheat Board']")
	WebElement PreheatBoard;

	@FindBy(xpath = "//label[text()='Outside Air Board']")
	WebElement OutsideAirBoard;

	@FindBy(xpath = "//button[text()='Manual']")
	WebElement Manual;

	@FindBy(xpath = "//button[text()='Network']")
	WebElement Network;

	@FindBy(xpath = "//input[@name='IPv4']")
	WebElement IPv4;

	@FindBy(xpath = "//input[@class='numbercontainer ']")
	public WebElement numbercontainer;

	@FindBy(xpath = "//input[@name='GatewayAddress']")
	WebElement GatewayAddress;

	@FindBy(xpath = "//input[@name='Netmask']")
	WebElement Netmask;

	@FindBy(xpath = "//label[text()='DNS Server Address']")
	WebElement DNS;

	@FindBy(xpath = "//button[text()=' Add']")
	WebElement Add;

	@FindBy(xpath = "//input[@name='BBMD IPv4 Address']")
	WebElement BBMD;

	@FindBy(xpath = "//input[@name='Network Port']")
	WebElement NetworkPort;

//	@FindBy(css = "div.label-container")
//	private List<WebElement> labelcontainer;
//	
	@FindBy(css = "span.nav-panel")
	WebElement navigationPath;

	@FindBy(xpath = "//div[text()='Thermistor']")
	WebElement Thermistor;

	@FindBy(xpath = "//label[text()='Exhaust Bypass']")
	WebElement ExhaustBypass;

	@FindBy(xpath = "//label[text()='Single Supply/Exhaust Bypass']")
	WebElement SupplyExhaust;

	WebDriver driver = Hooks.getDriver();

	public UnitSettingsBoardsPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void clickBoards() {
		HelpMethods.explicitWait_milliSeconds(500);
		BoardsButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public String getPageTitle() {
		return pageTitle.getText();
	}

	public void clickUnitManagerButton() {
		HelpMethods.explicitWait_milliSeconds(500);
		UnitManagerButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickPowerCommBoardButton() {
		HelpMethods.explicitWait_milliSeconds(500);
		PowerCommBoardButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickSubmenu() {
		Submenu.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickCheckboxSubmenu() {
		CheckboxSubmenu.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickIPv4() {
		IPv4.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickThermistor() {
		Thermistor.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickManual() {
		Manual.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clicknavigationPath() {
		navigationPath.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickExhaustBypass() {
		ExhaustBypass.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickSupplyExhaust() {
		SupplyExhaust.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

//get only button
	public void selectRadioButton(String labelText) {
		HelpMethods.explicitWait_milliSeconds(500);
		String xpath = "//label[text()='" + labelText + "']";

		try {
			WebElement radioButton = HelpMethods.getWebElement(xpath, driver);
			if (radioButton == null) {
				throw new NoSuchElementException(
						"Radio button with label '" + labelText + "' not found using XPath: " + xpath);
			}
			radioButton.click();
		} catch (Exception e) {
			System.err.println("Exception in selectRadioButton(): " + e.getMessage());
			throw e; // rethrow to fail the test and print in console/logs
		}
	}

	public void clickBoard1Label() {
		HelpMethods.explicitWait_milliSeconds(1000);
		Board1Label.click();
	}

	// get only label
	public void selectLabels(String labelText) {
		HelpMethods.explicitWait_milliSeconds(500);
		String xpath = "//div[text()='" + labelText + "']";

		try {
			WebElement labelElement = HelpMethods.getWebElement(xpath, driver);
			if (labelElement == null) {
				throw new NoSuchElementException("Label with text '" + labelText + "' not found using XPath: " + xpath);
			}
			labelElement.click();
		} catch (Exception e) {
			System.err.println("Exception in selectLabels(): " + e.getMessage());
			throw e; // rethrow to ensure test fails and logs the error
		}
	}

	// get only Navigation
	public void selectNavigationPath(String navigationText) {
		// Step 1: Click the navigation panel
		navigationPath.click();
		HelpMethods.explicitWait_milliSeconds(300); // Optional short wait
		// Step 2: Locate and click the dynamic button (by text)
		String buttonXpath = "//button[text()='" + navigationText + "']";
		WebElement dynamicButton = driver.findElement(By.xpath(buttonXpath));
		dynamicButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		// Step 3: Click the "Open" button
		WebElement openButton = driver.findElement(By.xpath("//button[text()='Open']"));
		openButton.click();
	}

	public void clickBackButton() {
		HelpMethods.explicitWait_milliSeconds(500);
		backArrowButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void verifyPageLables(List<String> expectedLabels) {
		HelpMethods.explicitWait_milliSeconds(1000);
		ArrayList<String> actulaLabels = new ArrayList<String>();

		for (WebElement labelCard : pageLables) {
			actulaLabels.add(labelCard.getText());
		}
		System.out.println(actulaLabels);
		boolean flag = actulaLabels.containsAll(expectedLabels);
		assertTrue(flag, "pageLables not matched");
	}

	public void verifyBoardTitle(String label) {
		String actualTitle = getPageTitle();

		switch (label) {
		case "24V Alert":
			assertEquals("Title not matched for 24V Alert", "Binary Input 1 - 24V Power Alert", actualTitle);
			break;
		case "PBO Alert":
			assertEquals("Title not matched for PBO Alert", "Binary Input 2 - PBO Alert", actualTitle);
			break;
		case "PS Therm Alert":
			assertEquals("Title not matched for PS Therm Alert", "Binary Input 3 - Power Supply Thermal Alert",
					actualTitle);
			break;
		default:
			throw new IllegalArgumentException("Unsupported label: " + label);
		}
	}

	public void clickConfirmPopupElement() {
		HelpMethods.explicitWait_milliSeconds(500);
		ConfirmPopupElement.click();
	}

	public void clickAirHandlerBoard() {
		HelpMethods.explicitWait_milliSeconds(500);
		AirHandlerBoard.click();
	}

	public void clickNotUsed() {
		HelpMethods.explicitWait_milliSeconds(500);
		NotUsed.click();
	}

	public void clickSupplyFan() {
		HelpMethods.explicitWait_milliSeconds(500);
		SupplyFan.click();
	}

	public void clickElectromagnetMotorEM() {
		HelpMethods.explicitWait_milliSeconds(500);
		ElectromagnetMotorEM.click();
	}

	public void clickPermanentMagnetMotorPMM() {
		HelpMethods.explicitWait_milliSeconds(500);
		PermanentMagnetMotorPMM.click();
	}

	public void clicktemperaturvalue() {
		HelpMethods.explicitWait_milliSeconds(500);
		temperaturvalue.click();
	}

	public String getTemperatureLableText() {
		return temperatureLabel.getText().trim();
	}

	public void SendLabelsValue(String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(SendValue));
		SendValue.clear();
		SendValue.sendKeys(value);
	}

	public void SendLabelsValue2(String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(SendValue2));
		SendValue2.clear();
		SendValue2.sendKeys(value);
	}

	public void clickDone() {
		HelpMethods.explicitWait_milliSeconds(500);
		doneButton.click();
	}

	public void clickSaveButton() {
		HelpMethods.explicitWait_milliSeconds(500);
		saveButton.click();
	}

	public void clickEnable() {
		HelpMethods.explicitWait_milliSeconds(500);
		Enable.click();
	}

	public void clickEnabled() {
		HelpMethods.explicitWait_milliSeconds(500);
		Enabled.click();
	}

	public void ClickDisabled() {
		HelpMethods.explicitWait_milliSeconds(500);
		Disabled.click();
	}

	public void clickBACnetPassthrough() {
		HelpMethods.explicitWait_milliSeconds(500);
		BACnetPassthrough.click();
	}

	public void clickNone() {
		HelpMethods.explicitWait_milliSeconds(500);
		None.click();
	}

	public void clickNumV() {
		HelpMethods.explicitWait_milliSeconds(500);
		NumV.click();
	}

	public void clickHeatingBoard() {
		HelpMethods.explicitWait_milliSeconds(500);
		HeatingBoard.click();
	}

	public void clickNextPage() {
		HelpMethods.explicitWait_milliSeconds(500);
		NextPage.click();
	}

	public void clickPreviousPage() {
		HelpMethods.explicitWait_milliSeconds(500);
		PreviousPage.click();
	}

	public String getActiveCaedText() {
		return activeCardLabel.getText().trim();
	}

	public void clickCoolingBoard() {
		HelpMethods.explicitWait_milliSeconds(500);
		CoolingBoard.click();
	}

	public void clickEnergyRecoveryBoard() {
		HelpMethods.explicitWait_milliSeconds(500);
		EnergyRecoveryBoard.click();
	}

	public void clickPreheatBoard() {
		HelpMethods.explicitWait_milliSeconds(500);
		PreheatBoard.click();
	}

	public void clickOutsideAirBoard() {
		HelpMethods.explicitWait_milliSeconds(500);
		OutsideAirBoard.click();
	}

	public void clickNetwork() {
		HelpMethods.explicitWait_milliSeconds(500);
		Network.click();
	}

	public void clickGatewayAddress() {
		HelpMethods.explicitWait_milliSeconds(500);
		GatewayAddress.click();
	}

	public void clickNetmask() {
		HelpMethods.explicitWait_milliSeconds(500);
		Netmask.click();
	}

	public void clickDNS() {
		HelpMethods.explicitWait_milliSeconds(500);
		DNS.click();
	}

	public void clickAdd() {
		HelpMethods.explicitWait_milliSeconds(500);
		Add.click();
	}

	public void clickBBMD() {
		HelpMethods.explicitWait_milliSeconds(500);
		BBMD.click();
	}

	public void clickNetworkPort() {
		HelpMethods.explicitWait_milliSeconds(500);
		NetworkPort.click();
	}

	public String actTempValue;

	public void enterTemperatureValueAndValidate(int min, int max) {
		int randomNum = new Random().nextInt((max - min) + 1) + min;
		temperatureValue.click();
		HelpMethods.explicitWait_milliSeconds(200);
		numberContainerInput.clear();
		numberContainerInput.sendKeys(String.valueOf(randomNum));
		HelpMethods.explicitWait_milliSeconds(300);
		doneButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		increaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		increaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		decreaseTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		saveButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		assertEquals(temperatureValue.getText(), activeCardValue.getText(),
				"Active card value and Temperature value not matched");
		assertEquals(activeCardValue.getText().substring(0, 2).trim(), String.valueOf(randomNum + 1),
				"Active card Temperature value not matched");
		actTempValue = String.valueOf(randomNum + 1);
	}

	public void validateForTwoTiles(List<String> expectedLabels, int highRangeMin, int lowRangeMax) {
		ArrayList<String> actualLabels = new ArrayList<>();
		int tileIndex = 1;
		while (true) {
			for (WebElement labelCard : serviceItemLabels) {
				labelCard.click();
				actualLabels.add(getActiveCaedText());
				if (tileIndex == 1) {
					enterTemperatureValueAndValidate(highRangeMin, 95); // First tile gets high range
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

	public void verifyItemLables(List<String> expectedLabels) {
		ArrayList<String> actulaLabels = new ArrayList<String>();

		for (WebElement labelCard : ListItemLabels) {
			actulaLabels.add(labelCard.getText());
		}
		System.out.println(actulaLabels);
		assertEquals("Tab labels not matched", expectedLabels, actulaLabels);
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

	public void EnterTemperatureValueOnly(int min, int max) {
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
		HelpMethods.explicitWait_milliSeconds(500);
	}
//
//	public void enterTemperatureValueAndValidate(int min, int max) {
//	    int randomNum = new Random().nextInt((max - min) + 1) + min;
//
//	    temperatureValue.click();
//	    HelpMethods.explicitWait_milliSeconds(300);
//	    numberContainerInput.clear();
//	    numberContainerInput.sendKeys(String.valueOf(randomNum));
//	    HelpMethods.explicitWait_milliSeconds(300);
//	    doneButton.click();
//	    HelpMethods.explicitWait_milliSeconds(500);
//
//	    // Try to increment, but it's fine if no change happens due to limits
//	    increaseTempButton.click();
//	    HelpMethods.explicitWait_milliSeconds(300);
//	    increaseTempButton.click();
//	    HelpMethods.explicitWait_milliSeconds(300);
//	    decreaseTempButton.click();
//	    HelpMethods.explicitWait_milliSeconds(300);
//
//	    saveButton.click();
//	    HelpMethods.explicitWait_milliSeconds(500);
//
//	    // ✅ Read final actual value from the temperature field
//	    String expectedTemp = getCurrentTemperatureValue();
//
//	    // ✅ Use this for reliable validation
//	    assertEquals(temperatureValue.getText(), activeCardValue.getText(), "Mismatch between UI field and card");
//	    assertEquals(activeCardValue.getText().substring(0, expectedTemp.length()).trim(), expectedTemp, "Active card value mismatch");
//
//	    actTempValue = expectedTemp;
//	}

	public void enterTemperatureAndValidateForAllTiles() {
		int tileIndex = 1;
		while (true) {
			for (WebElement labelCard : serviceItemLabels) {
				try {
					labelCard.click();
					if (tileIndex == 5 || tileIndex == 6) {
						enterTemperatureValueAndValidate(90, 95); // High range
					} else {
						enterTemperatureValueAndValidate(5, 7); // Low range
					}
					tileIndex++;
				} catch (Exception e) {
					System.out.println("Failed to process tile " + tileIndex + ": " + e.getMessage());
				}
			}
			if (HelpMethods.isElementPresent(nextPageButton_Pagination)) {
				if (!nextPageButton_Pagination.isEnabled()) {
					break;
				}
				nextPageButton_Pagination.click();
				HelpMethods.explicitWait_milliSeconds(700);
			} else {
				break;
			}
		}
	}

//	
	public void EnterTemperatureForAllTiles() {
		int tileIndex = 1;
		while (true) {
			for (WebElement labelCard : serviceItemLabels) {
				try {
					labelCard.click();
					// Logic: tiles 5 and 6 get value up to 100, others get value up to 10
					if (tileIndex == 5 || tileIndex == 6) {
						EnterTemperatureValueOnly(90, 100); // Accept high values for 5 and 6
					} else {
						EnterTemperatureValueOnly(5, 10); // Lower range for others
					}
					tileIndex++; // Move to next tile index
				} catch (Exception e) {
					System.out.println("Failed to process tile " + tileIndex + ": " + e.getMessage());
				}
			}
			if (HelpMethods.isElementPresent(nextPageButton_Pagination)) {
				if (!nextPageButton_Pagination.isEnabled()) {
					System.out.println("Next Page button is disabled. Stopping.");
					break;
				}
				nextPageButton_Pagination.click();
				HelpMethods.explicitWait_milliSeconds(700);
			} else {
				break;
			}
		}
	}

	public void validateOneTiles(List<String> expectedLabels, int defaultMin, int defaultMax) {
		String specialLabel = "ASSIST"; // label that gets the custom range
		int specialMin = 90;
		int specialMax = 100;
		ArrayList<String> actualLabels = new ArrayList<>();
		// Process labels on the first (or only) page
		for (WebElement labelCard : serviceItemLabels) {
			labelCard.click();
			String currentLabel = getActiveCaedText(); // Get label text
			actualLabels.add(currentLabel);
			if (currentLabel.equalsIgnoreCase(specialLabel)) {
				enterTemperatureValueAndValidate(specialMin, specialMax);
			} else {
				enterTemperatureValueAndValidate(defaultMin, defaultMax);
			}
		}
		// After processing all labels, press the back button
		clickBackButton();
		System.out.println(actualLabels);
		assertEquals("Tab labels not matched", expectedLabels, actualLabels);
	}

}