package Practice.postRequest.Type;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostReq_Via_JSONFile {
    @Test
	public void postRequestToServer() {
    	File fileobject=new File("./Jsonfile.json");
		  given().contentType(ContentType.JSON).body(fileobject)
		  
		      .when().post("http://49.249.28.218:8091/addProject").
		        
		      
		           then().
		              assertThat().statusCode(201).log().all();
		   
		    
	}
}
