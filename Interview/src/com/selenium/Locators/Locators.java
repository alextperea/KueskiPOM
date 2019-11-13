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
        public static final String START_ACCOUNT_BTN    = "//div[@data-entry-id='74vkmLx5EmjRT3unfDppLc']"; // xpath
        public static final String SIGN_IN_BUTTON       = "//div[@data-entry-id='3hu11eu2OBxRl3pBHRSdSc']"; // xpath
    }

    public class SquareLoginPage{
        public static final String EMAIL_TXT            = "email";      // id
        public static final String PASSWORD_TXT         = "password";   // id
        public static final String SIGN_IN_BTN          = "sign-in-button"; // id
    }

}
