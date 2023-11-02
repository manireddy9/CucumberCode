package OrangeHrmFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Utility {
	String username1;
	String password1;
	String path;
//	public Utility() {
//		Loginpage();
//	}
	public void Loginpage() {
		File file=new File("src\\test\\resources\\Features\\Data.properties");
		FileInputStream fileInput=null;
		try {
			fileInput=new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop=new Properties();
		try {
			prop.load(fileInput);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		path=prop.getProperty("url");
		username1=prop.getProperty("username");
		password1=prop.getProperty("password");
		
		
	}
}
