package Assignment3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Post {
	Response response;
	
  @Test
  public void f() {
	response=RestAssured.given().header("Content-Type","application/json").body("{\r\n"
					+ "    \"name\": \"morpheus\",\r\n"
					+ "    \"job\": \"leader\"\r\n"
					+ "}").when().post("https://reqres.in/api/users").then().log().all().extract().response();

  }
}
