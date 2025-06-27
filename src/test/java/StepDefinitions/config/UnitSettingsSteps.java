package StepDefinitions.config;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.config.UnitSettingsBoardsPage;
import pages.config.UnitSettingsPage;
import utils.TestData;

public class UnitSettingsSteps {
	UnitSettingsBoardsPage Boards = new UnitSettingsBoardsPage();
	UnitSettingsPage unit = new UnitSettingsPage();

	@When("User go to Unit settings page in Config")
	public void user_go_to_unit_settings_page_in_config() {
		unit.clickUnitSettings();
	}

	@When("User go to App type page in Unit settings")
	public void user_go_to_app_type_page_in_unit_settings() {
		unit.clickAppType();
	}

	@Then("Verify the fields in Unit settings page")
	public void verify_the_fields_in_unit_settings_page() {
		assertEquals(unit.getPageTitle(), "Unit Settings", "Unit settings lable not matched");
		unit.verifyPageLables(TestData.EXPECTED_UNITSETTINGS_VALUES);
	}

	@Then("Verify the fields in App type page")
	public void verify_the_fields_in_apptype_page() {
		assertEquals(unit.getPageTitle(), "Application Type", "Application Type lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_APPTYPE_VALUES);
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
	}

	@When("User selects precision radio button")
	public void user_selects_precision_radio_button() {
		unit.selectPrecision();
	}

	@Then("Verify the App type value {string} in Unit settings")
	public void verify_the_app_type_value_in_unit_settings(String expDesc) {
		unit.clickBackButton();
		assertEquals(unit.getAppTypeDesc(), expDesc, "App type desc value not matched");
		unit.clickAppType();
	}

	@When("User selects Standard radio button")
	public void user_selects_standard_radio_button() {
		unit.selectStandard();
	}

	@When("User selects VAV Control radio button")
	public void user_selects_vav_control_radio_button() {
		unit.selectVAVControl();
	}

	@When("User selects Outdoor Air Control radio button")
	public void user_selects_outdoor_air_control_radio_button() {
		unit.selectOutdoorAirControl();
	}

	@When("User selects Return Air Control radio button")
	public void user_selects_return_air_control_radio_button() {
		unit.selectReturnAirControl();
	}

	@When("User selects 3rd Party Interface radio button")
	public void user_selects_3rd_party_interface_radio_button() {
		unit.selectThirdPartyInterface();
	}

	@When("User clicks next page button of the selected option")
	public void user_next_page_button_of_the_selected_option() {
		UnitSettingsPage.clickNextPageButton();
	}

	@Then("Verify the fields in VAV Control page")
	public void verify_the_fields_in_vavac_page() {
		unit.verifyPageLables(TestData.EXPECTED_VAVCONTROL_VALUES);
	}

	@When("User go to {string} page")
	public void user_go_to_page(String name) {
		unit.clickWebElementByText(name);
	}

	@Then("Verify the fields in VAV - Config page")
	public void verify_the_fields_in_vavconfig_page() {
		assertEquals(unit.getPageTitle(), "VAV - Config", "VAV - Config lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_VAVCONFIG_ELEMENTS);
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
	}

	@When("User clicks {string} next page button")
	public void user_go_to_page_nextpage_button(String name) throws IOException {
		unit.selectWebElementByText(name);
		unit.clickNextPageByText(name);
	}

	@Then("Verify the fields in Morning Warm Up Setpoints page")
	public void verify_the_fields_in_mornngwarmup_page() {
		assertEquals(unit.getPageTitle(), "Morning Warm Up Setpoints", "Morning Warm Up Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Return Air Temp", "Return Air Temp lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_MORNING_WARMUP_SETPOINTS, 10, 70);
	}

	@Then("Verify the fields in Morning Cool Down Setpoints page")
	public void verify_the_fields_in_mornngcooldown_page() {
		assertEquals(unit.getPageTitle(), "Morning Cool Down Setpoints",
				"Morning Cool Down Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Return Air Temp", "Return Air Temp lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_MORNING_COOLDOWN_SETPOINTS, 10, 70);
	}

	@Then("Verify the fields in Unit Heating Setpoints page")
	public void verify_the_fields_in_unitheating_page() {
		assertEquals(unit.getPageTitle(), "Unit Heating Setpoints", "Unit Heating Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Cool OAT Enable Setpoint",
				"Cool OAT Enable Setpoint lable not matched");
		assertEquals(unit.getActiveCaedText(), "Cool OAT Enable SP", "Cool OAT Enable Setpoint lable not matched");
	}

	@Then("Verify the fields in Duct Static SP page")
	public void verify_the_fields_in_ductstatucsp_page() {
		assertEquals(unit.getPageTitle(), "Duct Static Pressure Setpoint",
				"Duct Static Pressure Setpoint lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Duct Static Pressure Setpoint",
				"Duct Static Pressure Setpoint lable not matched");
		assertEquals(unit.getActiveCaedText(), "Duct Static Pr. SP", "Duct Static Pressure Setpoint lable not matched");
	}

	@Then("Verify the fields in OA Control - SAT Source Setpoints page")
	public void verify_the_fields_in_oacontrolsatsource_page() {
		assertEquals(unit.getPageTitle(), "OA Control - SAT Source Setpoints",
				"OA Control - SAT Source Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Heat SAT Low", "Heat SAT Low lable not matched");
		assertEquals(unit.getActiveCaedText(), "Heat SAT Low", "Heat SAT Low lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SYPPLY_FAN_VFD_SAT_SETPOINTS, 10, 70);
	}

	@Then("Verify the fields in Space Air - SAT Source Setpoints page")
	public void verify_the_fields_in_spaceairsatsource_page() {
		assertEquals(unit.getPageTitle(), "Space Air - SAT Source Setpoints",
				"Space Air - SAT Source Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Heat SAT Low", "Heat SAT Low lable not matched");
		assertEquals(unit.getActiveCaedText(), "Heat SAT Low", "Heat SAT Low lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SYPPLY_FAN_VFD_SAT_SETPOINTS, 10, 70);
	}

	@Then("Verify the fields in Return Air - SAT Source Setpoints page")
	public void verify_the_fields_in_returnairsatsource_page() {
		assertEquals(unit.getPageTitle(), "Return Air - SAT Source Setpoints",
				"Return Air - SAT Source Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Heat SAT Low", "Heat SAT Low lable not matched");
		assertEquals(unit.getActiveCaedText(), "Heat SAT Low", "Heat SAT Low lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SYPPLY_FAN_VFD_SAT_SETPOINTS, 10, 70);
	}

	@Then("Verify the fields in Supply FAN VFD - SAT Source Setpoints page")
	public void verify_the_fields_in_supplyfansatsource_page() {
		assertEquals(unit.getPageTitle(), "Supply FAN VFD - SAT Source Setpoints",
				"Supply FAN VFD - SAT Source Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Heat SAT Low", "Heat SAT Low lable not matched");
		assertEquals(unit.getActiveCaedText(), "Heat SAT Low", "Heat SAT Low lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_Supply_FAN_VFD_SAT_Source_SetpointsS, 10, 70);
	}

	@Then("Verify the fields in SAT Reset page")
	public void verify_the_fields_in_satreset_page() {
		assertEquals(unit.getPageTitle(), "VAV - SAT Reset", "VAV - SAT Reset lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_VAV_SATRESET);
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
	}

	@Then("Verify the fields in Enable SAT Reset page")
	public void verify_the_fields_in_enablesatreset_page() {
		assertEquals(unit.getPageTitle(), "VAV - SAT Source Type", "VAV - SAT Source Type lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_VAV_SAT_SOURCE_TYPE);
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
	}

	@Then("Verify the fields in Remote Voltage Signal - SAT Reset Setpoints page")
	public void verify_the_fields_in_rvssatresetsetpoints_page() {
		assertEquals(unit.getPageTitle(), "Remote Voltage Signal - SAT Reset Setpoints",
				"Remote Voltage Signal - SAT Reset Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Minimum Voltage", "Min Voltage lable not matched");
		unit.verifyServiceItemLables(TestData.EXPECTED_RVS_SAT_RESET_SETPOINTS);
	}

	@Then("User enter the value and verify the entered value")
	public void enter_the_temperature_value_and_verify() {
		unit.enterTemperatureValueAndValidate(10, 70);
	}

	@When("User go to next page in pagination")
	public void user_go_to_next_page_in_pagination() {
		unit.clickNextPageButton_pagination();
	}

	@Then("Verify the fields in Space Control - Standard page")
	public void verify_the_fields_in_space_control_standard_page() {
		assertEquals(unit.getPageTitle(), "Space Control - Standard",
				"Space Control - Standard Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Occupied Cooling Setpoint",
				"Occupied Cooling SP lable not matched");
		assertEquals(unit.getActiveCaedText(), "Occupied Cooling SP", "Occupied Cooling SP lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SPACECONTROL_STANDARD_SETPOINTS, 10, 70);
	}

	@Then("Verify the fields in Space Control - Precision - Manual page")
	public void verify_the_fields_in_space_control_precmanual_page() {
		assertEquals(unit.getPageTitle(), "Precision Setpoints", "Precision Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Unoccupied Cooling Setpoint",
				"Unoccupied Cooling SP   lable not matched");
		assertEquals(unit.getActiveCaedText(), "Unoccupied Cooling SP", "Unoccupied Cooling SP lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SPACECONTROL_PRECISION_MANUAL_SETPOINTS, 10, 70);
	}

	@Then("Verify the all the tiles functionality in Auto Season page")
	public void verify_the_fields_functionalityinautopage() {
		assertEquals(unit.getPageTitle(), "Space Control - Auto", "Space Control - Auto Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Occupied Winter Setpoint",
				"Occupied Winter SP lable not matched");
		assertEquals(unit.getActiveCaedText(), "Occupied Winter SP", "Occupied Winter SP lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SPACECONTROL_AUTO_SETPOINTS, 10, 70);
	}

	@Then("Verify page functionality in Outside Air Control Setpoints page")
	public void verify_the_fields_Outside_Air_Control_Setpointspage() {
		assertEquals(unit.getPageTitle(), "Outside Air Control Setpoints",
				"Outside Air Control Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Occupied Cooling Setpoint",
				"Occupied Cooling Setpoint lable not matched");
		assertEquals(unit.getActiveCaedText(), "Occupied Cooling SP", "Occupied Cooling SP not matched");
		unit.validateAllTiles(TestData.EXPECTED_OUTSIDE_AIR_CONTROL_SETPOINTS, 10, 70);
	}

	@Then("Verify page functionality in OA Control SAT Reset Setpoints page")
	public void verify_the_fields_Outside_Air_Control_sat_reset_Setpointspage() {
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Heat SAT Low", "Heat SAT Low  lable not matched");
		assertEquals(unit.getActiveCaedText(), "Heat SAT Low", "Heat SAT Low lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SYPPLY_FAN_VFD_SAT_SETPOINTS, 10, 70);
		unit.clickBackButton();
		// unit.clickYesButton();
	}

	@Then("Verify the fields in Outside Air - Return Air Setpoints page")
	public void verify_the_fields_Outside_Air_Control_ras_Setpointspage() {
		assertEquals(unit.getPageTitle(), "Outside Air + Return Air Setpoints",
				"Outside Air + Return Air Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Unocc Space Cooling Setpoint",
				"Unocc Space Cooling Setpoint lable not matched");
		assertEquals(unit.getActiveCaedText(), "Unocc Space Cooling SP", "Unocc Space Cooling SP lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_OUTSIDE_AIR_RETURN_AIR_SETPOINTS, 10, 70);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Return Air Control page in app type")
	public void verify_the_fields_return_Air_Control_Setpointspage() {
		assertEquals(unit.getPageTitle(), "Return Air Control", "Return Air Control lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Occupied Cooling Setpoint",
				"Occupied Cooling Setpoint lable not matched");
		assertEquals(unit.getActiveCaedText(), "Occupied Cooling SP", "Occupied Cooling Setpoint lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_RETURN_AIR_CONTROL_SETPOINTS, 10, 70);
		unit.clickBackButton();
	}

	@Then("Verify the fields in third Party Interface Type page in app type")
	public void verify_the_fields_thirdpartyinttype_Setpointspage() {
		assertEquals(unit.getPageTitle(), "3rd Party Interface Type", "3rd Party Interface Type lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_3RD_PARTY_INTERFACE_TYPE);
	}

	@Then("Verify the fields in Heat Pump Thermostat Type page")
	public void verify_the_fields_heatpumpthermostattype() {
		assertEquals(unit.getPageTitle(), "Heat Pump Thermostat Type", "Heat Pump Thermostat Type lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_HEAT_PUMP_THERMOSTAT_TYPE);
		unit.clickBackButton();
		unit.clickYesButton();
	}

	@Then("Verify the fields in DDC page")
	public void verify_the_fields_ddc_page() {
		assertEquals(unit.getPageTitle(), "DCC Control Enables", "DCC Control Enables lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_DCC_CONTROL_ENABLES);
	}

	@Then("Verify the fields in supply fan DDC page")
	public void verify_the_fields_ddcsyppyfan_page() {
		assertEquals(unit.getPageTitle(), "DCC Supply Fan Setpoints", "DCC Supply Fan Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Minimum Voltage", "Min Voltage lable not matched");
		assertEquals(unit.getActiveCaedText(), "Min Voltage", "Min Voltage lable not matched");
		unit.validateForTwoTiles(TestData.EXPECTED_DCC_SUPPLY_FAN_SETPOINTS, 5, 6);
		unit.clickBackButton();
		// unit.clickYesButton();
	}

	@Then("Verify the fields in return exaust fan DDC page")
	public void verify_the_fields_ddcsreturnfan_page() {
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Minimum Voltage", "Minimum Voltage lable not matched");
		assertEquals(unit.getActiveCaedText(), "Min Voltage", "Min Voltage lable not matched");
		unit.validateForTwoTiles(TestData.EXPECTED_DCC_SUPPLY_FAN_SETPOINTS, 5, 6);
		unit.clickBackButton();
		// unit.clickYesButton();
	}

	@Then("Verify the fields in DDC - SAT Reset Setpoints page")
	public void verify_the_fields_in_ddcsatresetsetpoints_page() {
		assertEquals(unit.getPageTitle(), "SAT Reset Setpoints", "SAT Reset Setpoints lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Minimum Voltage", "Minimum Voltage lable not matched");
		assertEquals(unit.getActiveCaedText(), "Min Voltage", "Min Voltage lable not matched");
		unit.verifyServiceItemLables(TestData.EXPECTED_RVS_SAT_RESET_SETPOINTS);
	}

	@Then("Verify the fields in Enable Unoccupied Setpoints page in app type")
	public void verify_the_fields_in_enable_unoccupied_setpoints_page_in_app_type() {
		assertEquals(unit.getPageTitle(), "Night Setback Unoccupied Temps", "Enable Night Setback lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Unoccupied Cooling SP",
				"Unoccupied Cooling SP lable not matched");
		assertEquals(unit.getActiveCaedText(), "Unoccupied Cooling SP", "Unoccupied Cooling SP lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_NIGHT_SETBACK_SETPOINTS, 10, 70);
	}

	@Then("Verify the fields in Temp scaling page")
	public void verify_the_fields_tempscalingspage() {
		assertEquals(unit.getPageTitle(), "Temp Scaling", "Temp Scaling lable not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_TEMP_SCALINGS);
	}

	@Then("Verify the fields in Daylight Savings page")
	public void verify_the_fields_daylightsavingspage() {
		assertEquals(unit.getPageTitle(), "Daylight Savings", "Daylight Savings not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyServiceItemLables(TestData.EXPECTED_DAYLIGHT_SAVINGS);
	}

	@Then("Verify the fields in Simultaneous HeatCool page")
	public void verify_the_fields_simheatcoolpage() {
		assertEquals(unit.getPageTitle(), "Simultaneous Heat/Cool", "Daylight Savings not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_SIM_HEAT_COOL);
	}

}
