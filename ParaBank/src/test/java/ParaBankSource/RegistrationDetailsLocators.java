package ParaBankSource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationDetailsLocators {
	@FindBy(xpath="//input[@id='customer.firstName']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='customer.lastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='customer.address.street']")
	WebElement street;
	@FindBy(xpath="//input[@id='customer.address.city']")
	WebElement city;
	@FindBy(xpath="//input[@id='customer.address.state']")
	WebElement state;
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	WebElement zipcode;
	@FindBy(xpath="//input[@id='customer.phoneNumber']")
	WebElement phoneNumber;
	@FindBy(xpath="//input[@id='customer.ssn']")
	WebElement ssn;
	@FindBy(xpath="//input[@id='customer.username']")
	WebElement username;
	@FindBy(xpath="//input[@id='customer.password']")
	WebElement password;
	@FindBy(xpath="//input[@id='repeatedPassword']")
	WebElement confirmP;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement register;
    @FindBy(xpath="//h1[@class='title']")
    WebElement confirmation;
	
	

}
