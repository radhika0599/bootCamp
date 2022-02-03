package Assignment3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Put {
	Response response;
  @Test
  public void f() {
	  response=RestAssured.given().header("Content-Type","application/json").body("{\n"
	  		+ "    \"name\": \"morpheus\",\n"
	  		+ "    \"job\": \"zion resident\"\n"
	  		+ "}").put("https://reqres.in/api/users/2").then().log().all().extract().response();
  }
}
