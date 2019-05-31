package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chromedriver", "/Applications/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
