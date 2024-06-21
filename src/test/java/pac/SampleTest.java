package pac;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTest {
   
	@Test
	public void SampleGetReqTest() {
		Response res = RestAssured.get("https://reqres.in/api/users");
		System.out.println(res.prettyPrint());
	}
}
