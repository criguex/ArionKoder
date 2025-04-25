package stepdefinitions.flowshoppingcart;

import hooks.Context;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;
import pages.ShoppingCartPage;

public class StepDefinitionsFlowShoppingCart {
    Context context;
    HomePage homePage;
    ProductPage productPage;
    ShoppingCartPage shoppingCartPage;
    CheckoutPage checkoutPage;


    public StepDefinitionsFlowShoppingCart(Context context) {
        this.context = context;
        this.homePage = new HomePage(context.driver);
        this.productPage = new ProductPage(context.driver);
        this.shoppingCartPage = new ShoppingCartPage(context.driver);
        this.checkoutPage = new CheckoutPage(context.driver);
        context.login();
    }

    @After
    public void tearDown() {
        if (context.driver != null) {
            context.driver.quit();
        }
    }

    @Given("the user is on the ShopSmart catalog page")
    public void theUserIsOnTheShopSmartCatalogPage() {
        homePage.clickOnBtnProducts();
    }
    @When("the user filters the results by name, category or price range")
    public void theUserFiltersTheResultsByNameCategoryAndPriceRange() {
        productPage.selectCategory();
        productPage.selectOrder();
        productPage.checkPrices();
    }
    @And("the user adds the product to the cart")
    public void theUserAddsTheProductToTheCart() {
        productPage.clickAddShoppingCart();
    }
    @And("the cart should show product with its price")
    public void theCartShouldShowProductWithItsPrice() {
        homePage.clickOnShoppingCart();
        shoppingCartPage.checkPrice();
        shoppingCartPage.clickOnBtnFinishBuy();
    }

    @And("the user proceeds to checkout")
    public void theUserProceedsToCheckout() {
        checkoutPage.fillFormCheckout();
    }
    @Then("the system should request a shipping address")
    public void theSystemShouldRequestAShippingAddress() {
        checkoutPage.checkMsgError();
    }
}
