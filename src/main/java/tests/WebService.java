package tests;

import org.junit.Assert;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WebService {
	
	@Test
	public void request() {
	
	RestAssured.baseURI="https://swapi.co";
	
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.request(Method.GET, "/api/films/");
	JsonPath jsonPathEvaluator = response.jsonPath();
	
	//Take the fields that you want to validate
		int statusCode = response.getStatusCode();
		
    //Validate them 
		Assert.assertEquals(statusCode, 200);
		

	//Get Titles
	int count = jsonPathEvaluator.get("results.size()");
	for(int i=0;i<count;i++) {
		String name = jsonPathEvaluator.get("results["+i+"].title");
		String director = jsonPathEvaluator.get("results["+i+"].director");
		String producer = jsonPathEvaluator.get("results["+i+"].producer");
   
		if (director.equals("George Lucas") && producer.contains("Rick McCallum")) {
		  System.out.println(name);
	   }
	}   
	}
	
}

