package src.com.selenium.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import src.com.selenium.Locators.Locators;

public class GmailVerifyAccountPage extends PageBase {

    public GmailVerifyAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /**
     * Web Element Section
     */
    @FindBy(how = How.ID, using = Locators.GmailVerifyAccountPage.PHONE_TXT )
    WebElement phoneNumber;
    @FindBy(how = How.ID, using = Locators.GmailVerifyAccountPage.NEXT_BTN)
    WebElement nextButton;

    /**
     * Automated Section
     */
    public void verifyAccount(String number){
        type(phoneNumber, number);
        waitAndclick(nextButton);
    }
}
