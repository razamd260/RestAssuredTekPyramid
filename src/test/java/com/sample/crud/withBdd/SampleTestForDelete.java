package com.sample.crud.withBdd;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SampleTestForDelete {

	
	@Test
	public void getDataFromServer() {
		
		
		
		given().delete("http://49.249.28.218:8091/project/NH_PROJ_285").
	    
		   then().log().all().
		       
		       assertThat().statusCode(204);
		
	}
}
