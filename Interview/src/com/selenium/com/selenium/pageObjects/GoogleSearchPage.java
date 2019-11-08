package com.selenium.pageObjects;

import Locators.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage extends PageBase{

    public GoogleSearchPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CLASS_NAME, using = Locators.GoogleLocators.SEARCH_TXT)
    WebElement textBox;

    @FindBy(how = How.CLASS_NAME, using = Locators.GoogleLocators.SEARCH_BTN)
    WebElement searchButton;


    public void typeSearch(String text){
        type(textBox, text);
    }

    public void clickSearch(){
        click(searchButton);
    }

    public void goTo(String url){
        driver.get(url);
    }

}
