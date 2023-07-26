package Main;

import PageActions.AppPage;
import SeleniumBase.LaunchExitSelenium;

import org.testng.annotations.Test;
import PageActions.HomePage;

//main class to call selenium
public class WebPages extends LaunchExitSelenium {

        @Test
        public void SeleniumTest() throws InterruptedException {

            //launchs the selenium test
            driver.get("https://cushon_1.com");

            HomePage homePage = new HomePage(driver);
            homePage.clickStoreMenuLink();
            AppPage storePage = new AppPage(driver);
            storePage.ClickEnterAmount();
            storePage.enterAmount("50");
            storePage.EnterPercent("35%");


        }
    }
