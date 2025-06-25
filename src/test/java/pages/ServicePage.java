package pages;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import StepDefinitions.HelpMethods;
import StepDefinitions.Hooks;
import utils.TestData;

public class ServicePage extends HelpMethods {

	@FindBy(xpath = "//a[text()='Service']")
	WebElement serviceTab;

	@FindBy(css = ".topic-title")
	WebElement servicePageTitle;

	@FindBy(xpath = "//div[text()='EVAC']")
	WebElement evacButton;

	@FindBy(xpath = "//div[text()='Air Balance']")
	WebElement airBalanceButton;

	@FindBy(xpath = "//div[text()='Charge']")
	WebElement chargeButton;

	@FindBy(xpath = "//p[text()='Please select a date range']")
	WebElement daterangeText;

	@FindBy(xpath = "//div[text()='Filter By']")
	WebElement FilterBy;

	@FindBy(xpath = "//div[text()='Event Log']")
	WebElement eventLogTitle;

	@FindBy(css = ".filter-option")
	private List<WebElement> pageFieldLables;

	@FindBy(xpath = "//button[text()='Apply']")
	WebElement Apply;

	@FindBy(xpath = "//span[text()='Start Date']")
	WebElement daterange;

	@FindBy(xpath = "(//div[@class='days-grid'])[2]")
	WebElement days;

	@FindBy(xpath = "(//div[@class='month-header'])[2]")
	WebElement month;

	@FindBy(xpath = "//button[text()='Done']")
	WebElement Done;
	//
	@FindBy(xpath = "//div[text()='Test']")
	WebElement testButton;

	@FindBy(xpath = "//button[text()='Event Log']")
	WebElement eventLogButton;

	@FindBy(css = ".caution-question")
	WebElement cautionQuesion;

	@FindBy(css = ".caution-cancel-button")
	WebElement cautionCancelButton;

	@FindBy(css = ".caution-confirm-button ")
	WebElement cautionContinueButton;

	@FindBy(css = ".topic-title")
	WebElement testPageTitle;

	@FindBy(css = ".back-arrow")
	WebElement backArrowButton;

	@FindBy(css = ".service-test-card-label")
	private List<WebElement> serviceTestCardLabels;

	@FindBy(xpath = "//div[@class='serivce-test-footer-text']/text()")
	WebElement serviceTestFooterText;

	@FindBy(xpath = "//button[contains(text(),'Stop')]")
	WebElement stopTestButton;

	@FindBy(xpath = "//div[text()='Event Log']")
	WebElement testEventLogButton;

	@FindBy(xpath = "//*[text()='Event Log']")
	WebElement eventLogButton_TopicPage;

	@FindBy(xpath = "//button[text()='Details']")
	WebElement testDetailsButton;

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement stopTestConfirmButton;

	@FindBy(xpath = "//div[text()='Fans']")
	WebElement fansButton;

	@FindBy(xpath = "//div[text()='Dampers']")
	WebElement dampersButton;

	@FindBy(xpath = "//div[text()='Heat Wheel']")
	WebElement heatWheelButton;

	@FindBy(xpath = "//div[text()='Pre-heat']")
	WebElement preHeatButton;

	@FindBy(xpath = "//button[text()='Pre-heat']")
	WebElement preHeatTab;

	@FindBy(xpath = "//button[contains(@class, 'disable') and text()='Pre-heat']")
	WebElement diabledPreHeatTab;

	@FindBy(xpath = "//div[text()='Heat Pump']")
	WebElement heatPumpButton;

	@FindBy(xpath = "//div[text()='Cooling']")
	WebElement coolingButton;

	@FindBy(xpath = "//img[@alt='Increase temperature']")
	WebElement increaseTemperatureButton;

	@FindBy(xpath = "//button[text()='Force']")
	WebElement forceButton;

	@FindBy(xpath = "(//button[text()='Force'])[2]")
	WebElement forceConfirmButton;

	@FindBy(xpath = "//button[text()='Clear']")
	WebElement clearButton;

	@FindBy(xpath = "(//button[text()='Clear'])[2]")
	WebElement clearConfirmButton;

	@FindBy(xpath = "//button[contains(@class, 'disable') and text()='Exhaust Fans']")
	WebElement disabledExhaustFansButton;

	@FindBy(xpath = "//button[contains(text(), 'Supply Fans')]")
	WebElement supplyFansTab;

	@FindBy(xpath = "//button[text()='Compressors']")
	WebElement compressorTab;

	@FindBy(xpath = "//button[contains(@class, 'disable') and text()='Compressors']")
	WebElement disabledCompressorTab;

	@FindBy(xpath = "//button[text()='Return Fans']")
	WebElement returnFansTab;

	@FindBy(xpath = "//button[text()='Condenser Fans']")
	WebElement condenserFansTab;

	@FindBy(css = ".pagination-btn:last-of-type")
	WebElement nextPageButton;

	@FindBy(css = ".pagination-btn")
	WebElement previosPageButton;

	@FindBy(css = "button.stage-toggle.disable.off")
	private List<WebElement> heatPumpDisabledToggles;

	@FindBy(css = ".labelDescription.active")
	WebElement activeTileLabel;

	@FindBy(xpath = "//button[text()='SCR 1']")
	WebElement scr1Button_PreHeat;

	@FindBy(css = ".temperature-label")
	WebElement temperatureLabel;

	@FindBy(css = ".temperature-value")
	WebElement temperatureValue;

	@FindBy(css = ".contentValue.active")
	WebElement activeTileValue;

	@FindBy(css = ".status-text")
	WebElement status;

	@FindBy(css = "button.tab-button")
	private List<WebElement> tabButtons;

	@FindBy(xpath = "//div[@class='service-test-card  '][1]")
	WebElement fansServiceTestCard;

	@FindBy(xpath = "//div[@class='service-test-card  '][2]")
	WebElement damberServiceTestCard;

	@FindBy(xpath = "//div[@class='service-test-card  '][3]")
	WebElement heatwheelServiceTestCard;

	@FindBy(xpath = "//div[@class='service-test-card  '][4]")
	WebElement preheatServiceTestCard;

	@FindBy(xpath = "//div[@class='service-test-card  '][5]")
	WebElement heatpumpServiceTestCard;

	@FindBy(xpath = "//div[@class='service-test-card  '][6]")
	WebElement coolingServiceTestCard;

	@FindBy(xpath = "//button[contains(text(), 'Supply Fans')]")
	WebElement fansPageLabel;

	@FindBy(xpath = "//div[text() = 'Return Air Damper']")
	WebElement damperPageLabel;

	@FindBy(xpath = "//button[text()='Heat Wheel Enable']")
	WebElement heatWheelLabel;

	@FindBy(xpath = "//div[text()='Supply Fan Speed ']")
	WebElement preHeatPageLabel;

	@FindBy(xpath = "//button[text()='Emergency Heat']")
	WebElement heatPumpPageLabel;

	@FindBy(xpath = "//button[text()='Condenser Fans']")
	WebElement coolingPageLabel;

	@FindBy(xpath = "//div[text()='Test']")
	WebElement textCardLabel;

	@FindBy(xpath = "//button[@class='caution-confirm-button caution-stop-button']")
	WebElement cautionYesButton;

	@FindBy(xpath = "//button[@class='caution-cancel-button']")
	WebElement cautionNoButton;

	@FindBy(xpath = "//h1[text()='Service Test Mode']")
	WebElement serviceTestModulePageLabel;

	@FindBy(xpath = "//div[@class='progress-card-spinner']")
	WebElement testProgressCardSpinnerIcon;

	@FindBy(xpath = "//span[@class='status-text']")
	WebElement testStatusLabel;

	@FindBy(xpath = "//div[@class='progress-card-timer']")
	WebElement progressCardTimer;

	@FindBy(xpath = "//h1[text()='Select a Service Mode']")
	WebElement serviceModulePageLabel;

	@FindBy(xpath = "//button[text()='Stop']")
	WebElement StopButtonTestModule;

	@FindBy(xpath = "//h1[@class='topic-title']")
	WebElement coolingHeadingLabel;

	@FindBy(xpath = "//button[@class='tab-button active ']")
	WebElement supplyFansHeadingLabel;

	@FindBy(xpath = "//button[text()='Compressors']")
	WebElement compresserHeadingLabel;

	@FindBy(xpath = "//button[contains(@class, 'disable') and text()='CW Valve']")
	WebElement disabledCWValueHeadingLabel;

	@FindBy(css = "button.stage-toggle.off:not(.disable)")
	WebElement toggleButtonOff;

	@FindBy(css = "button.stage-toggle.on")
	WebElement toggleButtonOn;

	@FindBy(css = "p.warning-description-text")
	WebElement warningText_PreHeat;

	@FindBy(xpath = "//img[@alt='Close']")
	WebElement closeWarning;

	@FindBy(css = ".serviceItem-card.disable")
	private List<WebElement> disabledItemCard;

	WebDriver driver = Hooks.getDriver();

	public ServicePage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void clickServiceTab() {
		HelpMethods.explicitWait_milliSeconds(500);
		serviceTab.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public boolean isdaterangeTextPresent() {
		return daterangeText.isDisplayed();
	}

	public boolean isEVACButtonPresent() {
		return evacButton.isDisplayed();
	}

	public boolean isAirBalanceButtonPresent() {
		return airBalanceButton.isDisplayed();
	}

	public boolean isChargeButtonPresent() {
		return chargeButton.isDisplayed();
	}

	public void clickFilterBy() {
		HelpMethods.explicitWait_milliSeconds(500);
		FilterBy.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public boolean iseventLogTitlePresent() {
		return eventLogTitle.isDisplayed();
	}

	public void clickdaterange() {
		HelpMethods.explicitWait_milliSeconds(500);
		daterange.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void verifyPageFieldLables(List<String> expectedLabels) {
		ArrayList<String> actulaLabels = new ArrayList<String>();

		for (WebElement labelCard : pageFieldLables) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Tab labels not matched", expectedLabels, actulaLabels);
	}

	public void selectCheckboxes() {
		// Define the checkbox indices you want to select (1-based indexing)
		int[] indicesToSelect = { 0, 1, 3, 4, 2 }; // 1st, 2nd, 4th, 5th, and 3rd (0-based indexing)

		for (int index : indicesToSelect) {
			if (index < pageFieldLables.size()) {
				pageFieldLables.get(index).click();
				HelpMethods.explicitWait_milliSeconds(300);
			}
		}
		// Click on the Apply button
		Apply.click();
	}

	public void selectDate() throws InterruptedException {
		// 1. Print current visible month
		String currentMonth = month.getText();
		System.out.println("Currently visible month: " + currentMonth);
		// 2. Define list of date pairs
		int[][] datePairs = { { 3, 12 }, { 4, 15 }, { 15, 25 }, { 20, 26 } };
		// 3. Pick one random pair
		Random random = new Random();
		int[] selectedPair = datePairs[random.nextInt(datePairs.length)];
		int startDay = selectedPair[0];
		int endDay = selectedPair[1];
		System.out.println("Selected date range: " + startDay + " to " + endDay);
		// 4. Get all day elements
		List<WebElement> dayElements = days.findElements(By.tagName("button"));
		// 5. Click start and end day only
		int clicked = 0;
		for (WebElement day : dayElements) {
			String text = day.getText().trim();
			if (!text.isEmpty()) {
				try {
					int dayNumber = Integer.parseInt(text);
					if (dayNumber == startDay || dayNumber == endDay) {
						day.click();
						clicked++;
						Thread.sleep(300);
						if (clicked == 2)
							break; // done with both dates
					}
				} catch (NumberFormatException e) {
					// Skip invalid numbers
				}
			}
		}
		HelpMethods.explicitWait_milliSeconds(300);
		Done.click();
	}

	//
	public boolean isTestButtonPresent() {
		return testButton.isDisplayed();
	}

	public boolean isEventLogButtonPresent() {
		return eventLogButton.isDisplayed();
	}

	public void clickeventLogButton() {
		eventLogButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public String getServicePageTitle() {
		return servicePageTitle.getText();
	}

	public void clickTestButton() {
		testButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public String getCautionQuestionText() {
		return cautionQuesion.getText();
	}

	public String getCautionCancelButtonText() {
		return cautionCancelButton.getText();
	}

	public String getCautionContinueButtonText() {
		return cautionContinueButton.getText();
	}

	public void clickCautionContinueButton() {
		if (isElementPresent(cautionContinueButton)) {
			clickElement(cautionContinueButton);
		} else {
			System.out.println("Caution Continue button not found, moving to next action.");
		}
	}

	public String getServiceTestModeTitleText() {
		return testPageTitle.getText();
	}

	public String getServiceTestFooterText() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String text = (String) js.executeScript(
				"return document.querySelector('.serivce-test-footer-text').childNodes[0].nodeValue.trim();");
		return text.trim();
	}

	public boolean isStopTestButtonPresent() {
		return stopTestButton.isDisplayed();
	}

	public boolean isTestDetailsButtonPresent() {
		return testDetailsButton.isDisplayed();
	}

	public boolean isTestEventLogButtonPresent() {
		return testEventLogButton.isDisplayed();
	}

	public boolean isDisabledExhaustFansButtonPresent() {
		return disabledExhaustFansButton.isDisplayed();
	}

	public boolean isEventLogButtonPresentInTopic() {
		return eventLogButton_TopicPage.isDisplayed();
	}

	public void verifyLabelCardNames() {
		ArrayList<String> actulaLabels = new ArrayList<String>();
		List<String> expectedLabels = TestData.EXPECTED_LABELS_TESTPAGE;
		for (WebElement labelCard : serviceTestCardLabels) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Service test card labels not matched", expectedLabels, actulaLabels);
	}

	public void clickStopTestButton() {
		stopTestButton.click();
		HelpMethods.explicitWait_milliSeconds(1000);
	}

	public WebElement WebelementStopTestButton() {
		return stopTestButton;
	}

	public void clickStopTestConfirmButton() {
		stopTestConfirmButton.click();
		HelpMethods.explicitWait_milliSeconds(2000);
	}

	public void clickFansButton() {
		fansButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickDampersButton() {
		dampersButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickHeatWheelButton() {
		heatWheelButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickPreHeatButton() {
		preHeatButton.click();
		HelpMethods.explicitWait_milliSeconds(1000);
	}

	public void clickHeatPumpButton() {
		heatPumpButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickCoolingButton() {
		coolingButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickCompressorsTab() {
		compressorTab.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickReturnFansTab() {
		returnFansTab.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickCondenserFansTab() {
		condenserFansTab.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void verifyTabNames() {
		ArrayList<String> actulaLabels = new ArrayList<String>();
		List<String> expectedLabels = TestData.EXPECTED_TABS_NAMES;

		for (WebElement labelCard : tabButtons) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Tab labels not matched", expectedLabels, actulaLabels);
	}

	public String getActiveCardText() {
		return activeTileLabel.getText();
	}

	public String getTemperatureCardText() {
		return temperatureLabel.getText();
	}

	public void clickForceButton() {
		forceButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickForceConfirmButton() {
		forceConfirmButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickIncreaseTempButton() {
		increaseTemperatureButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		increaseTemperatureButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public String getTemperatureCardValue() {
		return temperatureValue.getText();
	}

	public String getActiveCardValue() {
		return activeTileValue.getText();
	}

	public int getDisabledToggleCount_HeatPump() {
		return heatPumpDisabledToggles.size();
	}

	public void clickClearButton() {
		clearButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickClearConfirmButton() {
		clearConfirmButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickFansServiceTestCard() {
		fansServiceTestCard.click();

	}

	public void clickDamperServiceTestCard() {
		damberServiceTestCard.click();
	}

	public void clickHeatWheelServiceTestCard() {
		heatwheelServiceTestCard.click();
	}

	public void clickPreHeatServiceTestCard() {
		preheatServiceTestCard.click();
	}

	public void clickHeatpumpServiceTestCard() {
		heatpumpServiceTestCard.click();
	}

	public void clickCoolingServiceTestCard() {
		coolingServiceTestCard.click();
	}

	public boolean verifyFansServiceTestCard() {
		return fansPageLabel.isDisplayed();
	}

	public boolean verifyDamperServiceTestCard() {
		return damperPageLabel.isDisplayed();
	}

	public boolean verifyHeatWheelServiceTestCard() {
		return heatWheelLabel.isDisplayed();
	}

	public boolean verifyPreHeatServiceTestCard() {
		return preHeatPageLabel.isDisplayed();
	}

	public boolean verifyHeatpumpServiceTestCard() {
		return heatPumpPageLabel.isDisplayed();
	}

	public boolean verifyCoolingServiceTestCard() {
		return coolingPageLabel.isDisplayed();
	}

	public void clickBackArrowButton() {
		backArrowButton.click();
	}

	public boolean verifyserviceTestModulePageLabel() {
		return serviceTestModulePageLabel.isDisplayed();
	}

	public void clickCautionYesButton() {
		cautionYesButton.click();
	}

	public void clickCautionNoButton() {
		cautionNoButton.click();
	}

	public boolean verifyProgressCardSpinnerIcon() {
		return testProgressCardSpinnerIcon.isDisplayed();
	}

	public boolean verifyStatusLabel() {
		return testStatusLabel.isDisplayed();
	}

	public boolean verifyProgressCardTimer() {
		return progressCardTimer.isDisplayed();
	}

	public boolean verifyServiceModulePageLabel() {
		return serviceModulePageLabel.isDisplayed();
	}

	public boolean verifyStopButtonLabel() {
		return StopButtonTestModule.isDisplayed();
	}

	public boolean verifycoolingHeadingLabel() {
		return coolingHeadingLabel.isDisplayed();
	}

	public boolean verifyBackArrowButton() {
		return backArrowButton.isDisplayed();
	}

	public boolean verifySupplyFanHeadinfLabel() {
		return supplyFansHeadingLabel.isDisplayed();
	}

	public boolean verifyCompressserHeadingLabel() {
		return compresserHeadingLabel.isDisplayed();
	}

	public boolean verifyCondenserHeadingLabel() {
		return coolingPageLabel.isDisplayed();
	}

	public boolean verifyCWvalueHeadingLabel() {
		return disabledCWValueHeadingLabel.isDisplayed();
	}

	public boolean verifyDeatilsButton() {
		return testDetailsButton.isDisplayed();
	}

	public boolean verifyStopTestButton() {
		return stopTestButton.isDisplayed();
	}

	public boolean verifyEventLogButton_TopicPage() {
		return eventLogButton_TopicPage.isDisplayed();
	}

	public void clickPreHeatTab() {
		preHeatTab.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickToggleOffButton() {
		toggleButtonOff.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickToggleOnButton() {
		toggleButtonOn.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public String getToggleButtonText() {
		return toggleButtonOff.getText();
	}

	public void clickSCR1Button() {
		scr1Button_PreHeat.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickSupplyFansTab() {
		supplyFansTab.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickCloseWarning() {
		closeWarning.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public String getWarningTextPreHeat() {
		return warningText_PreHeat.getText();
	}

	public boolean isDisabledPreHeatTabPresent() {
		return diabledPreHeatTab.isDisplayed();
	}

	public boolean isDisabledCompressorsTabPresent() {
		return disabledCompressorTab.isDisplayed();
	}

	public int getDisabledLabelCardCount_Fans() {

		int count = disabledItemCard.size();
		nextPageButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		count = count + disabledItemCard.size();
		previosPageButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
		return count;
	}

}
