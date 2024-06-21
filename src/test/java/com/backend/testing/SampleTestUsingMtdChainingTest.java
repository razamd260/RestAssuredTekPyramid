package com.backend.testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class SampleTestUsingMtdChainingTest {

	@Test
	public void getRequestTest() {
		// get("https://reqres.in/api/users").prettyPrint();
		
		get("https://reqres.in/api/users").then().log().all();
	}
}
