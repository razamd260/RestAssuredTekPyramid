package PracticeValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class VarifyResponseBody_Vai_JsonPath {

	
	@Test
	 public void sampleTest() {
		   Response response = given().
		    
		    
		         when().get("http://49.249.28.218:8091/projects-paginated");
		         response.then().log().all();
		         JsonPath jPath = response.jsonPath();
//		         System.err.println(jPath.get("numberOfElements"));
//		         System.out.println(jPath.get("pageable.sort.unsorted"));
//		         System.out.println(jPath.get("content.projectId"));
		         
		         
		         
		         ///////////////Check Madi////////////
		         ArrayList<String> list = jPath.get("content.projectId");   //get("content[*].projectId") can not use  
		
		        	 System.out.println(list);

		         
		         ////////////////////////
		         //response.then().assertThat().body("content[0].projectId", Matchers.equalTo("NH_PROJ_470"));
		         response.then().assertThat().body("pageable.sort.unsorted", Matchers.equalTo(true));
		         response.then().assertThat().body("numberOfElements", Matchers.greaterThanOrEqualTo(20));
		              
		               
	 }
}
