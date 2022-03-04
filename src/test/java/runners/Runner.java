package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        tags = "@Rental and @Done",
        glue = "steps",
        plugin = {"pretty","html:target/reports/report-html.html"},
        monochrome = true
)
public class Runner {
}
