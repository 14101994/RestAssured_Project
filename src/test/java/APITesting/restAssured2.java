  package APITesting;

import org.json.simple.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class restAssured2 {

	public static void main(String[] args) {
		// specify the base URI
		/*	RestAssured.baseURI="https://reqres.in/api/users?page=2";
		
		//Request specification of the request that we have to send to server
		RequestSpecification httpRequest = RestAssured.given();
		
		//now we have to pass the request type
		Response resp = httpRequest.request(Method.GET);
		
	     int statusCode =	resp.getStatusCode();
	     System.out.println(statusCode);

	     String body = resp.getBody().asString();
	     System.out.println(body);
	}

	*/

	RestAssured.baseURI="https://reqres.in/api/users?page=2";
    RequestSpecification request = RestAssured.given(); 
    JSONObject requestParams = new JSONObject();
    requestParams.put("userName", "test_rest");
    requestParams.put("password", "Testrest@123"); 
    request.body(requestParams.toJSONString());
    Response response = request.put("/User"); 
    ResponseBody body = response.getBody();
    System.out.println(response.getStatusLine());
    System.out.println(body.asString());
	
	
	}
}
