package StepDefinition;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Negative1 {
	RequestSpecification request;
	Response response;
	
	@Given("API testing with negative scenario")
	public void api_testing_with_negative_scenario() {
		System.out.println(" API testing with negative scenario");
		RestAssured.baseURI="https://reqres.in";	
		request=given().header("content-type","application/json").
				body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}");
	    
	 
	}

	@When("Url given is wrong")
	public void url_given_is_wrong() {
		System.out.println(" Url given is wrong");
		String path="api/";
		response=request.post(path).then().log().all().extract().response();
	   
	}

	@Then("Validate reponse code received")
	public void validate_reponse_code_received() {
		System.out.println(" Validate reponse code received");
		 Assert.assertEquals(404, response.getStatusCode());
		  Assert.assertEquals("HTTP/1.1 404 Not Found", response.getStatusLine());
			
	    
	}

	@Then("Store response in response object")
	public void store_response_in_response_object() {
		System.out.println(" Store response in response object");
		int statusCode= response.getStatusCode();
		String statusLine =response.getStatusLine();
		System.out.println("status Line is "+statusLine);
		  System.out.println("status code is "+statusCode);
		  Response response1=response.then().statusCode(statusCode).log().all().extract().response();
	}


}
