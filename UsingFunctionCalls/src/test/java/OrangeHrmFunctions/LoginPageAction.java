package OrangeHrmFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

public class LoginPageAction {
	LoginPageLocators objlocator=null;
	String username1,password1;
	public void LoginpageAction() {
		this.objlocator=new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), objlocator);
	}
	public void Username(String user) {
		objlocator.UserName.sendKeys(user);
		
	}
	public void PassWord(String pass) {
		objlocator.Password.sendKeys(pass);
	}
	public void Click() {
		objlocator.submit.click();
	}
	public void Login(String username,String Password) {
		Username(username);
		PassWord(Password);
	}


}