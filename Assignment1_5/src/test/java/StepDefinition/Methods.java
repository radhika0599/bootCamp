package StepDefinition;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Methods {
	RequestSpecification request;
	Response response;
	
	@Given("URL is given for get method")
	public void url_is_given_for_get_method() {
		System.out.println(" URL is given for get method");
		RestAssured.baseURI="https://reqres.in";
		request=given().header("content-type","application/json");
	}

	@When("get correct data")
	public void get_correct_data() {
		System.out.println(" get correct data");
	   String path="/api/users/2";
	   response=request.get(path).then().log().all().extract().response();
	   
	}

	@Then("validate status code for get")
	public void validate_status_code_for_get() {
		System.out.println(" validate status code for get");
		int statusCode= response.getStatusCode();
		String statusLine =response.getStatusLine();
		 System.out.println("status Line is "+statusLine);
		  System.out.println("status code is "+statusCode);
		  Assert.assertEquals(200, statusCode);
		  Assert.assertEquals("HTTP/1.1 200 OK", statusLine);
	   
	}

	@Given("URL is given for post method")
	public void url_is_given_for_post_method() {
		System.out.println(" URL is given for post method");
		RestAssured.baseURI="https://reqres.in";
		request=given().header("content-type","application/json")
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}");
	    
	}

	@When("post correct data")
	public void post_correct_data() {
		System.out.println(" post correct data");
		  String path="/api/users";
		   response=request.post(path).then().log().all().extract().response();
		
	   
	}

	@Then("validate status code for post")
	public void validate_status_code_for_post() {
		System.out.println(" validate status code for post");
		int statusCode= response.getStatusCode();
		String statusLine =response.getStatusLine();
		 System.out.println("status Line is "+statusLine);
		  System.out.println("status code is "+statusCode);
		  Assert.assertEquals(201, statusCode);
		  Assert.assertEquals("HTTP/1.1 201 Created", statusLine);
	}

	@Given("URL is given for put method")
	public void url_is_given_for_put_method() {
		System.out.println(" URL is given for put method");
		RestAssured.baseURI="https://reqres.in";
		request=given().header("content-type","application/json")
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}");
	}

	@When("update correct data")
	public void update_correct_data() {
		System.out.println(" update correct data");
		 String path="/api/users/2";
		   response=request.put(path).then().log().all().extract().response();
	}

	@Then("validate status code for put")
	public void validate_status_code_for_put() {
		System.out.println(" validate status code for put");
		
		int statusCode= response.getStatusCode();
		String statusLine =response.getStatusLine();
		 System.out.println("status Line is "+statusLine);
		  System.out.println("status code is "+statusCode);
		  Assert.assertEquals(200, statusCode);
		  Assert.assertEquals("HTTP/1.1 200 OK", statusLine);
	}

	@Given("URL is given for delete method")
	public void url_is_given_for_delete_method() {
		System.out.println(" URL is given for delete method");
		RestAssured.baseURI="https://reqres.in";
		request=given().header("content-type","application/json");
	}

	@When("delete the data")
	public void delete_the_data() {
		System.out.println(" delete the data");
		String path="/api/users/2";
		   response=request.delete(path).then().log().all().extract().response();
		
	}

	@Then("validate status code for delete")
	public void validate_status_code_for_delete() {
		System.out.println(" validate status code for delete");
		int statusCode= response.getStatusCode();
		String statusLine =response.getStatusLine();
		 System.out.println("status Line is "+statusLine);
		  System.out.println("status code is "+statusCode);
		  Assert.assertEquals(204, statusCode);
		  Assert.assertEquals("HTTP/1.1 204 No Content", statusLine);
	}


}
