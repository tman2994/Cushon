package MobileActions;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class Gestures {
    @Test
    public static void Clicks(AppiumDriver driver) throws InterruptedException {

        //creates instance var of page
        By views = AppiumBy.accessibilityId("PensionCalculatorPage");
        By textFields = AppiumBy.accessibilityId("EnterAmountInBlankSpace");
        By editText = AppiumBy.id("io.appium.android.apis:id/AmountInBlankSpace");

        //initiates element click
        driver.findElement(views).click();

        //initiates element click
        driver.findElement(textFields).click();

        //initiates element text enter
        driver.findElement(editText).sendKeys("50");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public static void percentage(AppiumDriver driver) throws InterruptedException {
        //creates instance var of page
        By editText = AppiumBy.id("io.appium.android.apis:id/AmountInBlankSpace");

        //initiates element text enter
        driver.findElement(editText).sendKeys("35%");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
