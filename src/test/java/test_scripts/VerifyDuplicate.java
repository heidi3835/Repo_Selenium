package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import page_Object.LandingPage;



public class VerifyDuplicate extends DriverWrapper {
    @Test
    public void VerifyDuplicate (){

        LandingPage landingPage = new LandingPage();
        landingPage.VerifyDuplicate();

    }
}
