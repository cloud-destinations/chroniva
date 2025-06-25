package StepDefinitions.config;

import static org.testng.Assert.assertEquals;
import io.cucumber.java.en.*;
import pages.config.UnitSettingsPage;
import utils.TestData;

public class BuildingPressureSteps {
	UnitSettingsPage unit = new UnitSettingsPage();

	@Then("Go to previous page")
	public void Gotopreviouspage() {
		unit.clickBackButton();
	}

	@Then("verify the Control description text")
	public void verify_the_control_description_text() {
		unit.clickControlLabele();
	}

	@Then("Verify the fields in Supply Fan Setpoints page")
	public void verify_the_fields_in_supplyfansetpoints_page() {
		assertEquals(unit.getPageTitle(), "Supply Fan Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Building Pressure Setpoints",
				"Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Bldg Pr Setpoint", "Active card lable not matched");
		unit.enterTemperatureValueWithTwoDecimalsAndValidate(0, (float) 0.28, (float) 0.01);
	}

	@Then("verify the Fan Control description text")
	public void verify_the_fan_control_description_text() {
		unit.clickFanControl();
	}

	@Then("Verify the fields in Return Fan Setpoints page")
	public void verify_the_fields_in_returnfansetpoints_page() {
		assertEquals(unit.getPageTitle(), "Return Fan Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Building Pressure Setpoints",
				"Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Bldg Pr Setpoint", "Active card lable not matched");
	}

	@Then("Verify the fields in Return Fan - Exhaust Damper Setpoints page")
	public void verify_the_fields_in_returnfanexhaustsetpoints_page() {
		assertEquals(unit.getPageTitle(), "Exhaust Damper Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Exhaust Damper Deadband", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Exhaust Damper SP", "Active card lable not matched");
		unit.enterTemperatureValueWithTwoDecimalsAndValidate(0, (float) 0.18, (float) 0.01);
	}

	@Then("Verify the fields in Exhaust Fan Setpoints page")
	public void verify_the_fields_in_exhaustfansetpoints_page() {
		assertEquals(unit.getPageTitle(), "Exhaust Fan Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Building Pressure Setpoints",
				"Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Bldg Pr Setpoint", "Active card lable not matched");
		unit.enterTemperatureValueWithTwoDecimalsAndValidate(0, (float) 0.18, (float) 0.01);
	}

	@Then("Verify the fields in OA Damper Setpoints page")
	public void verify_the_fields_in_oadampersetpoints_page() {
		assertEquals(unit.getPageTitle(), "OA Damper Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Building Pressure Setpoints",
				"Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Bldg Pr Setpoint", "Active card lable not matched");
		unit.enterTemperatureValueWithTwoDecimalsAndValidate(0, (float) 0.18, (float) 0.01);
	}

	@Then("Verify the fields in Exhaust Damper Setpoints page")
	public void verify_the_fields_in_exhadampersetpoints_page() {
		assertEquals(unit.getPageTitle(), "Exhaust Damper Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Building Pressure Setpoints",
				"Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Bldg Pr Setpoint", "Active card lable not matched");
		unit.enterTemperatureValueWithTwoDecimalsAndValidate(0, (float) 0.18, (float) 0.01);
	}

	@Then("Verify the fields in RF Duct Static Pressure Setpoints page")
	public void verify_the_fields_in_rfdspsetpoints_page() {
		assertEquals(unit.getPageTitle(), "RF Duct Static Pressure Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Duct Static Pressure Setpoint",
				"Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Duct Static Pr SP", "Active card lable not matched");
		unit.enterTemperatureValueWithTwoDecimalsAndValidate((float) 0.1, (float) 0.28, (float) 0.1);
	}

	@Then("Verify the fields in EF Duct Static Pressure Setpoints page")
	public void verify_the_fields_in_efdspsetpoints_page() {
		assertEquals(unit.getPageTitle(), "EF Duct Static Pressure Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Duct Static Pressure Setpoint",
				"Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Duct Static Pr SP", "Active card lable not matched");
		unit.enterTemperatureValueWithTwoDecimalsAndValidate((float) 0.1, (float) 0.28, (float) 0.1);
	}

	@Then("Verify the fields in Exhaust Fan Tracking Setpoints page")
	public void verify_the_fields_in_eftrackdspsetpoints_page() {
		assertEquals(unit.getPageTitle(), "Exhaust Fan Tracking Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Tracking Percent", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Tracking %", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_FAN_TRACKING, 0, 98);
	}

	@Then("Verify the fields in Return Fan Tracking Setpoints page")
	public void verify_the_fields_in_rftrackdspsetpoints_page() {
		assertEquals(unit.getPageTitle(), "Return Fan Tracking Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Tracking Percent", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Tracking %", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_FAN_TRACKING, 0, 98);
	}

	@When("User go to Bldg Pr Setpoint page")
	public void user_go_to_bldg_pr_setpoint_page() {
		unit.clickPrSetpoint();
	}
}
