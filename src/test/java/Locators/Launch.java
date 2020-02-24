package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https:/www.facebook.com/");
        WebElement unm = driver.findElement(By.id("email"));
        unm.sendKeys("al@gmail.com");

        driver.findElement(By.name("pass")).sendKeys("test");
        driver.findElement(By.id("loginbutton")).click();






    }
}
