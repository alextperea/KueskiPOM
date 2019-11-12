package com.selenium.test;

import com.selenium.pageObjects.FacebookPage;
import com.selenium.pageObjects.GoogleSearchPage;
import org.testng.annotations.Test;

public class HappyPathTest extends Setup{


    @Test()
    public void facebookLogin(){

        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.goTo(envProps.getProperty("test.url"));
        googleSearchPage.typeSearch(envProps.getProperty("test.search"));
        googleSearchPage.clickSearch();

        FacebookPage facebookPage = new FacebookPage(driver);
        facebookPage.clickLinkToPage();
        facebookPage.typeEmail(envProps.getProperty("test.user"));
        facebookPage.typePassword(envProps.getProperty("test.password"));
        facebookPage.clickLogin();
    }

}
