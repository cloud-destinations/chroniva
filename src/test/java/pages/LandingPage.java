package pages;

import static org.testng.Assert.assertEquals;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.asserts.SoftAssert;

import StepDefinitions.HelpMethods;

public class LandingPage {
	SoftAssert soft = new SoftAssert();

	@FindBy(xpath = "//input[@type='email']")
	WebElement msUserName;

	@FindBy(xpath = "//input[@type='password']")
	WebElement msPassword;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement msSubmitButton;

	@FindBy(xpath = "//i[@data-icon-name='Download']")
	WebElement msDownloadButton;

	@FindBy(id = "name")
	WebElement txt_username;

	@FindBy(css = ".btn-save-home")
	WebElement toolsButton;

	@FindBy(css = ".logo")
	WebElement homeButton;

	@FindBy(xpath = "//button[text() = '1']")
	WebElement button1;

	@FindBy(css = "button>.tick")
	WebElement buttonOK;

	@FindBy(css = ".settings-icon>button")
	WebElement settingsButton;

	@FindBy(xpath = "//div[@class=\"info-widget \"]")
	WebElement spaceHumitityCard;

	@FindBy(xpath = "//div[@class=\"widget-container flex-start\"]")
	WebElement spaceTempCard;

	@FindBy(xpath = "//div[@class=\"mode-class\"]")
	WebElement modeCard;

	// ELEMENTS of Header
	@FindBy(xpath = "//img[@class='logo-img']")
	private WebElement AAONlogo;

	@FindBy(xpath = "//button[@class='alarm-button activeState']")
	private WebElement AlarmIcon;

	@FindBy(xpath = "//button[@class='buttonbgnone']")
	private WebElement Settingsbutton;

	@FindBy(xpath = "//div[@class='temp-text']")
	private WebElement Temptextlabel;

	@FindBy(xpath = "//img[@class='temp-icon']")
	private WebElement tempicon;

	@FindBy(xpath = "//div[@class='time-text']")
	private WebElement timetextlabel;

	@FindBy(xpath = "//img[@class='time-icon']")
	private WebElement Timeiconlabel;

	@FindBy(linkText = "Sign In")
	private WebElement signInLink;

	@FindBy(linkText = "Analysis")
	private WebElement AnalysisTab;

	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameField;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;

	@FindBy(xpath = "//button[text() = 'Login']")
	private WebElement loginButton;

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void clickToolsButton() {
		toolsButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickLoginButton() {
		loginButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void enterMSUsername(String string) {
		msUserName.sendKeys(string);
		msSubmitButton.click();
		HelpMethods.explicitWait_milliSeconds(2000);
	}

	public void enterMSPassword(String string) {
		msPassword.sendKeys(string);
		msSubmitButton.click();
		HelpMethods.explicitWait_milliSeconds(2000);
	}

	public void clickSubmitButton() {
		msSubmitButton.click();
		HelpMethods.explicitWait_milliSeconds(2000);
	}

	public void clickDownlaodButton() {
		msDownloadButton.click();
	}

	public void clickAnalysisTab() {
		AnalysisTab.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public void clickSettingsButton() {
		HelpMethods.explicitWait_milliSeconds(1000);
		settingsButton.click();
		HelpMethods.explicitWait_milliSeconds(1000);

	}

	public void clickHomeButton() {
		HelpMethods.explicitWait_milliSeconds(1000);
		homeButton.click();
	}

	public void verifyAAONIcon() {
		AAONlogo.isDisplayed();
	}

	public void verifyAlarmIcon() {
		AlarmIcon.isDisplayed();
	}

	public void verifySettingsButton() {
		Settingsbutton.isDisplayed();
	}

	public void verifyTempText() {
		Temptextlabel.isDisplayed();
	}

	public void verifyTempIcon() {
		tempicon.isDisplayed();
	}

	public void verifyTimeText() {

		timetextlabel.isDisplayed();
		LocalTime systemTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		String formattedSystemTime = systemTime.format(formatter).toLowerCase();

		String appTime = timetextlabel.getText().trim().toLowerCase();
		System.out.println("System Time: " + formattedSystemTime);
		System.out.println("Application Time: " + appTime);
		assertEquals(appTime, formattedSystemTime, "System time and Application time should match");
		HelpMethods.explicitWait_milliSeconds(1000);

	}

	public void verifyTimeIcon() {
		Timeiconlabel.isDisplayed();
	}

	public void verifySpaceHumitityCard() {
		spaceHumitityCard.isDisplayed();
	}

	public void verifySpaceTempCard() {
		spaceTempCard.isDisplayed();

	}

	public void verifyModeCard() {
		modeCard.isDisplayed();

	}

	public void verifyToolCard() {
		toolsButton.isDisplayed();

	}

	public void loginWithCredentials(String username, String password) {

		HelpMethods.explicitWait_milliSeconds(500);
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		submitButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

}
