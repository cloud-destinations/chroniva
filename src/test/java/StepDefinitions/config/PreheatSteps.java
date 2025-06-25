package StepDefinitions.config;

import static org.testng.Assert.assertEquals;
import io.cucumber.java.en.*;
import pages.config.UnitSettingsPage;
import utils.TestData;

public class PreheatSteps {
	UnitSettingsPage unit=new UnitSettingsPage();

	@Then("Verify the fields in Preheat type page")
	public void verify_the_fields_filtertypes() {
		assertEquals(unit.getPageTitle(), "Preheat Type", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_PREHEAT_TYPES);
	}
	
	@Then("Verify the fields in Electric Setpoints page")
	public void verify_the_fields_in_elctricsetpoints_page() {
		assertEquals(unit.getPageTitle(), "Electric Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Stage Up Window", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Stage Up Window", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_ELECTRIC_SETPOINTS, 1, 13);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in WaterSteam Setpoints page")
	public void verify_the_fields_in_watstream_page() {
		assertEquals(unit.getPageTitle(), "Water/Steam Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Min Voltage", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Min Voltage", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_DCC_SUPPLY_FAN_SETPOINTS, 1, 98);
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in Preheat Setpoints page")
	public void verify_the_fields_in_PreheatSetpoints_page() {
		assertEquals(unit.getPageTitle(), "Preheat Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "OAT Enable Setpoints", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "OAT Enable SP", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_PREHEAT_SETPOINTS, 1, 58);
		unit.clickBackButton();
	}
	
	
}
