package common;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class BaseTest {

    private final static String selenideProperties = "configs/selenide.properties";

    @BeforeSuite
    static void setupSuite() {
        System.out.println("Before Suite");
        Configuration.remote = "http://localhost:4444/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeClass
    static void setupClass() {
        Properties props = new Properties();
        try (InputStream inputStream = BaseTest.class
                .getClassLoader()
                .getResourceAsStream(selenideProperties)) {
            props.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!props.isEmpty()) {
            for (Object propObj : props.keySet()) {
                String prop = String.valueOf(propObj);

                if (!System.getProperties().containsKey(prop)) {
                    System.setProperty(prop, props.getProperty(prop));
                }
            }
        }
    }

    @AfterClass
    static void cleanupClass() {
        if (WebDriverRunner.hasWebDriverStarted()) WebDriverRunner.closeWebDriver();
    }

    @BeforeTest
    protected void setupTest() {
    }

    @AfterTest
    protected void cleanupTest() {
        WebDriverRunner.closeWindow();
    }
}
