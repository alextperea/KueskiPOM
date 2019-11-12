package src.com.selenium.test;

import src.com.selenium.pageObjects.FacebookPage;
import src.com.selenium.pageObjects.GoogleSearchPage;
import org.testng.annotations.Test;
import src.com.selenium.pageObjects.SquareHomePage;

public class HappyPathTest extends Setup{


    @Test()
    public void SquareAccountCreationTest(){

        SquareHomePage square = new SquareHomePage(driver);
        square.clickStartAccount();

    }

}
