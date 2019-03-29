package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/features/globalSearch.feature"},
        glue = "stepDefinitions",
        tags = "@run",
        plugin = {"html:target/cucumber-pretty/1", "json:target/cucumber-report1.json"})
public class RunCukesTestFirst extends AbstractTestNGCucumberTests {
}
