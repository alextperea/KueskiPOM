package src.com.selenium.Endpoints;


import io.restassured.RestAssured;
import io.restassured.http.Header;
import org.testng.annotations.Test;
import src.com.selenium.resources.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static src.com.selenium.test.Setup.envProps;

public class EndpointTest extends BaseEndpoint {

    public EndpointTest(Properties props) {
        super(props);
    }

    @Test
    public void getAuth(){

        RestAssured.baseURI = envProps.getProperty("test.baseUri");

        String accessToken = given()
                .headers(Utils.getBasicHeaders())
                .body()
    }


}
