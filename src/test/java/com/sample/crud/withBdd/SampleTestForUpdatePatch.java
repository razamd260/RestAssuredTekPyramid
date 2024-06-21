package com.sample.crud.withBdd;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForUpdatePatch {
      
	@SuppressWarnings("unchecked")
	@Test
	public void getDataFromServer() {
		JSONObject json=new JSONObject();
	
		json.put("projectName", "Orange 2.0.4");
		
		given().contentType(ContentType.JSON).body(json).
		
	       when().put("http://49.249.28.218:8091/project/NH_PROJ_285").
	       
	           then().
	                assertThat().statusCode(200).
	                
	                 log().all();
		
		
		
	}
   
}
