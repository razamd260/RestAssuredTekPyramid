package Practice.postRequest.Type;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostReq_Via_HashMap {

	@SuppressWarnings("unchecked")
	@Test
	public void postDataToServer() {
		HashMap<Object, Object> json=new HashMap<Object, Object>();
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
