package pages;

import locators.DetailAccountLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.RandomFunctions;
import utils.Waits;

public class DetailsAccountPage {
    WebDriver driver;
    public DetailsAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, DetailAccountLocators.class);
    }

    public void fillRegisterForm(){
        this.fillName();
        this.fillLastName();
        this.fillCurrentPassword();
        this.fillNewPassword();
        this.fillConfirmPassword();
        this.clickOnRadioButtons();
        this.clickOnBtnSave();
    }

    public void fillName(){
        DetailAccountLocators.INP_NAME.sendKeys(RandomFunctions.getRandomText());
    }

    public void fillLastName(){
        DetailAccountLocators.INP_LASTNAME.sendKeys(RandomFunctions.getRandomText());
    }

    public void fillCurrentPassword(){
        DetailAccountLocators.INP_CURRENT_PASSWORD.sendKeys(RandomFunctions.getRandomText());
    }

    public void fillNewPassword(){
        DetailAccountLocators.INP_NEW_PASSWORD.sendKeys("Pass!2#4%");
    }

    public void fillConfirmPassword(){
        DetailAccountLocators.INP_CONFIRM_PASSWORD.sendKeys("Pass!2#4%");
    }

    public void clickOnRadioButtons(){
        DetailAccountLocators.LTS_RADIO_BUTTONS.get(RandomFunctions.getRandomNumber(0,2)).click();
    }

    public void clickOnBtnSave(){
        DetailAccountLocators.BTN_SAVE.click();
    }

    public void checkMsgError(){
        Waits.waitElementVisible(DetailAccountLocators.ALT_MESSAGE_ERROR, driver);
        assert DetailAccountLocators.ALT_MESSAGE_ERROR.isDisplayed();
        assert DetailAccountLocators.TXT_MESSAGE_ERROR.getText().equals("Tu contraseña actual no es correcta.");
    }
}

