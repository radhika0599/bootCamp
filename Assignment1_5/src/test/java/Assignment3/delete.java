package Assignment3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class delete {
	Response response;
  @Test
  public void f() {
	  response=RestAssured.given().delete("https://reqres.in/api/users/2").then().log().all().extract().response();
	  
	  String statusLine=response.getStatusLine();
	  System.out.println("status line is "+statusLine);
	  
	  int statusCode=response.getStatusCode();
	  System.out.println("status code is "+statusCode);
  }
}
