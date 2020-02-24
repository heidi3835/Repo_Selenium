package page_Object;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    //Locator
    private By verfyingError = By.xpath("//div[@id='js_27u']");


    //Methods
    public String getErrorMessage(){
        return getValueFromElement(verfyingError);

    }


}
