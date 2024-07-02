package TypesOfParameter;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class QueryParamTest {

	  @Test
	  public void sampleTest() {
		  given().queryParam("teamSize", 10).log().all().
		      
		      when().get("http://49.249.28.218:8091/project"). 
		          
		            then().log().all();
	 }
}
/*
 * get("http://49.249.28.218:8091/project?projectId=NH_PROJ_595").
 * 
 * get("http://49.249.28.218:8091/project?teamSize=10").
 * 
 * 
 */
