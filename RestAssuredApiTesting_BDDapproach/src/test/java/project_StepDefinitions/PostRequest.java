package project_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.TestPayloadBuild;
import resources.Utility;

import static io.restassured.RestAssured.*;

import java.io.IOException;

public class PostRequest extends Utility {
	
	RequestSpecification req;
	Response response;
	
	TestPayloadBuild data = new TestPayloadBuild();
	

@Given("Json payload to add the book {string}{string}{string}{string}")
public void json_payload_to_add_the_book(String name, String isbn, int aisle, String author) throws IOException {
    req = given().spec(requestSpecification()).body(data.addbook());
}



@When("user calls Addbook API with POST HTTP request")
public void user_calls_addbook_api_with_post_http_request() {
   response = req.when()
		   .post("Library/Addbook.php").then().extract().response();
}

@Then("The API call got success with status code {int}")
public void the_api_call_got_success_with_status_code(Integer int1) {
   response.then().assertThat().statusCode(200);
}

@Then("{string} in response body is {string}")
public void in_response_body_is(String string, String string2) {
    JsonPath js = new JsonPath(response.asString());
    String msg = js.get(string);
 //   assertEquals(msg,value);
    System.out.println("Book ID from response body=="+js.get("ID"));
    
}




}
