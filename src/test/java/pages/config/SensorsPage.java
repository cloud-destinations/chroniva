package pages.config;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import StepDefinitions.HelpMethods;
import StepDefinitions.Hooks;

public class SensorsPage {

	@FindBy(xpath = "//div[text()='Sensors']")
	WebElement sensors;

	@FindBy(css = ".label-container")
	private List<WebElement> sensorspageLables;

	@FindBy(xpath = "//div[text()='Space']")
	WebElement space;

	@FindBy(css = ".topic-title")
	WebElement TitleText;

	@FindBy(xpath = "//label[text()='No Space Sensor']")
	WebElement noSpaceSensorRadioButtons;

	@FindBy(xpath = "//label[text()='Analog']")
	WebElement analogRadioButtons;

	@FindBy(css = ".chevIcon")
	WebElement analogSubmenu;

	@FindBy(xpath = "//div[text()='# of Space Sensors']")
	WebElement analogSpaceSensorsOptionLabel;

	@FindBy(css = ".temperature-adjuster ")
	WebElement analogSpaceSensorsTempAdjuster;

	@FindBy(xpath = "//div[@class='temperature-label']")
	WebElement analogSpaceSensorsText;

	@FindBy(xpath = "(//div[text()='Override'])[1]")
	WebElement analogOverrideHrsLabel;

	@FindBy(xpath = "//div[text()=' hrs']")
	WebElement analogOverrideHrAdjuster;

	@FindBy(xpath = "//div[@class='temperature-label']")
	WebElement analogSpaceSensorOverrideText;

	@FindBy(xpath = "//div[text()='Setpoint Adjust Limit']") //
	WebElement analogSetpointFLabel;

	@FindBy(css = ".temperature-value")
	WebElement analogTemperatureValue;

	@FindBy(xpath = "//div[@class='temperature-label']")
	WebElement analogSetpointAdjustLimitText;

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement ConfirmPopupElement;

	@FindBy(css = ".back-arrow")
	WebElement BackArrow;

	@FindBy(xpath = "(//div[text()='Analog'])[1]")
	WebElement AnalogRadioButtonInLabel;

	@FindBy(xpath = "//label[text()='Digital']")
	WebElement digitalRadioButtons;

	@FindBy(css = ".chevIcon")
	WebElement digitalSubmenu;

	@FindBy(xpath = "//div[text()='# of Space Sensors']")
	WebElement digitalSpaceSensorsOptionLabel;

	@FindBy(css = ".temperature-adjuster ")
	WebElement digitalSpaceSensorsTempAdjuster;

	@FindBy(xpath = "//div[@class='temperature-label']")
	WebElement digitalSpaceSensorsText;

	@FindBy(xpath = "(//div[text()='Override'])[1]")
	WebElement digitalOverrideHrsLabel;

	@FindBy(xpath = "//div[text()=' hrs']")
	WebElement digitalOverrideHrAdjuster;

	@FindBy(xpath = "//div[@class='temperature-label']")
	WebElement digitalSpaceSensorOverrideText;

	@FindBy(xpath = "//div[text()='Setpoint Adjust Limit']")
	WebElement digitalSetpointFLabel;

	@FindBy(css = ".temperature-value")
	WebElement digitalTemperatureValue;

	@FindBy(xpath = "//div[@class='temperature-label']")
	WebElement digitalSetpointAdjustLimitText;

	@FindBy(xpath = "(//div[text()='Digital'])[1]")
	WebElement DigitalRadioButtonInLabel;

	@FindBy(xpath = "//label[text()='TS Space Sensor']")
	WebElement TSSpaceSensor;

	@FindBy(xpath = "//label[text()='BACnet Temp']")
	WebElement BACnetTempRadioButton;

	@FindBy(xpath = "//div[@class='checkbox-option undefined ']")
	WebElement HumidityCheckbox;

	@FindBy(xpath = "//label[text()='Remote Display']")
	WebElement RemoteDisplayRadioButton;

	@FindBy(xpath = "(//div[text()='BACnet Temp'])[1]")
	WebElement remoteDisplayRadioButtonInLabel;

	@FindBy(xpath = "//div[text()='Return']")
	WebElement Return;

	@FindBy(xpath = "//label[text()='No Return Sensor']")
	WebElement rNoReturnSensorRadioButton;

	@FindBy(xpath = "//label[text()='Analog']")
	WebElement rAnalogRadioButton;

	@FindBy(xpath = "//label[text()='Digital']")
	WebElement rDigitalRadioButton;

	@FindBy(xpath = "//label[text()='BACnet Temp']")
	WebElement rBACnetTempRadioButton;

	@FindBy(xpath = "//label[text()='+ Humidity']")
	WebElement rHumidityCheckbox;

	@FindBy(xpath = "(//div[text()='BACnet Temp'])[1]")
	WebElement BACnetTempRadioButtonInLabel;

	@FindBy(xpath = "//div[text()='Outdoor']")
	WebElement Outdoor;

	@FindBy(xpath = "//label[text ()='No OA Sensor']")
	WebElement oSNoOASensorRadioButton;

	@FindBy(xpath = "//label[text()='Analog']")
	WebElement oSAnalogRadioButton;

	@FindBy(xpath = "//label[text()='Digital']")
	WebElement oSdigitalRadioButton;

	@FindBy(xpath = "//label[text()='Global Broadcast']")
	WebElement oSGlobalBroadcastRadioButton;

	@FindBy(xpath = "//label[text()='BACnet Temp']")
	WebElement oSBACnetTempRadioButton;

	@FindBy(xpath = "//label[text()='+ Humidity']")
	WebElement oSHumiditycheckbox;

	@FindBy(xpath = "//div[text()='Supply']")
	WebElement Supply;

	@FindBy(xpath = "//label[text()='Analog']")
	WebElement suAnalogRadioButton;

	@FindBy(xpath = "//label[text()='Digital']")
	WebElement suDigitalRadioButton;

	@FindBy(xpath = "(//div[text()='Digital'])[1]")
	WebElement suDigitalRadioButtonInLabel;

	@FindBy(xpath = "//div[text()='CO2']")
	WebElement CO2;

	@FindBy(xpath = "//label[text()='No CO2 Sensor']")
	WebElement NoCO2SensorRadioButton;

	@FindBy(xpath = "//label[text()='Digital']")
	WebElement CO2digitalRadioButtons;

	@FindBy(css = ".chevIcon")
	WebElement CO2digitalSubmenu;

	@FindBy(xpath = "(//div[text()='CO2 Sensor Offset'])[1]") // click
	WebElement CO2SensorOffsetintsOptionLabel;

	@FindBy(css = ".temp-button:nth-of-type(2)") // click 5
	WebElement CO2SetpointsIncreaseTempAdjuster;

	@FindBy(xpath = "//img[@alt='Decrease temperature']") // click 2
	WebElement CO2SetpointsDecreaseTempAdjuster;

	@FindBy(xpath = "(//div[text()='CO2 Sensor Offset'])[2]")
	WebElement CO2SensorOffsetText;

	@FindBy(xpath = "(//div[text()='CO2 Setpoint'])[1]") // click
	WebElement CO2SetpointLabel;

	@FindBy(xpath = "(//div[text()='CO2 Setpoint'])[2]")
	WebElement CO2SetpointText;

	@FindBy(xpath = "//div[@class='contentValue active ']")
	WebElement CO2SetpointContentValueactive;

	@FindBy(xpath = "//div[@class='contentValue  ']")
	WebElement CO2SensorContentValue;

	@FindBy(xpath = "//label[text()='Reads CO2 Broadcast']")
	WebElement ReadsCO2BroadcastText;

	@FindBy(xpath = "//label[text()='Reads CO2 From BACnet']")
	WebElement ReadsCO2BACnetText;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement SaveButton;

	WebDriver driver = Hooks.getDriver();

	public SensorsPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void clickSensors() {
		HelpMethods.explicitWait_milliSeconds(500);
		sensors.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void verifySensorsPageLables(List<String> expectedLabels) {
		ArrayList<String> actulaLabels = new ArrayList<String>();

		for (WebElement labelCard : sensorspageLables) {
			actulaLabels.add(labelCard.getText());
		}
		System.out.println(actulaLabels);
		boolean flag = actulaLabels.containsAll(expectedLabels);
		assertTrue(flag, "sensors page values not matched");
	}

	public void clickSpace() {
		HelpMethods.explicitWait_milliSeconds(500);
		space.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public boolean isTitlePresent() {
		return TitleText.isDisplayed();
	}

	public boolean isNoSpaceSensorClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		noSpaceSensorRadioButtons.click();
		return noSpaceSensorRadioButtons.isDisplayed() && noSpaceSensorRadioButtons.isEnabled();
	}

	public void clickAnalogRadioButtons() {
		analogRadioButtons.click();
		HelpMethods.explicitWait_milliSeconds(500);

	}

	public void clickAnalogSubmenu() {
		analogSubmenu.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickAnalogSpaceSensorsOptionLabel() {
		HelpMethods.explicitWait_milliSeconds(500);
		analogSpaceSensorsOptionLabel.click();
	}

	public boolean isAnalogTemperatureAdjusterPresent() {
		return analogSpaceSensorsTempAdjuster.isDisplayed();
	}

	public String getAnalogSpaceSensors() {
		return analogSpaceSensorsText.getText();
	}

	public void clickAnalogOverrideHrsoptionLabel() {
		HelpMethods.explicitWait_milliSeconds(300);
		analogOverrideHrsLabel.click();
	}

	public boolean isAnalogOverrideHrsPresent() {
		return analogOverrideHrAdjuster.isDisplayed();

	}

	public String getAnalogSpaceSensorOverride() {
		return analogSpaceSensorOverrideText.getText();

	}

	public void clickAnalogSetPointFLabel() {
		HelpMethods.explicitWait_milliSeconds(500);
		analogSetpointFLabel.click();
	}

	public boolean isAnalogTemperatureValuePresent() {
		return analogTemperatureValue.isDisplayed();
	}

	public String getAnalogSetpointAdjustLimit() {
		return analogSetpointAdjustLimitText.getText();
	}

	public void clickConfirmPopupElement() {
		HelpMethods.explicitWait_milliSeconds(500);
		ConfirmPopupElement.click();
	}

	public void clickBackArrow() {
		HelpMethods.explicitWait_milliSeconds(1000);
		BackArrow.click();
		HelpMethods.explicitWait_milliSeconds(1000);
	}

	public boolean isremoteDisplayRadioButtonAnalogPresent() {
		return AnalogRadioButtonInLabel.isDisplayed();
	}

	public void clickDigitalRadioButtons() {
		HelpMethods.explicitWait_milliSeconds(500);
		digitalRadioButtons.click();
		HelpMethods.explicitWait_milliSeconds(500);

	}

	public void clickDigitalSubmenu() {
		digitalSubmenu.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickDigitalSpaceSensorsOptionLabel() {
		HelpMethods.explicitWait_milliSeconds(500);
		digitalSpaceSensorsOptionLabel.click();
	}

	public boolean isDigitalTemperatureAdjusterPresent() {
		return digitalSpaceSensorsTempAdjuster.isDisplayed();
	}

	public String getDigitalSpaceSensors() {
		return digitalSpaceSensorsText.getText();
	}

	public void clickDigitalOverrideHrsOptionLabel() {
		HelpMethods.explicitWait_milliSeconds(300);
		digitalOverrideHrsLabel.click();
	}

	public boolean isDigitalOverrideHrsPresent() {
		return digitalOverrideHrAdjuster.isDisplayed();

	}

	public String getDigitalSpaceSensorOverride() {
		return digitalSpaceSensorOverrideText.getText();

	}

	public void clickDigitalSetPointFLabel() {
		HelpMethods.explicitWait_milliSeconds(500);
		digitalSetpointFLabel.click();
	}

	public boolean isDigitalTemperatureValuePresent() {
		return digitalTemperatureValue.isDisplayed();
	}

	public String getDigitalSetpointAdjustLimit() {
		return digitalSetpointAdjustLimitText.getText();
	}

	public boolean isremoteDisplayRadioButtonDigitalPresent() {
		return DigitalRadioButtonInLabel.isDisplayed();
	}

	public boolean isTSSpaceSensorClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		TSSpaceSensor.click();
		return TSSpaceSensor.isDisplayed() && TSSpaceSensor.isEnabled();
	}

	public boolean isBACnetTempClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		BACnetTempRadioButton.click();
		return BACnetTempRadioButton.isDisplayed() && BACnetTempRadioButton.isEnabled();

	}

	public boolean isHumidityClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		HumidityCheckbox.click();
		return HumidityCheckbox.isDisplayed() && HumidityCheckbox.isEnabled();
	}

	public boolean isRemoteDisplayClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		RemoteDisplayRadioButton.click();
		return RemoteDisplayRadioButton.isDisplayed() && RemoteDisplayRadioButton.isEnabled();

	}

	public boolean islastSelectedRadioButtonBPresent() {
		return BACnetTempRadioButtonInLabel.isDisplayed();
	}

	public void clickReturn() {
		Return.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public boolean isNoReturnSensorROptionClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		rNoReturnSensorRadioButton.click();
		return rNoReturnSensorRadioButton.isDisplayed() && rNoReturnSensorRadioButton.isEnabled();
	}

	public boolean isanalogROptionClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		rAnalogRadioButton.click();
		return rAnalogRadioButton.isDisplayed() && rAnalogRadioButton.isEnabled();
	}

	public boolean isdigitalROptionClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		rDigitalRadioButton.click();
		return rDigitalRadioButton.isDisplayed() && rDigitalRadioButton.isEnabled();
	}

	public boolean isBACnetTempROptionClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		rBACnetTempRadioButton.click();
		return rBACnetTempRadioButton.isDisplayed() && rBACnetTempRadioButton.isEnabled();
	}

	public boolean isHumidityCBOptionClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		rHumidityCheckbox.click();
		return rHumidityCheckbox.isDisplayed() && rHumidityCheckbox.isEnabled();
	}

	public boolean islastSelectedRadioButtonRPresent() {
		return remoteDisplayRadioButtonInLabel.isDisplayed();
	}

	public void clickOutdoor() {
		HelpMethods.explicitWait_milliSeconds(500);
		Outdoor.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public boolean isoSNoOASensorRadioButtonClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		oSNoOASensorRadioButton.click();
		return oSNoOASensorRadioButton.isDisplayed() && oSNoOASensorRadioButton.isEnabled();
	}

	public boolean isoSAnalogROptionClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		oSAnalogRadioButton.click();
		return oSAnalogRadioButton.isDisplayed() && oSAnalogRadioButton.isEnabled();
	}

	public boolean isoSdigitalROptionClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		oSdigitalRadioButton.click();
		return oSdigitalRadioButton.isDisplayed() && oSdigitalRadioButton.isEnabled();
	}

	public boolean isoSGlobalBroadcastClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		oSGlobalBroadcastRadioButton.click();
		return oSGlobalBroadcastRadioButton.isDisplayed() && oSGlobalBroadcastRadioButton.isEnabled();
	}

	public boolean isoSBACnetTempROptionClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		oSBACnetTempRadioButton.click();
		return oSBACnetTempRadioButton.isDisplayed() && oSBACnetTempRadioButton.isEnabled();
	}

	public boolean isoSHumidityCBOptionClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		oSHumiditycheckbox.click();
		return oSHumiditycheckbox.isDisplayed() && oSHumiditycheckbox.isEnabled();
	}

	public void clickSupply() {
		HelpMethods.explicitWait_milliSeconds(500);
		Supply.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public boolean isSuAnalogROptionClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		suAnalogRadioButton.click();
		return suAnalogRadioButton.isDisplayed() && suAnalogRadioButton.isEnabled();
	}

	public boolean isSudigitalROptionClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		suDigitalRadioButton.click();
		return suDigitalRadioButton.isDisplayed() && suDigitalRadioButton.isEnabled();
	}

	public boolean islastSelectedRadioButtonSDPresent() {
		return suDigitalRadioButtonInLabel.isDisplayed();
	}

	public void clickCO2() {
		HelpMethods.explicitWait_milliSeconds(1000);
		CO2.click();
	}

	public boolean isNoCO2SensorClickable() {
		HelpMethods.explicitWait_milliSeconds(500);
		NoCO2SensorRadioButton.click();
		return NoCO2SensorRadioButton.isDisplayed() && NoCO2SensorRadioButton.isEnabled();

	}

	public void clickCO2digitalRadioButtonsLabel() {
		HelpMethods.explicitWait_milliSeconds(500);
		CO2digitalRadioButtons.click();
	}

	public void clickCO2DigitalSubmenu() {
		CO2digitalSubmenu.click();
		HelpMethods.explicitWait_milliSeconds(1000);
	}

	public void clickCO2SensorOffsetintsOptionLabel() {
		HelpMethods.explicitWait_milliSeconds(500);
		CO2SensorOffsetintsOptionLabel.click();
	}

	public void clickCO2SensorOffsetIncreaseTempAdjuster() {

		for (int i = 0; i < 5; i++) {
			HelpMethods.explicitWait_milliSeconds(500);
			CO2SetpointsIncreaseTempAdjuster.click();
		}
	}

	public void clickCO2SensorOffsetDecreaseTempAdjuster() {
		HelpMethods.explicitWait_milliSeconds(500);
		for (int i = 0; i < 2; i++) {
			HelpMethods.explicitWait_milliSeconds(500);
			CO2SetpointsDecreaseTempAdjuster.click();
		}
	}

	public String getCO2SensorOffsetText() {
		return CO2SensorOffsetText.getText();
	}

	public void clickCO2SetpointLabel() {
		HelpMethods.explicitWait_milliSeconds(500);
		CO2SetpointLabel.click();
	}

	public void clickCO2SetpointsIncreaseTempAdjuster() {

		for (int i = 0; i < 5; i++) {
			HelpMethods.explicitWait_milliSeconds(500);
			CO2SetpointsIncreaseTempAdjuster.click();
		}

	}

	public void clickCO2SetpointsDecreaseTempAdjuster() {
		HelpMethods.explicitWait_milliSeconds(1000);
		for (int i = 0; i < 2; i++) {
			HelpMethods.explicitWait_milliSeconds(500);
			CO2SetpointsDecreaseTempAdjuster.click();
		}
	}

	public String getkCO2SetpointsText() {
		return CO2SetpointText.getText();
	}

	public String getCO2SetpointContentValueactive() {
		HelpMethods.explicitWait_milliSeconds(1000);
		return CO2SetpointContentValueactive.getText();

	}

	public String getCO2SensorContentValue() {
		HelpMethods.explicitWait_milliSeconds(1000);
		return CO2SensorContentValue.getText();

	}

	public String getReadsCO2BroadcastText() {
		return ReadsCO2BroadcastText.getText();
	}

	public String getReadsCO2BACnetText() throws InterruptedException {
		return ReadsCO2BACnetText.getText();
	}

	public void clickSaveButton() {
		SaveButton.click();

	}
}
