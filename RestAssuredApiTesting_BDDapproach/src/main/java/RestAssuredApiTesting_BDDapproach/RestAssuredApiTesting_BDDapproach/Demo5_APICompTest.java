package RestAssuredApiTesting_BDDapproach.RestAssuredApiTesting_BDDapproach;
import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Demo5_APICompTest {

	
	@Test(enabled=false)
	public void verifyingTestStatusCode() {
		
		given()
		
		.when()
		  .get("http://jsonplaceholder.typicode.com/posts/5")
		  
		.then()
		   .statusCode(200)
		   .log().all();
		
		
	}
	@Test(enabled=false)
	public void testLogging() {
		given()
		
		.when()
		 .get("http://services.groupkt.com/country/get/iso2code/IN")
		 
		 .then()
		 //.statusCode(400)
		 .log().all();	}
	
	@Test(enabled=false)
	public void verifyingSingleContent() {
		
		given()
		
		.when()
		 .get("http://services.groupkt.com/country/get/iso2code/IN")
		
		 .then()
		  .body("RestResponse.result.name", equalTo("India"));
	}
	
	
	@Test
	public void verifyingMultipleContent() {
		
		given()
		
		.when()
		 .get("http://services.groupkt.com/country/get/iso2code/IN")
		 
		 .then()
		  .body("RestResponse.result.name", hasItems("India","Australia"));
		
	}
	
}
