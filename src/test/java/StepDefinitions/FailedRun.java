package StepDefinitions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failedrun.txt", glue = {
"StepDefinitions" },  monochrome = true, dryRun = false, plugin = { "pretty",
		"json:target/cucumber-rerun.json"

})

public class FailedRun extends AbstractTestNGCucumberTests {

    
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
