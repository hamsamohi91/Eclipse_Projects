package com.singleton.pattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Data_Reader {

	public static Properties p;// null

	public Test_Data_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\welcome\\eclipse-workspace\\Project_Sept\\src\\main\\java\\com\\singleton\\pattern\\Test_Data.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String get_Browser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String get_Url() {
		String url = p.getProperty("url");
		return url;
	}

	public String get_H_Location() {
		String hlocation = p.getProperty("hlocation");
		return hlocation;
	}

	public String get_H_Name() {

		String hname = p.getProperty("hname");
		return hname;
	}

}
