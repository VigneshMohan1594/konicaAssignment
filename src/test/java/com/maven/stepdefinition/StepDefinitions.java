package com.maven.stepdefinition;



import com.maven.pom.ebayHomePage;
import com.maven.pom.ebayProductDescPage;
import com.maven.pom.gmailLoginPage;
import com.maven.pom.mailHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.maven.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class StepDefinitions extends BaseClass {
	static WebDriver driver;

	@Given("^user prefers to launch chrome browser$")
	public void user_prefers_to_launch_chrome_browser() throws Throwable {
		driver = browserLaunch("chrome");

	}



	@Given("^User navigate to '(.*)' page$")
	public void user_navigate_to_https_www_imdb_com_title_tt_page(String arg1) throws Throwable {
		navigateTo(arg1);
	}


	@And("I enter the {string} and {string}")
	public void iEnterTheAnd(String username, String password) {

		gmailLoginPage objLoginPage = new gmailLoginPage(driver);
		objLoginPage.getUsername().sendKeys(username);

		objLoginPage.getNextBtn().click();


		objLoginPage.getPassword().sendKeys(password);

		objLoginPage.getPassword().sendKeys(Keys.ENTER);




	}

	@And("I validate the profile icon in HomePage")
	public void iValidateTheProfileIconInHomePage() {
		mailHomePage objMailHomePage = new mailHomePage(driver);
		boolean status = objMailHomePage.getProfileIcon().isDisplayed();

		System.out.println("Profile Image is displayed");
		Assert.assertTrue(status);

	}

	@And("{string} URL is launched in the chrome browser")
	public void urlIsLaunchedInTheChromeBrowser(String URL) throws Exception {

		launchURL(URL);
	}

	@And("I search for the {string}")
	public void iSearchForThe(String keyword) {

		ebayHomePage objEbayHomePage = new ebayHomePage(driver);

		objEbayHomePage.getSearchField().sendKeys(keyword);

		objEbayHomePage.getSearchField().sendKeys(Keys.ENTER);

	}

	@And("I open the first result from the search")
	public void iOpenTheFirstResultFromTheSearch() {
		ebayHomePage objEbayHomePage1 = new ebayHomePage(driver);

		objEbayHomePage1.getFirstResult().click();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));


	}

	@Then("I print the price of the first result")
	public void iPrintThePriceOfTheFirstResult() {
		ebayProductDescPage objEbayProdDescPage = new ebayProductDescPage(driver);

		System.out.println(	"The first result price is "+ objEbayProdDescPage.getPrice().getText());



	}

	@And("I Close the browser")
	public void iCloseTheBrowser() {
		driver.quit();
	}
}
