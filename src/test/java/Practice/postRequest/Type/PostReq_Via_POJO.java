package Practice.postRequest.Type;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import pojoclass.utility.ProjectPojo;

public class PostReq_Via_POJO {
  
	
	  @Test
		public void postRequestToServer() {
		  Random random=new Random(133);
		  int number=random.nextInt();
		  Faker fake=new Faker();
		  String ProjectName=fake.name().firstName();
		  /*
			JSONObject json=new JSONObject();
			json.put("createdBy", "MD NOUSHAD ANSARI");
			json.put("projectName", ProjectName);
			json.put("status", "active");
			json.put("teamSize", 3);
		  */
	      ProjectPojo pObj=new ProjectPojo(ProjectName,"Created","Noushad",3);
	     
			  given().contentType(ContentType.JSON).body(pObj)
			  
			      .when().post("http://49.249.28.218:8091/addProject").
			        
			      
			           then().
			              assertThat().statusCode(201).log().all();
			   
			    
			  
			  
			 
			
		}
	
}
