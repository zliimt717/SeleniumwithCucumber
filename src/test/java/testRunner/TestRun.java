package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = "stepDefinitions",
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-html-report.html",
                "json:target/cucumber-json-report.json"},
        monochrome = true
        //plugin = {"pretty"}
)
public class TestRun{

}
