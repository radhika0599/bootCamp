package Assignment4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getAssertion {
	Response response;
	
  @Test
  public void f() {
	  response=RestAssured.given().header("Content-Type","application/JSON")
			  .when().get("https://reqres.in/api/users?page=2").then().log().all().extract().response();
	  
	  int statusCode=response.getStatusCode();
	  System.out.println("status code is "+statusCode);
	  
	  
	  String statusLine=response.getStatusLine();
	  System.out.println("status line is "+statusLine);
	  
	  
	  Assert.assertEquals(200,statusCode);
	  Assert.assertEquals("HTTP/1.1 200 OK",statusLine);
	  
  }
}
