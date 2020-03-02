package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static java.lang.Thread.*;

public class NightStayVerify extends DriverWrapper{
    @Test

    public void nightStay() throws InterruptedException {
        getDriver().findElement(By.xpath("//button[@class='cta widget-overlay-close']")).click();
        getDriver().findElement(By.id("widget-query-label-1")).click();
        getDriver().findElement(By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//button[1]")).click();

        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd yyyy");
        Date date = new Date();
        String today = sdf.format(date);
        System.out.println("Today date is : " + today);
        Thread.sleep(3000);

        getDriver().findElement(By.xpath("//td[@class='widget-datepicker-today']")).click();
        //List<WebElement> tableRows = getDriver().findElements(By.xpath("//tr"));
        // for(WebElement row : tableRows){



         }


    }

