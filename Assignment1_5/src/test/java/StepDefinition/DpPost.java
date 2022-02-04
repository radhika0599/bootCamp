package StepDefinition;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;

import static io.restassured.RestAssured.given;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DpPost {
	RequestSpecification request;
	Response response;
	
  @Test(dataProvider = "Post")

@When("data is given using data provider {string}")
public void data_is_given_using_data_provider(String path) {
	  
	   response=request.post(path).then().log().all().extract().response();
    
}
 
  
  
  @BeforeMethod
  @Given("Base URL is given for Post method")
  public void base_url_is_given_for_post_method() {
	  System.out.println(" URL is given for post method");
		RestAssured.baseURI="https://reqres.in";
		request=given().header("content-type","application/json")
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}");
    
  }

  @AfterMethod
  @Then("validate responses")
  public void validate_responses() {
	  int statusCode= response.getStatusCode();
		String statusLine =response.getStatusLine();
		 System.out.println("status Line is "+statusLine);
		  System.out.println("status code is "+statusCode);
		  Assert.assertEquals(201, statusCode);
		  Assert.assertEquals("HTTP/1.1 201 Created", statusLine);
      
  }


 /* @DataProvider(name="Post")
  public Object[][] data() {
	  Object[][] data=new Object[1][2];
	  data[0][0]="morpheus";
	  data[0][1]="leader";
	return data();
	  } */
}
