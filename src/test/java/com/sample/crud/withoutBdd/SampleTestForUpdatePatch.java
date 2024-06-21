package com.sample.crud.withoutBdd;

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
		
		RequestSpecification request =RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(json);
		Response response=request.patch("http://49.249.28.218:8091/project/NH_PROJ_268");
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		
		
	}
   
}
