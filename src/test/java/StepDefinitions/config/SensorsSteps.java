package StepDefinitions.config;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConfigPage;
import pages.config.SensorsPage;
import pages.config.UnitSettingsPage;
import utils.TestData;

public class SensorsSteps {
	ConfigPage config = new ConfigPage();
	SensorsPage sensors = new SensorsPage();
	UnitSettingsPage unit = new UnitSettingsPage();

	@When("the user clicks on the Sensors option")
	public void the_user_clicks_on_the_sensors_option() {
		sensors.clickSensors();
		assertEquals(unit.getPageTitle(), "Sensors", "Sensors lable not matched");
	}

	@When("the user selects the Space option to navigate to the Space Sensor section")
	public void the_user_selects_the_space_option_to_navigate_to_the_space_sensor_section() {
		sensors.clickSpace();
		assertTrue(sensors.isTitlePresent(), "Space Sensor Title not Present");
	}

	@When("the user verifies that the No Space Sensor option is clickable")
	public void the_user_verifies_that_the_no_space_sensor_option_is_clickable() {
		assertTrue(sensors.isNoSpaceSensorClickable(), "No Space Sensor radio button is not clickable.");
	}

	@When("the user selects the Analog radio button and clicks the arrow to navigate to the Analog Space Sensor")
	public void the_user_selects_the_analog_radio_button_and_clicks_the_arrow_to_navigate_to_the_analog_space_sensor() {
		sensors.clickAnalogRadioButtons();
		sensors.clickAnalogSubmenu();
	}

	@Then("the user verifies the Analog value in Sensors")
	public void the_user_verifies_the_analog_value_in_sensors() {
		assertTrue("Analog Space Sensor Title is not displayed", sensors.isTitlePresent());

		sensors.clickAnalogSpaceSensorsOptionLabel();
		assertTrue("Temperature adjuster is not displayed", sensors.isAnalogTemperatureAdjusterPresent());
		assertEquals(sensors.getAnalogSpaceSensors(), "# of Space Sensors", "# of Space Sensors Not Matched");

		sensors.clickAnalogOverrideHrsoptionLabel();
		assertTrue("Space Sensor override hrs is not displayed", sensors.isAnalogOverrideHrsPresent());
		assertEquals(sensors.getAnalogSpaceSensorOverride(), "Override", "Override not matched");

		sensors.clickAnalogSetPointFLabel();
		assertTrue("Setpoint Adjust Limit F is not displayed", sensors.isAnalogTemperatureValuePresent());
		assertEquals(sensors.getAnalogSetpointAdjustLimit(), "Setpoint Adjust Limit",
				"Setpoint Adjust Limit not matched");

		sensors.clickBackArrow();
		//sensors.clickConfirmPopupElement();
	}

	@Then("the user selects the Digital radio button and clicks the arrow to navigate to the Digital Space Sensor")
	public void the_user_selects_the_digital_radio_button_and_clicks_the_arrow_to_navigate_to_the_digital_space_sensor() {
		sensors.clickDigitalRadioButtons();
		sensors.clickDigitalSubmenu();
	}

	@Then("the user verifies the Digital value in Sensors")
	public void the_user_verifies_the_digital_value_in_sensors() {
		assertTrue("Digital Space Sensor Title is not displayed", sensors.isTitlePresent());

		sensors.clickDigitalSpaceSensorsOptionLabel();
		assertTrue("Temperature adjuster is not displayed", sensors.isDigitalTemperatureAdjusterPresent());
		assertEquals(sensors.getDigitalSpaceSensors(), "# of Space Sensors", "# of Space Sensors Not Matched");

		sensors.clickDigitalOverrideHrsOptionLabel();
		assertTrue("Space Sensor override hrs is not displayed", sensors.isDigitalOverrideHrsPresent());
		assertEquals(sensors.getDigitalSpaceSensorOverride(), "Override", "Override not matched");

		sensors.clickDigitalSetPointFLabel();
		assertTrue("Setpoint Adjust Limit F is not displayed", sensors.isDigitalTemperatureValuePresent());
		assertEquals(sensors.getDigitalSetpointAdjustLimit(), "Setpoint Adjust Limit",
				"Setpoint Adjust Limit not matched");

		sensors.clickBackArrow();
		//sensors.clickConfirmPopupElement();
		sensors.clickBackArrow();

		assertTrue("Digital is not visible on the label", sensors.isremoteDisplayRadioButtonDigitalPresent());
	}

	@When("the user verifies that the TS Space Sensor option is clickable")
	public void the_user_verifies_that_the_ts_space_sensor_option_is_clickable() {
		sensors.clickSpace();
		assertTrue(sensors.isTSSpaceSensorClickable(), "TS Space Sensor radio button is not clickable.");
	}

	@When("the user verifies that the Humidity checkbox is clickable after BACnet Temp click")
	public void the_user_verifies_that_the_humidity_checkbox_is_clickable_after_ba_cnet_temp_click() {
		assertTrue(sensors.isBACnetTempClickable(), "BACnet Temp radio button is not clickable.");
		assertTrue(sensors.isHumidityClickable(), "Humidity checkbox is not clickable.");
	}

	@When("the user verifies that the Remote Display option is clickable")
	public void the_user_verifies_that_the_remote_display_option_is_clickable() {
		assertTrue(sensors.isRemoteDisplayClickable(), "Remote Display radio button is not clickable.");

		sensors.clickBackArrow();
		assertTrue("BACnet Temp is not visible on the label", sensors.islastSelectedRadioButtonRPresent());
	}

	@When("the user selects the Return option to navigate to the Return Air Sensor Type")
	public void the_user_selects_the_return_option_to_navigate_to_the_return_air_sensor_type() {
		sensors.clickReturn();
		assertTrue("Return Air Sensor Type Title is not displayed", sensors.isTitlePresent());
	}

	@Then("the user verifies that the No Return Sensor isclickable")
	public void the_user_verifies_that_the_no_return_sensor_isclickable() {
		assertTrue(sensors.isNoReturnSensorROptionClickable(), "No Return Sensor radio button is not clickable.");
	}

	@Then("the user selects the Analog and Digital radio button is clickable")
	public void the_user_selects_the_analog_and_digital_radio_button_is_clickable() {
		sensors.isanalogROptionClickable();
		sensors.isdigitalROptionClickable();
	}

	@Then("the user verifies that both the BACnet Temp option and the Humidity checkbox are clickable")
	public void the_user_verifies_that_both_the_ba_cnet_temp_option_and_the_humidity_checkbox_are_clickable() {
		assertTrue(sensors.isBACnetTempROptionClickable(), "BACnet Temp radio button is not clickable.");
		assertTrue(sensors.isHumidityCBOptionClickable(), "Humidity Checkbox is not clickable.");
		sensors.clickBackArrow();
		assertTrue("BACnet Temp is not visible on the label", sensors.islastSelectedRadioButtonBPresent());
	}

	@When("the user selects the Outdoor option to navigate to the Outdoor Air Sensor Options")
	public void the_user_selects_the_outdoor_option_to_navigate_to_the_outdoor_air_sensor_options() {
		sensors.clickOutdoor();
		assertTrue("Outdoor Air Sensor Options Title is not displayed", sensors.isTitlePresent());
	}

	@Then("the user verifies that the No OA Sensor is clickable")
	public void the_user_verifies_that_the_no_oa_sensor_is_clickable() {
		assertTrue(sensors.isoSNoOASensorRadioButtonClickable(), "No OutSide Sensor radio button is not clickable.");
	}

	@Then("the user verifies that the Global Broadcast, BACnet Temp and Humidity checkbox are clickable")
	public void the_user_verifies_that_the_global_broadcast_ba_cnet_temp_and_humidity_checkbox_are_clickable() {
		assertTrue(sensors.isoSGlobalBroadcastClickable(), "Global Broadcast radio button is not clickable.");
		assertTrue(sensors.isoSBACnetTempROptionClickable(), "BACnet Temp radio button is not clickable.");
		assertTrue(sensors.isoSHumidityCBOptionClickable(), "Humidity Checkbox is not clickable.");
	}

	@When("the user selects the Supply option to navigate to the Supply Air Sensor Options")
	public void the_user_selects_the_supply_option_to_navigate_to_the_supply_air_sensor_options() {
		sensors.clickSupply();
		assertTrue("Supply Air Sensor Options Title is not displayed", sensors.isTitlePresent());
	}

	@When("the user selects the CO2 option to navigate to the CO2 Sensor Type")
	public void the_user_selects_the_co2_option_to_navigate_to_the_co2_sensor_type() {
		sensors.clickCO2();
		assertTrue("CO2 Sensor Type is not displayed", sensors.isTitlePresent());
	}

	@Then("the user verifies that the  No CO2 Sensor option is clickable")
	public void the_user_verifies_that_the_no_co2_sensor_option_is_clickable() {
		assertTrue(sensors.isNoCO2SensorClickable(), "No CO2 Sensor radio button is not clickable.");
	}

	@Then("the user selects the Digital radio button and clicks the arrow to navigate to the CO2 Setpoints")
	public void the_user_selects_the_digital_radio_button_and_clicks_the_arrow_to_navigate_to_the_co2_setpoints() {
		sensors.clickCO2digitalRadioButtonsLabel();
		sensors.clickCO2DigitalSubmenu();
	}

	@Then("Verify the fields in CO2 Setpoints page")
	public void verify_the_fields_in_co2_setpoints_page() {
		assertTrue("CO2 Setpoints is not displayed", sensors.isTitlePresent());
		assertEquals(unit.getTemperatureLableText(), "CO2 Sensor Offset", "Temperature lable not matched");
		assertEquals(unit.getActiveCaedText(), "CO2 Sensor Offset", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_CO2_Sensor_Offset, 10, 90);
		sensors.clickBackArrow();
	}

	@Then("the user verifies that the Reads CO2 Broadcast, Reads CO2 From BACnet")
	public void the_user_verifies_that_the_reads_co2_broadcast_reads_co2_from_ba_cnet() throws InterruptedException {
		assertEquals(sensors.getReadsCO2BroadcastText(), "Reads CO2 Broadcast", "Reads CO2 Broadcast not matched");
		assertEquals(sensors.getReadsCO2BACnetText(), "Reads CO2 From BACnet", "Reads CO2 From BACnet not matched");
		sensors.clickBackArrow();
	}

}
