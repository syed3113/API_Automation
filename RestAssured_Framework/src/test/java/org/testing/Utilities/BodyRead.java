package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class BodyRead {
	
	public static String getBody(String Filepath) throws FileNotFoundException
	{
		
		File f = new File(Filepath);
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject j = new JSONObject(jt);
		return j.toString();
		
		
	}

}
