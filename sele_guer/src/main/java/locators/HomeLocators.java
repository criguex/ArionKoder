package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLocators {
    @FindBy(linkText = "Mi cuenta" )
    public static WebElement BTN_MY_ACCOUNT;

    @FindBy(linkText = "Productos" )
    public static WebElement BTN_PRODUCTS;

    @FindBy(css = "a[title='View your shopping cart']")
    public static WebElement BTN_SHOPPING_CART;
}
