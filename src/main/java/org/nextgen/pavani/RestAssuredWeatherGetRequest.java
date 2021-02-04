package org.nextgen.pavani;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredWeatherGetRequest {

	@Test
	void getWeatherDetsils() {
		// specifing base urI
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		// Request object
		RequestSpecification httpRequest = RestAssured.given();
		// response object
		Response response = httpRequest.request(Method.GET, "Hyderabad");
		// print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("the response body is" + responseBody);
		// staus code validation
		int responseCode = response.getStatusCode();
		System.out.println("the response code is" + responseCode);

		String responseLine = response.getStatusLine();
		System.out.println("the status line is" + responseLine);
	}

}
