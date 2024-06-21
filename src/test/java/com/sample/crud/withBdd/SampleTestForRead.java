package com.sample.crud.withBdd;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SampleTestForRead {

	
	@Test
	public void getDataFromServer() {
		given().get("http://49.249.28.218:8091/projects").
		    
		   then().log().all().
		       
		       assertThat().statusCode(200);
	
		
	}
}
