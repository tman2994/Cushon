package PageActions;

import SeleniumBase.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class StorePage extends BasePage {

    //creates instance of web selector
    private final By clickEnterAmount = By.id("//*[@id='clickEnterAmountBlankSpace']");

    //creates instance of web selector
    private final By EnterAmount = By.id("//*[@id='AmountBlankSpace']");

    //creates instance of web selector
    private final By EnterPercentage = By.id("//*[@id='clickEnterAmountBlankSpace']");

    //driver connection
    public  StorePage(WebDriver driver) {
        super(driver);
    }

    //uses web selector to apply a click event whilst also using explicit webdriverwait method
    @Test
    public void ClickEnterAmount(){
        wait.until(ExpectedConditions.elementToBeClickable(clickEnterAmount)).click();
    }

    //uses web selector to apply a send keys event whilst also using explicit webdriverwait method
    @Test
    public void enterAmount(String txt){
        wait.until(ExpectedConditions.visibilityOfElementLocated(EnterAmount)).sendKeys(txt);
    }

    //uses web selector to apply a send keys event whilst also using explicit webdriverwait method
    @Test
    public void EnterPercent(String txt){
        wait.until(ExpectedConditions.visibilityOfElementLocated(EnterPercentage)).sendKeys(txt);
    }


}
