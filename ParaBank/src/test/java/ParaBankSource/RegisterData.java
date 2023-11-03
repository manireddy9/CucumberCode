package ParaBankSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RegisterData {
	String path,fname,lname,address,city,state,zip,phone,ssn,username,password,confirm;
	public void register() {
		File file=new File("src\\test\\resources\\Data.properties");
		FileInputStream fileInput = null;
		try {
			fileInput =  new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	   Properties prop = new Properties();
	    try {
	    	prop.load(fileInput);
	    }catch (IOException e) {
	    	e.printStackTrace();
	    }
	   path=prop.getProperty("url");
	  
	   fname=prop.getProperty("firstname");
	   lname=prop.getProperty("lastname");
	   address=prop.getProperty("address");
	   city=prop.getProperty("city");
	   state=prop.getProperty("state");
	   zip=prop.getProperty("zip");
	   phone=prop.getProperty("phone");
	   ssn=prop.getProperty("SSN");
	   username=prop.getProperty("Username");
	   password=prop.getProperty("Password");
	   confirm=prop.getProperty("Confirm");
	   
	   

	}

}
