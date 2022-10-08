package com.api.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON_Validation {

	public static void main(String[] args) throws IOException, ParseException {
		
		File f = new File("C:\\Users\\welcome\\eclipse-workspace\\Project_Oct_Cucumber\\src\\test\\java\\com\\api\\demo\\payload.json");
		
		FileReader reader = new FileReader(f);
		
	JSONParser jsonParser = new JSONParser();
		
	Object parse = jsonParser.parse(reader);
		
	JSONObject jsonObject = (JSONObject) parse;
	
	Object object = jsonObject.get("name");
	
	System.out.println(object.toString());
	

	Object object2 = jsonObject.get("age");
	
	System.out.println(object2.toString());

	}
	
	
	
	
}
