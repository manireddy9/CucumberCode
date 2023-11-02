Feature: Try the login the OrangeHRM page
 
Scenario: User try to the OrangeHRM file using valid credentials
 
	Given User providing url of orangehrm
	When User providing valid username and valid password with the valaues
	When  User clicking then  login button and successfully logging
	Then Check sucessfully created