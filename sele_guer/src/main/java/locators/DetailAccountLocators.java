package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DetailAccountLocators {
    @FindBy(name = "account_first_name")
    public static WebElement INP_NAME;

    @FindBy(name = "account_last_name")
    public static WebElement INP_LASTNAME;

    @FindBy(name = "password_current")
    public static WebElement INP_CURRENT_PASSWORD;

    @FindBy(name = "password_1")
    public static WebElement INP_NEW_PASSWORD;

    @FindBy(name = "password_2")
    public static WebElement INP_CONFIRM_PASSWORD;

    @FindBy(how = How.CSS, using = "input[type='radio']")
    public static List<WebElement> LTS_RADIO_BUTTONS;

    @FindBy(css = "button[name='save_account_details']")
    public static WebElement BTN_SAVE;

    @FindBy(className = "woocommerce-error")
    public static WebElement ALT_MESSAGE_ERROR;

    @FindBy(xpath = "//li[contains(text(),  'Tu contraseña actual no es correcta.')]")
    public static  WebElement TXT_MESSAGE_ERROR;

}
