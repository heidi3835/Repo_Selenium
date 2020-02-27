package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;


public class AmazonTest extends DriverWrapper {
    @Test
    public void AmazonTest() throws InterruptedException {
        getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
        Thread.sleep(2000);

        Thread.sleep(1000);

        String price = getDriver().findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//span[@class='a-price']")).getText();
        System.out.print(price.substring(1, 4));
        String price2 = price.substring(1, 4);
        double priceForm = Double.parseDouble(price2);
        if (priceForm >= 50 && priceForm <= 95) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }


    }
}







