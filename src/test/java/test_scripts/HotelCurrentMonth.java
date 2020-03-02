package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelCurrentMonth extends DriverWrapper {
    @Test
    public void getCurrentMonth() throws InterruptedException {
        getDriver().findElement(By.xpath("//button[@class='cta widget-overlay-close']")).click();
        getDriver().findElement(By.id("widget-query-label-1")).click();
        //getDriver().findElement(By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//button[1]")).click();

        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        Date date = new Date();
        String today = sdf.format(date);
        System.out.println("Current month : " + today);
        Thread.sleep(3000);
        String mont =  getDriver().findElement(By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//div[1]")).getText();
        System.out.println("Display month : " + mont);

        if(!(today.equals(mont))){
            System.out.println("Months are not equal ");
            getDriver().findElement(By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//button[1]")).click();
        }else{
            System.out.println("I hate java ");
        }

    }
}