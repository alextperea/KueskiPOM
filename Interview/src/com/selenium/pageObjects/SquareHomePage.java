package src.com.selenium.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import src.com.selenium.Locators.Locators;

public class SquareHomePage extends PageBase {

    public SquareHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /**
     * WebElement Section
     */
    @FindBy(how = How.XPATH, using = Locators.SquareHomePage.START_ACCOUNT_BTN)
    WebElement startAccount;

    @FindBy(how = How.CLASS_NAME, using = Locators.SquareHomePage.SIGN_IN_BUTTON)
    WebElement signIn;

    /**
     * Automated Section
     */

    public void clickStartAccount(){
        waitAndclick(startAccount);
    }


}
