package mqttPages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import StepDefinitions.HelpMethods;
import StepDefinitions.Hooks;

public class MqttSensorsPage {

	private WebDriver driver;

	public MqttSensorsPage(WebDriver driver, List<String> payloadOrder) {
		this.driver = driver;
		// store payload order if needed
	}

	public static void selectLabels(String labelText) {
		HelpMethods.explicitWait_milliSeconds(500);
		String xpath = "//div[text()='" + labelText + "']";

		try {
			WebElement labelElement = HelpMethods.getWebElement(xpath, Hooks.getDriver());
			if (labelElement == null) {
				throw new NoSuchElementException("Label with text '" + labelText + "' not found using XPath: " + xpath);
			}
			labelElement.click();
		} catch (Exception e) {
			System.err.println("Exception in selectLabels(): " + e.getMessage());
			throw e; // rethrow to fail the test
		}
	}

	public static void VerifySelectedButtonUsingExcel(String labelText) {
		try {
			Thread.sleep(1000); // Let UI update after MQTT

			// Find all labels matching the text (may be duplicates)
			List<WebElement> labels = Hooks.getDriver().findElements(By.xpath("//label[text()='" + labelText + "']"));

			if (labels.isEmpty()) {
				throw new NoSuchElementException(" Label not found: " + labelText);
			}

			boolean inputVerified = false;

			for (WebElement label : labels) {
				// Attempt to find associated input (radio/checkbox) preceding the label
				WebElement input = label.findElement(By.xpath("preceding-sibling::input[1]"));

				String inputType = input.getAttribute("type");

				// Check if the input is radio or checkbox
				if (!"radio".equalsIgnoreCase(inputType) && !"checkbox".equalsIgnoreCase(inputType)) {
					continue; // Skip unsupported input types
				}

				if (!input.isSelected()) {
					throw new AssertionError(" " + inputType + " input for label '" + labelText + "' is NOT selected.");
				}

				System.out.println(" " + inputType + " input for label '" + labelText + "' is selected.");
				inputVerified = true;
				break;
			}

			if (!inputVerified) {
				throw new AssertionError(" No matching selected radio or checkbox found for label: " + labelText);
			}

		} catch (Exception e) {
			throw new RuntimeException(" Failed to verify radio/checkbox input with label: " + labelText, e);
		}
	}

	public static void VerifySelectedButtonUsingStep(String labelText) {
		try {
			Thread.sleep(1000);
			WebElement label = Hooks.getDriver().findElement(By.xpath("//label[text()='" + labelText + "']"));
			WebElement input = label.findElement(By.xpath("preceding-sibling::input[1]"));

			String inputType = input.getAttribute("type");
			if (!inputType.equalsIgnoreCase("radio") && !inputType.equalsIgnoreCase("checkbox")) {
				throw new IllegalStateException("Expected radio or checkbox, but found: " + inputType);
			}

			if (!input.isSelected()) {
				throw new AssertionError(inputType + " input for label '" + labelText + "' is NOT selected.");
			}

			System.out.println(inputType + " input for label '" + labelText + "' is selected.");

		} catch (Exception e) {
			throw new RuntimeException("Failed to verify input with label '" + labelText + "': " + e.getMessage(), e);
		}
	}

}
