package test_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverWrapper {

    private static WebDriver driver;
    private static String url = "https://www.facebook.com/";
    private static String amazonUrl = "http://www.amazon.com/";
    private static String hotelUrl = "http://www.hotels.com/";

    @BeforeClass
    public void beforeClass() {
        //setChromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        //init webdriver object
        driver = new ChromeDriver();
        //navigate to the url
        //driver.navigate().to(url);
        driver.navigate().to(hotelUrl);

    }

    @AfterClass
    public void afterClass() {
        //quit the browser
       // driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String getUrl() {
        return url;
    }
}