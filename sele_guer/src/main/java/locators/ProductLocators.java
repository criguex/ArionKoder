package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProductLocators {
    @FindBy(how = How.XPATH, using = "//ul[@id='menu-categorias-de-producto-18']//a")
    public static List<WebElement> LTS_BTN_TYPE_PRODUCT;

    @FindBy(css = "select[name='orderby']")
    public static WebElement SELECT_ORDER;

    @FindBy(how = How.XPATH, using = "//li[contains(@class, 'product type-product')]")
    public static List<WebElement> LST_PRODUCT;
}
