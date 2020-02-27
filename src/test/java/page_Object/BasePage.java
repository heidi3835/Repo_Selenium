package page_Object;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test_scripts.DriverWrapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static test_scripts.DriverWrapper.getDriver;

public class BasePage {

    public void clickOn(By locator) {
        getDriver().findElement(locator).click();
    }

    public void setValue(By locator, String value) {
        getDriver().findElement(locator).sendKeys(value);
    }

    public String getValueFromElement(By locator) {
        return getDriver().findElement(locator).getText();

    }
    public  String getCurrentDay (By locator){
        //Create a Calendar Object
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

        //Get Current Day as a number
        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today Int: " + todayInt +"\n");

        //Integer to String Conversion
        String todayStr = Integer.toString(todayInt);
        System.out.println("Today Str: " + todayStr + "\n");

        return todayStr;
    }



    public boolean isElementDisplay(By locator) {
        boolean isDisplayed;
        try {
            isDisplayed = getDriver().findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            isDisplayed = false;
        }
        return isDisplayed;

    }


    public void clear(By locator) {
        getDriver().findElement(locator).clear();
    }

    public void VerifyDuplicate() {
        Select select = new Select(getDriver().findElement(By.id("month")));
        List<WebElement> list = select.getOptions();
        Set<String> listNames = new HashSet<String>(list.size());
        for (WebElement element : list) {
            if (listNames.contains(element.getText()) == true) {
                System.out.println("Duplicate value is: " + element);
            } else {
                listNames.add(element.getText());
            }
        }

    }

    public boolean isDisplayed(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isDisplayed();
    }

    public boolean isSelected(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isSelected();
    }

    public boolean isEnable(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isEnabled();
    }
    //public void selectByText (By locator, String value){
    //   DriverWrapper.getDriver().findElement(locator).getText(

    // }

    // public void selectByIndex (By locator) {
    //  DriverWrapper.getDriver().findElement(locator);

    //  }
    // public boolean isDropDownContainsValue (By locator){
    // DriverWrapper.getDriver().findElement(locator);
    // }
    

}


//}




