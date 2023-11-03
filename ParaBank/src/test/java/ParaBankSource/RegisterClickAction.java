package ParaBankSource;

import org.openqa.selenium.support.PageFactory;

public class RegisterClickAction {
	RegisterClick objregisterclick=null;
	public void RegisterClickAction() {
		objregisterclick=new RegisterClick();
		PageFactory.initElements(HelperClass.getDriver(), objregisterclick);
	}
	public void registerclick() {
		objregisterclick.registerclick.click();
	}

}
