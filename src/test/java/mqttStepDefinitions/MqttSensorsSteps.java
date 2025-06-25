package mqttStepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import StepDefinitions.Hooks;
import io.cucumber.java.en.When;
import mqttPages.MqttSensorsPage;
import mqttUtils.ExcelUtil;
import mqttUtils.MqttClientPublisher;

public class MqttSensorsSteps {

	MqttClientPublisher mqtt = new MqttClientPublisher();
	private WebDriver driver = Hooks.getDriver(); // Gets the driver created in Hooks
	private List<String> payloadOrder;
	private MqttSensorsPage mqttSensorsPage;
	private Map<String, String> selectedRow;

	@When("the user navigates to {string}")
	public void the_user_navigates_to(String Labels) {
		MqttSensorsPage.selectLabels(Labels);

	}

	@When("user loads data from Excel sheet {string} row {int}, publishes the MQTT message, and verifies the radio button name in row {int}")
	public void publish_and_verify_radio_button_by_label(String sheetName, Integer publishRow, Integer labelRow) {
		try {
			// Load sheet
			ExcelUtil.loadSheetIgnoreCase(sheetName);

			// Get publish info (topic, payload)
			Map<String, String> publishRowData = ExcelUtil.readRow(sheetName, publishRow);
			String topic = publishRowData.get("Topic");
			String payload = publishRowData.get("Payload");

			System.out.println("\n--------------------------------------------------");
			System.out.println("Excel loaded. Topic: " + topic + ", Payload: " + payload);

			// Publish to MQTT
			MqttClientPublisher.quickPublish(topic, payload);
			Thread.sleep(1000); // Wait for MQTT update

			// Get radio button label from row
			String expectedLabel = ExcelUtil.getCellValue(sheetName, labelRow, "Feature");

			// Verify if the button is selected
			MqttSensorsPage.VerifySelectedButtonUsingExcel(expectedLabel);

			System.out.println("In Sensors, the \"" + expectedLabel + "\" radio button is selected.");
			System.out.println("--------------------------------------------------\n");

		} catch (Exception e) {
			throw new RuntimeException(" Failed to publish or verify radio button selection: " + e.getMessage(), e);
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

			System.out.println("\nPublishing MQTT message...");
			System.out.println("Topic: " + topic + " | Payload: " + payload);

			// Publish to MQTT
			MqttClientPublisher.quickPublish(topic, payload);
			Thread.sleep(1000); // Let the UI reflect the update

			// Verify checkbox by label text
			MqttSensorsPage.VerifySelectedButtonUsingStep(labelText);

			System.out.println(" Checkbox with label '" + labelText + "' is selected.\n");

		} catch (Exception e) {
			throw new RuntimeException(
					" Failed to publish or verify checkbox with label '" + labelText + "': " + e.getMessage(), e);
		}
	}

}
