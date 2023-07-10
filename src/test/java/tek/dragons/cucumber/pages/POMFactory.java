package tek.dragons.cucumber.pages;

import tek.dragons.cucumber.base.BaseSetup;

public class POMFactory extends BaseSetup{
	
	private HomePage homePage;
	private LoginPage loginPage;
	
	
	
	public POMFactory() {
		this.homePage = new HomePage();
		this.loginPage = new LoginPage();
		
		
	}
	public HomePage homePage() {
		return this.homePage;
	}
	
	public LoginPage loginPage() {
		return this.loginPage();
	}
	
	
}
