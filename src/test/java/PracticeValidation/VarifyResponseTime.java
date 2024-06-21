package PracticeValidation;

import static io.restassured.RestAssured.get;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class VarifyResponseTime {

	
	@Test
	 public void verifyHeadder() {
		Response response=get("http://49.249.28.218:8091/projects");
		response.then().log().all();
		response.then().assertThat().contentType(ContentType.JSON);
		response.then().assertThat().statusCode(200);
		response.then().assertThat().statusLine("HTTP/1.1 200 ");
	     long timetaken=response.time();
	     long timetakeninsecond=response.timeIn(TimeUnit.SECONDS);
	     System.out.println(timetaken);
	     System.out.println(timetakeninsecond);
	     
	     response.then().assertThat().time(Matchers.lessThan(2000L));
	     response.then().assertThat().time(Matchers.greaterThan(200L));
	     
	     response.then().assertThat().time(Matchers.both(Matchers.lessThan(2000l)).and(Matchers.greaterThan(100L)));
	 }
}
