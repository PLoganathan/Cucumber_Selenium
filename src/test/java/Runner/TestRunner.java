//package Runner;

package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},
features = "src/test/java/Features",
glue= "seleniumgluecode",
monochrome=true, 
dryRun=false
)



public class TestRunner {

}
