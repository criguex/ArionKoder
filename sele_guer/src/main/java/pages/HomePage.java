package pages;

import locators.HomeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, HomeLocators.class);
    }

    public void clickOnBtnAccount(){
        HomeLocators.BTN_MY_ACCOUNT.click();
    }

    public void clickOnBtnProducts(){
        HomeLocators.BTN_PRODUCTS.click();
    }

    public void  clickOnShoppingCart(){
        HomeLocators.BTN_SHOPPING_CART.click();
        HomeLocators.BTN_SHOPPING_CART.click();
    }
}
