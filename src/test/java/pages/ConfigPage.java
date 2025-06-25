package pages;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import StepDefinitions.HelpMethods;
import StepDefinitions.Hooks;
import utils.TestData;

public class ConfigPage {

	@FindBy(linkText = "Config")
	WebElement configTab;

	@FindBy(css = ".topic-title")
	WebElement pageTitle;

	@FindBy(css = ".label-container>div")
	private List<WebElement> unitConfigLables;

	@FindBy(css = "button.config-setpoints")
	WebElement setpointsButton;

	@FindBy(css = "button.config-configInfo")
	WebElement configInfoButton;

	@FindBy(xpath = "//div[text()='Control Mode']")
	WebElement controlModeButton;

	@FindBy(xpath = "//div[text()='Cooling']")
	WebElement coolingButton;

	@FindBy(xpath = "//div[text()='Heating']")
	WebElement heatingButton;

	@FindBy(xpath = "//div[text()='Dehum']")
	WebElement dehumButton;

	@FindBy(xpath = "//div[text()='Preheat']")
	WebElement PreheatButton;

	@FindBy(xpath = "//div[text()='Heat Wheel']")
	WebElement heatWheelButton;

	@FindBy(xpath = "//div[text()='Heat Pump']")
	WebElement heaPumpButton;

	@FindBy(xpath = "//div[text()='OA Damper']")
	WebElement oADamperModeButton;

	@FindBy(xpath = "//div[text()='Fan/AFMS']")
	WebElement FanAFMSButton;

	@FindBy(xpath = "//div[text()='Pressure']")
	WebElement pressureButton;

	@FindBy(xpath = "//div[text()='Safety']")
	WebElement safetyButton;

	@FindBy(xpath = "//div[text()='Misc.']")
	WebElement miscButton;

	@FindBy(xpath = "//div[text()='Cooling Mode Enable']")
	WebElement coolingModeEnableLabel;

	@FindBy(xpath = "//div[text()='High Reset Source']")
	WebElement highResetSourceLabel;

	@FindBy(css = ".temperature-label")
	WebElement temperatureCardLabel;

	@FindBy(xpath = "//div[text()='Indoor Humidity High SP/ Low Reset']")
	WebElement indoorHumidityHSPLResetLabel;

	@FindBy(xpath = "//div[text()='Preheat Setpoint']")
	WebElement preheatSetpointLabel;

	@FindBy(xpath = "//div[text()='Heat Wheel Defrost Temp.']")
	WebElement heatWheelDefrostTempLabel;

	@FindBy(xpath = "//div[text()='Heat Pump Defrost Interval']")
	WebElement heatPumpDefrostIntervalLabel;

	@FindBy(xpath = "//div[text()='Economizer Min Position']")
	WebElement economizerMinPositionLabel;

	@FindBy(xpath = "//div[text()='Heating Min VFD']")
	WebElement heatingMinVFDLabel;

	@FindBy(xpath = "//div[text()='Duct Static Pressure']")
	WebElement ductStaticPressureLabel;

	@FindBy(xpath = "//div[text()='Low Temp Cutoff']")
	WebElement lowTempCutoffLabel;

	@FindBy(xpath = "//div[text()='Controlling Week Schedule']")
	WebElement controllingWeekScheduleLabel;

	@FindBy(xpath = "//div[text()='Schedule']")
	WebElement scheduleButton;

	@FindBy(css = "div.setPoint-labelCard")
	private List<WebElement> setpointLables;

	@FindBy(css = "button.pagination-btn:last-child")
	WebElement nextPageButton;

	WebDriver driver = Hooks.getDriver();

	public ConfigPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void clickConfigTab() {
		HelpMethods.explicitWait_milliSeconds(500);
		configTab.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickSetpointsButton() {
		setpointsButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickScheduleButton() {
		scheduleButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickConfigInfoButton() {
		configInfoButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickControlModeButton() {
		controlModeButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickCoolingButton() {
		coolingButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickHeatingButton() {
		heatingButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickDehumButton() {
		dehumButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickPreheatButton() {
		PreheatButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickHeatWheelButton() {
		heatWheelButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickHeaPumpButton() {
		heaPumpButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickOADamperModeButton() {
		oADamperModeButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickFanAFMSButton() {
		FanAFMSButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickPressureButton() {
		pressureButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickSafetyButton() {
		safetyButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickMiscButton() {
		miscButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public boolean isCoolingModeEnableLabelPresent() {
		return coolingModeEnableLabel.isDisplayed();
	}

	public boolean isHighResetSourceLabelPresent() {
		return highResetSourceLabel.isDisplayed();
	}

	public boolean isIndoorHumidityHSPLResetLabelPresent() {
		return indoorHumidityHSPLResetLabel.isDisplayed();
	}

	public boolean isPreheatSetpointLabelPresent() {
		return preheatSetpointLabel.isDisplayed();
	}

	public boolean isHeatWheelDefrostTempLabelPresent() {
		return heatWheelDefrostTempLabel.isDisplayed();
	}

	public boolean isHeatPumpDefrostIntervalLabelPresent() {
		return heatPumpDefrostIntervalLabel.isDisplayed();
	}

	public boolean isEconomizerMinPositionLabelPresent() {
		return economizerMinPositionLabel.isDisplayed();
	}

	public boolean isHeatingMinVFDLabelPresent() {
		return heatingMinVFDLabel.isDisplayed();
	}

	public boolean isDuctStaticPressureLabelPresent() {
		return ductStaticPressureLabel.isDisplayed();
	}

	public boolean isLowTempCutoffLabelPresent() {
		return lowTempCutoffLabel.isDisplayed();
	}

	public boolean isControllingWeekScheduleLabelPresent() {
		return controllingWeekScheduleLabel.isDisplayed();
	}

	public String getTemperatureCardLabel() {
		return temperatureCardLabel.getText();
	}

	public int getSetpointLablesCount() {
		int count = 0;
		while (true) {
			count = count + setpointLables.size();
			System.out.println("Number of elements on current page: " + setpointLables.size());

			if (!nextPageButton.isEnabled()) {
				System.out.println("Next Page button is disabled. Stopping.");
				break;
			}
			nextPageButton.click();
		}
		return count;
	}

	public String getPageTitle() {
		return pageTitle.getText();
	}

	public void verifyTabNames() {
		ArrayList<String> actulaLabels = new ArrayList<String>();
		List<String> expectedLabels = TestData.EXPECTED_CONFIG_VALUES;

		for (WebElement labelCard : unitConfigLables) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Tab labels not matched", expectedLabels, actulaLabels);
	}
}
