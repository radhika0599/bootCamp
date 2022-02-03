package StepDefinition;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Negative {
	RequestSpecification request;
	Response response;

	
	@Given("API given for foreign Exchange")
	public void api_given_for_foreign_exchange() {
		System.out.println(" API given for foreign Exchange");
		RestAssured.baseURI="https://reqres.in";	
		request=given().header("content-type","application/json").
				body("{\r\n"
						+ "    \"email\": \"peter@klaven\"\r\n"
						+ "}");
	    
	}

	@When("Post with incorrect information")
	public void post_with_incorrect_information() {
		System.out.println(" Post with incorrect information");
		String path="api/login";
		response=request.post(path).then().log().all().extract().response();
	}

	//@SuppressWarnings("deprecation")
	@Then("Validate Response Code")
	public void validate_response_code() {
		System.out.println(" Validate Response Code");
		
		 
		  Assert.assertNotSame(201, response.getStatusCode());
		  Assert.assertNotSame("HTTP/1.1 201 Created", response.getStatusLine());
			
	}

	@Then("Store response code in response object")
	public void store_response_code_in_response_object() {
		System.out.println(" Store response code in response object");
		int statusCode= response.getStatusCode();
		String statusLine =response.getStatusLine();
		System.out.println("status Line is "+statusLine);
		  System.out.println("status code is "+statusCode);
		  Response response1=response.then().statusCode(statusCode).log().all().extract().response();
	    
	}



}
