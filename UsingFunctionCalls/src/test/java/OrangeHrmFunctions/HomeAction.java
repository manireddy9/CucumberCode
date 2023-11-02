package OrangeHrmFunctions;

import org.openqa.selenium.support.PageFactory;

public class HomeAction {
	HomeLocators objHome=null;
	public void HomeAction() {
		objHome=new HomeLocators();
		PageFactory.initElements(HelperClass.getDriver(),objHome);
	}
	public String check() {
		 return objHome.verfiy.getText();
	}

}
