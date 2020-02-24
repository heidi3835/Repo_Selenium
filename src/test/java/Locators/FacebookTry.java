package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTry {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        //driver.manage().window().maximize();
        //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@Selenium");
        //driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
        //driver.findElement(By.id("/input[@id='u_0_b']")).click();
        //driver.findElement(By.xpath(" //a[contains(text(),'Forgot account?')]")).click();
       // driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Hayriye");
        //driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Ozsoy");
        //driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("987654321");
        //driver.findElement(By.xpath("/input[@id='u_0_w'") ).sendKeys("123");
        driver.findElement(By.xpath("//label[contains(text(),'Female')")).click();
        driver.findElement(By.xpath("//button[@id='u_0_13']")).click();
        //driver.close();

    }//input[@id='u_0_b']
}
