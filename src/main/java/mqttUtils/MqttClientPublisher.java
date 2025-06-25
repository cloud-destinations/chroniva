package mqttUtils;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MqttClientPublisher {

	private static final String BROKER_URL = "tcp://localhost:1883";
	private static final String CLIENT_ID = "MQTT-Automation-Client";
	private static final String USERNAME = "cloud";
	private static final String PASSWORD = "cloud";

	private MqttClient client;

	// Connect using instance (optional if you want persistent connection)
	public void connect() throws MqttException {
		client = new MqttClient(BROKER_URL, CLIENT_ID, new MemoryPersistence());
		MqttConnectOptions options = new MqttConnectOptions();
		options.setCleanSession(true);
		options.setUserName(USERNAME);
		options.setPassword(PASSWORD.toCharArray());
		client.connect(options);
		System.out.println("Connected to broker: " + BROKER_URL);
	}

	// Disconnect
	public void disconnect() throws MqttException {
		if (client != null && client.isConnected()) {
			client.disconnect();
			System.out.println("Disconnected.");
		}
	}

	// Instance-based publish (if you're using connect/disconnect manually)
	public void publish(String topic, String payload) throws MqttException {
		if (client == null || !client.isConnected()) {
			throw new IllegalStateException("Client is not connected.");
		}
		MqttMessage message = new MqttMessage(payload.getBytes());
		message.setQos(1);
		client.publish(topic, message);
		System.out.println("Published: " + topic + " => " + payload);
	}

	// Static method (fire-and-forget style)
	public static void quickPublish(String topic, String payload) {
		try {
			MqttClient tempClient = new MqttClient(BROKER_URL, CLIENT_ID, new MemoryPersistence());
			MqttConnectOptions options = new MqttConnectOptions();
			options.setCleanSession(true);
			options.setUserName(USERNAME);
			options.setPassword(PASSWORD.toCharArray());

			tempClient.connect(options);
			MqttMessage message = new MqttMessage(payload.getBytes());
			message.setQos(1);
			tempClient.publish(topic, message);
			System.out.println("Published: " + topic + " => " + payload);
			tempClient.disconnect();
		} catch (Exception e) {
			throw new RuntimeException("Failed to publish MQTT message: " + e.getMessage(), e);
		}
	}
}
