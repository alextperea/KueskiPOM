package com.selenium.test;

import org.testng.annotations.Test;
import com.selenium.pages.FacebookHomePage;
import com.selenium.pages.GooglePage;

import DataProvider.provider;



public class FacebookInvalidCredentials extends BaseTest {

	private static Logger logger = LogManager.getLogger(FacebookInvalidCredentials.class.getName());
	
	@Test(dataProvider = "Facebook InvalidData", dataProviderClass = provider.class)
	public void FacebookCredentialsTest(String googleSearch, String user, String password) {
		
		GooglePage google = new GooglePage(driver);
		google.typeText(googleSearch);
		google.clickSearchButton();
		
		FacebookHomePage face = new FacebookHomePage(driver);
		face.typeUser(user);
		face.typePassword(password);
		face.clickLogin();
		logger.info("test");
		
	}
	
	
}
