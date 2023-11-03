package ParaBankSource;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefParaBank {
	RegisterData objdata=new RegisterData();
	RegistrationDetailsAction objdetails= new RegistrationDetailsAction();
	RegisterClickAction objregister=new RegisterClickAction();
	
	

	@Given("User navigate to ParabankPage")
	public void user_navigate_to_parabank_page() {
	   HelperClass.OpenPage(objdata.path);
	}

	@When("User Navigate to registeration Page")
	public void user_navigate_to_registeration_page() {
		objregister.registerclick();
		
	   
	}

	@When("user enters the required details")
	public void user_enters_the_required_details() {
	    //Here we need to registration actions like username password and other rest of things
		objdetails.Register(objdata.fname,objdata.lname,objdata.address,objdata.city,objdata.state,objdata.zip,objdata.phone,objdata.ssn,objdata.username,objdata.password,objdata.confirm);
	}

	@When("user clicks the register")
	public void user_clicks_the_register() {
	    objdetails.reg1();
	}

	@Then("Register must be Succesful")
	public void register_must_be_succesful() {
		String  confirm=objdetails.confirm1();
		Assert.assertEquals(confirm.contains(objdata.fname), "you landed on the correctpage");
	}


}
