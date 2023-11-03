package ParaBankSource;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationDetailsAction {
 RegistrationDetailsLocators objregLoc=null;
 
 public void RegistrationDetailsAction() {
	 objregLoc=new RegistrationDetailsLocators();
	 PageFactory.initElements(HelperClass.getDriver(), objregLoc);
 }

 public void SetFirstname(String fname) {
	 objregLoc.firstname.sendKeys(fname);
 }
 public void SetLastname(String lname) {
	 objregLoc.lastname.sendKeys(lname);
 }
 public void setAddress(String address) {
	 objregLoc.street.sendKeys(address);
 }
 public void SetCity(String city) {
	 objregLoc.city.sendKeys(city);
 }
 public void SetState(String state) {
	 objregLoc.state.sendKeys(state);
 }
 public void  SetZipCode(String zip) {
	 objregLoc.zipcode.sendKeys(zip);
 }
 public void SetPhone(String phone) {
	 objregLoc.phoneNumber.sendKeys(phone);
 }
 public void SetSSn(String ssn) {
	 objregLoc.ssn.sendKeys(ssn);
 }
 public void SetUsername(String username) {
	 objregLoc.username.sendKeys(username);
 }
 public void SetPassword(String pass1) {
	 objregLoc.password.sendKeys(pass1);
 }
 public void SetConfirm(String confirm) {
	 objregLoc.confirmP.sendKeys(confirm);
 }
 public void reg1() {
	 objregLoc.register.click();
 }
 public String confirm1() {
	return objregLoc.confirmation.getText();
 }
 
 public void Register(String fname,String lname,String address,String city,String state,String zip,String phone,String ssn,String username,String pass1,String confirm) {
	
	 SetFirstname(fname);
	 SetLastname(lname);
	 setAddress(address);
	 SetCity(city);
	 SetState(state);
	 SetZipCode(zip);
	 SetPhone(phone);
	 SetSSn(ssn);
	 SetUsername(username);
	 SetPassword(pass1);
	 SetConfirm(confirm);
	  
	 
 }
}
