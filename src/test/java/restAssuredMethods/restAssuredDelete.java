package restAssuredMethods;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAssuredDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/api/users/2";
		RequestSpecification request= RestAssured.given();
		
		Response resp = request.request(Method.DELETE);
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getStatusCode());
		
	
	/*	for(int i=1; i<10; i++)
		{
		String a = Integer.toString(i);
		Response resp = request.request(Method.DELETE,a);
		System.out.println (resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getBody().asString());
		}
*/
	

	}

}
