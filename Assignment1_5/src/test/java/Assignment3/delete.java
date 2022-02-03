package Assignment3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class delete {
	Response response;
  @Test
  public void f() {
	  response=RestAssured.given().delete("https://reqres.in/api/users/2").then().log().all().extract().response();
  }
}
