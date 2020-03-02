package Hotels.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import test_scripts.DriverWrapper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectCurMonth extends DriverWrapper {
    @Test

    public void SelectCurMonth () throws InterruptedException {
        HotelLandingPage hotelLandingPage = new HotelLandingPage();
        //hotelLandingPage.ClickOnPoup();
        Thread.sleep(2000);
        hotelLandingPage.clickOnCheckIn();
        Thread.sleep(2000);


        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        Date date = new Date();
        String today = sdf.format(date);
        System.out.println("Current month : " + today);
        Thread.sleep(3000);
        String month =  getDriver().findElement(By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//div[1]")).getText();

        //String mont = hotelLandingPage.selectMonthText();
        System.out.println("Display month : " + month);

        if(!(today.equals(month))){
            System.out.println("Months are not equal ");
           // hotelLandingPage.clickOnBack();
        }else{
            System.out.println("Months are equal ");
        }

    }
    }

