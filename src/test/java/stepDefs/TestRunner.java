package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		plugin = {"html:target/html-cucumber", "json:target/cucumber.json"},
		features = "src/test/java/feature",
		tags = {"@Sanity"}, //to run single tag
		//tags = {"@Sanity, @Regression"},
		//tags = {"@Regression","@Rapid"},
		glue = {"stepDefs"}
		)
public class TestRunner {

}
