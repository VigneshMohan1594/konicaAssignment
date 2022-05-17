package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mailHomePage {

	static WebDriver driver;


	@FindBy(xpath = "//a[contains(@aria-label,'tester konica')]")
	private WebElement profileIcon;



	public mailHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}





	public WebElement getProfileIcon() {
		return profileIcon;
	}

	public void setProfileIcon(WebElement profileIcon) {
		this.profileIcon = profileIcon;
	}



}
