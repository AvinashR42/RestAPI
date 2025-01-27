package project_StepDefinitions;

import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.TestPayloadBuild;
import resources.Utility;

public class GetRequest extends Utility {
	RequestSpecification req;
	Response response;
	TestPayloadBuild data = new TestPayloadBuild();
	
	
	
	@Given("data is passed via payload")
	public void data_is_passed_via_payload() {
		
			
		req = given().spec(req).body(data.addbook());
	   
	}
	@When("user calls productlist from automationExercize")
	public void user_calls_productlist_from_automation_exercize() {
	   response = req.when()
			   .post("Library/Addbook.php").then().extract().response();
	}
	@Then("the API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
		response.then().statusCode(200);
		//JsonPath js = new JsonPath(response.asString());
	//	String msg = js.get();
		// assertEquals(msg,"very beautiful");
		
	
		
	}




}
