package com.BaseLayer;

import java.io.FileInputStream;
import java.util.Properties;

public class baseClassAPI {
	public Properties prop ;
	
	public baseClassAPI(){
	
		prop = new Properties();
		
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin.DESKTOP-31QM75N\\eclipse-workspaceNew\\RestAssuredBasic\\src\\main\\java\\com\\ConfigLayer\\Config.properties");
		prop.load(fis);
		}
		
		catch(Exception e ) {
			e.printStackTrace();
		}
	}

}
