package hooks;

import drivers.BasesClassDriver;
import pages.HomePage;
import pages.MyAccountPage;
import test_data.LoginData;

public class Context extends BasesClassDriver {
    private HomePage homePage;
    private MyAccountPage myAccountPage;

    public Context() {
        setup();
    }

    public void login()
    {
        homePage = new HomePage(driver);
        myAccountPage = new MyAccountPage(driver);
        homePage.clickOnBtnAccount();
        myAccountPage.fillLoginForm(LoginData.USERNAME, LoginData.PASSWORD);
    }
}
