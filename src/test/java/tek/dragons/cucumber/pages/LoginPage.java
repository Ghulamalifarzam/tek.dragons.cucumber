package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class LoginPage extends BaseSetup{
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "signinLink")
	public WebElement signinBttn;
	
	@FindBy(id = "newAccountBtn")
	public WebElement newAccountBttn;
	
	@FindBy(id = "nameInput")
	public WebElement nameInputField;
	
	@FindBy(id = "emailInput")
	public WebElement emailInputField;
	
	@FindBy(id = "passwordInput")
	public WebElement passInputField;
	
	@FindBy(id = "passwordInput")
	public WebElement confirmPassInputField;
	
	@FindBy(id = "signupBtn")
	public WebElement signupBttn;
	
	@FindBy(xpath = "//h1[text()='Your Profile']")
	public WebElement yourProfileText;
	
	
	
//	public void sendRegisterationInfo(String name, String email, String pass, String confirmPass) {
//		nameInputField.sendKeys(name);
//		emailInputField.sendKeys(email);
//		passInputField.sendKeys(pass);
//		confirmPassInputField.sendKeys(confirmPass);
	}
	


