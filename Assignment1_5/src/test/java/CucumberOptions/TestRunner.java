package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Assignment1_5/src/test/java/Features/AssignmentBDD.feature",
		glue="/Assignment1_5/src/test/java/StepDefinition/StepDefinition.java",
		tags="@smoke"
		//monochrome = true
		//strict = true,
		//dryRun = false
		)
public class TestRunner {

}
