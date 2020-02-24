package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_Object.LandingPage;
import page_Object.LoginPage;
import test_scripts.DriverWrapper;

import java.util.Arrays;
import java.util.List;

public class VerfEmailLIst extends DriverWrapper {
    @Test

    public void VerfEmailLIst () throws InterruptedException {

        List<String> emailAdrs = Arrays.asList(
                " #@%^%#$@#$@#.com",
                "  @example.com",
                "  Joe Smith <email@example.com>",
                "  email.example.com",
                "  email@example@example.com",
                "  .email@example.com",
                "  email.@example.com",
                "  email..email@example.com",
                "  あいうえお@example.com"
,                "  email@example.com (Joe Smith)",
                "  email@example",
                "  email@-example.com",
                "  email@example.web",
                "  email@111.222.333.44444",
                "  email@example..com",
                "  Abc..123@example.com");
        for(int i = 0; i<emailAdrs.size(); i++){
            DriverWrapper driverWrapper = new DriverWrapper();
            LandingPage test = new LandingPage();

            Thread.sleep(150);
            test.ClearNumberOrEmail();
            test.enterInvalidEmail(emailAdrs.get(i));




        }
    }



        }





