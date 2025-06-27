package StepDefinitions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources"},
    glue = {"StepDefinitions", "mqttStepDefinitions"},
    tags = "@MqttUnitsettings2", //Tags to run TC
    plugin = {
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "json:target/cucumber.json",
        "rerun:target/failedrun.txt"
    },
    monochrome = true,
    dryRun = false 
)
public class TestRunner extends AbstractTestNGCucumberTests {
    
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
