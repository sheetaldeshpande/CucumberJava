import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(format="pretty",tags = "@ok", features="src/test/resources")
public class RunnerTest {
}
