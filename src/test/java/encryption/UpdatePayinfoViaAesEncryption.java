package encryption;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class UpdatePayinfoViaAesEncryption {

	@Test
	public void sampleTest() {

	    String jBody = "{ \"employee\": { \"empId\":\"NH_00245\", \"designation\": \"Architect\", \"dob\": \"20/01/1997\", \"email\": \"shivakumar@gmail.com\", \"empName\": \"user_783\", \"experience\": 3.4, \"mobileNo\": \"9876543219\", \"project\": \"Airtel_783\", \"role\": \"user\", \"username\": “user_783” }, \"basicPlusVda\": 1200, \"hra\": 3000, \"insurance\": 5000, \"lta\": 200, \"lwf\": 1200, \"netPay\": 5000, \"payroll_id\": 210, \"pf\": 100, \"pt\": 800, \"stat_bonus\": 1200, \"status\": “Disabled” }";
        
	     
		given()
              .body(jBody)

				.when()

				.put("http://49.249.28.218:8091/payroll")

				.then()

				.log().all();

	}

}
