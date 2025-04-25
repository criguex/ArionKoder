package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void waitElementVisible(WebElement element, WebDriver driver){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(d -> element.isDisplayed());
    }

    public static void waitElementVisibleForEight(WebElement element, WebDriver driver){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(d -> element.isDisplayed());
    }

    public static void waitElementEnable(WebElement element, WebDriver driver){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(d -> element.isEnabled());
    }

    public static void waitFor(int milisecounds) {
        try {
            Thread.sleep(milisecounds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
