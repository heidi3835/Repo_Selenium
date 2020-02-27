package page_Object;

import org.openqa.selenium.By;

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
    private By searchProduct = By.id("twotabsearchtextbox");
    private By searchButton = By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
    private By price = By.className("a-row");
   // private By amazonDate = By.xpath("//div[@class='rush-component']//div[@class='rush-component']//div[@class='s-include-content-margin s-border-bottom']//div[@class='a-section a-spacing-medium']//div[@class='sg-row']//div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-16-of-24 sg-col-12-of-20 sg-col-24-of-32 sg-col sg-col-28-of-36 sg-col-20-of-28']//div[@class='sg-col-inner']//div[@class='sg-row']//div[@class='sg-col-4-of-24 sg-col-4-of-12 sg-col-4-of-36 sg-col-4-of-28 sg-col-4-of-16 sg-col sg-col-4-of-20 sg-col-4-of-32']//div[@class='sg-col-inner']//div[@class='a-section a-spacing-none a-spacing-top-micro']//div[@class='a-row a-size-base a-color-secondary s-align-children-center']//div[@class='a-row s-align-children-center']//span//span[@class='a-text-bold'][contains(text(),'Today, Feb 27')]");





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
    public void seacrhMenu (String value){setValue(searchProduct, value);}

    public void SerachButton(){clickOn(searchButton);}
    public void productPrice() {clickOn(price);}
   // public String getCurrentDay  (By locator){
   //     setValue(amazonDate);

   //     return null;
  //  }

    private void setValue(By amazonDate) {
    }


}



