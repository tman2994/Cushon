package PageActions;

import SeleniumBase.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class HomePage extends BasePage {
    //creates instance of web selector
    private final By storeMenuLink = By.id("//*[@id='clickPensionCalculatorPage']");

    //driver connection
    public  HomePage(WebDriver driver) {
        super(driver);
    }

    //uses web selector to apply a click event whilst also using explicit webdriverwait method
    @Test
    public void clickStoreMenuLink(){
        wait.until(ExpectedConditions.elementToBeClickable(storeMenuLink)).click();
    }
}
