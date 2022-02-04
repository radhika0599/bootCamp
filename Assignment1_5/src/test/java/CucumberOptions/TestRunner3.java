package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Assignment1_5/src/test/java/Features/Negative7.feature",
		glue="/Assignment1_5/src/test/java/StepDefinition/Negative1.java",
		tags="@url"
		)
public class TestRunner3 {

}
