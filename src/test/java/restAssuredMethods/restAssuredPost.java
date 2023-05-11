package restAssuredMethods;

import org.json.simple.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class restAssuredPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI=("https://reqres.in/api/users");
	 	RequestSpecification httpRequest= RestAssured.given();
	 	httpRequest.header("Content-Type","application/json");
	 	JSONObject json = new JSONObject();
	 	json.put("fname", "akshay");
	 	json.put("lname", "zagade");
	 	json.put("id", 123);
	 	httpRequest.body( json.toString());
	 	Response resp = httpRequest.post("/3");
	 	
	 	//we can use below line also instead of above line
	 	//just add /3 in baseURI after users
	 	//Response resp = httpRequest.request(Method.POST);
	 	System.out.println(resp.getStatusCode());
	 	System.out.println( resp.getStatusLine());
	 	ResponseBody body= resp.getBody();
	 	System.out.println(body.asString());
	 	Headers allHeader = resp.headers();
		for(Header abc:allHeader) {
			System.out.println(abc);
		}
	}
}
