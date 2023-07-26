package Main;

import Utility.AppiumManager;
import io.appium.java_client.AppiumDriver;
import MobileActions.Gestures;
import org.testng.annotations.Test;


public class AndroidFind {
    @Test
    public static void main(String[] args) throws Exception {
        //launchs Appium Test driver, platformName parm is called Android this means only android will lunch in this method
        AppiumDriver driver = AppiumManager.initializeDriver("Android");

        //created instance when called initializes methods
        Gestures.Clicks(driver);
        Gestures.percentage(driver);
    }
}