import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Resource",  
format = { "pretty", "html:test_output","junit:junit_report.cucumber.xml", "json:json.cucumber.json" },
monochrome = true, dryRun = false)
public class RedfinRunner {

}
