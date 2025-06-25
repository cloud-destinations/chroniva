package StepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.ParseException;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.MonitoringPage;
import utils.TestData;

public class AnalysisSteps extends HelpMethods {

	LandingPage landing = new LandingPage(Hooks.getDriver());
	MonitoringPage monitor = new MonitoringPage();
	SoftAssert soft = new SoftAssert();

	@Given("Launching the application")
	public void launching_the_application() throws InterruptedException {
		landing.verifyToolCard();
		landing.verifySpaceHumitityCard();
		landing.verifySpaceTempCard();
		landing.verifyModeCard();
		explicitWait_milliSeconds(1000);
		landing.clickToolsButton();
		landing.loginWithCredentials("factoryadmin", "Admin@123");
	}

	@Then("the AAON logo and icons \\(time, temperature, settings, alarm) should be displayed in the header")
	public void the_AAON_logo_and_icons_time_temperature_settings_alarm_should_be_displayed_in_the_header()
			throws InterruptedException, ParseException {
		landing.verifyAAONIcon();
		landing.verifyTimeIcon();
		landing.verifyTimeText();
		landing.verifyTempIcon();
		landing.verifyTempText();
		landing.verifySettingsButton();
		landing.verifyAlarmIcon();
	}

	@Then("User verifies all header modules Config, Monitoring, Service are displayed")
	public void user_verifies_all_header_modules_Config_Analysis_Service_are_displayed() {
		monitor.verifyModuleHeaderLabels();
	}

	@Then("User verifies the submodules under the Monitoring module are Dashboard, Space Temp, Economizer, Schedule, are displayed")
	public void user_verifies_the_submodules_under_the_Analysis_module_are_Monitoring_Space_Temp_Mode_Economizer_Schedule_Graphs_are_displayed() {
		monitor.verifySubModuleHeaderLabels();
	}

	@Given("User is on the Dashboard page")
	public void user_is_on_the_Dashboard_page() throws InterruptedException {
		landing.clickToolsButton();
		landing.loginWithCredentials("factoryadmin", "Admin@123");
	}

	@Then("User verifies all telemetry labels are displayed on the monitoring dashboard initially")
	public void user_verifies_all_telemetry_labels_are_displayed_on_the_monitoring_dashboard_initially() {
		monitor.verifyDisplayedLabels();
	}

	@Then("User verifies the Airflow dropdown label is displayed as Airflow")
	public void user_verifies_the_Airflow_dropdown_label_is_displayed_as_Airflow() {
		monitor.verifyDropdownLabel();
	}

	@Given("User navigates to Custom page and click the edit button")
	public void user_verifies_the_Edit_button_label_is_displayed_as_Edit_and_click_the_edit_button() {
		monitor.navigateToCustomPage();
		monitor.clickEditButton();
	}

	@Then("User verifies the Edit page heading text")
	public void user_verifies_the_Edit_page_heading_text() {
		monitor.verifyEditHeadingPageText();
	}

	@Then("User verifies the Telemetry name heading")
	public void user_verifies_the_Telemetry_name_heading() {
		monitor.verifyTelementryNameHeading();
	}

	@When("User clicks on the Temperature telemetry label")
	public void user_clicks_on_the_Temperature_telemetry_label() {
		// monitor.clickTemperatureTelementryButton();
	}

	@Then("The Temperature telemetry details should be displayed")
	public void the_Temperature_telemetry_details_should_be_displayed() {
		monitor.verifyTelementryValue("Temperature", TestData.EXPECTED_TEMPERATURE_TELEMETRY_VALUES);
	}

	@When("User clicks on the Humidity telemetry label")
	public void user_clicks_on_the_Humidity_telemetry_label() {
		monitor.clickHumidityTelementryButton();
	}

	@Then("The Humidity telemetry details should be displayed")
	public void the_Humidity_telemetry_details_should_be_displayed() {
		monitor.verifyTelementryValue("Humidity", TestData.EXPECTED_HUMIDITY_TELEMETRY_VALUES);
	}

	@When("User clicks on the Pressure telemetry label")
	public void user_clicks_on_the_Pressure_telemetry_label() {
		monitor.clickPressureTelementryValue();
	}

	@Then("The Pressure telemetry details should be displayed")
	public void the_Pressure_telemetry_details_should_be_displayed() {
		monitor.verifyTelementryValue("Pressure", TestData.EXPECTED_PRESSURE_TELEMETRY_VALUES);
	}

	@When("User clicks on the Damper telemetry label")
	public void user_clicks_on_the_Damper_telemetry_label() {
		monitor.clickDamperTelementryValue();
	}

	@Then("The Damper telemetry details should be displayed")
	public void the_Damper_telemetry_details_should_be_displayed() {
		monitor.verifyTelementryValue("Damper", TestData.EXPECTED_DAMPER_TELEMETRY_VALUES);
	}

	@When("User clicks on the Fans telemetry label")
	public void user_clicks_on_the_Fans_telemetry_label() {
		monitor.clickFansTelementryValue();
	}

	@Then("The Fans telemetry details should be displayed")
	public void the_Fans_telemetry_details_should_be_displayed() {
		monitor.verifyTelementryValue("Fans", TestData.EXPECTED_FANS_TELEMETRY_VALUES);
	}

	@When("User clicks on the Airflow telemetry label")
	public void user_clicks_on_the_Airflow_telemetry_label() {
		monitor.clickAirflowTelementryValue();
	}

	@Then("The Airflow telemetry details should be displayed")
	public void the_Airflow_telemetry_details_should_be_displayed() {
		monitor.verifyTelementryValue("Airflow", TestData.EXPECTED_AIRFLOW_TELEMETRY_VALUES);
	}

	@When("User clicks on the Misc telemetry label")
	public void user_clicks_on_the_Misc_telemetry_label() {
		monitor.clickMiscTelementryValue();
	}

	@Then("The Misc telemetry details should be displayed")
	public void the_Misc_telemetry_details_should_be_displayed() {
		monitor.verifyTelementryValue("Misc.", TestData.EXPECTED_MISC_TELEMETRY_VALUES);
	}

	@When("User checks a telemetry value and saves")
	public void user_checks_a_telemetry_value_and_saves() {
		monitor.navigateToCustomPage();
		monitor.userChecksTelemetryValueAndSaves();
	}

	@Then("A Saved successfully popup should appear ans selected value should display")
	public void a_Saved_successfully_popup_should_appear() {
		Assert.assertTrue("Success message not displayed!", monitor.savedSuccessMessage.isDisplayed());
		assertEquals("Custom dashboard label count not matched", 1, monitor.getCustomDashbpardPageLablesCount());
	}

	@When("User unchecks a telemetry value and saves")
	public void user_unchecks_a_telemetry_value_and_saves() {
		monitor.userChecksTelemetryValueAndSaves();
	}

	@Then("The unchecked telemetry value should disappear from the Dashboard")
	public void the_unchecked_telemetry_value_should_disappear_from_the_Dashboard() {
		Assert.assertTrue("Success message not displayed!", monitor.savedSuccessMessage.isDisplayed());
		assertEquals("Custom dashboard label count not matched", 0, monitor.getCustomDashbpardPageLablesCount());
	}

	@Then("The dropdown should update to Custom")
	public void the_dropdown_should_update_to_Custom() {
		monitor.dropdownShouldUpdateToCustom();
	}

	@When("the user selects the Space Temp submodule")
	public void the_user_selects_the_Space_Temp_submodule() {
		monitor.verifyClickSpaceTempModule();
	}

	@Then("the system should display the Space Temp page and verify its correctness.")
	public void the_system_should_display_the_Space_Temp_page_and_verify_its_correctness() {

		monitor.validateSpaceTempPage();
		assertEquals(monitor.getTempCardText(), "Occupied Space Temperature Setpoint",
				"Occupied Space Temperature Setpoint lable showing wrong");
		assertTrue(monitor.isEventLogButtonDisplayed(), "Event Log button is not displaying");
	}

	@When("the user selects the Mode submodule")
	public void the_user_selects_the_Mode_submodule() {
		monitor.verifyClickModeModule();
	}

	@Then("the system should display the Mode page and verify its correctness.")
	public void the_system_should_display_the_Mode_page_and_verify_its_correctness() {
		monitor.validateModePage();
		assertTrue(monitor.isEventLogButtonDisplayed(), "Event Log button is not displaying");
	}

	@When("the user selects the Economizer submodule")
	public void the_user_selects_the_Economizer_submodule() {
		monitor.verifyClickEconomizerModule();
	}

	@Then("the system should display the Economizer page and verify its correctness.")
	public void the_system_should_display_the_Economizer_page_and_verify_its_correctness() {
		monitor.validateEconomizerPage();
		assertEquals(monitor.getEconomizerCardText(), "Minimum Economizer Position",
				"Minimum Economizer Position lable showing wrong");
		assertEquals(monitor.getForceClosedText(), "Force Closed", "Force Closed lable showing wrong");
		assertTrue(monitor.isEventLogButtonDisplayed(), "Event Log button is not displaying");
	}

	@When("the user selects the Schedule submodule")
	public void the_user_selects_the_Schedule_submodule() {
		monitor.verifyClickScheduleModule();
	}

	@Then("the system should display the Schedule page and verify its correctness.")
	public void the_system_should_display_the_Schedule_page_and_verify_its_correctness() {
		monitor.validateSchedulePage();
		assertTrue(monitor.isEventLogButtonDisplayed(), "Event Log button is not displaying");
	}

	@When("the user selects the Graphs submodule")
	public void the_user_selects_the_Graphs_submodule() {
		monitor.verifyClickGraphsModule();
	}

	@Then("the system should display the Graphs page and verify its correctness.")
	public void the_system_should_display_the_Graphs_page_and_verify_its_correctness() {
		monitor.validateGraphsPage();
	}

}
