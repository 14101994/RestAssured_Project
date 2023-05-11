package APITesting;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAssured1 {

	public static void main(String[] args) {
		// Specify the base URI
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		//request specification of the request that we have to send to server
		RequestSpecification httpRequest = RestAssured.given();
		
		//then we have to pass the request type
		Response resp = httpRequest.request(Method.GET);

		//get status code
		int statuscode  =resp.getStatusCode();
		System.out.println(statuscode);
		
		//get body
		String body =  resp.getBody().asString();
		System.out.println(body);
	}

}
