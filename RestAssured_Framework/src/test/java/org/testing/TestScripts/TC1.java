package org.testing.TestScripts;



import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseBodyParsing;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.BodyRead;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseParsing;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC1 {
	
	@Test
	public void tc1() throws IOException
	{
		
		
		String body = BodyRead.getBody("..//RestAssured_Framework//body.json");
		Properties pr = PropertiesFileLoad.propertiesload();
		
		HTTPMethods http = new HTTPMethods(pr);
		
		Response res = http.postRequest(body, "QA_URI");
		
		ResponseValidation.responseStatusCodeValidation(201, res);
		//Response res = http.getRequest("QA_URI");
	String id=	ResponseBodyParsing.responseDataParsing("id", res);// 1st way to extract from Json
	System.out.println(res.asString());
	System.out.println(id);
	
	
	//2nd way to extract from Json file
	
	ResponseParsing.ResponseDataParse(res.asString(),"posts","id","707","company");
	
	
		
	}

}
