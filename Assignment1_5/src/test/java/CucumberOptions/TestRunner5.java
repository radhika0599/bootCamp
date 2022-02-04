package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Assignment1_5/src/test/java/Features/DataProviderTestNG.feature",
		glue="/Assignment1_5/src/test/java/StepDefinition/DpPost.java",
		tags="@testng"
		)
public class TestRunner5 {

}
