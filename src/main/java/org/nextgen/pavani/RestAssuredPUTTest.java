package org.nextgen.pavani;

import io.restassured.RestAssured;

public class RestAssuredPUTTest {

	public void testUPDATEEmployee() {
		//the body as a string
		String body = "{\n" + "   \"employee_name\":\"Tenali2\",\n" + "   \"employee_salary\":320800,\n"
				+ "   \"employee_age\":61,\n" + "   \"profile_image\":null,\n" + "   \"id\":8875\n" + "} ";
		//
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/update/8875";
		String response = RestAssured.given().body(body).when().put("http://dummy.restapiexample.com/api/v1/update/8875")
				.then().assertThat().statusCode(200).extract().response().asString();

		System.out.println(response);

	}

}
