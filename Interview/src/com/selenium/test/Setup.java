package src.com.selenium.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import src.com.selenium.Config.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileReader;
import java.util.Properties;

public class Setup {

    protected WebDriver driver;
    public static Properties envProps;

    private final String PATH_TO_ENVIRONMENT    = "./src/com/selenium/resources/config.properties";

    @BeforeClass
    public void browserSetup() throws Exception {

        envProps = readEnvironmentData();
        readEnvironmentData();

        String browser = envProps.getProperty("test.browser");

        switch(browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get(envProps.getProperty("test.url"));
            break;
        }
    }

    private Properties readEnvironmentData() throws Exception{

        Properties prop = null;
        FileReader config = null;

        try{
            prop = new Properties();
            config = new FileReader(PATH_TO_ENVIRONMENT);

            prop.load(config);

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }finally {
            config.close();
        }

        return prop;
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
