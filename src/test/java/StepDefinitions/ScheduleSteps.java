package StepDefinitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.SchedulePage;

public class ScheduleSteps {
	SchedulePage schedule = new SchedulePage();
	LandingPage landing = new LandingPage(Hooks.getDriver());

	@Given("Go to Tools and sign in with {string} and {string} and click Schedule")
	public void go_to_Tools_and_sign_in_with_and_config(String username, String password) {
		landing.clickToolsButton();
		landing.loginWithCredentials(username, password);
		schedule.clickScheduleTab();
	}

	@Then("Verify the fields in Schedule page")
	public void verify_the_fields_in_Schedule_page_in_Config() {
		schedule.isBackButtonPresent();
		schedule.isTimelineButtonPresent();
		schedule.verifyDayCardNames();
		assertEquals(schedule.getPageTitleText(), "Schedule", "Schedule lables not matched");
		assertEquals(schedule.getExistingEvenetNameText(), "Event 1:", "Event name lables not matched");
	}

	@When("Go to schedule creation page in Monday")
	public void go_to_schedule_creation_page_in_Monday() {
		schedule.clickMonday();
	}

	@Then("Verify the fields in Schedule creation page")
	public void verify_the_fields_in_Schedule_creation_page_in_Config() {
		assertTrue("Event 1 button not displayed", schedule.isEvent1ButtonPresent());
		assertTrue("Cancel button not displayed", schedule.isCancelButtonPresent());
		assertTrue("Save button not displayed", schedule.isSaveButtonPresent());
		assertTrue("View timeline button not displayed", schedule.isTimelineButtonPresent());
		assertEquals("Monday", schedule.getPageTitleText(), "Monday title is not matched");
		assertEquals("Start Time", schedule.getStartTimeText(), "Start time label not matched");
		assertEquals("End Time", schedule.getEndTimeText(), "End time label not matched");

	}

	@When("Create second event in Schedule creation page")
	public void create_second_event_in_Schedule_creation_page() {
		schedule.clickEvent2Button();
		if (HelpMethods.isElementPresent(schedule.deleteEventButtonWebElement())) {
			schedule.clickDeleteEventButton();
			schedule.clickDeleteEventConfirmButton();
			schedule.clickMonday();
			schedule.clickEvent2Button();
		}

		schedule.setHoursTo7();
		schedule.clickSaveButton();
		HelpMethods.explicitWait_milliSeconds(2000);
	}

	@Then("Verify the second event in Schedule page")
	public void verifyt_the_second_event_in_Schedule_page() {
		assertTrue("Event2 lable not displayed", schedule.isEvenet2LablePresent());
		assertEquals("07:00 PM - 11:59 PM", schedule.getEvent2Time(), "Evenet 2 time in schedule is not matched");
	}

	@Then("Delete the second evenetin Schedule page")
	public void delete_the_second_evenetin_Schedule_page() {
		schedule.clickMonday();
		schedule.clickEvent2Button();
		schedule.clickDeleteEventButton();
		schedule.clickDeleteEventConfirmButton();
		assertFalse("Event2 lable displayed", schedule.isEvenet2LablePresent());

	}

	@When("Create Holiday event in Holiday creation page")
	public void create_Holiday_event_in_Holiday_creation_page() {
		assertEquals(0, schedule.getHolidayCount(), "Holiday count 0 in schedule is not matched");
		schedule.clickHolidayCard();
		schedule.verifyMonthNames();
		assertEquals(schedule.getNoHolidayText(), "No holidays yet. Tap below to add.",
				"Holiday text in schedule is not matched");
		schedule.clickAddHolidayButton();
		schedule.selectToday();
		schedule.clickDoneButton();
		assertEquals(schedule.getHolidayDate(), getTodayDate(), "Holiday date in schedule is not matched");
		assertEquals(schedule.getHolidayTime(), "12:00 AM - 11:59 PM", "Holiday time in schedule is not matched");
		schedule.clickBackButton();
		assertEquals(1, schedule.getHolidayCount(), "Holiday count in schedule is not matched");
	}

	@Then("Delete the created Holiday in Schedule page")
	public void delete_the_created_Holiday_in_Schedule_page() {

		schedule.clickHolidayCard();
		schedule.clickHolidayDate();
		assertEquals(schedule.getPageTitleText(), getTodayDate(), "Holiday date in title is not matched");
		assertTrue("Event 1 button not displayed", schedule.isEvent1ButtonPresent());
		assertTrue("Cancel button not displayed", schedule.isCancelButtonPresent());
		assertTrue("Save button not displayed", schedule.isSaveButtonPresent());
		assertTrue("View timeline button not displayed", schedule.isTimelineButtonPresent());
		schedule.clickDeleteEventButton();
		schedule.clickDeleteEventConfirmButton();
		schedule.clickBackButton();
		assertEquals(0, schedule.getHolidayCount(), "Holiday count 0 in schedule is not matched");

	}

	@When("Go to Timeline page in Schedule")
	public void go_to_timeline_page_in_schedule() {
		schedule.clickTimelineButton();
	}

	@Then("Verify the elements in timeline page")
	public void verify_the_elements_in_timeline_page_in_config() {
		assertEquals(schedule.getPageTitleText(), "Timeline", "Timeline title is not matched");
		assertTrue("Event 1 button not displayed", schedule.isEvent1ButtonPresentInTimeline());
		schedule.validateWeekNamesInTimeline();
	}

	public String getTodayDate() {
		return new SimpleDateFormat("dd MMM yyyy").format(Calendar.getInstance().getTime());
	}

}
