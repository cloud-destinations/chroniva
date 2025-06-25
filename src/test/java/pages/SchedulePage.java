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

public class SchedulePage<expectedLabels> {

	@FindBy(css = ".day-label")
	private List<WebElement> daysLabels;

	@FindBy(css = ".back-arrow")
	WebElement backButton;

	@FindBy(css = ".topic-title")
	WebElement pageTitle;

	@FindBy(xpath = "//button[text()='View Timeline']")
	WebElement timelineButton;

	@FindBy(css = ".event-title")
	WebElement existingEvenetName;

	@FindBy(css = "button.next-arrow")
	WebElement nextArrowButton;

	@FindBy(css = ".timeline-title")
	WebElement weekName_Timeline;

	@FindBy(css = ".label-container")
	WebElement event1Title;

	@FindBy(css = ".label-container:last-child")
	WebElement event2Title;

	@FindBy(xpath = "//h1[text()='Monday']")
	WebElement mondayButton;

	@FindBy(css = ".event-slider-text.startTime-text")
	WebElement startTimeLabel;

	@FindBy(css = ".event-slider-text.endTime-text")
	WebElement endTimeLabel;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancelButton;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;

	@FindBy(css = ".delete-area")
	WebElement deleteEventButton;

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement deleteEventConfirmButton;

	@FindBy(xpath = "//div[text()='Event 2']")
	WebElement event2Button;

	@FindBy(xpath = "//div[text()='Event 1']")
	WebElement event1Button;

	@FindBy(xpath = "//div/h2[text()='Event 1']")
	WebElement event1Button_Timeline;

	@FindBy(css = ".shift-left>.arrows")
	WebElement upArrowHours;

	@FindBy(xpath = "//span[text()='Event 2']")
	WebElement event2Lable;

	@FindBy(xpath = "//span[text()='Event 2']/following-sibling::span")
	WebElement event2Time;

	@FindBy(css = ".holiday-card")
	WebElement holidayCard;

	@FindBy(css = ".addButton")
	WebElement holidayAddButton;

	@FindBy(css = "button.day:not(.disabled-day)")
	WebElement selectDayButton;

	@FindBy(css = ".date-done-button")
	WebElement doneButton;

	@FindBy(css = ".day-label")
	WebElement dayLabel_Holiday;

	@FindBy(css = ".labelCard")
	WebElement newHolidayEventCard;

	@FindBy(css = ".event-title")
	WebElement eventTitle_Holiday;

	@FindBy(css = ".event-title:nth-of-type(2)")
	WebElement eventTime_Holiday;

	@FindBy(css = ".month-filter>button")
	private List<WebElement> monthNames;

	@FindBy(css = ".holiday-card .event-title:nth-of-type(2)")
	WebElement holidayCount;

	@FindBy(linkText = "Schedule")
	WebElement scheduleTab;

	@FindBy(css = ".holidayText")
	WebElement noHolidayText;

	WebDriver driver = Hooks.getDriver();

	public SchedulePage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void clickScheduleTab() {
		HelpMethods.explicitWait_milliSeconds(500);
		scheduleTab.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public boolean isBackButtonPresent() {
		return backButton.isDisplayed();
	}

	public void clickTimelineButton() {
		timelineButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void validateWeekNamesInTimeline() {
		for (int i = 0; i < 7; i++) {
			HelpMethods.explicitWait_milliSeconds(1000);
			String expWeek = TestData.EXPECTED_DAYS_NAMES.get(i);
			System.out.println(expWeek);
			System.out.println("act.." + weekName_Timeline.getText());
			assertEquals("Day labels not matched", expWeek, weekName_Timeline.getText());
			nextArrowButton.click();
		}
	}

	public boolean isEvent1ButtonPresentInTimeline() {
		return event1Button_Timeline.isDisplayed();
	}

	public boolean isEvenet2LablePresent() {
		try {
			return event2Lable.isDisplayed();
		} catch (Exception e) {
			return false;

		}
	}

	public String getEvent2Time() {
		return event2Time.getText();
	}

	public String getNoHolidayText() {
		return noHolidayText.getText();
	}

	public int getHolidayCount() {
		return Integer.parseInt(holidayCount.getText());
	}

	public WebElement deleteEventButtonWebElement() {
		return deleteEventButton;
	}

	public void clickDeleteEventButton() {
		deleteEventButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickHolidayDate() {
		newHolidayEventCard.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickBackButton() {
		backButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickHolidayCard() {
		holidayCard.click();
		HelpMethods.explicitWait_milliSeconds(1000);
	}

	public void clickAddHolidayButton() {
		holidayAddButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void selectToday() {
		selectDayButton.click();
	}

	public void clickDoneButton() {
		doneButton.click();
		HelpMethods.explicitWait_milliSeconds(2000);
	}

	public String getHolidayDate() {
		return dayLabel_Holiday.getText();
	}

	public String getHolidayEvenetName() {
		return eventTitle_Holiday.getText();
	}

	public String getHolidayTime() {
		return eventTime_Holiday.getText();
	}

	public void clickDeleteEventConfirmButton() {
		deleteEventConfirmButton.click();
		HelpMethods.explicitWait_milliSeconds(1000);
	}

	public boolean isSaveButtonPresent() {
		return saveButton.isDisplayed();
	}

	public void clickSaveButton() {
		saveButton.click();
	}

	public void clickEvent2Button() {
		event2Button.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public boolean isEvent1ButtonPresent() {
		return event1Button.isDisplayed();
	}

	public boolean isCancelButtonPresent() {
		return cancelButton.isDisplayed();
	}

	public void clickMonday() {
		HelpMethods.jsClick(mondayButton, driver);
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public boolean isTimelineButtonPresent() {
		return timelineButton.isDisplayed();
	}

	public String getPageTitleText() {
		return pageTitle.getText();
	}

	public String getStartTimeText() {
		return startTimeLabel.getText();
	}

	public String getEndTimeText() {
		return endTimeLabel.getText();
	}

	public String getExistingEvenetNameText() {
		return existingEvenetName.getText();
	}

	public void verifyDayCardNames() {
		ArrayList<String> actulaLabels = new ArrayList<String>();
		List<String> expectedLabels = TestData.EXPECTED_DAYS_NAMES;

		for (WebElement labelCard : daysLabels) {
			actulaLabels.add(labelCard.getText());
		}
		System.out.println(actulaLabels);
		assertEquals("Day labels not matched", expectedLabels, actulaLabels);
	}

	public void verifyMonthNames() {
		ArrayList<String> actulaLabels = new ArrayList<String>();
		List<String> expectedLabels = TestData.EXPECTED_MONTH_NAMES;

		for (WebElement labelCard : monthNames) {
			actulaLabels.add(labelCard.getText());
		}
		System.out.println(actulaLabels);
		assertEquals("Month labels not matched", expectedLabels, actulaLabels);
	}

	public void setHoursTo7() {

		for (int i = 1; i <= 7; i++) {
			upArrowHours.click();
			HelpMethods.explicitWait_milliSeconds(500);
		}
	}

}
