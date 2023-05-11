package restAssuredMethods;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAssuredPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification httpRequest= RestAssured.given();
		JSONObject json = new JSONObject();
		json.put("username","admin");
		json.put("password", "admin123");
		httpRequest.body(json.toString());
		Response resp = httpRequest.put("/User");
		//Response resp =httpRequest.request(Method.PUT,"/User");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		String body= resp.getBody().asString();
		System.out.println(body);
	}
}
