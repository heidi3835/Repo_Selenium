package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeEx {
        WebDriver driver;

        public void launchBrowser() {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://in.ebay.com/");
        }
        public void searchProduckt() throws InterruptedException {
            Thread.sleep(2000);
            driver.findElement(By.id("gh-ac")).sendKeys("JBL Speaker");
            driver.findElement(By.id("gh-btn")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Daily Deals")).click();

        }
        public void navigate() throws InterruptedException {
            Thread.sleep(2000);
            driver.navigate().to("https:/www.simplilearn.com/");
            Thread.sleep(3000);
            driver.navigate().back();
            System.out.println("Title of this page is : " + driver.getTitle());

        }

        public void closeBrowser (){
            driver.quit();

        }

    public static void main(String[] args) throws InterruptedException {
            YouTubeEx obj = new YouTubeEx();
            obj.launchBrowser();
            obj.searchProduckt();
            obj.navigate();
            obj.closeBrowser();


    }
}
