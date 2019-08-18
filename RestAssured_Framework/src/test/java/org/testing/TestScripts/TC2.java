package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseParsing;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC2 {
	
	@Test
	public void tc2() throws IOException
	{
		
		Properties pr = PropertiesFileLoad.propertiesload();
		

		HTTPMethods http = new HTTPMethods(pr);
		
		Response res = http.getRequest("QA_URI");
		
		System.out.println("Data:-"+res.asString());
		
		ResponseValidation.responseStatusCodeValidation(200, res);
		
		
		  String v=ResponseParsing.ResponseDataParse(res.asString(), "posts","id","789","lastname"); 
		  System.out.println(v);
		 
		
	}

}
