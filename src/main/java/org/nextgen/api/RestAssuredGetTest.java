package org.nextgen.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;


public class RestAssuredGetTest {
	
	
	@Test
	public void testGetEmployees() {
		 
		Response response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");	 
		
		 
		//validating respons code
		Assert.assertEquals(200, response.getStatusCode());
		 
		 //https://github.com/rest-assured/rest-assured/wiki/Usage#example-1---json
		 //use this to validate response body elements from json
		 
		
		
	}
	
	


}
