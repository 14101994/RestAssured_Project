package APITesting;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class restAssured3 {
	
	public static void main(String[] args) {
		
	
	RestAssured.baseURI="https://reqres.in/api/users";
	RequestSpecification httpRequest = RestAssured.given();
	httpRequest.header("Content-Type","application/json");
	JSONObject json = new JSONObject();
	json.put("fname", "akshay");
	json.put("lname", "zagade");
	
	Response resp= httpRequest.post("/3");
	System.out.println(resp.getStatusCode());
	ResponseBody body= resp.getBody();
	System.out.println(body.asString());
	}
}
