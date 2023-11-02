package OrangeHrmFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	@FindBy(xpath="//input[@name='username']")
	WebElement UserName;
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;

}
