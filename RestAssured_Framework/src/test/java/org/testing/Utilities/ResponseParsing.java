package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class ResponseParsing {

	public static String ResponseDataParse(String Responsejson,String object,String searchKey,String searchValue,String item)
	{
		JSONObject js = new JSONObject(Responsejson);
		JSONArray arrayy=js.getJSONArray(object);
		
		int l = arrayy.length();
		JSONObject ff =null;
		
		for(int i=0;i<l;i++)
		{
			
			 ff = arrayy.getJSONObject(i);
			
			if(ff.get(searchKey).equals(searchValue))   
			{
				break;
			}
			
			
		}
		return ff.get(item).toString();// item that I need
	}
}
