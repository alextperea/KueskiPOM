package com.selenium.test;

import com.selenium.Config.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.Properties;

public class Setup {

    protected WebDriver driver;

    @BeforeClass
    public void browserSetup(){

        Properties props = PropertiesReader.readProperties();
        System.setProperty("chrome.browser", props.getProperty("test.driver.location"));

        String browser = props.getProperty("test.driver");

        switch(browser){
            case "chrome": driver = new ChromeDriver();
            break;
        }
    }
}
