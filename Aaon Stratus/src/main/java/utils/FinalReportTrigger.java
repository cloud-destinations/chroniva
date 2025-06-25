package utils;

import java.io.File;

public class FinalReportTrigger {
    public static void main(String[] args) {
        System.out.println("FinalReportTrigger has started.");

        String propPath = "src/test/resources/extent.properties";
        File f = new File(propPath);
        System.setProperty("extent.properties.file", propPath);
        System.out.println("Property file exists? " + f.getAbsolutePath() + " : " + f.exists());
        System.out.println("Using extent.properties.file = " + System.getProperty("extent.properties.file"));
        System.out.println("JSON file path: " + System.getProperty("cucumber.report.json"));


        try {
            Class<?> clazz = Class.forName("com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter");
            System.out.println("Adapter class loaded: " + clazz);
        } catch (ClassNotFoundException e) {
            System.out.println("ExtentCucumberAdapter class not found. Check dependency.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Unexpected error:");
            e.printStackTrace();
        }

        System.out.println("FinalReportTrigger completed.");
    }
}
