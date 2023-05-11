package APITesting;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAssuredPut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type","application/json");
		
		JSONObject json = new JSONObject ();
		json.put("firstName", "miechal");
		json.put("lastName", "jakson");
		json.put("city", "banglore");
		
		httpRequest.body (json.toString());
		
		//tell put method where we want to do changes
		//here id=549 here we want to update changes
		Response resp =httpRequest.request(Method.PUT,"/549");
		
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getBody().asString());

	}

}
