package src.com.selenium.test;

import org.testng.annotations.Test;
import src.com.selenium.pageObjects.GmailAccountPage;
import src.com.selenium.pageObjects.GmailVerifyAccountPage;

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
        GmailVerifyAccountPage gmailVerifyAccountPage = new GmailVerifyAccountPage(driver);
        gmailVerifyAccountPage.verifyAccount(envProps.getProperty("gmail.phonenumber"));
    }

    @Test
    public void completeAccount(){

    }
}
