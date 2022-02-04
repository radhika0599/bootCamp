package Assignment4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostAssertion {
	Response response;
  @Test
  public void f() {
		response=RestAssured.given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}").when().post("https://reqres.in/api/users").then().log().all().extract().response();


                   int statusCode=response.getStatusCode();
                   System.out.println("status code is "+statusCode);
  
                 String statusLine=response.getStatusLine();
                 System.out.println("status line is "+statusLine);
                 
                 Assert.assertEquals(201,statusCode);
           	  Assert.assertEquals("HTTP/1.1 201 Created",statusLine);
  
  

  }
}
