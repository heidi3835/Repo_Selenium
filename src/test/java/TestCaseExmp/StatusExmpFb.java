package TestCaseExmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusExmpFb {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https:/facebook.com/");

       // WebElement img = driver.findElement(By.xpath("//h2[@class='_8est']"));
        //System.out.println(img.isDisplayed());
       // System.out.println(img.isEnabled());
       // System.out.println(img.isSelected());

        //##################################

        //WebElement userName = driver.findElement(By.id("email"));
        //userName.sendKeys("welcome");
        //Thread.sleep(2000);
        //userName.clear();
        //userName.sendKeys("aaa@gmailcom");

        //#####################################

        WebElement userN = driver.findElement(By.id("email"));
        userN.sendKeys("pass");

        WebElement Pwd = driver.findElement(By.name("pass"));
        Pwd.sendKeys("test");

        //driver.findElement(By.linkText("Forgotten account")).click(); // complete liktext
        driver.findElement(By.partialLinkText("Forgotten")).click();









    }
}
