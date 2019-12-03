package src.com.selenium.test;

import org.testng.annotations.Test;
import src.com.selenium.pageObjects.GmailAccountPage;

public class GmailCreateAccountTest extends Setup {

    @Test
    public void createAccount(){

        driver.get(envProps.getProperty("test.gmailURL"));

        GmailAccountPage gmailAccountPage = new GmailAccountPage(driver);
        gmailAccountPage.createAccount(envProps.getProperty("gmail.user"),
                                       envProps.getProperty("gmail.lastname"),
                                       envProps.getProperty("gmail.username"),
                                       envProps.getProperty("gmail.password"),
                                       envProps.getProperty("gmail.password")
                                       );
    }
}
