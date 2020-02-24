package TestCaseExmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https:/facebook.com/");
        WebElement day = driver.findElement(By.id("month"));
        Select d1 =new Select(day);

        d1.selectByIndex(1);
        //d1.selectByValue("2");
        //d1.selectByVisibleText("Day");
        System.out.println(day.getAttribute("value"));

        //##################################################
        List<WebElement> dd =d1.getOptions();
        System.out.println(dd.size());

        for (int i = 0; i< dd.size(); i++){
            String txt = dd.get(i).getText();
            System.out.println(txt);
            dd.get(i).click();
        }
    }
}
