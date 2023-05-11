package restAssuredMethods;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAssuredGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://reqres.in/api/users/2";
		RequestSpecification httpRequest = RestAssured.given();
		Response resp = httpRequest.request(Method.GET);
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		String body= resp.getBody().asString();
		System.out.println(body);
		Assert.assertEquals(body.contains("Janet"), true);
		System.out.println("====pass===");

	}

}
