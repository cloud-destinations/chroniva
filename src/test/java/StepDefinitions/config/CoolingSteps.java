package StepDefinitions.config;

import static org.testng.Assert.assertEquals;
import io.cucumber.java.en.*;
import pages.config.UnitSettingsPage;
import utils.TestData;

public class CoolingSteps {
	UnitSettingsPage unit=new UnitSettingsPage();

	@Then("Verify the fields in Compressors page")
	public void verify_the_fields_comprpage() {
		unit.clickWebElementByText("Compressor(s)");
		assertEquals(unit.getPageTitle(), "Compressor(s)", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_COMPRESSORS_TYPES);
		unit.clickBackButton();
		unit.clickYesButton();
	}
	
	@Then("Verify the fields in Reheat Valve page")
	public void verify_the_fields_rehvalvepage() {
		unit.clickWebElementByText("Reheat Valve");
		assertEquals(unit.getPageTitle(), "Reheat Valve", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_REHEAT_VALVE);
		unit.clickBackButton();
		unit.clickYesButton();
	}
	
	@Then("Verify the fields in Solenoid page")
	public void verify_the_fields_Solenoidpage() {
		unit.clickWebElementByText("Solenoid");
		assertEquals(unit.getPageTitle(), "Startup Solenoid", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_STARTUPSOLENOID);
	}
	
	@Then("Verify the fields in Condenser Fan Selection page")
	public void verify_the_fields_cfsoidpage() {
		unit.clickWebElementByText("Condenser Fan");
		assertEquals(unit.getPageTitle(), "Condenser Fan Selection", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_CFS);
	}
	
	@Then("Verify the fields in Inside EXV page")
	public void verify_the_fields_insideexoidpage() {
		unit.clickWebElementByText("Inside EXV");
		assertEquals(unit.getPageTitle(), "Indoor EXV", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_IEXV);
		unit.clickBackButton();
		unit.clickYesButton();
	}
	
	@Then("Verify the fields in Outside EXV page")
	public void verify_the_fields_outsideexoidpage() {
		unit.clickWebElementByText("Outside EXV");
		assertEquals(unit.getPageTitle(), "Outdoor EXV", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_OEXV);
	}
	
	@Then("Verify the fields in Reversing Valve page")
	public void verify_the_fields_revsideexoidpage() {
		unit.clickWebElementByText("Reversing Valve");
		assertEquals(unit.getPageTitle(), "Reversing Valve", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_RV);
		unit.clickBackButton();
		unit.clickYesButton();
	}
	
	@Then("Verify the fields in Defrost page")
	public void verify_the_fields_defoutsideexoidpage() {
		unit.clickWebElementByText("Defrost");
		assertEquals(unit.getPageTitle(), "Defrost", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_DEFROST);
	}
	
	@Then("Verify the fields in Cooling Setpoints page")
	public void verify_the_fields_in_cpHPPreheatSetpoints_page() {
		assertEquals(unit.getPageTitle(), "Cooling Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Stage Up Window", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Stage Up Window", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_COOLING_SETPOINTS, 1, 98);
	}
	@When("Configure the Cooling Board")
	public void configurethecoolingboards_page() {
		unit.selectWebElementByText("2 Boards");
		unit.clickNextPageByText("2 Boards");
		unit.clickWebElementByText("Board 1");
//		unit.clickWebElementByText("Unique ID");
//		unit.selectWebElementByText("00000001");
//		unit.clickBackButton();
		unit.clickWebElementByText("Refrigeration 1");
		unit.selectWebElementByText("Single Compressor");
		unit.clickBackButton();
		unit.clickWebElementByText("Refrigeration 2");
		unit.selectWebElementByText("Tandem");
		unit.clickBackButton();
		unit.clickWebElementByText("Mouts");
		unit.clickWebElementByText("Mout 1");
		unit.selectWebElementByText("Startup Solenoid");
		unit.clickBackButton();
		unit.clickWebElementByText("Mout 2");
		unit.selectWebElementByText("Reversing Valve");
		unit.clickBackButton();
		unit.clickBackButton();
		unit.clickWebElementByText("Reheat");
		unit.selectWebElementByText("Enable");
		unit.clickBackButton();
		unit.clickBackButton();
		unit.clickWebElementByText("Board 2");
//		unit.clickWebElementByText("Unique ID");
//		unit.selectWebElementByText("00000001");
//		unit.clickBackButton();
		unit.clickWebElementByText("Refrigeration 1");
		unit.selectWebElementByText("Single Compressor");
		unit.clickBackButton();
		unit.clickWebElementByText("Refrigeration 2");
		unit.selectWebElementByText("Tandem");
		unit.clickBackButton();
		unit.clickWebElementByText("Mouts");
		unit.clickWebElementByText("Mout 1");
		unit.selectWebElementByText("Startup Solenoid");
		unit.clickBackButton();
		unit.clickWebElementByText("Mout 2");
		unit.selectWebElementByText("Reversing Valve");
		unit.clickBackButton();
		unit.clickBackButton();
		unit.clickWebElementByText("Reheat");
		unit.selectWebElementByText("Enable");
	}
	
	@When("Configure the Cooling Board with one board")
	public void configurethecoolingboards_oneboardpage() {
		unit.selectWebElementByText("1 Board");
		unit.clickNextPageByText("1 Board");
		unit.clickWebElementByText("Board 1");
//		unit.clickWebElementByText("Unique ID");
//		unit.selectWebElementByText("00000001");
//		unit.clickBackButton();
		unit.clickWebElementByText("Refrigeration 1");
		unit.selectWebElementByText("Single Compressor");
		unit.clickBackButton();
		unit.clickWebElementByText("Refrigeration 2");
		unit.selectWebElementByText("Tandem");
		unit.clickBackButton();
		unit.clickWebElementByText("Mouts");
		unit.clickWebElementByText("Mout 1");
		unit.selectWebElementByText("Startup Solenoid");
		unit.clickBackButton();
		unit.clickWebElementByText("Mout 2");
		unit.selectWebElementByText("Reversing Valve");
		unit.clickBackButton();
		unit.clickBackButton();
		unit.clickWebElementByText("Reheat");
		unit.selectWebElementByText("Enable");
		unit.clickBackButton();
		unit.clickBackButton();
		unit.clickBackButton();
		unit.clickBackButton();
	}
	
	@When("Configure the Air Handler Board")
	public void configuretheAHboards_page() {
		unit.selectWebElementByText("1 Board");
		unit.clickNextPageByText("1 Board");
		unit.clickWebElementByText("Board 1");
//		unit.clickWebElementByText("Unique ID");
//		unit.selectWebElementByText("00000001");
//		unit.clickBackButton();
		unit.clickWebElementByText("VFD Ports");
		unit.clickWebElementByText("Port 1");
		unit.selectWebElementByText("Condenser Fan");
		unit.clickBackButton();
		unit.clickWebElementByText("Port 2");
		unit.selectWebElementByText("Condenser Fan");
		unit.clickBackButton();
		unit.clickWebElementByText("Port 3");
		unit.selectWebElementByText("Return Fan");
		unit.clickBackButton();
		unit.clickBackButton();
		unit.clickWebElementByText("Binary Inputs");
		unit.clickWebElementByText("Binary Input 1");
		unit.selectWebElementByText("Defrost Switch");
		unit.clickBackButton();
		unit.clickWebElementByText("Binary Input 3");
		unit.selectWebElementByText("Defrost Switch");
		unit.clickBackButton();
		unit.clickBackButton();
		unit.clickWebElementByText("Mouts");
		unit.clickWebElementByText("Mout 1");
		unit.selectWebElementByText("Reversing Valve");
		unit.clickBackButton();
		unit.clickWebElementByText("Mout 3");
		unit.selectWebElementByText("Reversing Valve");
	}
	
	@When("Configure the Power-Comm Board")
	public void configurethepcboards_page() {
		unit.selectWebElementByText("1 Board");
		unit.clickNextPageByText("1 Board");
		unit.clickWebElementByText("Board 1");
//		unit.clickWebElementByText("Unique ID");
//		unit.selectWebElementByText("0001112");
//		unit.clickBackButton();
		unit.clickWebElementByText("Comm 1");
		unit.selectWebElementByText("Enabled");
		unit.clickNextPageByText("Enabled");
		unit.selectWebElementByText("Sporlan");
		unit.clickNextPageByText("Sporlan");
		unit.clickWebElementByText("EXV 1");
		unit.selectWebElementByText("Inside");
		unit.clickBackButton();
		unit.clickWebElementByText("EXV 2");
		unit.selectWebElementByText("Outside");
		unit.clickBackButton();
		unit.clickBackButton();
		unit.clickBackButton();
		unit.clickBackButton();
		unit.clickWebElementByText("Comm 2");
		unit.selectWebElementByText("Enabled");
		unit.clickNextPageByText("Enabled");
		unit.selectWebElementByText("Sporlan");
		unit.clickNextPageByText("Sporlan");
		unit.clickWebElementByText("EXV 1");
		unit.selectWebElementByText("Outside");
		unit.clickBackButton();
		unit.clickWebElementByText("EXV 2");
		unit.selectWebElementByText("Inside");
	}
	
}
