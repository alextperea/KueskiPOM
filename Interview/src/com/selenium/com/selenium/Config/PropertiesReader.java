package com.selenium.Config;

import java.io.*;
import java.util.Properties;

public class PropertiesReader {

    public static Properties readProperties() throws Exception {

        FileReader propertyFile = null;
        java.util.Properties properties;

        properties = new Properties();

        try {
            propertyFile = new FileReader("com/selenium/resources/config.properties");
            properties.load(propertyFile);

        } catch (Exception e) {
            throw new Exception("Error while setting up environment properties.");
        } finally {
            propertyFile.close();
        }

        return properties;
    }
}
