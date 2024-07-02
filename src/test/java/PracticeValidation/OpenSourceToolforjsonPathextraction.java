package PracticeValidation;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OpenSourceToolforjsonPathextraction {

	@Test
	public void ExtractVerify() {
		Response response = given().
			    
			    
		         when().get("http://49.249.28.218:8091/projects-paginated");
		         response.then().log().all();
		         JsonPath jPath = response.jsonPath();
		         
		        // response.then().assertThat().body("content[0].projectId", Matchers.equalTo("NH_PROJ_470"));
		         response.then().assertThat().body("pageable.sort.unsorted", Matchers.equalTo(true));
		         response.then().assertThat().body("numberOfElements", Matchers.greaterThanOrEqualTo(20));
		         
		         // Capture Multiple Element
		         
		         ArrayList<String> list =response.jsonPath().get("content.projectId");
		         System.out.println(list);
		         
		         
		         
		         
	}
}
