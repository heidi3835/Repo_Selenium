package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        String url = "https://wwww.facebook.com/";
        driver.navigate().to(url);

        By emailLocator = By.id("email");
        WebElement email = driver.findElement(emailLocator);
        email.sendKeys("abcd@test");

       // driver.findElement(By.id("")).sendKeys("");

        By passLocator = By.id("pass");
        WebElement password = driver.findElement(passLocator);
        password.sendKeys("test1234");


        By loginLocator = By.id("u_0_b");
        WebElement loginButton = driver.findElement(loginLocator);
        loginButton.click();
        driver.findElement(By.id("")).click();

        //By fNameLocator = By.name("input[@id='u_0_b");
        //WebElement fName = driver.findElement(fNameLocator);
        //fName.findElement(fNameLocator );
        //driver.findElement(By.name("Hayriye")).toString();




    }
}
