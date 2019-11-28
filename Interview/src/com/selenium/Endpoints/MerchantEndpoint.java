package src.com.selenium.Endpoints;


import io.restassured.RestAssured;
import io.restassured.http.Header;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import src.com.selenium.resources.Utils;

import java.util.Properties;

import static io.restassured.RestAssured.given;
import static src.com.selenium.test.Setup.envProps;

public class MerchantEndpoint extends BaseEndpoint {

    public MerchantEndpoint(Properties props) {
        super(props);
    }


    @Test
    public static void getAuth(String user){

        //RestAssured.baseURI = envProps.getProperty("test.baseUri");

        String accessToken = given()
                .headers(Utils.getBasicHeaders())
                .body(Utils.getMerchantAuthBody(user))
        .when()
                .post(envProps.getProperty("test.baseUri") + "/api/login")
        .then()
                .statusCode(HttpStatus.SC_OK)
        .extract()
                .path("access_token");

        envProps.setProperty("access_token", accessToken);
    }


}
