package APITesting;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class restAssuredPost2 {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification httpRequest =  RestAssured.given();
		httpRequest.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("firstname", "chetan");
		json.put("lastname","mohite");
		httpRequest.body( json.toString());
	
		Response resp = httpRequest.request(Method.POST);
		
		System.out.println(resp.getStatusCode());
		ResponseBody body = resp.getBody();
		System.out.println(body.asString());
	}

}
