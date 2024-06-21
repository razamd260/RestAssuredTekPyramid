package Practice.postRequest.Type;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import pojoclass.utility.ProjectPojo;

public class PostReq_Via_POJO {
  
	
	  @Test
		public void postRequestToServer() {
		  Random random=new Random(1333);
		  int number=random.nextInt();
		  
	      ProjectPojo pObj=new ProjectPojo("ABC_ "+number,"Created","Deepak023",19);
			  given().contentType(ContentType.JSON).body(pObj)
			  
			      .when().post("http://49.249.28.218:8091/addProject").
			        
			      
			           then().
			              assertThat().statusCode(201).log().all();
			   
			    
			  
			  
			 
			
		}
	
}
