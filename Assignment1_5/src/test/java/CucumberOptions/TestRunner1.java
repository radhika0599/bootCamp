package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Assignment1_5/src/test/java/Features/Method4.feature",
		glue="/Assignment1_5/src/test/java/StepDefinition/Methods.java",
		tags="@post"
		)
public class TestRunner1 {

}
