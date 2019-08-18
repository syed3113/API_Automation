package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseValidation {
	
	public static void responseStatusCodeValidation(int ExpectedStatusCode,Response res)
	{
		
		Assert.assertEquals(ExpectedStatusCode, res.getStatusCode());
		
		
	}

}
