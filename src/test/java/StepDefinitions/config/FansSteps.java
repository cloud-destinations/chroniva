package StepDefinitions.config;

import static org.testng.Assert.assertEquals;
import io.cucumber.java.en.*;
import pages.config.UnitSettingsPage;
import utils.TestData;

public class FansSteps {
	UnitSettingsPage unit=new UnitSettingsPage();

	@Then("Verify the fields in Supply Fan Config page")
	public void verify_the_fields_suplyfanconfig() {
		assertEquals(unit.getPageTitle(), "Supply Fan Config", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_SUPPLY_FANS_CONFIG);
	}
	
	@Then("Verify the fields in Return Fan Config page")
	public void verify_the_fields_rerutnfanconfig() {
		assertEquals(unit.getPageTitle(), "Return Fan Config", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_RETURN_FAN_CONFIG);
	}
	
	@Then("Verify the fields in Exhaust Fan Config page")
	public void verify_the_fields_exattnfanconfig() {
		assertEquals(unit.getPageTitle(), "Exhaust Fan Config", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_RETURN_FAN_CONFIG);
	}
	
	@Then("Verify the fields Supply Fan Cycles should be selected")
	public void verify_the_fields_suuplyfancuscleconfig() {
		unit.isCheckboxselected("Supply Fan Cycles w/ Heat/Cool");
	}
	
	@Then("Verify the fields in Filter Loading Setpoints page")
	public void verify_the_fields_filterloadingconfig() {
		unit.selectWebElementByText("CAV");
		unit.selectWebElementByText("Filter Loading");
		unit.clickNextPageByText("Filter Loading");
		assertEquals(unit.getPageTitle(), "Filter Loading Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Duct Static Setpoint", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Duct Static SP", "Active card lable not matched");
		unit.enterTemperatureValueWithTwoDecimalsAndValidate(0.1, 2.80, 0.1);
	}
	
	@Then("Verify the fields in SZVAV Setpoints page")
	public void verify_the_fields_in_szvav_page() {
		assertEquals(unit.getPageTitle(), "SZVAV Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Heat Min VFD", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Heat Min VFD", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_SZVAV_SETPOINTS, 1, 98);
	}
	
	@Then("Verify the fields in Global Supply Fan Setpoints page")
	public void verify_the_fields_in_gsfsp_page() {
		assertEquals(unit.getPageTitle(), "Global Supply Fan Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Cool Minimum Speed", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Cool Min Speed", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_GLOBAL_SUPPLYFAN_SETPOINTS, 10, 98);
	}
	
	@Then("Verify the fields in SF Runs While Unoccupied Setpoints page")
	public void verify_the_fields_in_sfrwcsp_page() {
		assertEquals(unit.getPageTitle(), "Supply Fan while Unoccupied Setpoint", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Fixed Speed", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Fixed Speed", "Active card lable not matched");
		unit.enterTemperatureValueAndValidate(1, 98);
	}
	
	@Then("Verify the fields in Has Static Reset Setpoints page")
	public void verify_the_fields_in_staticreset_page() {
		assertEquals(unit.getPageTitle(), "Static Reset Setpoint", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Minimum", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Minimum", "Active card lable not matched");
		unit.enterTemperatureValueAndValidate(1, 98);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in Duct Static Control Setpoints page")
	public void verify_the_fields_in_ductstaticreset_page() {
		assertEquals(unit.getPageTitle(), "Duct Static Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Duct Static Setpoint", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Duct Static SP", "Active card lable not matched");
		unit.enterTemperatureValueWithTwoDecimalsAndValidate(0.1, 2.80, 0.1);
	}
	
	
}
