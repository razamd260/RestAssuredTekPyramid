package com.sample.crud.withoutBdd;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SampleTestForRead {

	
	@Test
	public void getDataFromServer() {
		Response response=get("http://49.249.28.218:8091/projects");
		System.out.println(response.prettyPrint());   // Only Body Not Header
		response.then().assertThat().statusCode(200);
		response.then().log().all();   // here All Body As well As Header
		
	}
}
