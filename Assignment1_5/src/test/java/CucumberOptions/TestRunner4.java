package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Assignment1_5/src/test/java/Features/DataProvider.feature",
		glue="/Assignment1_5/src/test/java/StepDefinition/DataProviderGet.java",
		tags="@dataprovider"
		)
public class TestRunner4 {

}
