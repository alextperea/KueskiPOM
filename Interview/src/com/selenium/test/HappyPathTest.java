package src.com.selenium.test;

import org.testng.annotations.Test;
import src.com.selenium.pageObjects.SquareLoginPage;
import src.com.selenium.pageObjects.SquareMainPage;

public class HappyPathTest extends Setup{


    @Test()
    public void SquareAccountCreationTest(){

        SquareMainPage home = new SquareMainPage(driver);
        driver.get(envProps.getProperty("test.squareURL"));
        home.clickSignIn();

        SquareLoginPage login = new SquareLoginPage(driver);
        login.login(envProps.getProperty("test.user"), envProps.getProperty("test.password"));
    }

}
