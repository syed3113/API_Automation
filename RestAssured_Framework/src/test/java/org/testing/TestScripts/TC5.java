package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC5 {
	
	@Test
	public void tc5() throws IOException
	{
		Properties pr = PropertiesFileLoad.propertiesload();
		
		HTTPMethods http = new HTTPMethods(pr);
		
		Response res = http.deleteRequest("QA_URI_DELETE");
		
		System.out.println("Response:-"+res.asString());
		
		System.out.println("Response Code:-"+res.getStatusCode());
		
		
	}

}
