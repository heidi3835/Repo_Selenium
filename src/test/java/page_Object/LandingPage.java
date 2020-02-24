package page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test_scripts.DriverWrapper;

import java.util.Date;

public class LandingPage extends BasePage {
    //Locators
    private By firstName = By.id("u_0_m");
    private By lastName = By.id("u_0_o");
    private By phoneNum = By.id("u_0_r");
    private By newPasswordTextField = By.xpath("//input[@id='u_0_w']");
    private By clearNumberOrEmail = By.xpath("//input[@id='u_0_r']");
    //private By clickSignInButton = By.id("u_0_13");
    private By redWarningButton = By.xpath("//div[@id='u_0_q']//i[@class='_5dbc img sp_nK4QBEPgZVv_2x sx_48bc47']");
    private By month = By.id("month");
    private By selectCurrentMont = By.id("month");



    //Methods
    public void enterFirstName(String value) {
        setValue(firstName, value);
    }

    public void enterLastName(String value) {
        setValue(lastName, value);
    }

    public void enterInvalidEmail(String value) {
        setValue(phoneNum, value);
    }


    public void clickNewPasswordTextField(String value ) {
        setValue(newPasswordTextField,value);
    }

    //public void setClickSignInButton() {
        //clickOn(clickSignInButton);
   // }

    public void clickOnRedWarning() {
        clickOn(redWarningButton);
    }

    public void ClearNumberOrEmail() {
        clear(clearNumberOrEmail);
    }

    public void monthSelect() {
        clickOn(month);
    }

    public void currentMonth() {
       clickOn(selectCurrentMont);



    }
}





