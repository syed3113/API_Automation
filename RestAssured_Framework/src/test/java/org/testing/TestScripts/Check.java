package org.testing.TestScripts;

import org.testing.Utilities.ResponseParsing;
import org.testng.annotations.Test;

public class Check {
	
	@Test
	public void tc3()
	{
		String body="{\r\n" + 
				"  \"posts\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 1,\r\n" + 
				"      \"title\": \"json-server\",\r\n" + 
				"      \"author\": \"typicode\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 3,\r\n" + 
				"      \"name\": \"Ali\",\r\n" + 
				"      \"author\": \"Syed\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2,\r\n" + 
				"      \"name\": \"Ali\",\r\n" + 
				"      \"author\": \"Ahtisham\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 6,\r\n" + 
				"      \"author\": \"Syed\",\r\n" + 
				"      \"name\": \"Ahtisham\",\r\n" + 
				"      \"adress\": {\r\n" + 
				"        \"landmark\": \"Tender Heart School\",\r\n" + 
				"        \"sector\": 62,\r\n" + 
				"        \"houseNumber\": 18\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 4,\r\n" + 
				"      \"author\": \"Syed\",\r\n" + 
				"      \"name\": \"Ahtisham\",\r\n" + 
				"      \"adress\": {\r\n" + 
				"        \"landmark\": \"Tender Heart School\",\r\n" + 
				"        \"sector\": 62,\r\n" + 
				"        \"houseNumber\": 18\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 5,\r\n" + 
				"      \"author\": \"Syed\",\r\n" + 
				"      \"name\": \"Ahtisham\",\r\n" + 
				"      \"address\": {\r\n" + 
				"        \"landmark\": \"Tender Heart School\",\r\n" + 
				"        \"sector\": 62,\r\n" + 
				"        \"houseNumber\": 18\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 7,\r\n" + 
				"      \"author\": \"Syed\",\r\n" + 
				"      \"name\": \"Ahtisham\",\r\n" + 
				"      \"address\": {\r\n" + 
				"        \"landmark\": \"Tender Heart School\",\r\n" + 
				"        \"sector\": 62,\r\n" + 
				"        \"houseNumber\": 18\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 8,\r\n" + 
				"      \"author\": \"Syed\",\r\n" + 
				"      \"name\": \"Ahtisham\",\r\n" + 
				"      \"address\": {\r\n" + 
				"        \"landmark\": \"Tender Heart School\",\r\n" + 
				"        \"sector\": 62,\r\n" + 
				"        \"houseNumber\": 18\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 9,\r\n" + 
				"      \"author\": \"Syed\",\r\n" + 
				"      \"name\": \"Ahtisham\",\r\n" + 
				"      \"address\": {\r\n" + 
				"        \"landmark\": \"Tender Heart School\",\r\n" + 
				"        \"sector\": 62,\r\n" + 
				"        \"houseNumber\": 18\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 11,\r\n" + 
				"      \"author\": \"Aligarh\",\r\n" + 
				"      \"name\": \"Ahti\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"landmark\": \"Ghaffar\",\r\n" + 
				"          \"sector\": 44,\r\n" + 
				"          \"houseNumber\": 20\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"landmark\": \"ILQA\",\r\n" + 
				"          \"sector\": 40,\r\n" + 
				"          \"houseNumber\": 21\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 10,\r\n" + 
				"      \"author\": \"Aligarh\",\r\n" + 
				"      \"name\": \"Ahti\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"landmark\": \"Ghaffar\",\r\n" + 
				"          \"sector\": 44,\r\n" + 
				"          \"houseNumber\": 20\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"landmark\": \"ILQA\",\r\n" + 
				"          \"sector\": 40,\r\n" + 
				"          \"houseNumber\": 21\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 12,\r\n" + 
				"      \"name\": \"ABC\",\r\n" + 
				"      \"author\": \"XYZ\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 13,\r\n" + 
				"      \"name\": \"ABC1\",\r\n" + 
				"      \"author\": \"XYZ1\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 14,\r\n" + 
				"      \"name\": \"ABC1\",\r\n" + 
				"      \"author\": \"XYZ1\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 15,\r\n" + 
				"      \"name\": \"ABC1\",\r\n" + 
				"      \"author\": \"XYZ1\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 16,\r\n" + 
				"      \"name\": \"ABC1\",\r\n" + 
				"      \"author\": \"XYZ1\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 17,\r\n" + 
				"      \"author\": \"XYZ\",\r\n" + 
				"      \"name\": \"AS\",\r\n" + 
				"      \"address\": {\r\n" + 
				"        \"houseNumber\": 11,\r\n" + 
				"        \"sector\": 44,\r\n" + 
				"        \"landmark\": \"AXSZ\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 18\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"19\",\r\n" + 
				"      \"name\": \"Sana\",\r\n" + 
				"      \"company\": \"Vizag\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"231\",\r\n" + 
				"      \"name\": \"Mobiles\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": {\r\n" + 
				"        \"houseno\": \"652\",\r\n" + 
				"        \"wardno\": \"121\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"707\",\r\n" + 
				"      \"firstname\": \"Alig\",\r\n" + 
				"      \"lastname\": \"UP\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardno\": \"10\",\r\n" + 
				"          \"houseno\": \"652AI\",\r\n" + 
				"          \"sector\": \"29\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"708\",\r\n" + 
				"      \"firstname\": \"Alig\",\r\n" + 
				"      \"lastname\": \"UP\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardno\": \"10\",\r\n" + 
				"          \"houseno\": \"652AI\",\r\n" + 
				"          \"sector\": \"29\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"709\",\r\n" + 
				"      \"firstname\": \"Alig\",\r\n" + 
				"      \"lastname\": \"UP\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardno\": \"10\",\r\n" + 
				"          \"houseno\": \"652AI\",\r\n" + 
				"          \"sector\": \"29\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"719\",\r\n" + 
				"      \"firstname\": \"Alig\",\r\n" + 
				"      \"lastname\": \"UP\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardno\": \"10\",\r\n" + 
				"          \"houseno\": \"652AI\",\r\n" + 
				"          \"sector\": \"29\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"7203peO\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"729\",\r\n" + 
				"      \"firstname\": \"Alig\",\r\n" + 
				"      \"lastname\": \"UP\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardno\": \"10\",\r\n" + 
				"          \"houseno\": \"652AI\",\r\n" + 
				"          \"sector\": \"29\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"739\",\r\n" + 
				"      \"firstname\": \"Alig\",\r\n" + 
				"      \"lastname\": \"UP\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardno\": \"10\",\r\n" + 
				"          \"houseno\": \"652AI\",\r\n" + 
				"          \"sector\": \"29\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"749\",\r\n" + 
				"      \"firstname\": \"Alig\",\r\n" + 
				"      \"lastname\": \"UP\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardno\": \"10\",\r\n" + 
				"          \"houseno\": \"652AI\",\r\n" + 
				"          \"sector\": \"29\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"759\",\r\n" + 
				"      \"firstname\": \"Alig\",\r\n" + 
				"      \"lastname\": \"UP\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardno\": \"10\",\r\n" + 
				"          \"houseno\": \"652AI\",\r\n" + 
				"          \"sector\": \"29\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"769\",\r\n" + 
				"      \"firstname\": \"Alig\",\r\n" + 
				"      \"lastname\": \"UP\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardno\": \"10\",\r\n" + 
				"          \"houseno\": \"652AI\",\r\n" + 
				"          \"sector\": \"29\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"779\",\r\n" + 
				"      \"firstname\": \"Alig\",\r\n" + 
				"      \"lastname\": \"UP\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardno\": \"10\",\r\n" + 
				"          \"houseno\": \"652AI\",\r\n" + 
				"          \"sector\": \"29\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"789\",\r\n" + 
				"      \"firstname\": \"Alig\",\r\n" + 
				"      \"lastname\": \"UP\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardno\": \"10\",\r\n" + 
				"          \"houseno\": \"652AI\",\r\n" + 
				"          \"sector\": \"29\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"799\",\r\n" + 
				"      \"firstname\": \"Alig\",\r\n" + 
				"      \"lastname\": \"UP\",\r\n" + 
				"      \"company\": \"91mobiles\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardno\": \"10\",\r\n" + 
				"          \"houseno\": \"652AI\",\r\n" + 
				"          \"sector\": \"29\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"901\",\r\n" + 
				"      \"fname\": \"Ali\",\r\n" + 
				"      \"lname\": \"Aligarh\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"801\",\r\n" + 
				"      \"fname\": \"ABC\",\r\n" + 
				"      \"lname\": \"XYZ\",\r\n" + 
				"      \"address\": {\r\n" + 
				"        \"wardno\": \"1\",\r\n" + 
				"        \"landmark\": \"ILQA\"\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"comments\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 1,\r\n" + 
				"      \"body\": \"some comment\",\r\n" + 
				"      \"postId\": 1\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"profile\": {\r\n" + 
				"    \"name\": \"typicode\"\r\n" + 
				"  }\r\n" + 
				"}";
		
		String v=ResponseParsing.ResponseDataParse(body, "posts", "id","789","lastname");
		System.out.println(v);
		
	}

}
