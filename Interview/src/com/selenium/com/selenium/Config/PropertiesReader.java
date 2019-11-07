package com.selenium.Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    public static Properties readProperties() {
        Properties prop = null;
        try {
            InputStream input = new FileInputStream("com/selenium/resources/config.properties");
            prop = new Properties();
            prop.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }
}
