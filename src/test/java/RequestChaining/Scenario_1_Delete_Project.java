package RequestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclass.utility.ProjectPojo;

public class Scenario_1_Delete_Project {
  
	
	  @Test
		public void postRequestToServer() {
		  Random random=new Random(1333);
		  int number=random.nextInt();
		  /*
		   * Api-1 ==> add project in side server
		   */
	      ProjectPojo pObj=new ProjectPojo("Airtel_ "+number,"Created","Deepak023",19);
	      Response res = given().contentType(ContentType.JSON).body(pObj)
			      .when().post("http://49.249.28.218:8091/addProject");
			         res.then().
			              assertThat().statusCode(201).log().all();
			   
			    /*
			     * Capture project or data the before Response
			     */
			  
			  String ProjectID=res.jsonPath().get("projectId");
			  
			  /*
			   * Api-2 Delete Project
			   */
			  Response res1 = given().contentType(ContentType.JSON).body(pObj)
				      .when().delete("http://49.249.28.218:8091/project/"+ProjectID);
			  res1.then().log().all();
			 
			
		}
	
}
