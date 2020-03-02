package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class HotelDateVerify extends DriverWrapper {
    @Test
     public void alertButton() throws InterruptedException {
        getDriver().findElement(By.xpath("//button[@class='cta widget-overlay-close']")).click();
        getDriver().findElement(By.id("widget-query-label-1")).click();
        getDriver().findElement(By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//button[1]")).click();

            SimpleDateFormat sdf = new SimpleDateFormat("d");
            Date date = new Date();
            String today = sdf.format(date);
            Thread.sleep(3000);
            getDriver().findElement(By.xpath("//input[@id='qf-0q-localised-check-in']")).click();
            List<WebElement> days = getDriver().findElements(By.xpath("(//div[contains(@class,'datepicker-bd')])[1]//td//a"));
            for (WebElement day : days) {
                System.out.println(day.getText());
                if (day.getText().equals(today)) {
                    day.click();
                    Thread.sleep(2000);
                    break;
                }
            }
        }


    }

