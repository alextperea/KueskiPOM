package com.selenium.test;

import com.selenium.pageObjects.GoogleSearchPage;
import org.testng.annotations.Test;

public class HappyPathTest extends Setup{


    @Test()
    public void facebookLogin(){

        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.goTo(envProps.getProperty("test.url"));
        googleSearchPage.typeSearch(envProps.getProperty("test.search"));
    }

}
