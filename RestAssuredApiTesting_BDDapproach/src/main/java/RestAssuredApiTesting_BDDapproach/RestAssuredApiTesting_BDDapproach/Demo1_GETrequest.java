package RestAssuredApiTesting_BDDapproach.RestAssuredApiTesting_BDDapproach;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;



public class Demo1_GETrequest {
	
	@Test
	public void getWeatherData() {
		given()
		
		.when()
		 .get("https://automationexercise.com/api/productsList")
		
		.then()
		  .statusCode(200)
		  .statusLine("HTTP/1.1 200 OK");
		
	}

}
