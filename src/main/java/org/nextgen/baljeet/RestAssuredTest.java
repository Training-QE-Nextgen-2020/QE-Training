package org.nextgen.baljeet;

import io.restassured.RestAssured;

public class RestAssuredTest {
	
	Response response;
	
	@BeforeMethod
	public void run() {
		respose = RestAssured
		.get()
	}

}
