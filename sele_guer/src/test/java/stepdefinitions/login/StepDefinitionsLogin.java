package stepdefinitions.login;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.MyAccountPage;
import test_data.LoginData;
import hooks.Context;


public class StepDefinitionsLogin {
    Context context;
    HomePage homePage;
    MyAccountPage myAccountPage;


    public StepDefinitionsLogin(Context context) {
        this.context = context;
        this.homePage = new HomePage(context.driver);
        this.myAccountPage = new MyAccountPage(context.driver);
        context.setup();
    }
    @After
    public void tearDown() {
        if (context.driver != null) {
            context.driver.quit();
        }
    }

    @Given("user is on the login page of the site")
    public void userIsOnTheLoginPageOfTheSite() {
        homePage.clickOnBtnAccount();
    }

    @When("enters the credentials")
    public void entersTheCredentials() {
        myAccountPage.fillLoginForm(LoginData.USERNAME, LoginData.PASSWORD);
    }
    @Then("it shows the user profile and your home page")
    public void itShowsTheUserProfileAndYourHomePage() {
        myAccountPage.checkTxtLoginSuccess();
    }
}
