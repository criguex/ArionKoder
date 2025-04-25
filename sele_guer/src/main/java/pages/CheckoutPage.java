package pages;

import locators.CheckoutLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import test_data.LoginData;
import utils.RandomFunctions;
import utils.Waits;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, CheckoutLocators.class);
    }

    public void fillFormCheckout(){
        this.fillName();
        this.fillLastName();
        this.fillPhone();
        this.fillPostCode();
        this.fillEmail();
        this.fillCity();
        this.fillRegion();
        this.fillRfc();
        this.fillAddress();
        this.fillNumberExt();
        this.fillNumberInt();
        this.selectState();
        this.clickOnCbxTerms();
        this.checkboxPaymentMethod();
        this.clickOnBtnPlaceOrder();
    }
    public void fillName(){
        CheckoutLocators.INP_NAME.clear();
        CheckoutLocators.INP_NAME.sendKeys(RandomFunctions.getRandomText());
    }

    public void fillLastName(){
        CheckoutLocators.INP_LASTNAME.clear();
        CheckoutLocators.INP_LASTNAME.sendKeys(RandomFunctions.getRandomText());
    }

    public void fillPhone(){
        CheckoutLocators.INP_PHONE.clear();
        CheckoutLocators.INP_PHONE.sendKeys(String.valueOf(RandomFunctions.getRandomNumber(30000000, 318000000)));
    }

    public void fillPostCode(){
        CheckoutLocators.INP_POSTCODE.clear();
        CheckoutLocators.INP_POSTCODE.sendKeys(RandomFunctions.getRandomText());
    }

    public void fillCity(){
        CheckoutLocators.INP_CITY.clear();
        CheckoutLocators.INP_CITY.sendKeys(RandomFunctions.getRandomText());
    }

    public void fillEmail(){
        CheckoutLocators.INP_EMAIL.clear();
        CheckoutLocators.INP_EMAIL.sendKeys(RandomFunctions.getRandomEmail("Prueba"));
    }

    public void fillRegion(){
        CheckoutLocators.INP_REGION.clear();
        CheckoutLocators.INP_REGION.sendKeys(RandomFunctions.getRandomText());
    }

    public void fillRfc(){
        CheckoutLocators.INP_RFC.clear();
        CheckoutLocators.INP_RFC.sendKeys(RandomFunctions.getRandomText());
    }

    public void fillAddress(){
        CheckoutLocators.INP_ADDRESS.clear();
        CheckoutLocators.INP_ADDRESS.sendKeys(RandomFunctions.getRandomText());
    }

    public void fillNumberExt(){
        CheckoutLocators.INP_NUMBER_EX.clear();
        CheckoutLocators.INP_NUMBER_EX.sendKeys(String.valueOf(RandomFunctions.getRandomNumber(10,100)));
    }

    public void fillNumberInt(){
        CheckoutLocators.INP_NUMBER_INT.clear();
        CheckoutLocators.INP_NUMBER_INT.sendKeys(String.valueOf(RandomFunctions.getRandomNumber(10,100)));
    }

    public void selectState(){
     CheckoutLocators.LISTBOX_STATE.click();
     CheckoutLocators.OPTIONS_STATE.get(RandomFunctions.getRandomNumber(0,CheckoutLocators.OPTIONS_STATE.size()-1)).click();
    }

    public void checkboxPaymentMethod(){
        Waits.waitFor(4000);
        CheckoutLocators.RADIO_BTN_PAY_STORE.click();
    }

    public void clickOnCbxTerms(){
        Waits.waitFor(4000);
        CheckoutLocators.CBX_TERMS.click();
    }

    public void clickOnBtnPlaceOrder(){
        CheckoutLocators.BTN_PLACE_ORDER.click();
    }

    public void checkMsgError(){
        Waits.waitElementVisibleForEight(CheckoutLocators.RESUMEN_ORDER, driver);
        assert CheckoutLocators.RESUMEN_ORDER.isDisplayed();
        assert  CheckoutLocators.TXT_RESUMEN_ORDER.getText().contains("pedido");
    }

}
