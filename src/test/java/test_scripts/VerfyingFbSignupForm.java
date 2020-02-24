package test_scripts;

import org.testng.annotations.Test;
import page_Object.LandingPage;
import page_Object.LoginPage;

public class VerfyingFbSignupForm extends DriverWrapper{

    @Test
    public void VerfyngFbSignForm() throws InterruptedException {
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();
        VerfEmailLIst email = new VerfEmailLIst();


        landingPage.enterFirstName("Hay");
        Thread.sleep(2000);
        landingPage.enterLastName("Oz");
        //email.VerfEmailLIst();
        //landingPage.ClearNumberOrEmail();
        landingPage.enterInvalidEmail("333555999");
        //Thread.sleep(500);
        landingPage.clickNewPasswordTextField("123456789");
        Thread.sleep(2000);
        //landingPage.setClickSignInButton();
        //getDriver().navigate().forward();
        loginPage.getErrorMessage();
        landingPage.clickOnRedWarning();
        //Assert.assertEquals("Error message", loginPage.getErrorMessage());





    }
}
