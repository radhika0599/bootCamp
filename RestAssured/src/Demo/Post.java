package Demo;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Post {
  @Test
  public void f() {
	  given().
		header("Content-Type","application/json").
		body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}").
when().
		post("https://reqres.in/api/users").
		
then().
		statusCode(201).
		log().all();
	  
  }
}
