package StepDefinition;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class DataProviderGet {
	
	RequestSpecification request;
	Response response;
	
	@Given("Base URL is given")
	public void base_url_is_given() {
		System.out.println(" Base URL is given");
		RestAssured.baseURI="https://reqres.in";
		request=given().header("content-type","application/json");
	    
	}

	@When("path of get method {string}")
	public void path_of_get_method(String path) {
		System.out.println(" path of get method {string}");
		   
		   response=request.get(path).then().log().all().extract().response();
	    
	}

	@Then("Validate status code")
	public void validate_status_code() {
		System.out.println(" Validate status code");
		int statusCode= response.getStatusCode();
		String statusLine =response.getStatusLine();
		 System.out.println("status Line is "+statusLine);
		  System.out.println("status code is "+statusCode);
		  Assert.assertEquals(200, statusCode);
		  Assert.assertEquals("HTTP/1.1 200 OK", statusLine);
	    
	}


}
