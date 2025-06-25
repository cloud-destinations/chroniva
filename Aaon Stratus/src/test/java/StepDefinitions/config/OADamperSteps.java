package StepDefinitions.config;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.config.UnitSettingsPage;
import utils.TestData;

public class OADamperSteps {
	UnitSettingsPage unit=new UnitSettingsPage();

	@Then("Verify the fields in CO2 Setpoints")
	public void verify_the_fields_in_co2setpoints_page() {
		assertEquals(unit.getPageTitle(), "CO2 Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "CO2 Sensor Offset", "CO2 Sensor Offset lable not matched");
		assertEquals(unit.getActiveCaedText(), "CO2 Sensor Offset", "CO2 Sensor Offset lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_CO2_SETPOINTS, 10, 70);
	}
	
	@Then("Verify the fields in OA Damper Config")
	public void verify_the_fields_simheatcoolpage() {
		assertEquals(unit.getPageTitle(), "OA Damper Config", "OA Damper Config not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_OA_DAMPER_CONFIG);
	}
	
	@Then("Verify the fields in Building Pressure - Return Fan Control")
	public void verify_the_fields_bprfcpage() {
		assertEquals(unit.getPageTitle(), "Building Pressure - Return Fan Control", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_BP_RETURN_FAN_CONTROL);
		unit.clickBackButton();
		unit.clickYesButton();
	}
	
	@Then("Verify the fields in CO2 Sensor Type")
	public void verify_the_fields_CO2sensortypepage() {
		assertEquals(unit.getPageTitle(), "CO2 Sensor Type", "CO2 Sensor Type not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_CO2_SENSOR_TYPE);
	}
	
	@Then("Verify the fields in Supply Fan page in BPC")
	public void verify_the_fields_supplyfaninbpcpage() {
		assertEquals(unit.getPageTitle(), "Supply Fan Setpoints", "Supply Fan Setpoints not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Building Pressure Setpoints", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Bldg Pr Setpoint", "Active card lable not matched");
		unit.verifyServiceItemLables(TestData.EXPECTED_SUPPLYFAN_SETPOINTS);
	}
	
	@Then("Verify the fields in Building Pressure - Return Fan Setpoints")
	public void verify_the_fields_bp_rfs() {
		assertEquals(unit.getPageTitle(), "Return Fan Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Building Pressure Setpoints", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Bldg Pr Setpoint", "Active card lable not matched");
		unit.verifyServiceItemLables(TestData.EXPECTED_SUPPLYFAN_SETPOINTS);
	}
	
	@Then("Verify the fields in Building Pressure - Exhaust Damper")
	public void verify_the_fields_bp_exdamp() {
		assertEquals(unit.getPageTitle(), "Exhaust Damper Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Building Pressure Setpoints", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Bldg Pr Setpoint", "Active card lable not matched");
		unit.verifyServiceItemLables(TestData.EXPECTED_SUPPLYFAN_SETPOINTS);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in Building Pressure - RF Exhaust Damper")
	public void verify_the_fields_bp_rfexdamp() {
		assertEquals(unit.getPageTitle(), "Exhaust Damper Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Exhaust Damper Deadband", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Exhaust Damper SP", "Active card lable not matched");
		unit.verifyServiceItemLables(TestData.EXPECTED_EXAUST_DAMPER_SETPOINTS);
		unit.clickBackButton();
		//unit.clickYesButton();
	}
	
	@When("User selects {string} radio button")
	public void user_selects_radio_button(String name) {
		unit.selectWebElementByText(name);
	}
	
	@Then("Verify the fields in Building Pressure - Outside Air Damper")
	public void verify_the_fields_in_building_pressure_outside_air_damper() {
		assertEquals(unit.getPageTitle(), "OA Damper Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Building Pressure Setpoints", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Bldg Pr Setpoint", "Active card lable not matched");
		unit.verifyServiceItemLables(TestData.EXPECTED_SUPPLYFAN_SETPOINTS);
		unit.clickBackButton();
		//unit.clickYesButton();
	}
	
	@Then("Verify the fields in Building Pressure -Exhaust Fan Control")
	public void verify_the_fields_in_building_pressure_exhaust_fan_control() {
		assertEquals(unit.getPageTitle(), "Building Pressure - Exhaust Fan Control", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_BP_RETURN_FAN_CONTROL);
		unit.clickBackButton();
		unit.clickYesButton();
	}
	
	@Then("Verify the fields in Building Pressure Sensor Type")
	public void verify_the_fields_in_building_pressure_sensortype() {
		assertEquals(unit.getPageTitle(), "Sensor Type", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_BP_SENSOR_TYPE);
	}
	
	@Then("Verify the fields in Building Pressure - Exhaust Fan Setpoints")
	public void verify_the_fields_in_building_pressure_exhaust_fan_setpoints() {
		assertEquals(unit.getPageTitle(), "Exhaust Fan Setpoints", "Supply Fan Setpoints not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Building Pressure Setpoints", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Bldg Pr Setpoint", "Active card lable not matched");
		unit.verifyServiceItemLables(TestData.EXPECTED_SUPPLYFAN_SETPOINTS);
	}
	
	@Then("Verify the fields in Duct Static Pressure Sensor page - Return Fan")
	public void verify_the_fields_in_ds_pressure_return_fan_setpoints() {
		assertEquals(unit.getPageTitle(), "RF Duct Static Pressure Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Duct Static Pressure Setpoint", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Duct Static Pr SP", "Active card lable not matched");
		unit.verifyServiceItemLables(TestData.EXPECTED_DUCT_STATIC_PRESSURE_SENSOR);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Duct Static Pressure Sensor page - Exhaust Fan")
	public void verify_the_fields_in_ds_pressure_exhaust_fan_setpoints() {
		assertEquals(unit.getPageTitle(), "EF Duct Static Pressure Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Duct Static Pressure Setpoint", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Duct Static Pr SP", "Active card lable not matched");
		unit.verifyServiceItemLables(TestData.EXPECTED_DUCT_STATIC_PRESSURE_SENSOR);
	}
	
	@Then("Verify the fields in Fan Tracking - Return Fan")
	public void verify_the_fields_in_ds_FanTracking_return_fan_setpoints() {
		assertEquals(unit.getPageTitle(), "Return Fan Tracking Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Tracking Percent", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Tracking %", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_FAN_TRACKING, 0, 98);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in Fan Tracking - Exhaust Fan")
	public void verify_the_fields_in_FanTracking_exhaust_fan_setpoints() {
		assertEquals(unit.getPageTitle(), "Exhaust Fan Tracking Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Tracking Percent", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Tracking %", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_FAN_TRACKING, 0, 98);
	}
	
	@Then("Verify the fields in OA Damper - Min Eco Pos.")
	public void verify_the_fields_in_oadminecopos() {
		assertEquals(unit.getPageTitle(), "Minimum Economizer Position", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Minimum Economizer Position", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Minimum Economizer Position", "Active card lable not matched");
		unit.enterTemperatureValueAndValidate(10, 70);
		unit.clickBackButton();
		assertEquals(unit.getminEcoPosDescreption(), unit.actTempValue+" %", "Min Eco Pos Descreption not matched");
	}
	
	@Then("Verify the fields in OA Damper - Economizer Enable - Outside Air Drybulb")
	public void verify_the_fields_in_oa_damper_economizer_enable_outside_air_drybulb() {
		assertEquals(unit.getPageTitle(), "Outside Air Drybulb Setpoint", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Outside Air Enable Setpoint", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "OA Enable SP", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_OUTSIDE_AIR_SETPOINT, 10, 70);
		unit.clickBackButton();
	}
	@Then("Verify the fields in OA Damper - Economizer Enable - Outside Air Wetbulb")
	public void verify_the_fields_in_oa_damper_economizer_enable_outside_air_wetbulb() {
		assertEquals(unit.getPageTitle(), "Outside Air Wetbulb Setpoint", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Outside Air Enable Setpoint", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "OA Enable SP", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_OUTSIDE_AIR_SETPOINT, 10, 70);
		unit.clickBackButton();
	}
	@Then("Verify the fields in OA Damper - Economizer Enable - Outside Air Dewpoint")
	public void verify_the_fields_in_oa_damper_economizer_enable_outside_air_dewpoint() {
		assertEquals(unit.getPageTitle(), "Outside Air Dewpoint Setpoint", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Outside Air Enable Setpoint", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "OA Enable SP", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_OUTSIDE_AIR_SETPOINT, 10, 70);
		unit.clickBackButton();
		}
	@Then("Verify the fields in OA Damper - Economizer Enable - Comparative Enthalpy Drybulb Limit")
	public void verify_the_fields_in_oa_damper_economizer_enable_comparative_enthalpy_drybulb_limit() {
		assertEquals(unit.getPageTitle(), "Comparative Enthalpy with Drybulb Limit Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Outside Air Limit Setpoint", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "OA Limit SP", "Active card lable not matched");
		unit.validateThreeTiles(TestData.EXPECTED_COMP_ENTH_LIMIT_SETPOINT);
		unit.clickBackButton();
		//unit.clickYesButton();
		
		}
	@Then("Verify the fields in OA Damper - Economizer Enable - Comparative Enthalpy")
	public void verify_the_fields_in_oa_damper_economizer_enable_comparative_enthalpy() {
		assertEquals(unit.getPageTitle(), "Comparative Enthalpy Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Outside Air Enthalpy", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "OA Enthalpy", "Active card lable not matched");
		unit.validateTwoTiles(TestData.EXPECTED_COMP_ENTH_DRYBULB_SETPOINT);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in OA Damper - Economizer Voltages")
	public void verify_the_fields_in_oa_damper_economizer_voltages() {
		assertEquals(unit.getPageTitle(), "Economizer Voltage Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Minimum Economizer Voltage", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Min Econo Voltage", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_ECO_VOLTAGES_SETPOINT, 0, 8);
		unit.clickBackButton();
	}
}
