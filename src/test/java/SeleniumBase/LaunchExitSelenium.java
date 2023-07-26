package SeleniumBase;
import Utility.SeleniumManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class LaunchExitSelenium {

    protected WebDriver driver;
    //initialises selenium driver before any test is called
    @BeforeMethod
    public void startDriver() {
        driver = new SeleniumManager().initializeDriver();
    }

    //exits selenium driver when a test is reached its last code line
    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }
}
