package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabClassPrac {
    public static void main(String[] args) {
        //#!
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.darksky.net");

        //#2
        By feelsLikeLocator = By.xpath("//span[@class='low-temp-text']");
        WebElement feelsLike = driver.findElement(feelsLikeLocator);
        String feelsLikeTmep = feelsLike.getText(); //14

        By LowLocator = By.className("low-temp-text");
        WebElement low = driver.findElement(LowLocator);
        String lowTemp = low.getText();

        By highLocator = By.className("high-temp-text");
        WebElement high = driver.findElement(highLocator);
        String highTemp = high.getText();

        String val = "14";
        int valInt = Integer.valueOf(val);

         driver.quit();








    }
}
