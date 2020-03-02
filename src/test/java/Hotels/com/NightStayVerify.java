package Hotels.com;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_scripts.DriverWrapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class NightStayVerify extends DriverWrapper {
    @Test
    public void tryhotel() throws InterruptedException {

        HotelLandingPage hotlanding = new HotelLandingPage();

        // poup up cancel it
        //hotlanding.ClickOnPoup();
        Thread.sleep(2000);
        hotlanding.clickOnCheckIn();
        Thread.sleep(2000);


        // Date format
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, 1);
        String newDate = dateFormat.format(cal.getTime());
        System.out.println("Check-in date as tomorrow date " + newDate);


        // Click on check in calender icon
        hotlanding.clickOnCheckIn();
        Thread.sleep(2000);
        // Check in date
        hotlanding.checkInDATE();
        Thread.sleep(2000);

        // Click on check out calender icon
        hotlanding.clickCalendarIcon();
        Thread.sleep(2000);
        // Check out date
        hotlanding.clickCheckOutDate();
        // Brief case night date
        String briefCase = getDriver().findElement(By.className("widget-query-num-nights")).getText();
        System.out.println("Stay nights :" + briefCase);

        Assert.assertEquals(briefCase, "7");


    }
}
