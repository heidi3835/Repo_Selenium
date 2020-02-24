package TestCaseExmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https:/facebook.com/");

        List<WebElement> gender = driver.findElements(By.name("sex"));

       int cnt = gender.size();
        System.out.println(cnt);

        //##################################

        for(int i =0; i<cnt ; i++){
            String txt = gender.get(i).getText();
            System.out.println(txt);

            gender.get(i).click();
            Thread.sleep(1000);

        }



    }
}
