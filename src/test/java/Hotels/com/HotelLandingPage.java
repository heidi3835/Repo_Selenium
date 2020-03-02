package Hotels.com;

import org.openqa.selenium.By;
import page_Object.BasePage;
import test_scripts.DriverWrapper;

public class HotelLandingPage extends BasePage {

    private By ignorePopUp = By.xpath("//button[@class='cta widget-overlay-close']");
    private By clickCheckInField = By.id("widget-query-label-1");
    private By clickOnBackArrow = By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//button[1]");
    //private By selectMonth = By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//div[1]");
    private By ClickCheckSecondField = By.id("widget-query-label-3");
    private By checkInDate = By.xpath("//div[6]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[2]");
    private By checkOutDate = By.xpath("//div[6]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/a[1]");
    public void ClickOnPoup (){
        clickOn(ignorePopUp);
    }
    public void clickOnCheckIn (){
        clickOn(clickCheckInField);
    }
    public void clickOnBack(){
        clickOn(clickOnBackArrow);
    }
    public void clickCalendarIcon(){clickOn(ClickCheckSecondField);}
    public void checkInDATE(){clickOn(checkInDate);}
    public void clickCheckOutDate(){clickOn(checkOutDate);}

    }



