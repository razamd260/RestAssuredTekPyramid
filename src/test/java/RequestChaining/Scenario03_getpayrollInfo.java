package RequestChaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Scenario03_getpayrollInfo {

	
	@Test
	   public void sampleTest() {
		/*
		 * API-1 get Authentication
		 */
		Response res=given().
		     formParam("client_id", "ninza-client").
		     formParam("client_secret", "gPQBf1Yxew5OMccMhzos1GefIyiSnXzM").
		     formParam("grant_type", "client_credentials").
		    when().post("http://49.249.28.218:8180/auth/realms/ninza/protocol/apenid-connect/token");
		     res. then().log().all();
		
	/*
	 * capture the token from the response	
	 */
	    String token=res.jsonPath().get("access_token");
	    
	    /*
	     * Get the all inforamtion of payroll
	     */
		   given().auth().oauth2(token).
		       when().get("http://49.249.28.218:8091/admin/payrolls").
		           
		            then().log().all();
	   }
}
