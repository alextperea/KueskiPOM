package src.com.selenium.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import src.com.selenium.Locators.Locators;

public class GmailAccountPage extends PageBase {

    public GmailAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /**
     * Web Element Section
     */
    @FindBy(how = How.ID, using = Locators.GmailAccountPage.FIRST_NAME_TXT)
    WebElement firstName;
    @FindBy(how = How.ID, using = Locators.GmailAccountPage.LAST_NAME_TXT)
    WebElement lastName;
    @FindBy(how = How.ID, using = Locators.GmailAccountPage.USER_NAME_TXT)
    WebElement userName;
    @FindBy(how = How.NAME, using = Locators.GmailAccountPage.PASSWORD_TXT)
    WebElement password;
    @FindBy(how = How.NAME, using = Locators.GmailAccountPage.CONFIRM_TXT)
    WebElement confirmPass;
    @FindBy(how = How.ID, using = Locators.GmailAccountPage.NEXT_BTN)
    WebElement nextButton;

    /**
     * Automated Section
     */
     public void createAccount(String name, String last, String user, String pass, String confirm){

         type(firstName, name);
         type(lastName, last);
         clearField(userName);
         type(userName, user);
         type(password, pass);
         type(confirmPass, confirm);
         waitAndclick(nextButton);
     }

}
