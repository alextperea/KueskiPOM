package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BasePage {

	public GooglePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class = 'gLFyf gsfi']")
	WebElement textBox;
	@FindBy(xpath = "//div[@class = 'FPdoLc VlcLAe']/center/input[2]")
	WebElement searchButton;
	
	
	public void typeText(String text) {
		type(textBox, text);
	}
	
	public void clickSearchButton() {
		click(searchButton);
	}
	
	

}
