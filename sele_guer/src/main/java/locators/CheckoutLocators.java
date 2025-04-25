package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CheckoutLocators {
    @FindBy(id = "billing_first_name")
    public static WebElement INP_NAME;

    @FindBy(id = "billing_last_name")
    public static WebElement INP_LASTNAME;

    @FindBy(id = "billing_phone")
    public static WebElement INP_PHONE;

    @FindBy(id = "billing_postcode")
    public static WebElement INP_POSTCODE;

    @FindBy(id = "billing_rfc")
    public static WebElement INP_RFC;

    @FindBy(id = "billing_city")
    public static WebElement INP_CITY;

    @FindBy(id = "billing_delegacion_o_municipio")
    public static WebElement INP_REGION;

    @FindBy(id = "billing_address_1")
    public static WebElement INP_ADDRESS;

    @FindBy(id = "billing_numero_exterior")
    public static WebElement INP_NUMBER_EX;

    @FindBy(id = "billing_numero_interior")
    public static WebElement INP_NUMBER_INT;

    @FindBy(css = "span[role='textbox']")
    public static WebElement LISTBOX_STATE;

    @FindBy(how = How.CSS, using = "li[role='option']")
    public static List<WebElement> OPTIONS_STATE;

    @FindBy(id = "billing_email")
    public static WebElement INP_EMAIL;

    @FindBy(css ="button[value='Realizar el pedido']")
    public static WebElement RADIO_BTN_PAY_STORE;

    @FindBy(xpath = "//input[@id='terms']")
    public static WebElement CBX_TERMS;

    @FindBy(css ="input[type='checkbox']")
    public static WebElement BTN_PLACE_ORDER;

    @FindBy(className ="woocommerce-error")
    public static WebElement TXT_MSG_ERROR;

    @FindBy(className ="woocommerce-order")
    public static WebElement TXT_RESUMEN_ORDER;

    @FindBy(xpath ="//strong[contains(text(), 'Pago en efectivo')]")
    public static WebElement RESUMEN_ORDER;


}

