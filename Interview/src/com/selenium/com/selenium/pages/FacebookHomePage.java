package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage extends BasePage{

	public FacebookHomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id = 'email']")
	WebElement userBox;
	@FindBy(id = "pass")
	WebElement passwordBox;
	@FindBy(id = "loginbutton")
	WebElement loginButton;
	
	public void typeUser(String text) {
		type(userBox, text);
	}
	
	public void typePassword(String text) {
		type(passwordBox, text);
	}
	
	public void clickLogin() {
		click(loginButton);
	}
	
	public void getText() {
		getEementText(userBox);
	}
	

	
}
