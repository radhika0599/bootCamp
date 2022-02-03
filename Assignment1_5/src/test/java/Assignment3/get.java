package Assignment3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class get {
	Response response;
	
  @Test
  public void f() {
	  response=RestAssured.given().header("Content-Type","application/JSON")
			  .when().get("https://reqres.in/api/users?page=2").then().log().all().extract().response();
	  
  }
}
