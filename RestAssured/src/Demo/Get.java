package Demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get {
  @Test
  public void f() {
	  Response response;
	  response=RestAssured.get("https://reqres.in/api/users?page=2");
	  
	  String responseBody=response.getBody().asString();
	  System.out.println("Response of system is  "+responseBody); 
			  
	  /* RestAssured.baseURI="https://reqres.in";
	  RequestSpecification httpRequest=RestAssured.given();
	  Response response=httpRequest.request(Method.GET,"/api/users?page=2");
	  
	  String responseBody=response.getBody().asString();
	  System.out.println("Response of system is  "+responseBody); */
	  
	  String id=response.getSessionId();
	  System.out.println("Session Id is  "+id);
	  
	  String contentType=response.getContentType();
	  System.out.println("content type is "+contentType);
	  
	  int statusCode=response.getStatusCode();
	  System.out.println("status code is "+statusCode);
	  
	  String statusLine=response.getStatusLine();
	  System.out.println("status line is "+statusLine);
	  
	  Headers allHeaders=response.getHeaders();
	  for(Header header :allHeaders) {
		  System.out.println("Key:" +header.getName() +"Value:" +header.getValue());
		  
	  }
	  
	  
  }
}
