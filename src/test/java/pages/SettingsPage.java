package pages;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import StepDefinitions.HelpMethods;
import StepDefinitions.Hooks;
import utils.TestData;

public class SettingsPage {

	// Settings page elements
	@FindBy(css = "button.tab-button.active")
	WebElement activeTab;

	@FindBy(xpath = "//button[text()='Idle View Data']")
	WebElement idleViewDataTab;

	@FindBy(xpath = "//button[text()='Display']")
	WebElement displayTab;

	@FindBy(xpath = "//button[text()='Time']")
	WebElement timeTab;

	@FindBy(xpath = "//button[text()='Temp Scale']")
	WebElement tempScaleTab;

	@FindBy(xpath = "//button[text()='User Settings']")
	WebElement UserSettingsTab;

	@FindBy(xpath = "//button[text()='Network']")
	WebElement networkSettingsTab;

	@FindBy(css = "button.tab-button")
	private List<WebElement> settingsPageTabs;

	// Idle view data elements
	@FindBy(xpath = "(//input//parent::label)[1]")
	WebElement spaceTemperatureLable;

	@FindBy(xpath = "(//input//parent::label)[2]")
	WebElement spaceHumidityLable;

	@FindBy(xpath = "(//input//parent::label)[3]")
	WebElement modeLable;

	// Display elements

	@FindBy(xpath = "//span[text() = 'Always On']")
	WebElement alwaysOnLable;

	@FindBy(xpath = "(//input[@type='radio']//parent::label)[1]")
	WebElement lightModeLable;

	@FindBy(xpath = "(//input[@type='radio']//parent::label)[2]")
	WebElement darkModeLable;

	@FindBy(xpath = "(//input[@type='radio']//parent::label)[3]")
	WebElement midnightLable;

	@FindBy(xpath = "(//input[@type='radio']//parent::label)[4]")
	WebElement aaonBlueLable;

	// Time elements
	@FindBy(css = ".slider-text.on-text")
	WebElement autoButton;

	@FindBy(css = ".slider-text.off-text")
	WebElement manualButton;

	// Temp scale elements
	@FindBy(xpath = "(//input[@type='checkbox']//parent::label)[1]")
	WebElement fahrenheitLable;

	@FindBy(xpath = "(//input[@type='checkbox']//parent::label)[2]")
	WebElement celsiusLable;

	@FindBy(xpath = "//label[text() = 'Fahrenheit']/input")
	WebElement fahrenheitCheckbox;

	@FindBy(xpath = "//label[text() = 'Celsius']/input")
	WebElement celsiusCheckbox;

	@FindBy(xpath = "//button[text() = 'Save']")
	WebElement saveButton;

	@FindBy(css = ".ip-address-container")
	WebElement ipAddressLable;

	@FindBy(css = ".Toastify")
	WebElement successMessage;

	@FindBy(css = ".timing .hours")
	WebElement autoTimeHours;

	@FindBy(css = ".timing .minutes")
	WebElement autoTimeMinutes;

	@FindBy(css = ".timing .period")
	WebElement autoTimePeriod;

	@FindBy(xpath = "//h1[text() = 'Add User']")
	WebElement AddUsertitle;

	@FindBy(xpath = "//div[text()='Default']")
	WebElement DefaultLabel;

	@FindBy(xpath = "//button[text()='User Settings']")
	public WebElement userSettingsLabel;

	@FindBy(xpath = "//button[text()='Add Users']")
	public WebElement AddUsers;

	@FindBy(xpath = "//h1[@class='user-title']")
	WebElement userTitleLabel;

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstNameField;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastNameField;

	@FindBy(xpath = "//input[@name='username']")
	WebElement userNameField;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;

	@FindBy(xpath = "//input[@name='pin']")
	WebElement pinField;

	@FindBy(xpath = "//div[text()='Default']")
	WebElement userDropdown;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement userSaveButton;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement userCancelButton;

	@FindBy(xpath = "//div[text()='User Added Successfully']")
	WebElement savedSuccessPopup;

	@FindBy(xpath = "//button[text()='Add Users']")
	WebElement userAddbuttons;

	@FindBy(xpath = "(//table[@class='custom-table']//tr)[1]")
	public List<WebElement> userTableHeaders;

	@FindBy(xpath = "//input[@class='search-input']")
	public WebElement clickSearchField;

	@FindBy(xpath = "//img[@alt='Delete']")
	public WebElement userDeleteButton;

	@FindBy(xpath = "//img[@alt='Edit']")
	public WebElement userEditButton;

	@FindBy(tagName = "tbody")
	public List<WebElement> tableBody;

	@FindBy(xpath = "//table[@class='custom-table']//td")
	List<WebElement> usersData;

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement clickYesButton;

	@FindBy(css = ".keyboardinput>input")
	WebElement keyboardInput;

	@FindBy(css = ".key.EnterKey")
	WebElement enterKey;

	@FindBy(xpath = "//input[@class='textcontainer']")
	public WebElement textcontainer;

	@FindBy(xpath = "//input[@class='pinnumbercontainer ']")
	public WebElement pinnumbercontainer;

	WebDriver driver = Hooks.getDriver();

	public SettingsPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void enterSearchText1(String text) {
		HelpMethods.jsSendKeys(clickSearchField, text, driver);
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void enterSearchText(String text) {
		HelpMethods.explicitWait_milliSeconds(500);
		clickSearchField.click();
		HelpMethods.explicitWait_milliSeconds(500);

		HelpMethods.jsSendKeys(keyboardInput, text, driver);
		HelpMethods.explicitWait_milliSeconds(500);

		HelpMethods.jsClick(enterKey, driver);
		HelpMethods.explicitWait_milliSeconds(500);

	}

	public String getactiveTabText() {
		return activeTab.getText();
	}

	public String getFirstNameValue() {
		return firstNameField.getAttribute("value");
	}

	public String getLastNameValue() {
		return lastNameField.getAttribute("value");
	}

	public String getUserNameValue() {
		return userNameField.getAttribute("value");
	}

	public String getPasswordValue() {
		return passwordField.getAttribute("value");
	}

	public void clickDisplayTab() {
		displayTab.click();
	}

	public String getSpaceTemperatureText() {
		return spaceTemperatureLable.getText();
	}

	public String getSpaceHumidityText() {
		return spaceHumidityLable.getText();
	}

	public String getModeText() {
		return modeLable.getText();
	}

	public boolean getAlwaysOnVisibility() {
		return alwaysOnLable.isDisplayed();
	}

	public String getLightModeText() {
		return lightModeLable.getText();
	}

	public String getDarkModeText() {
		return darkModeLable.getText();
	}

	public String getMidnightText() {
		return midnightLable.getText();
	}

	public String getAAONBlueText() {
		return aaonBlueLable.getText();
	}

	public void clickTimeTab() {
		timeTab.click();
	}

	public void clickTempScaleTab() {
		tempScaleTab.click();
	}

	public String getAutoButtonText() {
		return autoButton.getText();
	}

	public String getManualButtonText() {
		return manualButton.getText();
	}

	public String getFahrenheitText() {
		return fahrenheitLable.getText();
	}

	public String getCelsiusText() {
		return celsiusLable.getText();
	}

	public boolean getFahrenheitCheckStatus() {
		return fahrenheitCheckbox.isSelected();
	}

	public boolean getCelciusCheckStatus() {
		return celsiusCheckbox.isSelected();
	}

	public void clickFahrenheitCheckBox() {
		fahrenheitCheckbox.click();
	}

	public void clickCelciusCheckBox() {
		celsiusCheckbox.click();
	}

	public void clickSaveButton() {
		saveButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickNetworkSettingsTab() {
		networkSettingsTab.click();
	}

	public String getIpAddressLabel() {
		return ipAddressLable.getText();
	}

	public String getSuccessMessage() {
		return successMessage.getText();
	}

	public String getAutoHours() {
		return autoTimeHours.getText();
	}

	public String getAutoMinutes() {
		return autoTimeMinutes.getText();
	}

	public String getAutoPeriod() {
		return autoTimePeriod.getText();
	}

	public void verifySettingsTabNames() {
		ArrayList<String> actulaLabels = new ArrayList<String>();
		List<String> expectedLabels = TestData.EXPECTED_TABS_SETTINGS;
		for (WebElement labelCard : settingsPageTabs) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Settings tab labels not matched", expectedLabels, actulaLabels);
	}

	public void verifySettingsTabNamesAfterLogin() {
		ArrayList<String> actulaLabels = new ArrayList<String>();
		List<String> expectedLabels = TestData.EXPECTED_TABS_SETTINGS_AFTER_LOGIN;
		for (WebElement labelCard : settingsPageTabs) {
			actulaLabels.add(labelCard.getText());
		}
		assertEquals("Settings tab labels not matched", expectedLabels, actulaLabels);
	}

	public boolean verifyAddUsertitle() {
		return AddUsertitle.isDisplayed();
	}

	public boolean verifyDefaultLabel() {
		return DefaultLabel.isDisplayed();
	}

	public void clickUserAddButton() {
		HelpMethods.explicitWait_milliSeconds(500);
		userAddbuttons.click();
		HelpMethods.explicitWait_milliSeconds(300);
	}

	public boolean verifyUserTitleLabel() {
		return userTitleLabel.isDisplayed();
	}

	public void enterFirstNameField(String firstname) {
		firstNameField.sendKeys(firstname);
	}

	public void enterLastNameField(String lastname) {
		lastNameField.sendKeys(lastname);
	}

	public void enterUserNameField(String name) {
		userNameField.sendKeys(name);
	}

	public void enterPinField(String pin) {
		pinField.sendKeys(pin);
	}

	public void enterPasswordField(String password) {
		passwordField.sendKeys(password);
	}

	public boolean verifyUserDropdown() {
		return userDropdown.isDisplayed();
	}

	public boolean verifyPinField() {
		return pinField.isDisplayed();
	}

	public boolean verifyCancelButton() {
		return userCancelButton.isDisplayed();
	}

	public boolean verifySaveButton() {
		return userSaveButton.isDisplayed();
	}

	public void clickuserSaveButton() {
		userSaveButton.click();
	}

	public boolean verifySaveSuccessPopup() {
		return savedSuccessPopup.isDisplayed();
	}

	public boolean verifyUserTableHeaders() {
		return userTableHeaders.retainAll(TestData.User_Table_Header_Name);
	}

	public void clickDeleteButton() {
		userDeleteButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickUserEditButton() {
		userEditButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public boolean verifyUserDeleteDatas() {
		return !tableBody.contains(TestData.fullname);
	}

	public void verifyClickYesButton() {
		clickYesButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void ClickUserSettingsTab() {
		UserSettingsTab.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void ClickAddUsers() {
		AddUsers.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void ClickfirstNameField() {
		firstNameField.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

}
