package automation.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(tags = "", features = "src/test/resources/LoginPageFeature.feature",
        glue = "automation/definitions", plugin = {})

public class CucumberTestRunner extends AbstractTestNGCucumberTests{

}
