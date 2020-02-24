package Advatage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//button[@id='u_0_13']")).click();
        Thread.sleep(1500);

        String txt = driver.switchTo().alert().getText();
        System.out.println(txt);

        if (txt.contentEquals("please selecet start place")) {
            driver.switchTo().alert().accept();
            System.out.println("correct alert appread");
        } else {
            System.out.println("invalid alert");
            driver.close();
        }

    }

    }

