package org.nextgen.api;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class RestAssuredGetTest {
	
	Response response;
	
	@BeforeMethod
	public void run() {
		 response = RestAssured
		.get("https://jsonplaceholder.typicode.com/todos/2");
		 
		 //make sure there is a response
		 Assert.assertNotNull(response);
		 
		 //make sure service is up and responded with 200/ok
		 response
		.then()
		.assertThat()
		.statusCode(200);
		 System.out.println(response.asString());
		 
		
	}
	
	
	@Test(suiteName = "PERF")	
	public void validateResponse() {
		 
		int userId = response
				.then()
				.assertThat()
				.statusCode(200)
				.extract()
				.path("userId")
				;
		Assert.assertNotNull(userId);
		Assert.assertEquals(userId, 1);	
					
		 
		//validating respons code
		 
		
		
	}
	
	@Test(enabled = false)
	public void testPost() {
		
	}
	
	


}
