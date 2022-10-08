package com.singleton.pattern;

import java.io.IOException;

public class File_Reader_Manager {

	private static File_Reader_Manager manager;//This is used because of the if statement

	private File_Reader_Manager() {
	}

	public static File_Reader_Manager get_Instance_FRM() {

		
//		File_Reader_Manager manager = new File_Reader_Manager();
//
//		return manager;

//or
		if (manager==null) {//to reduce memory wastage
			
		
		 manager = new File_Reader_Manager();
	
		}
		return manager;	
		
	}

	public Test_Data_Reader get_Instance_Reader() throws IOException {

		Test_Data_Reader reader = new Test_Data_Reader();

		return reader;
	}

}
