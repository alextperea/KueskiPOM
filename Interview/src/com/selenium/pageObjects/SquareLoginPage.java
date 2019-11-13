package src.com.selenium.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import src.com.selenium.Locators.Locators;

public class SquareLoginPage extends PageBase {


    public SquareLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /**
     * WebElement Section
     */
    @FindBy(how = How.ID, using = Locators.SquareLoginPage.EMAIL_TXT)
    WebElement email;
    @FindBy(how = How.ID, using = Locators.SquareLoginPage.PASSWORD_TXT)
    WebElement password;
    @FindBy(how = How.ID, using = Locators.SquareLoginPage.SIGN_IN_BTN)
    WebElement signIn;

    /**
     * Automated Section
     */

    public void login(String user, String pass){
        type(email, user);
        type(password, pass);
        waitAndclick(signIn);
    }

}
