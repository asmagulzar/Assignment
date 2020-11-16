package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Resources", glue = "StepDefinitions",
format = { "pretty", "html:test_output","junit:junit_report.cucumber.xml", "json:json.cucumber.json" },
monochrome = true, dryRun = false)

public class Plus500Runner {

}
