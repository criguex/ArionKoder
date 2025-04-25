package pages;

import locators.MyAccountLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.RandomFunctions;
import utils.Waits;

import java.time.Duration;


public class MyAccountPage {
    WebDriver driver;

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, MyAccountLocators.class);
    }

    public void fillLoginForm(String username, String password){
        this.fillInpUsername(username);
        this.fillInpPassword(password);
        this.clickOnBtnLogin();
    }

    public void fillInpUsername(String username){
        MyAccountLocators.INP_USERNAME.sendKeys(username);
    }

    public void fillInpPassword(String password){
        MyAccountLocators.INP_PASSWORD.sendKeys(password);
    }

    public void clickOnBtnLogin(){
        MyAccountLocators.BTN_LOGIN.click();
    }

    public void fillInpRegisterEmail(){
       MyAccountLocators.INP_EMAIL_REGISTER.sendKeys(RandomFunctions.getRandomEmail("prueba"));
    }

    public void clickOnBtnRegister(){
        MyAccountLocators.BTN_REGISTER.click();
    }

    /**********************************************************************************************************************/
    /*                                       After login                                                                  */
    /**********************************************************************************************************************/

    public void checkTxtLoginSuccess(){
        Waits.waitElementVisible(MyAccountLocators.TXT_LOGIN_SUCCESS, driver);
        assert MyAccountLocators.TXT_LOGIN_SUCCESS.isDisplayed();
        assert MyAccountLocators.TXT_USERNAME.getText().equals("prueba2024qas");
    }

    public void clickOnDetailsAccount(){
        MyAccountLocators.BTN_DETAILS_ACCOUTN.click();
    }
}
