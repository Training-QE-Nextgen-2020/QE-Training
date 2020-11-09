package org.nextgen.pavani;

import static org.junit.Assert.assertNotNull;

import org.apache.http.HttpStatus;
import org.junit.Test;

import io.restassured.RestAssured;

public class RestAssuredPostTest {

	@Test
	public void testCreateEmployee() {
		// RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/create";

		String bodyString = " {\n" + "           \n" + "            \"employee_name\": \"Tenali\",\n"
				+ "            \"employee_salary\": 320800,\n" + "            \"employee_age\": 61,\n"
				+ "            \"profile_image\": \"\"\n" + "        }";

		String response = RestAssured.given().body(bodyString).when()
				.post("http://dummy.restapiexample.com/api/v1/create").then().assertThat().statusCode(HttpStatus.SC_OK)
				.extract().asString();

		System.out.print(response);
		assertNotNull(response);

	}
}
