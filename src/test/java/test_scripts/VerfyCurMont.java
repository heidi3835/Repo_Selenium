package test_scripts;

import org.testng.annotations.Test;
import page_Object.LandingPage;

public class VerfyCurMont extends DriverWrapper {

    @Test
    public void VerfyCurMont () throws InterruptedException {
        LandingPage landingPage=new LandingPage();
        landingPage.monthSelect();
        Thread.sleep(2000);

    }
}
