package src.com.selenium.resources;

import io.restassured.http.Header;
import io.restassured.http.Headers;

import java.util.ArrayList;
import java.util.List;

public class Utils {

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
}
