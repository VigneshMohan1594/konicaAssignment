package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ebayHomePage {

	static WebDriver driver;





	@FindBy(xpath = "//input[contains(@aria-label,'Search for anything')]")
	private WebElement searchField;




	@FindBy(xpath = "(//div[@class='srp-river-results clearfix']//a/h3[@class='s-item__title'])[1]")
	private WebElement firstResult;




	public ebayHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public void setSearchField(WebElement searchField) {
		this.searchField = searchField;
	}

	public WebElement getFirstResult() {
		return firstResult;
	}

	public void setFirstResult(WebElement firstResult) {
		this.firstResult = firstResult;
	}








}
