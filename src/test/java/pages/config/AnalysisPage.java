package pages.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import StepDefinitions.HelpMethods;
import StepDefinitions.Hooks;

public class AnalysisPage {

	@FindBy(xpath = "//button[text()='Space Temp']")
	WebElement spaceTempButton;

	@FindBy(xpath = "//button[text()='Mode']")
	WebElement modeButton;

	@FindBy(xpath = "//button[text()='Economizer']")
	WebElement economizerButton;

	@FindBy(xpath = "//button[text()='Schedule']")
	WebElement scheduleButton;

	@FindBy(xpath = "//button[text()='Graphs']")
	WebElement graphsButton;

	@FindBy(xpath = "//div[text()='Occupied Space Temp SP']")
	WebElement occupiedSpaceTempSPLabel;

	@FindBy(xpath = "//div[text()='Occupied Space Temperature Setpoint']")
	WebElement occupiedSpaceTempSetpointLabel;

	@FindBy(xpath = "//div[text()='Event Log']")
	WebElement eventLogButton;

	@FindBy(xpath = "//p[text()='Occupied Cooling Setpoint']")
	WebElement occupiedCoolingSetpointLabel;

	@FindBy(xpath = "//label[text()='Cool']")
	WebElement coolRadioButtonLabel;

	@FindBy(xpath = "//p[text()='Economizer Setpoint']")
	WebElement economizerSetpointLabel;

	@FindBy(xpath = "//p[text()='Minimum Economizer Position']")
	WebElement minimumEconomizerPositionLabel;

	@FindBy(xpath = "//p[text()='Current Mode']")
	WebElement currentModelabel;

	@FindBy(xpath = "//label[text()='Force Unoccupied']")
	WebElement forceUnoccupiedLabel;

	@FindBy(xpath = "//button[text()='Graph Editor']")
	WebElement graphEditorButton;

	@FindBy(xpath = "//button/span[text()='Custom']")
	WebElement custonButton;

	@FindBy(linkText = "Monitoring")
	WebElement monitoringTab;

	WebDriver driver = Hooks.getDriver();

	public AnalysisPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void clickSpaceTempButton() {
		HelpMethods.explicitWait_milliSeconds(500);
		spaceTempButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickMonitoringButton() {
		HelpMethods.explicitWait_milliSeconds(500);
		monitoringTab.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickModeButton() {
		HelpMethods.explicitWait_milliSeconds(500);
		modeButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickEconomizerButton() {
		HelpMethods.explicitWait_milliSeconds(500);
		economizerButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickScheduleButton() {
		HelpMethods.explicitWait_milliSeconds(500);
		scheduleButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickGraphsButton() {
		HelpMethods.explicitWait_milliSeconds(500);
		graphsButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public boolean osTempSPLabelPresnt() {
		return occupiedSpaceTempSPLabel.isDisplayed();
	}

	public boolean osTempSetpointLabelPresnt() {
		return occupiedSpaceTempSetpointLabel.isDisplayed();
	}

	public boolean eventLogButtonPresnt() {
		return eventLogButton.isDisplayed();
	}

	public boolean occupiedColingSPPLabelPresnt() {
		return occupiedCoolingSetpointLabel.isDisplayed();
	}

	public boolean coolRadioButtonPresnt() {
		return coolRadioButtonLabel.isDisplayed();
	}

	public boolean economizerSetpointLabelPresnt() {
		return economizerSetpointLabel.isDisplayed();
	}

	public boolean minimumEconomiserPositionLabelPresnt() {
		return minimumEconomizerPositionLabel.isDisplayed();
	}

	public boolean currentModeLabelPresnt() {
		return currentModelabel.isDisplayed();
	}

	public boolean forceUnoccupiedLabelPresnt() {
		return forceUnoccupiedLabel.isDisplayed();
	}

	public boolean graphEditorButtonPresnt() {
		return graphEditorButton.isDisplayed();
	}

	public boolean customListPresnt() {
		return custonButton.isDisplayed();
	}
}
