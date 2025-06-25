package utils;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ExtentReportMerger {

	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		// List your JSON files here in execution order (oldest to latest)
		List<File> jsonFiles = List.of(new File("target/cucumber.json"), new File("target/cucumber-rerun.json"));

		// Store latest version of each scenario
		Map<String, JsonNode> latestScenarioMap = new LinkedHashMap<>();
		Map<String, ObjectNode> featureTemplateMap = new LinkedHashMap<>();

		for (File file : jsonFiles) {
			JsonNode root = mapper.readTree(file);
			for (JsonNode feature : root) {
				String featureId = feature.path("id").asText();
				featureTemplateMap.putIfAbsent(featureId, (ObjectNode) feature.deepCopy());

				ArrayNode elements = (ArrayNode) feature.get("elements");
				if (elements == null)
					continue;

				for (JsonNode scenario : elements) {
					String scenarioId = featureId + ":" + scenario.path("id").asText();
					latestScenarioMap.put(scenarioId, scenario); // overwrite earlier
				}
			}
		}

		// Rebuild features with only latest scenarios
		ArrayNode finalFeatures = mapper.createArrayNode();
		for (Map.Entry<String, ObjectNode> entry : featureTemplateMap.entrySet()) {
			String featureId = entry.getKey();
			ObjectNode feature = entry.getValue();
			ArrayNode newElements = mapper.createArrayNode();

			for (Map.Entry<String, JsonNode> scenarioEntry : latestScenarioMap.entrySet()) {
				if (scenarioEntry.getKey().startsWith(featureId + ":")) {
					newElements.add(scenarioEntry.getValue());
				}
			}

			feature.set("elements", newElements);
			finalFeatures.add(feature);
		}

		File output = new File("target/merged-cucumber.json");
		mapper.writerWithDefaultPrettyPrinter().writeValue(output, finalFeatures);
		System.out.println("✅ Cleaned merged JSON written to: " + output.getAbsolutePath());
	}
}
