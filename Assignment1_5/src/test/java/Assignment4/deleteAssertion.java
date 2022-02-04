package Assignment4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class deleteAssertion {
	Response response;
  @Test
  public void f() {
response=RestAssured.given().delete("https://reqres.in/api/users/2").then().log().all().extract().response();
	  
	  String statusLine=response.getStatusLine();
	  System.out.println("status line is "+statusLine);
	  
	  int statusCode=response.getStatusCode();
	  System.out.println("status code is "+statusCode);
	  
	  Assert.assertEquals(204,statusCode);
	  Assert.assertEquals("HTTP/1.1 204 No Content",statusLine);
	  
	  
  }
}
