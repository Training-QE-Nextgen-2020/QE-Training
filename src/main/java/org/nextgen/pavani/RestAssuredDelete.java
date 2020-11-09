package org.nextgen.pavani;

import org.junit.Test;

import io.restassured.RestAssured;

public class RestAssuredDelete {
	@Test
	public void restAssuredDeleteTest() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/delete";
		String response=RestAssured.given().when().delete("http://dummy.restapiexample.com/api/v1/delete/8875").then().assertThat().statusCode(200).and().extract().response().asString();
		System.out.println(response);
		
	}

}
