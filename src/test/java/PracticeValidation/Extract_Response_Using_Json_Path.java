package PracticeValidation;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class Extract_Response_Using_Json_Path {
    
	@Test
	public void sampleTest() {
		Response response = given().
			    
			    
		         when().get("http://49.249.28.218:8091/projects-paginated");
		         response.then().log().all();
		         
		         ArrayList<Object> list=JsonPath.read(response.asString(),"content[*].projectName");  //jsonpath navigate response.asstring and capture data base xpatyh
	   // System.out.println(list);
		         for(Object obj:list) {
		        	 System.out.println(obj);
		         }
	
	
	}
}
