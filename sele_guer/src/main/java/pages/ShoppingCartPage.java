package pages;

import locators.ShoppingCartLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    WebDriver driver;
    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, ShoppingCartLocators.class);
    }

    public void checkPrice(){
        for (WebElement element : ShoppingCartLocators.TD_PRICE){
            assert element.isDisplayed();
            assert element.getText().contains("$");
        }
    }

    public void  clickOnBtnFinishBuy(){
        ShoppingCartLocators.BTN_FINISH_BUY.click();
    }
}
