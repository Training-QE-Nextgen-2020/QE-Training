package org.nextgen.pavani;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;




public class RestAssuredGetTest {
	@Test
	public void testGetEmployees() {
		Response response=RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		System.out.println("the response body"+response.getBody().asString());
		System.out.println("status line"+response.getStatusLine());
		System.out.println("status code"+response.getStatusCode());
				
	}
	
	

}
