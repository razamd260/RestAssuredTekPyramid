package com.sample.crud.withBdd;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForCreate {
	@SuppressWarnings("unchecked")
	@Test
	public void getDataFromServer() {
		JSONObject json=new JSONObject();
		json.put("createdBy", "MD NOUSHAD ANSARI");
		json.put("projectName", "Orange 2.0.1");
		json.put("status", "active");
		json.put("teamSize", 3);
		
		given().contentType(ContentType.JSON).body(json).
		
		       when().post("http://49.249.28.218:8091/addProject").
		       
		           then().
		                assertThat().statusCode(201).
		                
		                 log().all();
		
	

		
		
	}
}

