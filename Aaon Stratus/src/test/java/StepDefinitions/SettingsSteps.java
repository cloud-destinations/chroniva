package StepDefinitions;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.text.SimpleDateFormat;
import java.util.Date;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.MonitoringPage;
import pages.SettingsPage;
import utils.TestData;

public class SettingsSteps extends HelpMethods {

	LandingPage landing = new LandingPage(Hooks.getDriver());
	MonitoringPage monitor = new MonitoringPage();
	SettingsPage setting = new SettingsPage();

	@Given("Navigate to settings screen")
	public void navigate_to_settings_screen() {
		landing.clickSettingsButton();
	}

	@Then("Verify the tabs on the left hand side")
	public void verify_the_tabs_on_the_left_hand_side() {
		assertEquals("App Mode", setting.getactiveTabText(), "App Mode data not matched");
		setting.verifySettingsTabNames();
	}

	@Then("Verify the tabs on the left hand side afer login")
	public void verify_the_tabs_on_the_left_hand_side_afer_login() {
		assertEquals("App Mode", setting.getactiveTabText(), "App Mode data not matched");
		setting.verifySettingsTabNamesAfterLogin();
	}

	@Then("Verify the list of ideal screen display data")
	public void verify_the_list_of_ideal_screen_display_data() {

		assertEquals("Space Temperature", setting.getSpaceTemperatureText(), "Space Temperature lable not matched");
		assertEquals("Space Humidity", setting.getSpaceHumidityText(), "Space Humidity lable not matched");
		assertEquals("Mode", setting.getModeText(), "Mode lable not matched");
	}

	@When("click on Display tab")
	public void click_on_Display_tab() {
		setting.clickDisplayTab();
	}

	@Then("Verify the fields in Display tab")
	public void verify_the_fields_in_Display_tab() {
		assertTrue("Always on lable not displayed", setting.getAlwaysOnVisibility());
		assertEquals("Light Mode", setting.getLightModeText(), "Light Mode lable not matched");
		assertEquals("Dark Mode", setting.getDarkModeText(), "Dark Mode lable not matched");
//		assertEquals("Midnight", setting.getMidnightText(), "Midnight lable not matched");
//		assertEquals("AAON Blue", setting.getAAONBlueText(), "AAON Blue lable not matched");
	}

	@When("click on Time tab")
	@Given("Go to Time tab")
	public void click_on_Time_tab() {
		setting.clickTimeTab();
	}

	@Then("Verify the fields in Time tab")
	public void verify_the_fields_in_Time_tab() {

		assertEquals("Auto", setting.getAutoButtonText(), "Auto lable not matched");
		assertEquals("Manual", setting.getManualButtonText(), "Manual lable not matched");
	}

	@When("changed the time in Manual sceen")
	public void changed_the_time_in_Manual_sceen() {
		/*
		 * SimpleDateFormat dateFormat = new
		 * SimpleDateFormat("dd-MMM-yy hh.mm.ss.S aa"); String formattedDate =
		 * dateFormat.format(new Date()).toString(); System.out.println(formattedDate);
		 */
	}

	@Then("Should show the changed time")
	public void should_show_the_changed_time() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Should show the system time")
	public void should_show_the_system_time() {
		Date date = new Date();
		SimpleDateFormat formatTime = new SimpleDateFormat("hh:mm aa");
		String expTime = formatTime.format(date);
		String actTime = setting.getAutoHours() + ":" + setting.getAutoMinutes() + " "
				+ setting.getAutoPeriod().toLowerCase();

		assertEquals(actTime, expTime, "Time not matched in Auto page");
	}

	@Given("Go to Temp scale tab")
	public void go_to_Temp_scale_tab() {
		setting.clickTempScaleTab();
	}

	@Then("Verify the values in Temp scale tab")
	public void verify_the_values_in_Temp_scale_tab() {
		assertEquals("Fahrenheit", setting.getFahrenheitText(), "Fahrenheit lable not matched");
		assertEquals("Celsius", setting.getCelsiusText(), "Celsius lable not matched");
	}

	@Then("change the values in Temp scale sceen and verify")
	public void changed_the_values_in_Temp_scale_sceen() throws Exception {

		if (setting.getFahrenheitCheckStatus()) {
			setting.clickCelciusCheckBox();
			setting.clickSaveButton();
			assertEquals("Saved successfully!", setting.getSuccessMessage(), "Success message text not matched");
			landing.clickHomeButton();
			landing.clickSettingsButton();
			setting.clickTempScaleTab();
			assertTrue("Temp scale value not saved", setting.getCelciusCheckStatus());

		} else {
			setting.clickFahrenheitCheckBox();
			setting.clickSaveButton();
			assertEquals("Saved successfully!", setting.getSuccessMessage(), "Success message text not matched");
			landing.clickHomeButton();
			landing.clickSettingsButton();
			setting.clickTempScaleTab();
			assertTrue("Temp scale value not saved", setting.getFahrenheitCheckStatus());

		}
		HelpMethods.explicitWait_milliSeconds(3000);
	}

	@Given("Go to User Settings tab")
	public void go_to_user_settings_tab() {
		setting.ClickUserSettingsTab();
		setting.ClickAddUsers();
	}

	@Then("Verify the values in Network Settings tab")
	public void verify_the_values_in_Network_Settings_tab() {
		setting.verifyAddUsertitle();
		setting.verifyDefaultLabel();
	}

	@When("User click on the User Settings page and click add")
	public void user_click_on_the_user_settings_feature() {
		setting.userSettingsLabel.click();
		explicitWait_milliSeconds(200);
		if (HelpMethods.isElementPresent(setting.userDeleteButton)) {
			setting.userDeleteButton.click();
			explicitWait_milliSeconds(300);
			setting.verifyClickYesButton();
		}
		setting.clickUserAddButton();
	}

	@Then("User verify the User Settings page and its labels.")
	public void user_verify_the_user_settings_page_and_its_labels() {
		setting.verifyUserTitleLabel();
		setting.verifyPinField();
		setting.verifySaveButton();
		setting.verifyCancelButton();
		setting.verifyUserDropdown();
		explicitWait_milliSeconds(500);
	}

	String firstname = HelpMethods.generateRandomString();
	String lastname = HelpMethods.generateRandomString();
	String username = HelpMethods.generateRandomString();

	@When("User enter valid details in the User Settings page and Save")
	public void user_enter_valid_details_in_the_user_settings_page() throws InterruptedException {
		setting.enterFirstNameField(firstname);
		setting.enterLastNameField(lastname);
		setting.enterUserNameField(username);
		System.out.println("un  " + username);
		setting.enterPasswordField(TestData.password);
		setting.enterPinField(TestData.pin);
		setting.clickSaveButton();
	}

	@Then("User verify the usertable in the usersetting page.")
	public void user_verify_the_usertable_in_the_usersetting_page() {

		explicitWait_milliSeconds(1000);
		setting.verifyUserTableHeaders();
		/*
		 * setting.clickSearchField.click(); explicitWait_milliSeconds(1000);
		 * //setting.keyboardInputField.sendKeys(TestData.fullname);
		 * //setting.keyboardEnterKey.click();
		 * 
		 * //setting.verifyUserTableHeaders();
		 * setting.enterSearchText(TestData.fullname); explicitWait_milliSeconds(3000);
		 */
	}

	@When("User delete the created user")
	public void user_delete_the_created_user() {
		setting.userDeleteButton.click();
		explicitWait_milliSeconds(500);
		setting.verifyClickYesButton();
	}

	@Then("User verify the delete user in the table")
	public void user_verify_the_delete_user_in_the_table() {
		setting.verifyUserDeleteDatas();
	}

	@When("User edits the created new user")
	public void user_edits_the_created_new_user() {
		setting.clickUserEditButton();
	}

	@Then("User verify the user details in edit user page.")
	public void user_verify_the_user_details_in_edit_user_page() {
		assertEquals(setting.getFirstNameValue(), firstname, "firstname not matched");
		assertEquals(setting.getLastNameValue(), lastname, "lastname not matched");
		assertEquals(setting.getUserNameValue(), username, "username not matched");
		assertEquals(setting.getPasswordValue(), TestData.password, "password not matched");
	}

	@When("User delete the created user in edit user page")
	public void user_delete_the_created_user_in_edit_user_page() {
		setting.userDeleteButton.click();
		explicitWait_milliSeconds(500);
		setting.verifyClickYesButton();
	}

	@Given("User go to Landing page and click login")
	public void user_go_to_landing_page() {
		landing.clickHomeButton();
	}

	@When("User login with newly created user user name and password")
	public void user_login_with_newly_created_user_user_name_and_password() {
		landing.clickLoginButton();
		landing.loginWithCredentials(username, TestData.password);
		landing.clickSettingsButton();
		setting.userSettingsLabel.click();
		explicitWait_milliSeconds(1000);
		assertFalse(HelpMethods.isElementPresent(setting.userDeleteButton), "Delete button is present");
	}

	@When("User login with newly created user user name and pin")
	public void user_login_with_newly_created_user_user_name_and_pin() {
		landing.clickLoginButton();
		landing.loginWithCredentials(username, TestData.pin);
		landing.clickSettingsButton();
		setting.userSettingsLabel.click();
		explicitWait_milliSeconds(1000);
		assertFalse(HelpMethods.isElementPresent(setting.userDeleteButton), "Delete button is present");
	}

	@Given("Click login and login with {string} and {string}")
	public void click_login_and_sign_in_with_cred(String username, String password) {
		landing.clickLoginButton();
		landing.loginWithCredentials(username, password);
	}

}
