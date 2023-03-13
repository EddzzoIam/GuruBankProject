package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = "html:target/cucumber_html_report.html", 
		monochrome= true,
		features = {"src/test/java/features"},
		glue = {"hooks","StepDefinition"},
		tags="@Login"
		
		)
public class TestRunner {

}
