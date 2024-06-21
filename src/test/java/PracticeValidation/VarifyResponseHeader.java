package PracticeValidation;

import static io.restassured.RestAssured.get;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class VarifyResponseHeader {

	
	@Test
	 public void verifyHeadder() {
		Response response=get("http://49.249.28.218:8091/projects");
		response.then().log().all();
		response.then().assertThat().contentType(ContentType.JSON);
		response.then().assertThat().statusCode(200);
		response.then().assertThat().statusLine("HTTP/1.1 200 ");
		response.then().assertThat().header("Connection", "keep-alive");
	 }
}
