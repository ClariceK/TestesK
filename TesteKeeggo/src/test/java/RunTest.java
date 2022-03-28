import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/steps"},
        plugin = {"pretty", "html:target/cucumber","json:target/cucumber/jsonReport.json","junit:target/cucumber/xmlReport.xml"},
        glue = {"Steps"},
        tags = {"@MatchingServicePostRequests"}
)

public class RunTest {
}