package StepDefinition;

import static io.restassured.RestAssured.given;

import io.cucumber.core.gherkin.messages.internal.gherkin.internal.com.eclipsesource.json.JsonObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class StepDefinition {
	RequestSpecification request;
	Response response;

@Given("API for foreign Exchange")
public void api_for_foreign_exchange() {
   
	System.out.println(" api_for_foreign_exchange");
	
	RestAssured.baseURI="https://reqres.in";	
	request=given().header("content-type","application/json").
			body("{\r\n"
					+ "    \"name\": \"morpheus\",\r\n"
					+ "    \"job\": \"leader\"\r\n"
					+ "}");
	
}

@When("Posted with correct information")
public void posted_with_correct_information() {
   
	System.out.println(" posted_with_correct_information");
	//request=RestAssured.given().log().all();
	String path="api/users";
	response=request.post(path).then().log().all().extract().response();
}

@Then("Validate positive Response code received")
public void validate_positive_response_code_received() {
	
	System.out.println(" validate_positive_response_code_received");
	
	//request.then().log().all();
     
	int statusCode= response.getStatusCode();
	String statusLine =response.getStatusLine();
	 System.out.println("status Line is "+statusLine);
	  System.out.println("status code is "+statusCode);
	  Assert.assertEquals(201, statusCode);
	  Assert.assertEquals("HTTP/1.1 201 Created", statusLine);
		
	  
}
}
