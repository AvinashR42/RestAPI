package RestAssuredApiTesting_BDDapproach.RestAssuredApiTesting_BDDapproach;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo4_DELETE_Request {
	
	@Test
	public void deleteRequest() {
		
		RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/"   ;
		
	  Response response =	given()
		
		.when()
		  .delete()
		  
		  .then()
		    .statusCode(200)
		    .log().all()
		    .extract().response();
		
		
		
	}
	

}
