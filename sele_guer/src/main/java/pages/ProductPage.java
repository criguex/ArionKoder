package pages;

import locators.ProductLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.RandomFunctions;
import utils.Waits;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, ProductLocators.class);
    }

    public void selectCategory(){
        boolean loop = false;
        while (Boolean.FALSE.equals(loop)){
            int sizeCategory = ProductLocators.LTS_BTN_TYPE_PRODUCT.size();
            if (sizeCategory == 1 || sizeCategory == 8){
                loop = false;
            } else {
                loop = true;
                ProductLocators.LTS_BTN_TYPE_PRODUCT.get(RandomFunctions.getRandomNumber(0,sizeCategory)).click();
            }
        }

    }

    public void selectOrder(){
        Select select = new Select(ProductLocators.SELECT_ORDER);
        select.selectByIndex(RandomFunctions.getRandomNumber(0,5));
    }


    public void checkPrices (){
        for (WebElement element : ProductLocators.LST_PRODUCT){
            assert element.findElement(By.className("price")).isDisplayed();
        }
    }

    public void clickAddShoppingCart() {
        Waits.waitFor(1000);
        ProductLocators.LST_PRODUCT
                .get(RandomFunctions.getRandomNumber(0, ProductLocators.LST_PRODUCT.size()-1))
                .findElement(By.linkText("Añadir al carrito")).click();
    }
}
