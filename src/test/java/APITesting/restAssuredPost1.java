package APITesting;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class restAssuredPost1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		
		//Response resp = httpRequest.request(Method.POST);
		json.put("firstName", "Akshsay");
		json.put("lastName", "zagade123");
		httpRequest.body(json.toString());
		
	    Response response = httpRequest.post("/3"); 
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());

	}

}
