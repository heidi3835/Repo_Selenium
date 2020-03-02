package Hotels.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test_scripts.DriverWrapper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SelectCurDate extends DriverWrapper {
    @Test

    public void SelectCurDate () throws InterruptedException {
        HotelLandingPage hotlanding = new HotelLandingPage();
        //hotlanding.ClickOnPoup();
        Thread.sleep(2000);
        hotlanding.clickOnCheckIn();
        Thread.sleep(2000);
        //hotlanding.clickOnBack();

        SimpleDateFormat sdf = new SimpleDateFormat("d");
        Date date = new Date();
        String today = sdf.format(date);
        Thread.sleep(3000);
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
