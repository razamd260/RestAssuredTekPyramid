package PracticeValidation;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;
import junit.framework.Assert;

public class VerifyData_complexJsonxpath {
     @Test
	public void sampleTest() {
    	 Response response = given().
    			    
    			    
		         when().get("http://49.249.28.218:8091/projects-paginated");
		         response.then().log().all();
		         
		         ArrayList<String> list=JsonPath.read(response.asString(),"content[*].projectName");  
		        // System.out.println(list);
		         for(String str:list) {
		        	 System.out.println(str);
		         }
		         
		         ArrayList<String> list1=JsonPath.read(response.asString(),"content[*].[?(@.projectName=='Orange_005')].projectId"); 
		         
		         /*
		          * noushad Your self Only
		          */
		         
		         ArrayList<String> list2=JsonPath.read(response.asString(),"content[*].[?(@.projectName=='Orange_005')]");
		         System.out.println("Noushad Check Madi  : "+list2);
		         
		         System.out.println(list1.get(0));
		         String actualprojectId=list1.get(0);
		         Assert.assertEquals(actualprojectId, "NH_PROJ_472");
		         
		         
		         /*
		          * extract firstprojectId
		          * Db Validation
		          * request chaining
		          */
		         
		         
		         
	}
}
