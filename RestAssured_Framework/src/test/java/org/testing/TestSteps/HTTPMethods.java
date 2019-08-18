package org.testing.TestSteps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods {
	
	
	 Properties pr;
	 
	 public HTTPMethods(Properties pr) {
		 this.pr=pr;
		 }
	 
	
	
	public Response postRequest(String payload,String uri)
	{
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(payload)
		.when()
		.post(pr.getProperty(uri));
		return res;
		
		
		
	}
	
	
	public Response getRequest(String uri)
	{
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(uri));
				return res;
	}
	
	public Response putRequest(String body, String uri)
	{
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.put(pr.getProperty(uri));
		return res;
	}
	
	public Response deleteRequest(String uri)
	{
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(pr.getProperty(uri));
				return res;
	}
	
	
	
}
