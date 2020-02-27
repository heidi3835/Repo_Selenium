package test_scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page_Object.LandingPage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class VerifyGetDate extends DriverWrapper {
    @Test

    public void VerifyGetDate() throws InterruptedException {
       //LandingPage landingPage = new LandingPage();
        getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
        String amazonDate = getDriver().findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//div[@class='rush-component']//div[@class='rush-component']//div[@class='s-include-content-margin s-border-bottom']//div[@class='a-section a-spacing-medium']//div[@class='sg-row']//div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-16-of-24 sg-col-12-of-20 sg-col-24-of-32 sg-col sg-col-28-of-36 sg-col-20-of-28']//div[@class='sg-col-inner']//div[@class='sg-row']//div[@class='sg-col-4-of-24 sg-col-4-of-12 sg-col-4-of-36 sg-col-4-of-28 sg-col-4-of-16 sg-col sg-col-4-of-20 sg-col-4-of-32']//div[@class='sg-col-inner']//div[@class='a-section a-spacing-none a-spacing-top-micro']//div[@class='a-row a-size-base a-color-secondary s-align-children-center']//div[@class='a-row s-align-children-center']//span//span[@class='a-text-bold'][contains(text(),'Tomorrow, Feb 28')]")).getText();
        System.out.println("Amazon date : " + amazonDate.substring(10,16));

        String result = amazonDate.substring(10,16);

        Date date = new Date();
        SimpleDateFormat datetoString = new SimpleDateFormat("MMM dd");
        Date date2 = new Date();
        System.out.println("Current date : " + datetoString.format(date));
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd");
        Date date3 = null;
        try {
            date3 = formatter.parse(result);
        }
        catch(Exception ex){
            System.out.println("exception:" + ex);
        }


        if(date3.compareTo(date)<0){
           System.out.println("Amazon date is greater than today's date");
        }else{
           System.out.println("Fail");
        }
    }
        }









