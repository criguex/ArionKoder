package stepdefinitions.register;

import hooks.Context;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DetailsAccountPage;
import pages.HomePage;
import pages.MyAccountPage;

public class StepDefinitionRegister {
    Context context;
    HomePage homePage;
    MyAccountPage myAccountPage;
    DetailsAccountPage detailsAccountPage;


    public StepDefinitionRegister(Context context) {
        this.context = context;
        this.homePage = new HomePage(context.driver);
        this.myAccountPage = new MyAccountPage(context.driver);
        this.detailsAccountPage = new DetailsAccountPage(context.driver);
    }

    @After
    public void tearDown() {
        if (context.driver != null) {
            context.driver.quit();
        }
    }

    @Given("User is on the main page of the site")
    public void userIsOnTheMainPageOfTheSite() {
        context.setup();
        homePage.clickOnBtnAccount();
    }
    @When("enters the info in the creation profile form")
    public void entersTheInfoInTheCreationProfileForm() {
        myAccountPage.fillInpRegisterEmail();
        myAccountPage.clickOnBtnRegister();
        myAccountPage.clickOnDetailsAccount();
        detailsAccountPage.fillRegisterForm();
    }
    @Then("it shows the user profile with your basic information")
    public void itShowsTheUserProfileWithYourBasicInformation() {
        detailsAccountPage.checkMsgError();
    }
}
