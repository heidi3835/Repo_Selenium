package Trial;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class First {
    public static void main(String[] args) {
        // Set driver
       System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
       // init webdriver object
        WebDriver driver = new ChromeDriver();
        // set url
        String url = "https://wwww.facebook.com/";
        //navigate to the url
        driver.navigate().to(url);
        // get current url
        String currentUrl = driver.getCurrentUrl();
        // verify if url is correct
        Assert.assertEquals(currentUrl,url);
        // quit the browser
        driver.quit();





    }
}
