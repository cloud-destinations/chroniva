package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import StepDefinitions.HelpMethods;
import StepDefinitions.Hooks;
import utils.TestData;

public class MonitoringPage extends HelpMethods {

	@FindBy(css = ".dropdown-button")
	WebElement customDropdown;

	@FindBy(xpath = "//button[text() = 'Custom']")
	WebElement customOption;

	@FindBy(xpath = "//button[text() = 'Airflow']")
	WebElement airflowOption;

	@FindBy(xpath = "//nav[@class='nav']")
	WebElement moduleHeaderLabels;

	@FindBy(xpath = "//div[@class='tabs-container horizontal']")
	WebElement subModuleHeaderLabels;
	// Editing Functionality
	@FindBy(xpath = "//button[@class='editbutton float-right']")
	WebElement editButton;

	@FindBy(css = ".date-buttons-container")
	WebElement dateButtons;

	@FindBy(css = ".chart-container>canvas")
	WebElement graphContainer;

	@FindBy(xpath = "//h2[text()='Dashboard Editor']")
	WebElement editHeader;

	@FindBy(xpath = "//p[text()='Please select the data you wish to display on the dashboard']")
	WebElement editHeaderDescription;

	@FindBy(css = ".tabs-container.vertical button")
	List<WebElement> telementryNamesTab;

	@FindBy(css = ".tabs-container.vertical button.tab-button.active")
	WebElement TemperatureTelementryLabel;

	@FindBy(css = "input[type='checkbox']+div.checklabel")
	List<WebElement> TelemetryValues;

	@FindBy(xpath = "//button[contains(@class, 'inactive') and text()='Humidity']")
	WebElement humidityLabelButton;

	@FindBy(xpath = "//button[contains(@class, 'inactive') and text()='Pressure']")
	WebElement pressureLabelButton;

	@FindBy(xpath = "//button[contains(@class, 'inactive') and text()='Damper']")
	WebElement damperLabelButton;

	@FindBy(xpath = "//button[contains(@class, 'inactive') and text()='Airflow']")
	WebElement airflowLabelButton;

	@FindBy(xpath = "//button[contains(@class, 'inactive') and text()='Fans']")
	WebElement fansLabelButton;

	@FindBy(xpath = "//button[contains(@class, 'tab-button') and text()='Misc.']")
	WebElement miscLabelButton;

	@FindBy(xpath = "//button[not(contains(@class, 'disable')) and text()='Cancel']")
	WebElement editPageCancelButton;

	@FindBy(xpath = "//button[contains(@class, 'disable') and text()='Save']")
	WebElement editPageSaveButtonDisable;

	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> checkboxLabel;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement editpageSaveButtonEnable;

	@FindBy(xpath = "//div[text()='Saved successfully!'] ")
	public WebElement savedSuccessMessage;
	// for single telementry value
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement checkboxLabel1;

	@FindBy(xpath = "//p[text()='Outdoor Air CFM']")
	WebElement unCheckedLabelText;

	@FindBy(xpath = "//*[text()='Custom']")
	WebElement customTextElement;

	@FindBy(xpath = "//a[@class='nav-item active']")
	WebElement activeElementModule;

	@FindBy(xpath = "//button[@class='tab-button active ']")
	WebElement MonitorElementModule;

	@FindAll({ @FindBy(xpath = "(//button[@class='tab-button inactive '])[1]"),
			@FindBy(xpath = "//button[text()='Space Temp']") })
	public List<WebElement> spacetempElementButtons;

	@FindBy(xpath = "//button[text()='Space Temp']")
	WebElement spacetempElementButton;

	@FindBy(xpath = "//button[text()='Mode']")
	WebElement modeElementButton;

	@FindBy(xpath = "//div[text()='Event Log']")
	WebElement eventLogButton;

	@FindBy(xpath = "//button[text()='Economizer']")
	WebElement economizerElementButton;

	@FindBy(xpath = "//button[text()='Schedule']")
	WebElement scheduleElementButton;

	@FindBy(xpath = "//button[text()='Graphs']")
	WebElement graphElementButton;

	@FindBy(css = ".setPoint-labelCard .label-container")
	List<WebElement> spaceTempItemCard;

	@FindBy(xpath = "//img[@alt='Increase temperature']")
	WebElement temperatureButton;

	@FindBy(css = ".temperature-label")
	WebElement temperatureLableCard;

	@FindBy(css = "input[type='radio']+label")
	List<WebElement> modeValidateElement;

	@FindBy(css = ".card .label-class")
	WebElement economizerCardLable;

	@FindBy(css = "label.switch+.slider-text")
	WebElement forceClosedSlider;

	@FindBy(css = ".economizer-telemetry-container .label-class")
	List<WebElement> economizerValidateElement;

	@FindBy(css = ".radio-option>input+label")
	List<WebElement> schduleValidateElement;

	@FindBy(css = ".label-class")
	List<WebElement> dashboardPageLables;

	WebDriver driver = Hooks.getDriver();

	public MonitoringPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void selectCustomOption() throws InterruptedException {
		customDropdown.click();
		customOption.click();
	}

	public void verifyDisplayedLabels() {

		Set<String> actualValues = new HashSet<String>();
		for (WebElement elements : dashboardPageLables) {
			actualValues.add(elements.getText());
		}
		assertEquals(actualValues, TestData.EXPECTED_MONITORING_DASHBOARD_VALUES, "Dashboard values not mactched");

	}

	public void verifyModuleHeaderLabels() {

		assertTrue("Module header labels are not displayed.", moduleHeaderLabels.isDisplayed());
		String moduleText = moduleHeaderLabels.getText();
		assertTrue("Config module is not displayed correctly.", moduleText.contains("Monitoring"));
		assertTrue("Config module is not displayed correctly.", moduleText.contains("Config"));
		assertTrue("Service module is not displayed correctly.", moduleText.contains("Service"));
		String elementText = activeElementModule.getText().trim();
		assertEquals("Monitoring", elementText, "Active tab is showing wrong");
	}

	public void verifySubModuleHeaderLabels() {
		assertTrue("Submodule header labels are not displayed.", subModuleHeaderLabels.isDisplayed());
		String subModuleText = subModuleHeaderLabels.getText();
		assertTrue("Dashboard submodule is not displayed correctly.", subModuleText.contains("Dashboard"));
		assertTrue("Space Temp submodule is not displayed correctly.", subModuleText.contains("Space Temp"));
		// assertTrue("Mode submodule is not displayed correctly.",
		// subModuleText.contains("Mode"));
		assertTrue("Economizer submodule is not displayed correctly.", subModuleText.contains("Economizer"));
		assertTrue("Schedule submodule is not displayed correctly.", subModuleText.contains("Schedule"));
		// assertTrue("Graphs submodule is not displayed correctly.",
		// subModuleText.contains("Graphs"));

	}

	public void verifyDropdownLabel() {
		customDropdown.click();
		assertEquals(airflowOption.getText(), "Airflow", "Airflow label is not displayed correctly.");
		assertEquals(customOption.getText(), "Custom", "Custom label is not displayed correctly.");
	}

	public void navigateToCustomPage() {
		explicitWait_milliSeconds(500);
		customDropdown.click();
		explicitWait_milliSeconds(500);
		customOption.click();
		explicitWait_milliSeconds(500);
	}

	public void clickEditButton() {
		assertEquals("Edit", editButton.getText(), "Edit button label is not displayed correctly.");
		editButton.click();
	}

	public void verifyEditHeadingPageText() {
		explicitWait_milliSeconds(1000);
		String ExpectedEditHeader = "Dashboard Editor";
		String ExpectedEditHeaderDescription = "Please select the data you wish to display on the dashboard";
		editHeader.isDisplayed();
		editHeaderDescription.isDisplayed();
		String actualEditHeader = editHeader.getText().trim();
		String actualEditHeaderDescription = editHeaderDescription.getText().trim();

		assertEquals(ExpectedEditHeader, actualEditHeader, "Edit header text does not match!");
		assertEquals(ExpectedEditHeaderDescription, actualEditHeaderDescription,
				"Edit header description text does not match!");
	}

	public void verifyTelementryNameHeading() {

		ArrayList<String> actulaLabels = new ArrayList<String>();
		List<String> expectedLabels = TestData.EXPECTED_TELEMETRY_VALUES;
		for (WebElement labelCard : telementryNamesTab) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Temperature Telemetry values labels not matched", expectedLabels, actulaLabels);
	}

	public void verifyTelementryValue(String expectedLabel, List<String> expectedLabels) {

		explicitWait_milliSeconds(1000);
		assertEquals(expectedLabel, TemperatureTelementryLabel.getText().trim(),
				"Telemetry label text does not match!");
		ArrayList<String> actulaLabels = new ArrayList<String>();
		for (WebElement labelCard : TelemetryValues) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Telemetry values labels not matched", expectedLabels, actulaLabels);
		assertTrue("Save button is not displayed!", editPageSaveButtonDisable.isDisplayed());
		assertTrue("Cancel button is not displayed!", editPageCancelButton.isDisplayed());
	}

	public void clickHumidityTelementryButton() {
		humidityLabelButton.click();
	}

	public void clickPressureTelementryValue() {
		pressureLabelButton.click();

	}

	public void clickDamperTelementryValue() {
		damperLabelButton.click();
	}

	public void clickFansTelementryValue() {
		fansLabelButton.click();
	}

	public void clickAirflowTelementryValue() {
		airflowLabelButton.click();
	}

	public void clickMiscTelementryValue() {
		miscLabelButton.click();
	}

	public void userChecksTelemetryValueAndSaves() {
		editButton.click();
		explicitWait_milliSeconds(1000);
		pressureLabelButton.click();
		airflowLabelButton.click();
		explicitWait_milliSeconds(1000);
		checkboxLabel1.click();
		explicitWait_milliSeconds(1000);
		editpageSaveButtonEnable.click();
		explicitWait_milliSeconds(1000);
	}

	public int getCustomDashbpardPageLablesCount() {
		return dashboardPageLables.size();
	}

	public void dropdownShouldUpdateToCustom() {
		Assert.assertTrue("'Custom' text is not displayed in the element.", customTextElement.isDisplayed());
	}

	public void verifyClickSpaceTempModule() {
		explicitWait_milliSeconds(500);
		spacetempElementButton.click();
		explicitWait_milliSeconds(1000);
	}

	public void validateSpaceTempPage() {
		ArrayList<String> actulaLabels = new ArrayList<String>();
		List<String> expectedLabels = TestData.EXPECTED_SPACETEMP_VALUES;
		for (WebElement labelCard : spaceTempItemCard) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Page left side values labels not matched", expectedLabels, actulaLabels);
	}

	public String getTempCardText() {
		return temperatureLableCard.getText();
	}

	public String getEconomizerCardText() {
		return economizerCardLable.getText();
	}

	public String getForceClosedText() {
		return forceClosedSlider.getText();
	}

	public boolean isEventLogButtonDisplayed() {
		return eventLogButton.isDisplayed();
	}

	public void verifyClickModeModule() {
		modeElementButton.click();
		explicitWait_milliSeconds(1000);
	}

	public void validateModePage() {
		ArrayList<String> actulaLabels = new ArrayList<String>();
		List<String> expectedLabels = TestData.EXPECTED_MODE_VALUES;
		for (WebElement labelCard : modeValidateElement) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Mode Page values labels not matched", expectedLabels, actulaLabels);
	}

	public void verifyClickEconomizerModule() {
		economizerElementButton.click();
		explicitWait_milliSeconds(1000);
	}

	public void validateEconomizerPage() {
		ArrayList<String> actulaLabels = new ArrayList<String>();
		List<String> expectedLabels = TestData.EXPECTED_ECONOMIZER_VALUES;
		for (WebElement labelCard : economizerValidateElement) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Economizer Page values labels not matched", expectedLabels, actulaLabels);
	}

	public void verifyClickScheduleModule() {
		scheduleElementButton.click();
		explicitWait_milliSeconds(1000);
	}

	public void validateSchedulePage() {
		ArrayList<String> actulaLabels = new ArrayList<String>();
		List<String> expectedLabels = TestData.EXPECTED_SCHDULE_VALUES;
		for (WebElement labelCard : schduleValidateElement) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Schedule Page values labels not matched", expectedLabels, actulaLabels);
	}

	public void verifyClickGraphsModule() {
		graphElementButton.click();
		explicitWait_milliSeconds(1000);
	}

	public void validateGraphsPage() {
		assertEquals(editButton.getText().trim(), "Graph Editor", "Schedule Page values labels not matched");
		assertTrue(dateButtons.isDisplayed(), "Date buttons not displayed");
		assertTrue(graphContainer.isDisplayed(), "Graph container not displayed");
	}

	public void IncreaseSP() throws InterruptedException {
		// Hold durations in seconds for each label
		int[] holdDurations = { 2, 3, 4, 5, 6, 7 };
		Actions actions = new Actions(driver);
		for (int i = 0; i < spaceTempItemCard.size() && i < holdDurations.length; i++) {
			WebElement label = spaceTempItemCard.get(i);
			label.click();
			Thread.sleep(500); // brief wait to ensure UI response
			// Press and hold the temperature increase button
			actions.clickAndHold(temperatureButton).perform();
			Thread.sleep(holdDurations[i] * 1000); // hold duration in milliseconds
			actions.release().perform();
			Thread.sleep(500); // short pause after release
			editpageSaveButtonEnable.click();
			Thread.sleep(1000); // optional wait before moving to the next label
		}
	}

}
