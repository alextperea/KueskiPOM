package src.com.selenium.Locators;

public class Locators {

    public class GoogleLocators{
        public static final String SEARCH_TXT           = "//input[@class='gLFyf gsfi' and contains(@name,'q')]";  // xpath
        public static final String SEARCH_BTN           = "gNO89b";      // class name
    }

    public class FacebookLocators{
        public static final String LINK_TO_HOME_PAGE    = "TbwUpd";      // class name
        public static final String EMAIL_TXT            = "email";        // id
        public static final String PASS_TXT             = "pass";         // id
        public static final String LOGIN_BTN            = "loginbutton";  // id
    }

    public class SquareHomePage{
        public static final String START_ACCOUNT_BTN    = "//div[@class='column'/div/a[0]]";      // class name
        public static final String SIGN_IN_BUTTON       = "display-inline-block"; // class name
    }
}
