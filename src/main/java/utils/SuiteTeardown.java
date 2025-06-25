package utils;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class SuiteTeardown {

	@AfterSuite
	public void afterSuite() throws IOException {
		// Trigger FinalReportTrigger
		StandaloneExtentReportGenerator.main(new String[] {});

		// Modify dashboard label text
		ReportLabelModifier.updateLabels(new File("target/final-spark-report.html"));

		System.out.println("Final report generation triggered.");
	}
}
