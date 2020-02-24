package TestCaseExmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTry {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        //driver.get("https:/google.com/");
        driver.navigate().to("https:/www.google.com/"); // both are correct to use

        driver.findElement(By.linkText("Images")).click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("Back Done....");

        driver.navigate().forward();
        Thread.sleep(2000);
        System.out.println();

        driver.navigate().refresh();
        System.out.println("Refresh Done...");



    }
}
