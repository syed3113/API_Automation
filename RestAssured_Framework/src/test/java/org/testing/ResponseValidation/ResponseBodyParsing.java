package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseBodyParsing {
	
	
	public static String responseDataParsing(String path, Response res) {
		
		return res.jsonPath().get(path);
		
	}

}
