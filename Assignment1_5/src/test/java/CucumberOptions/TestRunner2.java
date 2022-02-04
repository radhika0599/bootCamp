package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Assignment1_5/src/test/java/Features/NegativeScenario5.feature",
		glue="/Assignment1_5/src/test/java/StepDefinition/Negative.java",
		tags="@Negative"
		)
public class TestRunner2 {

}
