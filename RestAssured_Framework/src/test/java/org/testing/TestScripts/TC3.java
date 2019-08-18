package org.testing.TestScripts;



import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.BodyRead;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC3 {
	
	@Test
	public void tc3() throws IOException
	{
		
		String body = BodyRead.getBody("..//RestAssured_Framework//body.json");

		Properties pr = PropertiesFileLoad.propertiesload();
		
		HTTPMethods http= new HTTPMethods(pr);
		
		
		Response res = http.putRequest(body,"QA_URI_PUT");
		
		System.out.println("Data:-"+res.asString());
		
		
		
		
	}
	

}
