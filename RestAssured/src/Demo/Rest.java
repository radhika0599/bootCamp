package Demo;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Rest {
  @Test
  public void basic() {
	  /*  //Get
	  Response res=RestAssured.given().log().all()
				
			.header("Content-Type","application/json")
				.when().get("https://reqres.in/api/unknown/2")
				.then().log().all().statusCode(200).extract().response(); */
      //Post
	  Response res1= given().log().all()
				.header("Content-Type","application/json")
				.body("{\r\n"
                       + " \"email\": \"eve.holt@reqre.in\" ,\r\n"
                       
                       + "    \"password\": \"pistol\"\r\n"
                       + "}")
				.when().post("https://reqres.in/api/register")
				.then().log().all().statusCode(400).extract().response();


		/*		RestAssured.baseURI="https://reqres.in/api/users?page=2";
				System.out.println(res.asString());
			JsonPath js=new JsonPath(res.asString());
			String place=js.get("place_id");
			System.out.println(place);  
		
			//put API
			
			Response resput=(Response)given().log().all()
			.queryParam("key", "qaclick12")
			.header("Content-Type","application/json")
			.body("{\r\n" + 
					"\"place_id\":\"+place+"\",\r\n" + 
					"\"address\":\"29, side layout, cohen 09\",\r\n" + 
					"\"key\":\"qaclick123\"\r\n" + 
					"}")
			.when().put("map/api/place/update/json")
				.then().assertThat().log().all().statusCode(200).extract().response();  */
	  
  }
}
