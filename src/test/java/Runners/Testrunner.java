package Runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/nita.html"}, //reporting purpose
		monochrome=false,  //console output color
		tags = "@tag", //tags from feature file
		features = {"src/test/resources/features"}, //location of feature files
		glue= {"stepDefinitions","AppHooks"} //location of step definition files
)
public class Testrunner {

}
