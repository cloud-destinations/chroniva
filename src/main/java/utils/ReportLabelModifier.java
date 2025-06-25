package utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

public class ReportLabelModifier {

	public static void updateLabels(File htmlFile) throws IOException {
		String content = FileUtils.readFileToString(htmlFile, StandardCharsets.UTF_8);

		// Replace dashboard labels
		content = content.replace(">Tests<", ">Scenarios<");
		content = content.replace(">Log events<", ">Steps<");
		content = content.replace(">Tests Passed<", ">Scenarios Passed<");
		content = content.replace(">Tests Failed<", ">Scenarios Failed<");

		// Save back the updated file
		FileUtils.writeStringToFile(htmlFile, content, StandardCharsets.UTF_8);
		System.out.println("✅ Report labels updated in: " + htmlFile.getAbsolutePath());
	}

	public static void main(String[] args) throws IOException {
		File reportFile = new File("target/final-spark-report.html");
		updateLabels(reportFile);
	}
}
