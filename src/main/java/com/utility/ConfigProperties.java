package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	
	public static String getValue(String value ) {
		
		File file = new File("C:\\Users\\User\\eclipse-workspace\\automation-exercise\\Config.properties");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			//Auto-generated catch block
			e1.printStackTrace();
		}
		
		Properties ps = new Properties();
		try {
			ps.load(fis);
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
		
		String prop=ps.getProperty(value);
		System.out.println(ps.getProperty(value));
		
		return prop;
		
	}

	  
	  }


