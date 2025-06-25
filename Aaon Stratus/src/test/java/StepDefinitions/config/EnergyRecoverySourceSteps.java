package StepDefinitions.config;

import static org.testng.Assert.assertEquals;

import StepDefinitions.HelpMethods;
import io.cucumber.java.en.*;
import pages.config.UnitSettingsPage;
import utils.TestData;

public class EnergyRecoverySourceSteps {
	UnitSettingsPage unit=new UnitSettingsPage();

	@Then("Verify the fields in Modulating ERS Type page")
	public void verify_the_fields_moderstypes() {
		assertEquals(unit.getPageTitle(), "Modulating ERS Type", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_MOD_ERS_TYPES);
	}
	
	@Then("Verify the fields in Modulating ERS Setpoints page")
	public void verify_the_fields_in_moders_setpoints_page() {
		assertEquals(unit.getPageTitle(), "Modulating ERS Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "ERS Min Voltage", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "ERS Min Voltage", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_MOD_ERS_SETPOINTS, 1, 8);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in ERS Defrost Setpoints page")
	public void verify_the_fields_in_ersdefrost_page() {
		assertEquals(unit.getPageTitle(), "ERS Defrost Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Outside Air Temperature", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "OA Temp", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_ERS_DEFROST_TYPES, 1, 98);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in ERS OA Enthalpy Setpoints page")
	public void verify_the_fields_in_ersoaenth_page() {
		assertEquals(unit.getPageTitle(), "ERS OA Enthalpy Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Low OA Enthalpy Setpoint", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Low OA Enthalpy SP", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_ERS_OA_ENTH_SETPOINTS, 1, 8);
	}
	
	@Then("Verify the fields in Modulating ERS Bypass Setpoints page")
	public void verify_the_fields_in_moderSbypass_page() {
		assertEquals(unit.getPageTitle(), "Modulating ERS Bypass Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "OA ERV Bypass Min", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "OA ERV Bypass Min", "Active card lable not matched");
	}
	
	@Then("Alert should display with {string}")
	public void alert_should_display_with(String string) {
		HelpMethods.explicitWait_milliSeconds(500);
		assertEquals(unit.getAlertBoxText(), string, "Alert text not matched");
	}
	
	@Then("Go back to Unit configuration page")
	public void GobacktoUnitconfigurationpageh() {
		  while (!unit.getPageTitle().equals("Unit Configuration")) {
				try {
					unit.clickBackButton();
				} catch (Exception e) {
					unit.clickYesButton();
					unit.clickBackButton();
				}
		    }
	}
	
	@Then("User enter the value with in {string} and {string} and verify")
	public void user_enter_the_value_with_in_and_and_verify(String string, String string2) {
		unit.enterTemperatureValueAndValidate(Integer.parseInt(string), Integer.parseInt(string2));
	}
	
	@Then("User enter the value with two decimals and verify the entered value")
	public void user_enter_the_value_with_two_decimals_and_verify_the_entered_value() {
		unit.enterTemperatureValueWithTwoDecimalsAndValidate((float) 0.01, (float) 0.08, (float) 0.01);
	}
	
}

