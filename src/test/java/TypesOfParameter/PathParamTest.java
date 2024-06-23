package TypesOfParameter;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PathParamTest {

	  @Test
	  public void sampleTest() {
		  given().contentType(ContentType.JSON).pathParam("projectId", "NH_PROJ_595").
		      
		      when().get("http://49.249.28.218:8091/project/{projectId}"). 
		          
		            then().log().all();
	 }
}
