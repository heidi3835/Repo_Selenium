package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https:/www.facebook.com/");

       // driver.findElement(By.linkText("Data Policy")).click();
        //driver.close(); //parent window
        //driver.quit(); // child window

       // driver.findElement(By.partialLinkText("Data")).click();
       WebElement Usnm = driver.findElement(By.xpath("//input[@id='email']"));

       Usnm.sendKeys("WELCOME");
       String title = driver.getTitle();
        System.out.println("Title is :" + title);

        System.out.println(driver.getCurrentUrl());
        //driver.close();




    }
}
