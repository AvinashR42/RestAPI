package resources;

import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

public class Utility {
	RequestSpecification req;
	
	public RequestSpecification requestSpecification() throws IOException{
	
 	PrintStream log =new PrintStream(new FileOutputStream("logdetails.txt"));
 	System.out.println("Log file initialized: logdetails.txt");
 	
	req = new RequestSpecBuilder()
			 .setContentType(ContentType.JSON)
			 .setBaseUri(getGlobalvalue("baseUrl"))
			 .addFilter(RequestLoggingFilter.logRequestTo(log))
			 .addFilter(ResponseLoggingFilter.logResponseTo(log))
			 .build();
	
    return req;
    

    
	}

	private static String getGlobalvalue(String key) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("D:\\New folder\\New folder\\RestAPI\\RestAssuredApiTesting_BDDapproach\\src\\test\\java\\resources\\global.properties");
		prop.load(file);
		return prop.getProperty(key);
	}
}
