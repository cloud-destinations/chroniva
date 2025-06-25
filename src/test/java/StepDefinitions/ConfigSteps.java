package StepDefinitions;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConfigPage;
import pages.LandingPage;

public class ConfigSteps {
	LandingPage landing=new LandingPage(Hooks.getDriver());
	ConfigPage config=new ConfigPage();

	@Then("Verify the fields in Config page")
	public void verify_the_fields_in_Config_page() {
		assertEquals(config.getPageTitle(), "Unit Configuration", "Unit Configuration lable not matched");
		config.verifyTabNames();
	}
	
	@Given("User go to Tools and sign in with {string} and {string} and click Config")
	public void user_go_to_tools_and_sign_in_with_and_and_click_config(String username, String password) {
		landing.clickToolsButton();
		landing.loginWithCredentials(username, password);
		config.clickConfigTab();
	}
	
	@Given("Go to Tools and sign in with {string} and {string} and click Config")
	public void go_to_tools_and_sign_in_with_and_and_click_config(String username, String password) {
		landing.clickToolsButton();
		landing.loginWithCredentials(username, password);
		config.clickConfigTab();
	}
	
	@When("Go to Control Mode page in Setpoints")
	public void go_to_Control_Mode_page_in_Setpoints() {
		config.clickSetpointsButton();
		config.clickControlModeButton();
	}

	@Then("Verify the fields in Control Mode page")
	public void verify_the_fields_in_Control_Mode_page() {
		assertTrue("Cooling Mode Enable label not displayed", config.isCoolingModeEnableLabelPresent());
		assertEquals("Cooling Mode Enable Setpoint", config.getTemperatureCardLabel(),
				"Cooling Mode Enable Setpoint label not matched");
		assertEquals(config.getSetpointLablesCount(), 11, "Setpoint lables count not matched");
	}

	@When("Go to Cooling page in Setpoints")
	public void go_to_Cooling_page_in_Setpoints() {
		config.clickSetpointsButton();
		config.clickCoolingButton();
	}

	@Then("Verify the fields in Cooling page")
	public void verify_the_fields_in_Cooling_page() {
		assertTrue("High Reset Source label not displayed", config.isHighResetSourceLabelPresent());
		assertEquals("High Reset Source Setpoint", config.getTemperatureCardLabel(),
				"High Reset Source Setpoint label not matched");
		assertEquals(config.getSetpointLablesCount(), 27, "Setpoint lables count not matched");
	}

	@When("Go to Heating page in Setpoints")
	public void go_to_Heating_page_in_Setpoints() {
		config.clickSetpointsButton();
		config.clickHeatingButton();
	}

	@Then("Verify the fields in Heating page")
	public void verify_the_fields_in_Heating_page() {
		assertTrue("High Reset Source", config.isHighResetSourceLabelPresent());
		assertEquals("High Reset Source", config.getTemperatureCardLabel(), "High Reset Source label not matched");
		assertEquals(config.getSetpointLablesCount(), 20, "Setpoint lables count not matched");
	}

	@When("Go to Dehum page in Setpoints")
	public void go_to_Dehum_page_in_Setpoints() {
		config.clickSetpointsButton();
		config.clickDehumButton();
	}

	@Then("Verify the fields in Dehum page")
	public void verify_the_fields_in_Dehum_page() {
		assertTrue("Indoor Humidity High SP/ Low Reset label not displayed",
				config.isIndoorHumidityHSPLResetLabelPresent());
		assertEquals("Indoor Humidity High SP/ Low Reset", config.getTemperatureCardLabel(),
				"Indoor Humidity High SP/ Low Reset label not matched");
		assertEquals(config.getSetpointLablesCount(), 7, "Setpoint lables count not matched");
	}

	@When("Go to Preheat page in Setpoints")
	public void go_to_Preheat_page_in_Setpoints() {
		config.clickSetpointsButton();
		config.clickPreheatButton();
	}

	@Then("Verify the fields in Preheat page")
	public void verify_the_fields_in_Preheat_page() {
		assertTrue("Preheat Setpoint label not displayed", config.isPreheatSetpointLabelPresent());
		assertEquals("Preheat Setpoint", config.getTemperatureCardLabel(), "Preheat Setpoint label not matched");
	}

	@When("Go to Heat Wheel page in Setpoints")
	public void go_to_Heat_Wheel_page_in_Setpoints() {
		config.clickSetpointsButton();
		config.clickHeatWheelButton();
	}

	@Then("Verify the fields in Heat Wheel page")
	public void verify_the_fields_in_Heat_Wheel_page() {
		assertTrue("Heat Wheel Defrost Temp. label not displayed", config.isHeatWheelDefrostTempLabelPresent());
		assertEquals("Heat Wheel Defrost Temperature", config.getTemperatureCardLabel(),
				"Heat Wheel Defrost Temperature label not matched");
	}

	@When("Go to Heat Pump page in Setpoints")
	public void go_to_Heat_Pump_page_in_Setpoints() {
		config.clickSetpointsButton();
		config.clickHeaPumpButton();

	}

	@Then("Verify the fields in Heat Pump page")
	public void verify_the_fields_in_Heat_Pump_page() {
		assertTrue("Heat Pump Defrost Interval label not displayed", config.isHeatPumpDefrostIntervalLabelPresent());
		assertEquals("Heat Pump Defrost Interval", config.getTemperatureCardLabel(),
				"Heat Pump Defrost Interval label not matched");
	}

	@When("Go to OA Damper page in Setpoints")
	public void go_to_OA_Damper_page_in_Setpoints() {
		config.clickSetpointsButton();
		config.clickOADamperModeButton();

	}

	@Then("Verify the fields in OA Damper page")
	public void verify_the_fields_in_OA_Damper_page() {
		assertTrue("Economizer Min Position label not displayed", config.isEconomizerMinPositionLabelPresent());
		assertEquals("Economizer Min Position Setpoint", config.getTemperatureCardLabel(),
				"Economizer Min Position Setpoint label not matched");
		assertEquals(config.getSetpointLablesCount(), 19, "Setpoint lables count not matched");

	}

	@When("Go to FAN AFMS page in Setpoints")
	public void go_to_FAN_AFMS_page_in_Setpoints() {
		config.clickSetpointsButton();
		config.clickFanAFMSButton();

	}

	@Then("Verify the fields in FAN AFMS page")
	public void verify_the_fields_in_FAN_AFMS_page() {
		assertTrue("Heating Min VFD label not displayed", config.isHeatingMinVFDLabelPresent());
		assertEquals("Heating Min VFD Setpoint", config.getTemperatureCardLabel(),
				"Heating Min VFD Setpoint label not matched");
		assertEquals(config.getSetpointLablesCount(), 18, "Setpoint lables count not matched");

	}

	@When("Go to Pressure page in Setpoints")
	public void go_to_Pressure_page_in_Setpoints() {
		config.clickSetpointsButton();
		config.clickPressureButton();

	}

	@Then("Verify the fields in Pressure page")
	public void verify_the_fields_in_Pressure_page() {
		assertTrue("Duct Static Pressure label not displayed", config.isDuctStaticPressureLabelPresent());
		assertEquals("Duct Static Pressure Setpoint", config.getTemperatureCardLabel(),
				"Duct Static Pressure Setpoint label not matched");
		assertEquals(config.getSetpointLablesCount(), 18, "Setpoint lables count not matched");

	}

	@When("Go to Safety page in Setpoints")
	public void go_to_Safety_page_in_Setpoints() {
		config.clickSetpointsButton();
		config.clickSafetyButton();
	}

	@Then("Verify the fields in Safety page")
	public void verify_the_fields_in_Safety_page() {
		assertTrue("Low Temp Cutoff label not displayed", config.isLowTempCutoffLabelPresent());
		assertEquals("Low Temp Cutoff Setpoint", config.getTemperatureCardLabel(),
				"Low Temp Cutoff Setpoint label not matched");
		assertEquals(config.getSetpointLablesCount(), 10, "Setpoint lables count not matched");

	}

	@When("Go to Misc page in Setpoints")
	public void go_to_Misc_page_in_Setpoints() {
		config.clickSetpointsButton();
		config.clickMiscButton();

	}

	@Then("Verify the fields in Misc page")
	public void verify_the_fields_in_Misc_page() {
		assertTrue("Controlling Week Schedule label not displayed", config.isControllingWeekScheduleLabelPresent());
		assertEquals("Controlling Week Schedule", config.getTemperatureCardLabel(),
				"Controlling Week Schedule label not matched");
		assertEquals(config.getSetpointLablesCount(), 7, "Setpoint lables count not matched");

	}
	
}
