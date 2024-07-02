package AuthTest;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class BearesTokenAuth2_0 {
 
	@Test
	public void SampleTest() {
		
		Response res=given().formParam("client_id", "ninza-client").
		formParam("client_secret", "gPQBf1Yxew5OMccMhzos1GefIyiSnXzM").
		formParam("grant_type", "client_credentials").
		  
		      when().post("http://49.249.28.218:8180/auth/realms/ninza/protocol/openid-connect/token");
		      
		             res.then().log().all();
		
		             //capture token from the respponse [Key Token
		
		String token=res.jsonPath().getString("access_token");
		given().auth().oauth2(token).log().all().
		   
		      when().get("http://49.249.28.218:8091/projects").
		         
		             then().log().all();
	}
}
//"access_token": "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJsZUN3YUNPai00RXVlbzJkTFFrTmZuLXh2M0F3Nm5ZdWZtS0pINXBFWkNNIn0.eyJleHAiOjE3MTkzMTAyNjEsImlhdCI6MTcxOTMwODQ2MSwianRpIjoiYWVjODA3ZGYtODNhYS00YWYyLTk1MmEtMzQ4ZmU3ZTA5ZTg5IiwiaXNzIjoiaHR0cDovLzQ5LjI0OS4yOC4yMTg6ODE4MC9hdXRoL3JlYWxtcy9uaW56YSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjZTg3NTllNC03ZjhlLTQ4YmEtOGU3My05MjJkZmQ2MDBlYWMiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJuaW56YS1jbGllbnQiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbImh0dHA6Ly80OS4yNDkuMjguMjE4OjgwOTEiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbImRlZmF1bHQtcm9sZXMtbmluemEiLCJvZmZsaW5lX2FjY2VzcyIsImFkbWluIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6ImVtYWlsIHByb2ZpbGUiLCJjbGllbnRIb3N0IjoiMTAuMTAuMjAuMSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiY2xpZW50SWQiOiJuaW56YS1jbGllbnQiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJzZXJ2aWNlLWFjY291bnQtbmluemEtY2xpZW50IiwiY2xpZW50QWRkcmVzcyI6IjEwLjEwLjIwLjEifQ.HkYziiXPUYhwlxXYZ8B2s6MCRBuBtExYjrbDKX4C0TFVilQjDTr-r7aaQQcSFoGdqx0x5tTaFSUJ2xHJTpKoiKkIjTgEwOtTmMdLEaGJQZreTohxG25Hz4T2V9ubp3ufe3IhxCJfryKVauENFakg1ygfOXtbwPhVB7R6-v_z5h44If5gtQT3rM33gC0U6kMACu1gZFjt2vQ6PY3RBlO6st5pd9RYsV3cGfI-ZHjX-SavYhMbPCmjKHgARg92kYpxn0qwFpB2hJrbfFjJkHL8dgmcltzpEytjiyDTmiyVYGQPtIdvRqsMve1fVusSaaXFcMKysvdDlbZgsL5s9yUi1A",
//"expires_in": 1800,