package PracticeValidation;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class Complex_JsonXpath_for_Dynamic_Response_Payload {
     
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
		         
		         ArrayList<String> list1=JsonPath.read(response.asString(),"content[*].[?(@.projectName=='Orange_005')].projectId");  //jsonpath navigate response.asstring and capture data base xpatyh
		    	 System.out.println(list1);
		    	 
		    	 String actualdata=list1.get(0);
		    	 Assert.assertEquals(actualdata,"NH_PROJ_472");
	
		    	 
		    	 //extract first project Id
		    	 
	}
}
