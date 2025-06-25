package utils;

import org.testng.annotations.AfterSuite;

public class ReportMergerTrigger {

	@AfterSuite
	public void mergeExtentReports() {
		try {
			ExtentReportMerger.main(null);

		} catch (Exception e) {
			System.out.println("Report merge failed: " + e.getMessage());
		}
	}
}
