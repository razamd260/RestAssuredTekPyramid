package RequestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclass.utility.PojoClassOfScenario_2;
import pojoclass.utility.ProjectPojo;

public class Scenario_2_AddEmployeeToProject {
  
	
	  @Test
		public void scenario01() {
          Faker fake=new Faker();
          String ProjectName=fake.name().firstName();
          Random random=new Random();
          int Rnum=random.nextInt(123);
		  /*
		   * Api-1 ==> add project in side server
		   */
	      ProjectPojo pObj=new ProjectPojo(ProjectName,"Created","DeepakSir",10);
	      Response res = given().contentType(ContentType.JSON).body(pObj)
			      .when().post("http://49.249.28.218:8091/addProject");
			         res.then().
			              assertThat().statusCode(201).log().all();
			   
			    /*
			     * Capture project or data the before Response
			     */
			  
			  String projectName=res.jsonPath().get("projectName");
			  
			  /*
			   * Api-2 ==> add Employee to same Project
			   */
			 
			  PojoClassOfScenario_2 sce2=new PojoClassOfScenario_2("Architech", "24/04/1995", "noushad7@gmail.com", "user_"+Rnum, 18 ,"5429652678" , ProjectName,"ROLE_EMPLOYEE","user_"+Rnum);
			  Response res1 = given().contentType(ContentType.JSON).body(sce2)
				      .when().post("http://49.249.28.218:8091/employees");
			  res1.then().log().all();
			 
			
		}
	    
	
}
