package StepDefinitions.config;

import static org.testng.Assert.assertEquals;
import io.cucumber.java.en.*;
import pages.config.UnitSettingsPage;
import utils.TestData;

public class FiltersSteps {
	UnitSettingsPage unit = new UnitSettingsPage();

	@Then("Verify the fields in Filter types page")
	public void verify_the_fields_filtertypes() {
		assertEquals(unit.getPageTitle(), "Filter Types", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_FILTER_TYPES);
	}

	@Then("Verify the fields in Pre Filter Monitoring Type page")
	public void verify_the_fields_in_pre_filter_monitoring_type_page() {
		assertEquals(unit.getPageTitle(), "Pre Filter Monitoring Type", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_MONITORING_FILTER_TYPES);
		unit.selectWebElementByText("Differential Pressure");
		assertEquals(unit.getReminingLifeTimeLabel(), "Remaining Lifetime:", "Remaining Lifetime not matched");
		assertEquals(unit.getReminingLifeTimeValue(), "100 %", "100% lable not matched");
		unit.selectWebElementByText("Change Interval");
		assertEquals(unit.getReminingLifeTimeLabel(), "Remaining Lifetime:", "Remaining Lifetime not matched");
		assertEquals(unit.getReminingLifeTimeValue(), "120 days", "120days lable not matched");
	}

	@Then("Verify the fields in Pre-Filter Differential Pressure Setpoints page")
	public void verify_the_fields_in_pre_filter_differential_pressure_setpoints_page() {
		assertEquals(unit.getPageTitle(), "Pre-Filter Differential Pressure Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Differential Pressure Threshold","Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Differential Pr. Threshold", "Active card lable not matched");
		unit.validateOneTiles(5, 55);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Pre-Filter Change Interval Setpoints page")
	public void verify_the_fields_in_pre_filter_change_pressure_setpoints_page() {
		assertEquals(unit.getPageTitle(), "Pre-Filter Change Interval Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Lifetime Remaining", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Lifetime", "Active card lable not matched");
		unit.enterTemperatureValueAndValidate(0, 58);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Main Filter Monitoring Type page")
	public void verify_the_fields_in_Main_filter_monitoring_type_page() {
		assertEquals(unit.getPageTitle(), "Main Filter Monitoring Type", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_MONITORING_FILTER_TYPES);
		unit.selectWebElementByText("Differential Pressure");
		assertEquals(unit.getReminingLifeTimeLabel(), "Remaining Lifetime:", "Remaining Lifetime not matched");
		assertEquals(unit.getReminingLifeTimeValue(), "100 %", "100% lable not matched");
		unit.selectWebElementByText("Change Interval");
		assertEquals(unit.getReminingLifeTimeLabel(), "Remaining Lifetime:", "Remaining Lifetime not matched");
		assertEquals(unit.getReminingLifeTimeValue(), "120 days", "120days lable not matched");
	}

	@Then("Verify the fields in Main-Filter Differential Pressure Setpoints page")
	public void verify_the_fields_in_Main_filter_differential_pressure_setpoints_page() {
		assertEquals(unit.getPageTitle(), "Main Filter Differential Pressure Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Differential Pressure Threshold",
				"Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Differential Pr. Threshold", "Active card lable not matched");
		unit.validateOneTiles(5, 55);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Main-Filter Change Interval Setpoints page")
	public void verify_the_fields_in_Main_filter_change_pressure_setpoints_page() {
		assertEquals(unit.getPageTitle(), "Main Filter Change Interval Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Lifetime Remaining", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Lifetime", "Active card lable not matched");
		unit.enterTemperatureValueAndValidate(0, 58);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Preheat Filter Monitoring Type page")
	public void verify_the_fields_in_Preheat_filter_monitoring_type_page() {
		assertEquals(unit.getPageTitle(), "Preheat Filter Monitoring Type", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_MONITORING_FILTER_TYPES);
		unit.selectWebElementByText("Differential Pressure");
		assertEquals(unit.getReminingLifeTimeLabel(), "Remaining Lifetime:", "Remaining Lifetime not matched");
		assertEquals(unit.getReminingLifeTimeValue(), "100 %", "100% lable not matched");
		unit.selectWebElementByText("Change Interval");
		assertEquals(unit.getReminingLifeTimeLabel(), "Remaining Lifetime:", "Remaining Lifetime not matched");
		assertEquals(unit.getReminingLifeTimeValue(), "120 days", "120days lable not matched");
	}

	@Then("Verify the fields in Preheat Filter Differential Pressure Setpoints page")
	public void verify_the_fields_in_Preheat_filter_differential_pressure_setpoints_page() {
		assertEquals(unit.getPageTitle(), "Preheat Differential Pressure Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Differential Pressure Setpoints",
				"Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Differential Pr. Threshold", "Active card lable not matched");
		unit.validateOneTiles(5, 55);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Preheat Filter Change Interval Setpoints page")
	public void verify_the_fields_in_Preheat_filter_change_pressure_setpoints_page() {
		assertEquals(unit.getPageTitle(), "Preheat Change Interval Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Lifetime Remaining", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Lifetime", "Active card lable not matched");
		unit.enterTemperatureValueAndValidate(0, 58);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Heat Wheel Exhaust Filter Monitoring Type page")
	public void verify_the_fields_in_hwe_filter_monitoring_type_page() {
		assertEquals(unit.getPageTitle(), "Heat Wheel Exhaust Filter Monitoring Type", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_MONITORING_FILTER_TYPES);
		unit.selectWebElementByText("Differential Pressure");
		assertEquals(unit.getReminingLifeTimeLabel(), "Remaining Lifetime:", "Remaining Lifetime not matched");
		assertEquals(unit.getReminingLifeTimeValue(), "100 %", "100% lable not matched");
		unit.selectWebElementByText("Change Interval");
		assertEquals(unit.getReminingLifeTimeLabel(), "Remaining Lifetime:", "Remaining Lifetime not matched");
		assertEquals(unit.getReminingLifeTimeValue(), "120 days", "120days lable not matched");
	}

	@Then("Verify the fields in Heat Wheel Exhaust Filter Differential Pressure Setpoints page")
	public void verify_the_fields_in_hwe_filter_differential_pressure_setpoints_page() {
		assertEquals(unit.getPageTitle(), "HW Exhaust Differential Pressure Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Differential Pressure Threshold",
				"Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Differential Pr. Threshold", "Active card lable not matched");
		unit.validateOneTiles(5, 55);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Heat Wheel Exhaust Filter Change Interval Setpoints page")
	public void verify_the_fields_in_hwe_filter_change_pressure_setpoints_page() {
		assertEquals(unit.getPageTitle(), "HW Exhaust Change Interval Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Lifetime Remaining", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Lifetime", "Active card lable not matched");
		unit.enterTemperatureValueAndValidate(0, 58);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Heat Wheel OA Filter Monitoring Type page")
	public void verify_the_fields_inhwoa_filter_monitoring_type_page() {
		assertEquals(unit.getPageTitle(), "Heat Wheel OA Filter Monitoring Type", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_MONITORING_FILTER_TYPES);
		unit.selectWebElementByText("Differential Pressure");
		assertEquals(unit.getReminingLifeTimeLabel(), "Remaining Lifetime:", "Remaining Lifetime not matched");
		assertEquals(unit.getReminingLifeTimeValue(), "100 %", "100 % lable not matched");
		unit.selectWebElementByText("Change Interval");
		assertEquals(unit.getReminingLifeTimeLabel(), "Remaining Lifetime:", "Remaining Lifetime not matched");
		assertEquals(unit.getReminingLifeTimeValue(), "120 days", "120days lable not matched");
	}

	@Then("Verify the fields in Heat Wheel OA Filter Differential Pressure Setpoints page")
	public void verify_the_fields_in_hwoa_filter_differential_pressure_setpoints_page() {
		assertEquals(unit.getPageTitle(), "HW OA Differential Pressure Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Differential Pressure Threshold",
				"Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Differential Pr. Threshold", "Active card lable not matched");
		unit.validateOneTiles(5, 55);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Heat Wheel OA Filter Change Interval Setpoints page")
	public void verify_the_fields_in_hwoa_filter_change_pressure_setpoints_page() {
		assertEquals(unit.getPageTitle(), "HW OA Change Interval Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Lifetime Remaining", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Lifetime", "Active card lable not matched");
		unit.enterTemperatureValueAndValidate(0, 58);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Return Air Bypass Filter Monitoring Type page")
	public void verify_the_fields_in_rab_filter_monitoring_type_page() {
		assertEquals(unit.getPageTitle(), "RA Bypass Filter Monitoring Type", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		unit.verifyPageFieldLables(TestData.EXPECTED_MONITORING_FILTER_TYPES);
		unit.selectWebElementByText("Differential Pressure");
		assertEquals(unit.getReminingLifeTimeLabel(), "Remaining Lifetime:", "Remaining Lifetime not matched");
		assertEquals(unit.getReminingLifeTimeValue(), "100 %", "100% lable not matched");
		unit.selectWebElementByText("Change Interval");
		assertEquals(unit.getReminingLifeTimeLabel(), "Remaining Lifetime:", "Remaining Lifetime not matched");
		assertEquals(unit.getReminingLifeTimeValue(), "120 days", "120days lable not matched");
	}

	@Then("Verify the fields in Return Air Bypass Filter Differential Pressure Setpoints page")
	public void verify_the_fields_inrab_filter_differential_pressure_setpoints_page() {
		assertEquals(unit.getPageTitle(), "RA Bypass Differential Pressure Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Differential Pressure Threshold",
				"Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Differential Pr. Threshold", "Active card lable not matched");
		unit.validateOneTiles(5, 55);
		unit.clickBackButton();
	}

	@Then("Verify the fields in Return Air Bypass Filter Change Interval Setpoints page")
	public void verify_the_fields_in_rab_filter_change_pressure_setpoints_page() {
		assertEquals(unit.getPageTitle(), "RA Bypass Change Interval Setpoints", "Page title not matched");
		assertEquals(unit.getNavigationPathText(), "Navigation Path", "Navigation Path lable not matched");
		assertEquals(unit.getTemperatureLableText(), "Lifetime Remaining", "Temperature card lable not matched");
		assertEquals(unit.getActiveCaedText(), "Lifetime", "Active card lable not matched");
		unit.enterTemperatureValueAndValidate(0, 58);
		unit.clickBackButton();
	}

}
