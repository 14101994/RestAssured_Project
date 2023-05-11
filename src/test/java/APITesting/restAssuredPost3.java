package APITesting;

import org.json.simple.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAssuredPost3 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		RestAssured.baseURI="https://api.dev.outmarch.io/forms/response/63b95718-1f65-401f-9848-c5257f9b9468";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type","application/json");
		httpRequest.header("Authorization","Bearer eyJraWQiOiJHd29FT0JcL3RRbko1MEp6cjhHbTdJd3lkdjNOYkFrOGZ0MWlLbk41M2hUST0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiI5NTRiNjdjZC02OTM5LTQyZGQtYTNkMy1jOGMxYzU3NmMyNzUiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImdlbmRlciI6Ik1hbGUiLCJpc3MiOiJodHRwczpcL1wvY29nbml0by1pZHAudXMtZWFzdC0xLmFtYXpvbmF3cy5jb21cL3VzLWVhc3QtMV9TTjB6dW01NHciLCJjb2duaXRvOnVzZXJuYW1lIjoidGhvbWFzLnBlcnJ5IiwicHJlZmVycmVkX3VzZXJuYW1lIjoidGhvbWFzLnBlcnJ5IiwiZ2l2ZW5fbmFtZSI6IlRob21hcyAoQ00pIiwicGljdHVyZSI6Imh0dHBzOlwvXC9kZXYtdGVuYW50LWRvY3VtZW50cy5zMy5hbWF6b25hd3MuY29tXC9oYXBweWhlZWxzXC91c2VyXC9iOTU2NTRiOC1jZTZiLTQwY2ItODNlYS0xYTk4NzE5NThiMGNfMTYxOTQzMjA0Mi5qcGVnIiwiY3VzdG9tOmxvY2F0aW9uIjoiRlIsUlMsQkwsQ00sa3V3YWl0LFRva3lvIiwiY3VzdG9tOnRlbmFudElkIjoiaGFwcHloZWVscyIsImF1ZCI6IjVrcmVlMzF1YzJ0OWplaWtxc2FuMnExMDV0IiwiZXZlbnRfaWQiOiI5Y2ZjNmRkOS0zZjIzLTRjY2EtYTYyYi00ZGYxYThiOWVjYzIiLCJjdXN0b206Y2F0ZWdvcnlJZCI6IlJldGFpbCBPcGVyYXRpb25zIiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2Nzc1OTA5NjUsIm5hbWUiOiJ0aG9tYXMucGVycnkiLCJleHAiOjE2Nzc1OTgxNjUsImN1c3RvbTpyb2xlIjoiU3RyX01nciIsImlhdCI6MTY3NzU5MDk2NSwiZmFtaWx5X25hbWUiOiJQZXJyeSIsImVtYWlsIjoiYWtzaGF5LnphZ2FkZUBvdXRtYXJjaC5pbyJ9.K66wYy8dmNcJRnkSsDpXEMaVFeO4v5-mtptavjf5bxaA5UDeAMW-bXy-rVa8PKwYrF9xnroSaPE3tRIG6MLOWSYlpGflfRKoaQxe3PWzWA7rQ8zl-fCKyRb3hNYS67iM9qcwEQQ2zgg0h3qQaGcUBriPXBxNDeO3n6dBF1W6tygj21BtlVShNZEdj0WWtMZrf2lU24rqxBinvE5X2Hok-eciR0ZVMSV5W7mCjqZ1V4pbTa8jXeTgXekVtASqbTdR5RmoGP7zEG39MNYVjVQizPEYmUJ2KeoPI5a6qVkeuV8MRTnnxRobDXZg10hqNvM5I3aklXVIt3_vI6aXISSePQ");
		JSONObject json = new JSONObject ();
		
	
		//json.put("body", "");
		//json.put("lastname", "rana");
		//json.put("city", "pune");
		httpRequest.body (json.toString());
		
		Response resp = httpRequest.request(Method.POST);
		
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getBody().asString());
		
		Headers allHeader = resp.headers();
		
		for(Header abc:allHeader) {
			System.out.println(abc);
		}	
		
//		System.out.println("==================================");
//
//		Assert.assertEquals(resp.getStatusCode(), 201);
//		Assert.assertEquals(resp.getStatusLine(), "HTTP/1.1 201 Created");
//		Assert.assertEquals(resp.getBody().asString().contains("navneet"), true);
	}

}
