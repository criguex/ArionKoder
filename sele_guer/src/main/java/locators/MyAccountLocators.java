package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountLocators {
    @FindBy(id = "username")
    public static WebElement INP_USERNAME;

    @FindBy(id = "password")
    public static WebElement INP_PASSWORD;

    @FindBy(css = "button[name='login']")
    public static WebElement BTN_LOGIN;

    @FindBy(id = "reg_email")
    public static WebElement INP_EMAIL_REGISTER;

    @FindBy(css = "button[name='register']")
    public static WebElement BTN_REGISTER;

    /**********************************************************************************************************************/
    /*                                       After login                                                                  */
    /**********************************************************************************************************************/

    @FindBy(xpath = "//a[contains(text(),  'Detalles de la cuenta')]")
    public static WebElement BTN_DETAILS_ACCOUTN;

    @FindBy(className = "woocommerce-MyAccount-content")
    public static WebElement TXT_LOGIN_SUCCESS;

    @FindBy(xpath = "//strong[contains(text(),  'prueba2024qas')][1]")
    public static WebElement TXT_USERNAME;

}
