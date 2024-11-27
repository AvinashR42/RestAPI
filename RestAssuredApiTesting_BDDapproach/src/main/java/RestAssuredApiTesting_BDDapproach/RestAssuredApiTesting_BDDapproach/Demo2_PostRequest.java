package RestAssuredApiTesting_BDDapproach.RestAssuredApiTesting_BDDapproach;

import org.apache.http.client.methods.HttpRequestBase;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2_PostRequest {
	
	
	@Test
	public void GetRequest_Headers() {
		
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.get(""); 
		
		Headers allHeaders = response.headers();
		
		for(Header header : allHeaders) {
			System.out.println("Key: " + header.getName() + " Value: " + header.getValue()); 
		 
		}
		
	}

	
}
