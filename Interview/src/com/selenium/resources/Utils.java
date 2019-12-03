package src.com.selenium.resources;

import com.google.gson.JsonObject;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static src.com.selenium.test.Setup.envProps;

public class Utils {

    public static final String JSON_PATH = "./src/com/selenium/resources/JsonFiles/";

    public static List<Header> getLoginHeaders(){

        Header h1 = new Header("Accept", "application/vnd.com.payclip.v1+json");
        Header h2 = new Header("Content-Type", "application/json;charset=UTF-8");

        List<Header> headerList = new ArrayList<>();
        headerList.add(h1);
        headerList.add(h2);
        return headerList;
    }

    public static Headers getBasicHeaders(){
        return new Headers(getLoginHeaders());
    }

    public static String getMerchantAuthBody(String user){

        JSONObject jsonObject;
        jsonObject = getRawFile("AuthBody.json");

        jsonObject.put("email",user);
        jsonObject.put("password", envProps.getProperty("test.password"));

        return jsonObject.toJSONString();
    }


    public static JSONObject getRawFile(String fileName){
        JSONObject jsonObject = new JSONObject();

        try {
            FileReader reader = new FileReader(JSON_PATH + fileName);
            jsonObject = (JSONObject) new JSONParser().parse(reader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            return null;

        } catch (ParseException e) {
            return null;
        }

        return jsonObject;
    }



}
