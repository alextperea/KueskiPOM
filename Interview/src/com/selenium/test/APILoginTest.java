package src.com.selenium.test;

import org.testng.annotations.Test;
import src.com.selenium.Endpoints.MerchantEndpoint;

public class APILoginTest extends Setup {

    @Test
    public void getAuthToken(){

        driver.get(envProps.getProperty("test.clipURL"));
        MerchantEndpoint.getAuth(envProps.getProperty("test.user"));


    }
}
