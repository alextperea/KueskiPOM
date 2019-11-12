package src.com.selenium.pageObjects;

import src.com.selenium.Locators.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import src.com.selenium.Locators.Locators;

public class FacebookPage extends PageBase {


    public FacebookPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CLASS_NAME, using = Locators.FacebookLocators.LINK_TO_HOME_PAGE)
    WebElement linkToHomePage;

    @FindBy(how = How.ID, using = Locators.FacebookLocators.EMAIL_TXT)
    WebElement email;

    @FindBy(how = How.ID, using = Locators.FacebookLocators.PASS_TXT)
    WebElement password;

    @FindBy(how = How.ID, using = Locators.FacebookLocators.LOGIN_BTN)
    WebElement loginButton;

    public void clickLinkToPage(){
        waitAndclick(linkToHomePage);
    }

    public void typeEmail(String text){
        type(email, text);
    }

    public void typePassword(String text){
        type(password, text);
    }

    public void clickLogin(){
        waitAndclick(loginButton);
    }

}
