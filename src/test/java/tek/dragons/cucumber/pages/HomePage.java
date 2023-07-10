package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class HomePage extends BaseSetup{
	
	//create a constructor 
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	/*
	 * instead of findElement() or findElements we use @FindBy annotation to find element or elements 
	 * @FindBy is a selenium annotation, it is used as alternative way to 
	 * findElement and FindElements
	 */
	@FindBy(linkText = "TEKSCHOOL")
	public WebElement tekschoolLogo;
	
	@FindBy(id = "search")
	public WebElement allDepartments;
	
	@FindBy(id = "searchInput")
	public WebElement searchTExtBox;
	
	@FindBy(id = "searchBtn")
	public WebElement searchBttn;
	
	@FindBy(xpath = "//img[@alt='PlayStation 5 Console']")
	public WebElement playStationItem;
	
	@FindBy(id = "categoryTitle")
	public WebElement shotbyCattitle;
	
	
	
	
}

	
	
	
	

