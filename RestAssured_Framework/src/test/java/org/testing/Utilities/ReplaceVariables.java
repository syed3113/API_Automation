package org.testing.Utilities;

import java.util.regex.Pattern;

public class ReplaceVariables {

	public static String replaceVariable(String body,String searchVariable,String insertVariable)
	{
		
		body=body.replaceAll(Pattern.quote("{{"+ searchVariable +"}}"), insertVariable);
		System.out.println(body);
		return body;
		
	}
	
	
	
}
