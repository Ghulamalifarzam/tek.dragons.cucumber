package tek.dragons.cucumber.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class LoginSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	@Then("I click on sign in button")
	public void iClickOnSignInButton() {
		slowDown();
		waitTillClickable(factory.loginPage().signupBttn);
		click(factory.loginPage().signinBttn);
		logger.info("User clicked on signin button successfully");
	  	}
	@Then("I click on create new account button")
	public void iClickOnCreateNewAccountButton() {
		click(factory.loginPage().newAccountBttn);
		logger.info("User clicked on New Account Button Successfully");
	   
	}
	@Then("I enter {string} and {string} and {string} and {string}")
	public void iEnterAndAndAnd(String name, String email, String password, String confirmPass) {
		sendText(factory.loginPage().nameInputField, name);
		logger.info(name + ": user name was entered successfully");
		sendText(factory.loginPage().emailInputField, email);
		logger.info(email + ": user email was entered successfully");
		sendText(factory.loginPage().passInputField, password);
		logger.info("Password was entered successfully");
		sendText(factory.loginPage().confirmPassInputField, confirmPass);
		logger.info("confirm password was entered successfully");
		
//		factory.loginpage().sendRegisterationInfo(name, email, password, confirmPass);
//		logger.info("User registration entered successfully");
 
	}
	@Then ("I click on signup button")
	public void iClickOnSignupButton() {
		click(factory.loginPage().signupBttn);
		logger.info("signup button was clicked successfully");
		
	}
	@Then ("I should see my profile page")
	public void iShouldSeeMyProfilPage() {
		slowDown();
		String expectedText = "Your Profile"; 
		String actualText = factory.loginPage().yourProfileText.getText();
		Assert.assertEquals(expectedText, actualText);
		logger.info(actualText + ": was verified successfully");
				
	}
}
