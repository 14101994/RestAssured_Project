package APITesting;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://reqres.in/api/users/3";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("firstname", "jenet");
		json.put("lastname", "Dsouza");
		json.put("id", 111);
		httpRequest.body(json.toString());
		
		Response resp = httpRequest.request(Method.PUT);
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getBody().asString());

	}

}
