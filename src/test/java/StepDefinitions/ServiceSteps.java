package StepDefinitions;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.ServicePage;
import utils.TestData;

public class ServiceSteps extends HelpMethods {
	ServicePage service = new ServicePage();
	LandingPage landing = new LandingPage(Hooks.getDriver());

	@Given("Go to Tools and sign in with {string} and {string} and click Service")
	public void go_to_Tools_and_sign_in_with_and(String username, String password) {
		landing.clickToolsButton();
		landing.loginWithCredentials(username, password);
		service.clickServiceTab();
	}

	@Then("Verify the elements in Service page")
	public void verify_the_elements_in_Service_page() {
		assertTrue("Air balance label not displayed", service.isAirBalanceButtonPresent());
		assertTrue("Charge label not displayed", service.isChargeButtonPresent());
		assertTrue("EVAC label not displayed", service.isEVACButtonPresent());
		assertTrue("Event log button not displayed", service.isEventLogButtonPresent());
		assertEquals("Select a Service Mode", service.getServicePageTitle(), "Select a Service Mode label not matched");
	}

	@Then("verified the Event Log in the Service module")
	public void verified_the_event_log_in_the_service_module() {
		service.clickeventLogButton();
		assertTrue("Event log Title not displayed", service.iseventLogTitlePresent());
        assertTrue("Please select a date range not displayed", service.isdaterangeTextPresent());
	}

	@Then("User clicks Filter By verifies the labels and selects the required checkboxes")
	public void user_clicks_filter_by_verifies_the_labels_and_selects_the_required_checkboxes() throws InterruptedException {

		service.clickFilterBy();
		service.verifyPageFieldLables(TestData.EXPECTED_Filter_By);
		service.selectCheckboxes();
		service.clickdaterange();
		service.selectDate();
	}

	//
	@When("Click on Test button in Service page")
	public void click_on_Test_button_in_Service_page() {
		explicitWait_milliSeconds(500);
		if (HelpMethods.isElementPresent(service.WebelementStopTestButton()))

		{
			service.clickStopTestButton();
			service.clickStopTestConfirmButton();
		}
		service.clickTestButton();
	}

	@Then("Verify the elements in caution page")
	public void verify_the_elements_in_caution_page() {
		assertEquals("Cancel", service.getCautionCancelButtonText(), "Select a Service Mode label not matched");
		assertEquals("Continue", service.getCautionContinueButtonText(), "Select a Service Mode label not matched");
		assertEquals("Do you wish to continue?", service.getCautionQuestionText(),
				"Do you wish to continue? text not matched");
		explicitWait_milliSeconds(2000);
	}

	@When("Click on Continue button in Test Page")
	public void click_on_Continue_button_in_Test_Page() {
		explicitWait_milliSeconds(2000);
		service.clickCautionContinueButton();
	}

	@Then("Verify the elements in Test run page")
	public void verify_the_elements_in_Test_run_page() {
		service.verifyLabelCardNames();
		assertEquals("Service Test Mode", service.getServiceTestModeTitleText(), "Service Test Mode label not matched");
		// assertTrue("Stop test button not displayed",
		// service.isStopTestButtonPresent());
		assertTrue("Details button not displayed", service.isTestDetailsButtonPresent());
		assertTrue("Event log button not displayed", service.isTestEventLogButtonPresent());
		assertEquals("Test Mode will automatically end after", service.getServiceTestFooterText(),
				"Service Test footer text not matched");
		explicitWait_milliSeconds(1000);
	}

	@When("Click on Fans button in Service test page")
	public void click_on_Fans_button_in_Service_test_page() {
		// service.clickTestButton();
		// explicitWait_milliSeconds(1000);
		// service.clickCautionContinueButton();
		explicitWait_milliSeconds(1000);
		service.clickFansButton();
	}

	@Then("Verify the elements in Fans test page")
	public void verify_the_elements_in_Fans_test_page() {
		assertEquals(service.getServicePageTitle(), "Fans", "Fans label not matched with temp card");
		service.verifyTabNames();
		assertEquals(service.getDisabledLabelCardCount_Fans(), 11, "Disabled card count not matched");
		assertEquals(service.getTemperatureCardText(), service.getActiveCardText(),
				"Active card label not matched with temp card");
		assertTrue("Disabled exhaust fans button not displayed", service.isDisabledExhaustFansButtonPresent());
		assertTrue("Stop test button not displayed", service.isStopTestButtonPresent());
		assertTrue("Details button not displayed", service.isTestDetailsButtonPresent());
		assertTrue("Event log button not displayed", service.isEventLogButtonPresentInTopic());
		explicitWait_milliSeconds(1000);
	}

	@When("I increase the temperatue and click force and confirm")
	public void i_increase_the_temperatue_and_click_force_and_confirm() {
		String firstChar = String.valueOf(service.getTemperatureCardValue().charAt(0));
		System.out.println("............" + firstChar);
		service.clickIncreaseTempButton();
		service.clickForceButton();
		service.clickForceConfirmButton();
		service.clickClearButton();
		service.clickClearConfirmButton();
		service.clickIncreaseTempButton();
		explicitWait_milliSeconds(1000);
		service.clickForceButton();
		service.clickForceConfirmButton();
	}

	@When("I increase the temperatue and click force")
	public void i_increase_the_temperatue_and_click_force() {
		String firstChar = String.valueOf(service.getTemperatureCardValue().charAt(0));
		System.out.println("............" + firstChar);
		service.clickIncreaseTempButton();
		service.clickForceButton();
		service.clickClearButton();
		explicitWait_milliSeconds(2000);
		service.clickIncreaseTempButton();
		service.clickForceButton();
	}

	@Then("Verify the temperature value is {string}")
	public void verify_the_temperature_value_is(String value) {

		int expTemp = Integer.parseInt(value);
		char firstChar = service.getTemperatureCardValue().charAt(0);

		assertEquals(expTemp, Character.getNumericValue(firstChar), "Active card value not matched with temp card");
		assertEquals(service.getTemperatureCardValue(), service.getActiveCardValue(),
				"Active card value not matched with temp card");
	}

	@When("I cleared the temperature")
	public void i_cleared_the_temperature() {
		explicitWait_milliSeconds(2000);
		service.clickClearButton();
	}

	@When("I cleared the temperature with confirmation")
	public void i_cleared_the_temperature_confirmation() {
		explicitWait_milliSeconds(2000);
		service.clickClearButton();
		service.clickClearConfirmButton();
	}

	// 26
	@When("Click on the fans card")
	public void click_on_the_fans_card() {
		explicitWait_milliSeconds(2000);
		service.clickTestButton();
		service.clickCautionContinueButton();
		service.clickFansButton();
	}

	@Then("verify that the corresponding fan page for is opened")
	public void verify_that_the_corresponding_fan_page_for_is_opened() {
		explicitWait_milliSeconds(2000);
		service.verifyFansServiceTestCard();
	}

	@When("Click on the left arrow fansicon indicating back")
	public void click_on_the_left_arrow_fansicon_indicating_back() {
		explicitWait_milliSeconds(2000);
		service.clickBackArrowButton();
	}

	@When("Click on the Damper card")
	public void click_on_the_damper_card() {
		explicitWait_milliSeconds(2000);
		service.clickDamperServiceTestCard();
	}

	@Then("verify that the corresponding damper page for is opened")
	public void verify_that_the_corresponding_damper_page_for_is_opened() {
		service.verifyDamperServiceTestCard();
	}

	@When("Click on the left arrow dampericon indicating back")
	public void click_on_the_left_arrow_dampericon_indicating_back() {
		explicitWait_milliSeconds(2000);
		service.clickBackArrowButton();
	}

	@When("Click on the Heat Wheel card")
	public void click_on_the_heat_wheel_card() {
		explicitWait_milliSeconds(2000);
		service.clickHeatWheelServiceTestCard();
	}

	@Then("verify that the corresponding heatwheel page for is opened")
	public void verify_that_the_corresponding_heatwheel_page_for_is_opened() {
		service.verifyHeatWheelServiceTestCard();
	}

	@When("Click on the left arrow heatwheelicon indicating back")
	public void click_on_the_left_arrow_heatwheelicon_indicating_back() {
		explicitWait_milliSeconds(2000);
		service.clickBackArrowButton();
	}

	@When("Click on the Pre-Heat card")
	public void click_on_the_pre_heat_card() {
		explicitWait_milliSeconds(2000);
		service.clickPreHeatServiceTestCard();
	}

	@Then("verify that the corresponding pre-heat page for is opened")
	public void verify_that_the_corresponding_pre_heat_page_for_is_opened() {
		service.verifyPreHeatServiceTestCard();
	}

	@When("Click on the left arrow preheaticon indicating back")
	public void click_on_the_left_arrow_preheaticon_indicating_back() {
		explicitWait_milliSeconds(2000);
		service.clickBackArrowButton();
	}

	@When("Click on the HeatPump card")
	public void click_on_the_heat_pump_card() {
		explicitWait_milliSeconds(2000);
		service.clickHeatpumpServiceTestCard();
	}

	@Then("verify that the corresponding heat pump page for is opened")
	public void verify_that_the_corresponding_heat_pump_page_for_is_opened() {
		service.verifyHeatpumpServiceTestCard();
	}

	@When("Click on the left arrow heatpumpicon indicating back")
	public void click_on_the_left_arrow_heatpumpicon_indicating_back() {
		explicitWait_milliSeconds(2000);
		service.clickBackArrowButton();
	}

	@When("Click on the Cooling card")
	public void click_on_the_cooling_card() {
		explicitWait_milliSeconds(2000);
		service.clickCoolingServiceTestCard();
	}

	@Then("verify that the corresponding cooling page for is opened")
	public void verify_that_the_corresponding_cooling_page_for_is_opened() {
		service.verifyCoolingServiceTestCard();
	}

	@When("Click on the left arrow coolingpageicon indicating back")
	public void click_on_the_left_arrow_coolingpageicon_indicating_back() {
		explicitWait_milliSeconds(2000);
		service.clickBackArrowButton();
	}

	@When("Click on Dampers button in Service test page")
	public void click_on_Dampers_button_in_Service_test_page() {
		explicitWait_milliSeconds(2000);
		service.clickDampersButton();
	}

	@Then("Verify the elements in Dampers test page")
	public void verify_the_elements_in_Dampers_test_page() {
		assertEquals(service.getServicePageTitle(), "Dampers", "Dampers label not matched");
		assertEquals(service.getActiveCardText(), "Return Air Damper", "Return Air Damper label not matched");
		assertEquals(service.getTemperatureCardText(), "Return Air Damper Position",
				"Return Air Damper Position label not matched");
		assertTrue("Stop test button not displayed", service.isStopTestButtonPresent());
		assertTrue("Details button not displayed", service.isTestDetailsButtonPresent());
		assertTrue("Event log button not displayed", service.isEventLogButtonPresentInTopic());

	}

	@When("Click on Heat Wheel button in Service test page")
	public void click_on_Heat_Wheel_button_in_Service_test_page() {
		explicitWait_milliSeconds(2000);
		service.clickHeatWheelButton();
	}

	@Then("Verify the elements in Heat Wheel test page")
	public void verify_the_elements_in_Heat_Wheel_test_page() {
		assertEquals(service.getServicePageTitle(), "Heat Wheel", "Heat Wheel label not matched");
		assertTrue("Stop test button not displayed", service.isStopTestButtonPresent());
		assertTrue("Details button not displayed", service.isTestDetailsButtonPresent());
		assertTrue("Event log button not displayed", service.isEventLogButtonPresentInTopic());
	}

	@Then("Verify the play and stop button in Heat Wheel")
	public void verify_the_play_and_stop_button_in_Heat_Wheel() {
		assertEquals(service.getToggleButtonText(), "Heat Wheel Enable", "Heat Wheel Enable label not matched");
		service.clickToggleOffButton();
		service.clickToggleOnButton();
	}

	@Then("Stop the test in Service test page")
	public void stop_the_test_in_service_test_page() {
		if (HelpMethods.isElementPresent(service.WebelementStopTestButton())) {
			explicitWait_milliSeconds(1000);
			service.clickStopTestButton();
			service.clickStopTestConfirmButton();
		}

	}

	@When("Click on Pre-heat button in Service test page")
	public void click_on_Pre_heat_button_in_Service_test_page() {
		service.clickPreHeatButton();
	}

	@Then("Verify the elements in Pre-heat test page")
	public void verify_the_elements_in_Pre_heat_test_page() {
		assertEquals(service.getServicePageTitle(), "Pre-heat", "Pre-heat label not matched");
		assertTrue("Pre-heat tab is enabled", service.isDisabledPreHeatTabPresent());
		assertTrue("Stop test button not displayed", service.isStopTestButtonPresent());
		assertTrue("Details button not displayed", service.isTestDetailsButtonPresent());
		assertTrue("Event log button not displayed", service.isEventLogButtonPresentInTopic());
	}

	@When("Navigate to Pre-heat page and click the SCR button")
	public void navigate_to_Pre_heat_page_and_click_the_SCR_button() {
		service.clickPreHeatTab();
		service.clickSCR1Button();
	}

	@Then("Verify the pre-heat tab status")
	public void verify_the_pre_heat_tab_status() {
		assertTrue("Pre-heat tab is enabled", service.isDisabledPreHeatTabPresent());
	}

	@When("Navigate to supply fans page")
	public void navigae_to_supply_fans_page() {
		service.clickSupplyFansTab();
	}

	@Then("Should show warning message in supply fans")
	public void should_show_warning_message_in_supply_fans() {
		assertEquals(service.getWarningTextPreHeat(), "TURN OFF THE RUNNING PRE-HEAT MODES TO TURN OFF THE SUPPLY FAN.",
				"Warning message not matched");
		service.clickCloseWarning();
	}

	@When("Click on Heat pump button in Service test page")
	public void click_on_Heat_pump_button_in_Service_test_page() {
		service.clickHeatPumpButton();
	}

	@Then("Verify the elements in Heat pump test page")
	public void verify_the_elements_in_Heat_pump_test_page() {
		assertEquals(service.getServicePageTitle(), "Heat Pump", "Heat Pump label not matched");
		assertEquals(service.getDisabledToggleCount_HeatPump(), 8, "Heat Pump disabled toggle count not matched");
		assertTrue("Stop test button not displayed", service.isStopTestButtonPresent());
		assertTrue("Details button not displayed", service.isTestDetailsButtonPresent());
		assertTrue("Event log button not displayed", service.isEventLogButtonPresentInTopic());
	}

	@Then("Verify the play and stop button in Heat pump")
	public void verify_the_play_and_stop_button_in_Heat_pump() {
		assertEquals(service.getToggleButtonText(), "Emergency Heat", "Emergency Heat label not matched");
		service.clickToggleOffButton();
		service.clickToggleOnButton();
	}

	@When("Click on Cooling button in Service test page")
	public void click_on_Cooling_button_in_Service_test_page() {
		service.clickCoolingButton();
	}

	@Then("Verify the elements in Cooling test page")
	public void verify_the_elements_in_Cooling_test_page() {
		assertEquals(service.getServicePageTitle(), "Cooling", "Cooling label not matched");
		assertEquals("Supply Fan ON", service.getActiveCardText(), "Active card label not matched");
		assertEquals("Supply Fan ON Position", service.getTemperatureCardText(), "Temp card label not matched");
		assertTrue("Compressors tab is enabled", service.isDisabledCompressorsTabPresent());
		assertTrue("Stop test button not displayed", service.isStopTestButtonPresent());
		assertTrue("Details button not displayed", service.isTestDetailsButtonPresent());
		assertTrue("Event log button not displayed", service.isEventLogButtonPresentInTopic());
	}

	@When("Navigate to Compressors page in Cooling")
	public void navigate_to_Compressors_page_in_Cooling() {
		explicitWait_milliSeconds(2000);
		service.clickCompressorsTab();
	}

	@Then("Verify the Compressors tab status")
	public void verify_the_compressor_tab_status() {
		assertTrue("Compressors tab is enabled", service.isDisabledCompressorsTabPresent());
	}

	@Then("Should show warning message in supply fans in Cooling")
	public void should_show_warning_message_in_supply_fans_in_Cooling() {
		assertEquals(service.getWarningTextPreHeat(),
				"YOU MUST STOP THE RUNNING COMPRESSORS BEFORE TURNING OFF THE SUPPLY FAN(S)",
				"Warning message not matched");
		service.clickCloseWarning();
		explicitWait_milliSeconds(1000);
	}
	// 27

	@When("Click on test module")
	public void click_on_test_module() {
		explicitWait_milliSeconds(1000);

		service.clickTestButton();
	}

	@When("Click on continue in the caution popup")
	public void click_on_continue_in_the_caution_popup() {
		service.clickCautionContinueButton();
	}

	@When("Click on back button")
	public void click_on_back_button() {
		explicitWait_milliSeconds(2000);
		// service.clickBackArrowButton();
	}

	@When("Click No button in the caution message")
	public void click_no_button_in_the_caution_message() {
		explicitWait_milliSeconds(2000);
		service.clickCautionNoButton();
	}

	@When("Click Yes button in caution message")
	public void click_yes_button_in_caution_message() {
		explicitWait_milliSeconds(2000);
		// service.clickBackArrowButton();
		service.clickCautionYesButton();

	}

	@Then("Verify service mode dashboard1")
	public void verify_service_mode_dashboard1() {
		service.verifyProgressCardSpinnerIcon();
		service.verifyStatusLabel();
		service.verifyProgressCardTimer();
		service.verifyProgressCardSpinnerIcon();
		service.verifyStopButtonLabel();
		service.isEventLogButtonPresent();
		explicitWait_milliSeconds(1000);
	}

	// 24
	@When("the user clicks on Cooling")
	public void the_user_clicks_on_cooling() {
		explicitWait_milliSeconds(1000);
		service.clickTestButton();
		service.clickCautionContinueButton();
		explicitWait_milliSeconds(1000);
		service.clickCoolingServiceTestCard();
	}

	@Then("the Cooling screen should be displayed")
	public void the_cooling_screen_should_be_displayed() {
		service.verifycoolingHeadingLabel();
	}

	@Then("a Left Arrow should be present on the top left indicating Back")
	public void a_left_arrow_should_be_present_on_the_top_left_indicating_back() {
		service.verifyBackArrowButton();
	}

	@Then("the following header menu options should be present:")
	public void the_following_header_menu_options_should_be_present(io.cucumber.datatable.DataTable dataTable) {
		service.verifySupplyFanHeadinfLabel();
		service.verifyCompressserHeadingLabel();
		service.verifyCondenserHeadingLabel();
		service.verifyCWvalueHeadingLabel();
	}

	@Then("the following buttons should be present below the right card:")
	public void the_following_buttons_should_be_present_below_the_right_card(
			io.cucumber.datatable.DataTable dataTable) {
		service.verifyStopTestButton();
		service.verifyDeatilsButton();
		service.verifyEventLogButton_TopicPage();
		explicitWait_milliSeconds(2000);
	}

	@When("Navigate to Return Fans page in Fans")
	public void navigate_to_Return_Fans_page_in_Fans() {
		explicitWait_milliSeconds(2000);
		service.clickReturnFansTab();
	}

	@Then("Verify the elements in Return Fans test page")
	public void verify_the_elements_in_Return_Fans_test_page() {
		assertEquals(service.getServicePageTitle(), "Fans", "Fans label not matched with temp card");
		assertEquals(service.getTemperatureCardText(), service.getActiveCardText(),
				"Active card label not matched with temp card");
		assertTrue("Stop test button not displayed", service.isStopTestButtonPresent());
		assertTrue("Details button not displayed", service.isTestDetailsButtonPresent());
		assertTrue("Event log button not displayed", service.isEventLogButtonPresentInTopic());
	}

	@When("Click on Condenser fans tab in Cooling")
	public void click_on_condenser_fans_tab_in_cooling() {
		service.clickCondenserFansTab();
	}

	@Then("Verify the elements in Condenser fans page")
	public void verify_the_elements_in_condenser_fans_page() {

		assertEquals(service.getServicePageTitle(), "Cooling", "Cooling label not matched");
		assertEquals(service.getTemperatureCardText(), service.getActiveCardText(),
				"Active card label not matched with temp card");
		assertTrue("Stop test button not displayed", service.isStopTestButtonPresent());
		assertTrue("Details button not displayed", service.isTestDetailsButtonPresent());
		assertTrue("Event log button not displayed", service.isEventLogButtonPresentInTopic());

	}

}
