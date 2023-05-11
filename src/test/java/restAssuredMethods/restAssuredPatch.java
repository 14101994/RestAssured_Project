package restAssuredMethods;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAssuredPatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification httpRequest= RestAssured.given();
		//httpRequest.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("username", "snakeprince");
		httpRequest.body(json.toString());
		Response resp = httpRequest.patch("/User");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		String body = resp.getBody().asString();
		System.out.println(body);
		Headers allHeader = resp.getHeaders();
		for(Header abc:allHeader) {
			System.out.println(abc);
		}
		

	}

}
