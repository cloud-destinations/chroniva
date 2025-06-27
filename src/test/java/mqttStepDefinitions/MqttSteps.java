package mqttStepDefinitions;

import java.util.Map;

import StepDefinitions.HelpMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mqttPages.MqttPage;
import mqttUtils.ExcelUtil;
import mqttUtils.MqttClientPublisher;
import pages.config.UnitSettingsPage;

public class MqttSteps extends UnitSettingsPage {

	MqttClientPublisher mqtt = new MqttClientPublisher();

	@When("user loads data from Excel sheet {string} row {int}, publishes the MQTT message, and verifies the radio button name in row {int}")
	public void publish_and_verify_radio_button_by_label(String sheetName, Integer row, Integer labelRow) {
		try {
			ExcelUtil.loadSheetIgnoreCase(sheetName);
			String topic = ExcelUtil.getCellValue(sheetName, row, "Topic");
			String payload = ExcelUtil.getCellValue(sheetName, row, "Payload");

			// Publish the MQTT message
			MqttClientPublisher.quickPublish(topic, payload);
			System.out.println(" Published: " + topic + " => " + payload);

			// Get the expected label for verification
			String expectedLabel = ExcelUtil.getCellValue(sheetName, labelRow, "Feature");

			// pass the sheet name
			MqttPage.VerifySelectedButtonUsingExcel(sheetName, expectedLabel);

		} catch (Exception e) {
			throw new RuntimeException(" Error in publishing and verifying radio button: " + e.getMessage(), e);
		}
	}

	@When("user publishes MQTT message from sheet {string} row {int} and verifies checkbox with label {string} is selected")
	public void publish_mqtt_and_verify_checkbox_selected(String sheetName, Integer rowNum, String labelText) {
		try {
			// Load Excel sheet
			ExcelUtil.loadSheetIgnoreCase(sheetName);
			Map<String, String> rowData = ExcelUtil.readRow(sheetName, rowNum);

			String topic = rowData.get("Topic");
			String payload = rowData.get("Payload");

			System.out.println(" \nPublishing MQTT message...");
			System.out.println(" Topic: " + topic + " | Payload: " + payload);

			// Publish to MQTT
			MqttClientPublisher.quickPublish(topic, payload);
			Thread.sleep(1000); // Let the UI reflect the update

			// Verify checkbox by label text
			MqttPage.VerifySelectedButtonUsingStep(labelText);

			System.out.println(" Checkbox with label '" + labelText + "' is selected.\n");

		} catch (Exception e) {
			throw new RuntimeException(
					" Failed to publish or verify checkbox with label '" + labelText + "': " + e.getMessage(), e);
		}
	}

	@When("User publishes random payload from Excel sheet {string} row {int} and verifies {int} UI Labels")
	public void user_publishes_random_payload_for_n_labels(String sheetName, Integer startRow, Integer numberOfLabels) {
		try {
			MqttPage.publishAndVerifyloopThroughCards(sheetName, startRow, numberOfLabels);
		} catch (Exception e) {
			throw new RuntimeException(" Failed test for multiple labels: " + e.getMessage(), e);
		}
	}

	@When("User publishes random payload from Excel sheet {string} row {int} and verifies UI Label")
	public void user_publishes_random_payload_from_excel_row_and_verifies_ui_label(String sheetName, Integer row) {
		try {
			ExcelUtil.loadSheetIgnoreCase(sheetName);
			String topic = ExcelUtil.getCellValue(sheetName, row, "Topic");
			MqttPage.publishAndVerifySingleCard(topic);
		} catch (Exception e) {
			throw new RuntimeException(" Failed to verify UI Label from row: " + row + ", Error: " + e.getMessage(), e);
		}
	}

	@Then("the user navigates to {string} 📊")
	public void the_user_navigates_to(String Labels) {
		HelpMethods.explicitWait_milliSeconds(500);
		MqttPage.selectLabels(Labels);
	}

	@When("User clicks next page button of the selected option >")
	public void user_clicks_next_page_button_of_the_selected_option() {
		HelpMethods.explicitWait_milliSeconds(500);
		UnitSettingsPage.clickNextPageButton();
		HelpMethods.explicitWait_milliSeconds(500);

	}

	@When("user has to click the {string} Lable")
	public void user_has_to_click_the_lable(String Label) {
		MqttPage.clickDivByLabelText(Label);
		HelpMethods.explicitWait_milliSeconds(500);

	}

	@Then("User navigates to the next label page 📄>")
	public void user_navigates_to_the_next_label_page() {
		UnitSettingsPage.clickNextPageLabel();
		HelpMethods.explicitWait_milliSeconds(500);
	}

}
