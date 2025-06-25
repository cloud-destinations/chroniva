package StepDefinitions.config;

import static org.testng.Assert.assertEquals;
import io.cucumber.java.en.*;
import pages.config.UnitSettingsPage;
import utils.TestData;

public class DehumSteps {
	UnitSettingsPage unit=new UnitSettingsPage();

	@When("User clicks Factory Reset button")
	public void user_clicks_factory_reset_button() {
		unit.clickFactoryResetButton();
	}
	@Then("verify the {string} description text should be {string} and click")
	public void verify_the_description_text_should_be(String name, String descr) {
		assertEquals(unit.getDescriptionText(name), descr, descr+" lable not matched for "+name);
		unit.clickWebElementByText(name);
	}
	@Then("verify the {string} description text should be {string}")
	public void verify_the_description_text(String name, String descr) {
		assertEquals(unit.getDescriptionText(name), descr, descr+" lable not matched for "+name);
	}
	@Then("Verify the fields in Dehum Config page")
	public void verify_the_fields_in_dehum_config_page() {
		assertEquals(unit.getPageTitle(), "Dehum Config", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_DEHUM_CONFIG_LABLES);
	}
	@Then("Verify the fields in Reheat Config page")
	public void verify_the_fields_in_Reheat_config_page() {
		assertEquals(unit.getPageTitle(), "Reheat Config", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_REHEAT_CONFIG_LABLES);
	}
	@Then("Verify the fields in Dehum Enable Sensor page")
	public void verify_the_fields_in_dehum_enblesensor_page() {
		assertEquals(unit.getPageTitle(), "Dehum Enable Sensor", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_DEHUM_CONFIG_SENSOR_LABLES);
	}
	@Then("Verify the fields in Modulating HGR page")
	public void verify_the_fields_in_moduhcr_page() {
		assertEquals(unit.getPageTitle(), "Modulating HGR - Flush Config", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_REHEAT_MOD_HGR_LABLES);
	}
	@When("User selects {string} radio button and go back")
	public void user_selects_radio_button_and_go_back(String name) {
		unit.selectWebElementByText(name);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Reheat Flush Interval page")
	public void verify_the_fields_in_rehrfi_page() {
		assertEquals(unit.getPageTitle(), "Reheat Flush Interval", "Paage title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Reheat Flush Interval", "Temperature lable not matched");
		assertEquals(unit.getActiveCaedText(), "Reheat Flush Interval", "Active card lable not matched");
		//unit.enterTemperatureValueAndValidate(10, 70);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in Condenser Flush Interval page")
	public void verify_the_fields_in_condflushi_page() {
		assertEquals(unit.getPageTitle(), "Condenser Flush Interval", "Paage title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Condenser Flush Interval", "Temperature lable not matched");
		assertEquals(unit.getActiveCaedText(), "Cond. Flush Interval", "Active card lable not matched");
		//unit.enterTemperatureValueAndValidate(10, 70);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in Cooling Flush Interval page")
	public void verify_the_fields_in_coolinghrfi_page() {
		assertEquals(unit.getPageTitle(), "Cooling Flush Interval", "Paage title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Cooling Flush Interval", "Temperature lable not matched");
		assertEquals(unit.getActiveCaedText(), "Cooling Flush Interval", "Active card lable not matched");
		//unit.enterTemperatureValueAndValidate(10, 70);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in Dehum Space Sensor page")
	public void verify_the_fields_in_dehum_space_sensor_page() {
		assertEquals(unit.getPageTitle(), "Space Sensor Humidity Setpoints", "Paage title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Humidity Setpoint", "Temperature lable not matched");
		assertEquals(unit.getActiveCaedText(), "Humidity SP", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SPACE_SENSOR_HUMIDITY_SETPOINTS, 10, 90);
	}
	@Then("Verify the fields in Dehum Return Sensor page")
	public void verify_the_fields_in_dehum_return_sensor_page() {
		assertEquals(unit.getPageTitle(), "Return Sensor Humidity Setpoints", "Paage title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Humidity Setpoint", "Temperature lable not matched");
		assertEquals(unit.getActiveCaedText(), "Humidity SP", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SPACE_SENSOR_HUMIDITY_SETPOINTS, 10, 90);
	}
	@Then("Verify the fields in Dehum OA Sensor page")
	public void verify_the_fields_in_dehum_oa_sensor_page() {
		assertEquals(unit.getPageTitle(), "OA Sensor Humidity Setpoints", "Paage title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Humidity Setpoint", "Temperature lable not matched");
		assertEquals(unit.getActiveCaedText(), "Humidity SP", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SPACE_SENSOR_HUMIDITY_SETPOINTS, 10, 90);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in Dehum Dewpoint Space Sensor page")
	public void verify_the_fields_in_dehum_Dewpointspace_sensor_page() {
		assertEquals(unit.getPageTitle(), "Space Senor", "Paage title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Dewpoint Setpoint", "Temperature lable not matched");
		assertEquals(unit.getActiveCaedText(), "Dewpoint SP", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SPACE_SENSOR_DEWPOINT_SETPOINTS, 10, 90);
	}
	@Then("Verify the fields in Dehum Dewpoint Return Sensor page")
	public void verify_the_fields_in_dehum_Dewpointreturn_sensor_page() {
		assertEquals(unit.getPageTitle(), "Return Sensor Dewpoint Setpoint", "Paage title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Dewpoint Setpoint", "Temperature lable not matched");
		assertEquals(unit.getActiveCaedText(), "Dewpoint SP", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SPACE_SENSOR_DEWPOINT_SETPOINTS, 10, 90);
	}
	@Then("Verify the fields in Dehum Dewpoint OA Sensor page")
	public void verify_the_fields_in_dehum_Dewpointoa_sensor_page() {
		assertEquals(unit.getPageTitle(), "OA Senor", "Paage title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Dewpoint Setpoint", "Temperature lable not matched");
		assertEquals(unit.getActiveCaedText(), "Dewpoint SP", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SPACE_SENSOR_DEWPOINT_SETPOINTS, 10, 90);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in Dehum Supply Air Dewpoint Control page")
	public void verify_the_fields_in_dehum_sadc_page() {
		assertEquals(unit.getPageTitle(), "Supply Air Dewpoint Setpoint", "Paage title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Supply Air Dewpoint Setpoint", "Temperature lable not matched");
		assertEquals(unit.getActiveCaedText(), "SA Dewpoint SP", "Active card lable not matched");
		unit.enterTemperatureValueAndValidate(10, 90);
	}
	
}
