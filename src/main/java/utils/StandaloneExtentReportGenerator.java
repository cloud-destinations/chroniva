package utils;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StandaloneExtentReportGenerator {

	public static void main(String[] args) throws IOException {
		File jsonFile = new File("target/merged-cucumber.json");
		File reportFile = new File("target/final-spark-report.html");

		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(jsonFile);

		ExtentSparkReporter spark = new ExtentSparkReporter(reportFile).viewConfigurer().viewOrder()
				.as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST }).apply();

		// Set config from XML
		spark.loadXMLConfig("src/test/resources/extent-config.xml");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);

//		for (JsonNode feature : root) {
//		    String featureName = feature.path("name").asText();
//		    ExtentTest featureTest = extent.createTest(featureName);
//
//		    for (JsonNode scenario : feature.path("elements")) {
//		        if (!"scenario".equals(scenario.path("type").asText())) continue;
//
//		        String scenarioName = scenario.path("name").asText();
//		        ExtentTest scenarioTest = featureTest.createNode(scenarioName);
//
//		        for (JsonNode step : scenario.path("steps")) {
//		            String keyword = step.path("keyword").asText();
//		            String stepName = step.path("name").asText();
//		            String status = step.path("result").path("status").asText();
//
//		            switch (status) {
//		                case "passed" -> scenarioTest.pass(keyword + stepName);
//		                case "failed" -> scenarioTest.fail(keyword + stepName);
//		                case "skipped" -> scenarioTest.skip(keyword + stepName);
//		                default -> scenarioTest.info(keyword + stepName);
//		            }
//		        }
//		    }
//		}
//

		for (JsonNode feature : root) {
			String featureName = feature.path("name").asText();

			for (JsonNode scenario : feature.path("elements")) {
				if (!"scenario".equals(scenario.path("type").asText()))
					continue;

				String scenarioName = scenario.path("name").asText();
				ExtentTest test = extent.createTest(featureName + " - " + scenarioName);
//				ExtentTest featureNode = extent.createTest(featureName).assignCategory("Feature");
//				ExtentTest scenarioNode = featureNode.createNode(scenarioName).assignCategory("Scenario");

				for (JsonNode step : scenario.path("steps")) {
					String keyword = step.path("keyword").asText();
					String stepName = step.path("name").asText();
					String status = step.path("result").path("status").asText();

					switch (status) {
					case "passed" -> test.pass(keyword + stepName);
					case "failed" -> test.fail(keyword + stepName);
					case "skipped" -> test.skip(keyword + stepName);
					default -> test.info(keyword + stepName);
					}

				}
			}
		}
		extent.flush();
		System.out.println("✅ Report generated at: " + reportFile.getAbsolutePath());
	}
}
