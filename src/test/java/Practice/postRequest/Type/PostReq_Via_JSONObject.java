package Practice.postRequest.Type;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostReq_Via_JSONObject {
    
	@SuppressWarnings("unchecked")
	@Test
	public void postDataToServer() {
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
