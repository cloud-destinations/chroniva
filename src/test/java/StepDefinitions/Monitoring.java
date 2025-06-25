package StepDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.MonitoringPage;
import pages.config.AnalysisPage;

public class Monitoring {

	LandingPage landing = new LandingPage(Hooks.getDriver());
	AnalysisPage analysis = new AnalysisPage();
	MonitoringPage Monitoring = new MonitoringPage();
	
	@Given("Go to Tools and sign in with {string} and {string}")
	public void go_to_Tools_and_sign_in_with_cred(String username, String password) {
		landing.clickToolsButton();
		landing.loginWithCredentials(username, password);
	}

	@When("Navigate to Space Temp screen in Monitoring")
	public void navigate_to_Space_Temp_screen_in_Tools() {
		analysis.clickMonitoringButton();
		analysis.clickSpaceTempButton();
	}

	@Then("Verify the fields in Space Temp page")
	public void verify_the_fields_in_Space_Temp_page() throws InterruptedException {
		assertTrue("Occupied Space Temp SP label not displayed", analysis.osTempSPLabelPresnt());
		assertTrue("Occupied Space Temp SetPoint label not displayed", analysis.osTempSetpointLabelPresnt());
		assertTrue("Event log button not displayed", analysis.eventLogButtonPresnt());
		Monitoring.IncreaseSP();
	}

	@When("Navigate to Mode screen in Monitoring")
	public void navigate_to_Mode_screen_in_Tools() {
		analysis.clickMonitoringButton();
		analysis.clickModeButton();
	}

	@Then("Verify the fields in Mode page")
	public void verify_the_fields_in_Mode_page() {
		assertTrue("Occupied Cooling Setpoint label not displayed", analysis.occupiedColingSPPLabelPresnt());
		assertTrue("Cool radiobutton not displayed", analysis.coolRadioButtonPresnt());
		assertTrue("Event log button not displayed", analysis.eventLogButtonPresnt());
	}

	@When("Navigate to Economizer screen in Monitoring")
	public void navigate_to_Economizer_screen_in_Tools() {
		analysis.clickMonitoringButton();
		analysis.clickEconomizerButton();
	}

	@Then("Verify the fields in Economizer page")
	public void verify_the_fields_in_Economizer_page() {
		assertTrue("Economizer Setpoint label not displayed", analysis.economizerSetpointLabelPresnt());
		assertTrue("Minimum Economizer Position label not displayed", analysis.minimumEconomiserPositionLabelPresnt());
		assertTrue("Event log button not displayed", analysis.eventLogButtonPresnt());
	}

	@When("Navigate to Schedule screen in Monitoring")
	public void navigate_to_Schedule_screen_in_Tools() {
		analysis.clickMonitoringButton();
		analysis.clickScheduleButton();
	}

	@Then("Verify the fields in Schedule page in Monitoring")
	public void verify_the_fields_in_Schedule_page() {
		assertTrue("Current Mode label not displayed", analysis.currentModeLabelPresnt());
		assertTrue("Force Unoccupied label not displayed", analysis.forceUnoccupiedLabelPresnt());
		assertTrue("Event log button not displayed", analysis.eventLogButtonPresnt());
	}

	@When("Navigate to Graphs screen in Monitoring")
	public void navigate_to_Graphs_screen_in_Tools() {
		analysis.clickMonitoringButton();
		analysis.clickGraphsButton();
	}

	@Then("Verify the fields in Graphs page")
	public void verify_the_fields_in_Graphs_page() {
		assertTrue("Graph Editor label not displayed", analysis.graphEditorButtonPresnt());
		assertTrue("Custom list not displayed", analysis.customListPresnt());
	}

}
