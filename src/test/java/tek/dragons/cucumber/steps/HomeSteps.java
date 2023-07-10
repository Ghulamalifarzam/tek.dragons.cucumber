package tek.dragons.cucumber.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Given("User is on retail website home page")
	public void userIsOnRetailWebsteHOmePage() {
		Assert.assertTrue(factory.homePage().tekschoolLogo.isDisplayed());
		logger.info("Tekschool logo is present");
	}
	@Then("User verify retail website title")
	public void userVerifyRetailWebsiteTitle() {
	   String expectedTitle = "React App";
	   String actualTitle = getTitle();
	   Assert.assertEquals(expectedTitle, actualTitle);
	   logger.info("Expected and Actual Page Title are the Same " + actualTitle);
	}
	@When("User changes category to {string}")
	public void userChangesCategoryTo(String string) {
		slowDown();
		click(factory.homePage().allDepartments);
		selectByVisibleText(factory.homePage().allDepartments, string);
		logger.info(string + ": Selected from dropdown");
	   
	}
	@When("User enter item name {string}")
	public void userEnterItemName(String string) {
		sendText(factory.homePage().searchTExtBox, string);
		logger.info(string + ": value was entered successfully");
	}
	@When("User click on search button")
	public void userClickOnSearchButton() {
		click(factory.homePage().searchBttn);
		logger.info("Search button was clicked successfully");
	   
	}
	@Then("Item should be present on the page")
	public void itemShouldBePresentOnThePage() {
	// Assert.assertTrue(factory.homePage().playStationItem.isDisplayed());
	 Assert.assertTrue(isElementDisplayed(factory.homePage().playStationItem));
	 logger.info("Item is present");
	}
	@Then("User see the title {string}")
	public void userSeeTheTitle(String string) {
	   Assert.assertTrue(isElementDisplayed(factory.homePage().shotbyCattitle));
	   logger.info(string + ": is present");
}
}
