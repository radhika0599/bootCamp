package StepDefinition;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DpGet {
	String url="https://reqres.in/";
	Response response;

	@Test
	@Given("Base URL is given for get method")
	public void base_url_is_given_for_get_method() {
		RestAssured.baseURI=url;
	}




	@Test(dataProvider="Page")
	@When("values given using parameterization {string}")
	public void values_given_using_parameterization(String number) {
		response=RestAssured.get("/api/users?page="+number);

	}

	@Test(dataProvider="Page")
	@Then("Do all the validations {string}")
	public void do_all_the_validations(String number) {
		response=RestAssured.get("/api/users?page="+number);
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode,200);
		System.out.println("giving next page value");
		System.out.println("Status code is "+statusCode);

		String statusLine=response.getStatusLine();
		Assert.assertTrue(statusLine.contains("OK"));
		System.out.println("Status line is  "+statusLine);

		// System.out.println("Session Id is  "+response.getSessionId());



	}





	@DataProvider(name="Page")
	public Object[][] data() {
		Object[][] num=new Object[3][1];

		num[0][0]="2";

		num[1][0]="3";

		num[2][0]="4";

		return num;



	}
}

