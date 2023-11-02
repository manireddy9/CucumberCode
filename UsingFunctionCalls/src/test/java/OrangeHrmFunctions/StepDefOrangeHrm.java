package OrangeHrmFunctions;

import org.testng.Assert;

import io.cucumber.java.en.*;

public class StepDefOrangeHrm {
	Utility util = new Utility();
	LoginPageAction log=new LoginPageAction();
	HomeAction home=new HomeAction();
	HelperClass helper;
//	@Given("User is on HRMLogin page {string}")
//	public void user_is_on_hrm_login_page(String url) {
//		HelperClass.OpenPage(util.path);
//	   
//	}
//
//	@When("User enters username as {string}")
//	public void user_enters_username_as(String username1) {
//	    log.Username(username1);
//	}
//
//	@When("User enters password as {string}")
//	public void user_enters_password_as(String password) {
//	 log.PassWord(password);
//	}
//
//	@When("User clicks login button")
//	public void user_clicks_login_button() {
//	    log.Click();
//	}
//
//	@Then("User should be able to login sucessfully")
//	public void user_should_be_able_to_login_sucessfully() {
//	  
//	}
	@Given("User providing url of orangehrm")
	public void user_providing_url_of_orangehrm() {
		HelperClass.OpenPage(util.path);
//		   
	}

	@When("User providing valid username and valid password with the valaues")
	public void user_providing_valid_username_and_valid_password_with_the_valaues() {
		log.Login(util.username1,util.password1);
	}

	@When("User clicking then  login button and successfully logging")
	public void user_clicking_then_login_button_and_successfully_logging() {
		log.Click();
	}

	@Then("Check sucessfully created")
	public void check_sucessfully_created() {
	    Assert.assertTrue(home.check().contains("Dashboard"));
	}

	

}
