package org.testing.TestScripts;


import java.io.FileNotFoundException;

import org.testing.Utilities.BodyRead;
import org.testing.Utilities.ReplaceVariables;
import org.testng.annotations.Test;



public class TC6 {
	
	
	@Test
	public void tc6() throws FileNotFoundException
	{
		String body = BodyRead.getBody("..//RestAssured_Framework//body1.json");
		String b= ReplaceVariables.replaceVariable(body, "firstname", "Ahtisham");
		System.out.println("TC6:-"+b);
		
		
		
		
	}

}
