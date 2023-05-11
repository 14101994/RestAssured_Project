package APITestingTestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.baseClassAPI;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class demo1 extends baseClassAPI{
	

	RequestSpecification httpRequest ;
	Response resp ;
	@BeforeClass
	public void setUp() {
		RestAssured.baseURI=prop.getProperty("url");
		httpRequest = RestAssured.given();
		resp = httpRequest.request(Method.GET,"/2");
		// here /2 is a id number which is after the url, but in future
		//it can change so better write it in resp method
	}
	
	@Test(priority=1)
	public void validateResponseCode() {
		int actualStatusCode = resp.getStatusCode();
		Assert.assertEquals(actualStatusCode,200);
	}
	
	@Test(priority=2)
	public void validateResponseBody() {
		String actualBody= resp.getBody().asString();
		boolean firstName = actualBody.contains("Janet");
		Assert.assertEquals(firstName, true);
	}
	
/*	@Test
	public void validateKeyValue() {
		Headers header = resp.getHeaders();
		
		for (Header actualValues:header) {
			System.out.println(actualValues.getName()+"::"+actualValues.getValue());
		}
	}		*/
	
	@Test(priority=3)
	public void validateContentType() {
		String actualContentType= resp.header("Content-Type");
		Assert.assertEquals(actualContentType, "application/json; charset=utf-8");
	}

}
