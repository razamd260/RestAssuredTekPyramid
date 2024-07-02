package PackageName;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.RequestSender;

public class Run1_JacksonSerTest {
	
	@Test
	public void Test() {
		 RequestSender req = RestAssured.given();
		 RequestSpecification reqS=(RequestSpecification)req;
		 reqS.contentType(ContentType.JSON);
		 reqS.baseUri("https://reqres.in");
		 reqS.basePath("/api/users");
		 reqS.port(686);
		 reqS.post();
		 FilterableRequestSpecification reqF=(FilterableRequestSpecification) reqS;
		 System.out.println(reqF.getBasePath());
		 System.out.println(reqF.getBaseUri());
		 System.out.println(reqF.getContentType());
		 System.out.println(reqF.getMethod());
		 System.out.println(reqF.getPort());
		 
		
		              
	}
	  
}
//RequestSender rest =