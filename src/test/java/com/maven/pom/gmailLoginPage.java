package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailLoginPage {

	static WebDriver driver;



	@FindBy(id = "identifierId")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextBtn;

	public WebElement getSecondNextBtn() {
		return secondNextBtn;
	}

	public void setSecondNextBtn(WebElement secondNextBtn) {
		this.secondNextBtn = secondNextBtn;
	}

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement secondNextBtn;

	public gmailLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	public void setNextBtn(WebElement nextBtn) {
		this.nextBtn = nextBtn;
	}




}
