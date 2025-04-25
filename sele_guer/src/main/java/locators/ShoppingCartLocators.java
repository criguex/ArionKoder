package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCartLocators {
    @FindBy(css = "td[data-title='Precio']")
    public static List<WebElement> TD_PRICE;

    @FindBy(linkText = "Finalizar compra")
    public static WebElement BTN_FINISH_BUY;
}
