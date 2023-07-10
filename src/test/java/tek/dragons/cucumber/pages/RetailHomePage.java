package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement tekschoolLogo;

	@FindBy(id = "signinLink")
	public WebElement signinLinkOption;
	
	@FindBy(linkText = "Account")
	public WebElement AccountField;
	
	@FindBy(linkText = "Orders")
	public WebElement OrdersField;
	
	@FindBy(id = "logoutBtn")
	public WebElement logoutBtnField;

}
