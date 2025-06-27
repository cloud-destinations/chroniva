package mqttPages;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import StepDefinitions.HelpMethods;
import StepDefinitions.Hooks;
import mqttUtils.ExcelUtil;
import mqttUtils.MqttClientPublisher;
import pages.config.UnitSettingsPage;

public class MqttPage {

	public static void VerifySelectedButtonUsingExcel(String sheetName, String labelText) {
		try {
			Thread.sleep(1000);
			List<WebElement> labels = Hooks.getDriver().findElements(By.xpath("//label[text()='" + labelText + "']"));
			if (labels.isEmpty()) {
				throw new NoSuchElementException(" Label not found: " + labelText);
			}

			for (WebElement label : labels) {
				WebElement input = label.findElement(By.xpath("preceding-sibling::input[1]"));
				String inputType = input.getAttribute("type");

				if (!"radio".equalsIgnoreCase(inputType) && !"checkbox".equalsIgnoreCase(inputType)) {
					continue;
				}

				if (!input.isSelected()) {
					throw new AssertionError(" " + inputType + " input for label '" + labelText + "' is NOT selected.");
				}

				System.out.println(" " + inputType + " input for label '" + labelText + "' is selected.");
				System.out.println("In " + sheetName + ", the \"" + labelText + "\" radio button is selected.");
				System.out.println("--------------------------------------------------\n");
				return;
			}

			throw new AssertionError(" No matching selected radio or checkbox found for label: " + labelText);

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

	public static void publishAndVerifyloopThroughCards(String sheetName, int startRow, int numberOfLabels) {
		try {
			ExcelUtil.loadSheetIgnoreCase(sheetName);
			List<WebElement> cards = Hooks.getDriver()
					.findElements(By.cssSelector("div.serviceItem-card.without-description"));

			if (cards.isEmpty()) {
				throw new RuntimeException(" No UI cards found.");
			}

			int verifiedCount = 0;

			for (int i = 0; i < cards.size(); i++) {
				if (verifiedCount >= numberOfLabels) {
					System.out.println(" Completed verification for " + verifiedCount + " UI labels. Stopping.");
					break;
				}

				WebElement card = cards.get(i);
				System.out.println(" Clicking card #" + (i + 1));
				card.click();
				Thread.sleep(1000);

				// Read topic from Excel
				String topic = ExcelUtil.getCellValue(sheetName, startRow + i, "Topic");
				System.out.println(" Extracted topic from Excel row " + (startRow + i) + ": " + topic);

				// Generate random value
				int randomVal = new Random().nextInt(1000);
				String payload = String.valueOf(randomVal);
				System.out.println(" Publishing payload: " + payload + " to topic: " + topic);
				MqttClientPublisher.quickPublish(topic, payload);
				System.out.println(" Published to MQTT: " + topic + " => " + payload);

				Thread.sleep(1500); // wait for UI to update

				WebElement valueElement = Hooks.getDriver().findElement(By.xpath("//div[@class='temperature-value']"));
				String uiRaw = valueElement.getText().trim();
				String uiNumeric = uiRaw.replaceAll("[^0-9.-]", "");

				System.out.println(" UI displayed value: " + uiRaw + " (Parsed: " + uiNumeric + ")");

				if (!uiNumeric.equals(payload)) {
					throw new AssertionError(
							" UI value '" + uiRaw + "' does not match published payload '" + payload + "'");
				}
				System.out.println(" Match confirmed for label #" + (verifiedCount + 1));
				verifiedCount++;
				System.out.println("--------------------------------------------------\n");

			}

			if (verifiedCount < numberOfLabels) {
				throw new RuntimeException(" Only verified " + verifiedCount + " labels, expected " + numberOfLabels);
			}

		} catch (Exception e) {
			throw new RuntimeException(" Error during loop: " + e.getMessage(), e);
		}
	}

	public static void publishAndVerifySingleCard(String topic) {
		try {
			// Generate and publish payload
			int randomValue = new Random().nextInt(1000);
			String payload = String.valueOf(randomValue);

			System.out.println(" Publishing random payload: " + payload + " to topic: " + topic);
			MqttClientPublisher.quickPublish(topic, payload);
			System.out.println(" Published to MQTT: " + topic + " => " + payload);

			// Wait for UI to reflect change
			Thread.sleep(1500);

			WebElement uiValueElement = Hooks.getDriver().findElement(By.xpath("//div[@class='temperature-value']"));
			String rawUIValue = uiValueElement.getText().trim();
			String uiNumeric = rawUIValue.replaceAll("[^0-9.-]", "");

			System.out.println(" UI displayed value: " + rawUIValue + " (Parsed: " + uiNumeric + ")");

			if (!uiNumeric.equals(payload)) {
				throw new AssertionError(
						" UI value '" + rawUIValue + "' does not match published payload '" + payload + "'");
			}

			System.out.println(" UI shows expected payload value.\n");

		} catch (Exception e) {
			throw new RuntimeException(" Error during publish and verify: " + e.getMessage(), e);
		}
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

	public static void clickNextPageButton() {
		UnitSettingsPage.naxtPageButton.click();
		HelpMethods.explicitWait_milliSeconds(500);
	}

	public static void clickDivByLabelText(String labelText) {
		HelpMethods.explicitWait_milliSeconds(500);
		String xpath = "//div[text()='" + labelText + "']";
		WebElement divElement = HelpMethods.getWebElement(xpath, Hooks.getDriver()); // fix here

		if (divElement == null) {
			throw new NoSuchElementException(" Div with text '" + labelText + "' not found.");
		}

		divElement.click();
	}
}
