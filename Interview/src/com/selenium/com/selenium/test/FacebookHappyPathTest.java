package com.selenium.test;

import org.testng.annotations.Test;

import com.selenium.pages.FacebookHomePage;
import com.selenium.pages.GooglePage;

import DataProvider.provider;

public class FacebookHappyPathTest extends BaseTest{

	@Test(dataProvider = "Facebook Credentials", dataProviderClass = provider.class)
	public void validCredentials(String text1, String text2, String text3) {
		
		GooglePage google = new GooglePage(driver);
		google.typeText(text1);
		google.clickSearchButton();
		
		FacebookHomePage face = new FacebookHomePage(driver);
		face.typeUser(text2);
		face.typePassword(text3);
		face.clickLogin();
	}
}
