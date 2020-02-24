package Advatage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https:/www.amazon.com/");

        Actions act = new Actions(driver);

        WebElement signing = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));

        //### doubleclick
        //act.moveToElement(signing).doubleClick().perform();
        //act.doubleClick(signing).build().perform();

        //##move
        //act.moveToElement(signing).contextClick().build().perform();
        act.contextClick(signing).perform();


    }
}
