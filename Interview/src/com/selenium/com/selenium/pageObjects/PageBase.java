package com.selenium.pageObjects;

import com.selenium.test.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class PageBase {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Properties props;
    protected Actions action;


    public PageBase(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        action = new Actions(this.driver);
        props = Setup.envProps;
    }

    public void waitAndclick(WebElement element){
        try{
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void type(WebElement element, String text){
        try{
            wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
