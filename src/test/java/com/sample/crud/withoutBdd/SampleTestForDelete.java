package com.sample.crud.withoutBdd;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SampleTestForDelete {

	
	@Test
	public void getDataFromServer() {
		Response response=delete("http://49.249.28.218:8091/project/NH_PROJ_268");
		System.out.println(response.prettyPrint());   // Only Body Not Header
		response.then().assertThat().statusCode(204);
		response.then().log().all();   // here All Body As well As Header
		
	}
}
