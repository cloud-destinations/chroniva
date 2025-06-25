package StepDefinitions.config;

import static org.testng.Assert.assertEquals;
import io.cucumber.java.en.*;
import pages.config.UnitSettingsBoardsPage;
import pages.config.UnitSettingsPage;
import utils.TestData;

public class HeatingSteps {
	UnitSettingsPage unit=new UnitSettingsPage();
	UnitSettingsBoardsPage Boards = new UnitSettingsBoardsPage();

	@Then("Verify the fields in Heat Type page")
	public void verify_the_fields_filtertypes() {
		assertEquals(unit.getPageTitle(), "Heat Type", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_HEAT_TYPES);
	}
	
	@Then("Verify the fields in Aux Emergency Heat page")
	public void verify_the_fields_AUXfiltertypes() {
		assertEquals(unit.getPageTitle(), "Aux / Emergency Heat", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_AUXHEAT_TYPES);
	}
	
	@When("User clicks back button")
	public void whenuserclicksbackbutton() {
		unit.clickBackButton();
	}
	
	@Then("Verify the fields in Heat Pump WHP Glycol page")
	public void verify_the_fields_hpfiltertypes() {
		assertEquals(unit.getPageTitle(), "Heat Pump WHP Glycol", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_HPWHPG);
	}
	
	@Then("Verify the fields in Heat Pump Setpoints page")
	public void verify_the_fields_in_HPPreheatSetpoints_page() {
		assertEquals(unit.getPageTitle(), "Heat Pump Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Aux Off Delay", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Aux Off Delay", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_HEATPUMP_SETPOINTS, 30, 58);
	}
	
	@Then("Verify the fields in Water Steam page")
	public void verify_the_fields_in_watstrSetpoints_page() {
		assertEquals(unit.getPageTitle(), "Water/Steam Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Min Voltage", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Min Voltage", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_DCC_SUPPLY_FAN_SETPOINTS, 0, 98);
	}
	
	@Then("Verify the fields in Heating Setpoints page")
	public void verify_the_fields_in_hswatstrSetpoints_page() {
		assertEquals(unit.getPageTitle(), "Heating Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Stage Up Window", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Stage Up Window", "Active card lable not matched");
		unit.validateAllTiles(TestData.EXPECTED_HEATING_SETPOINTS, 0, 58);
	}
	@Then("verify the {string} description")
	public void verify_the_description(String BoardNum) {
		Boards.selectLabels(BoardNum);

	}
	@When("User selects {string} > {string} and clicks {string} to verify the labels")
	public void user_selects_and_clicks_to_verify_the_labels(String Gas, String Aux, String BoardNum) {
		Boards.selectRadioButton(Gas);
		Boards.selectRadioButton(Aux);
		Boards.clickSubmenu();
		Boards.selectLabels(BoardNum);
		Boards.verifyItemLables(TestData.EXPECTED_Ignition_Control_Boards);
	
	}
}
