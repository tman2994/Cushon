package Main;

import PageActions.StorePage;
import SeleniumBase.LaunchExitSelenium;

import org.testng.annotations.Test;
import PageActions.HomePage;

//main class to call selenium
public class webpages extends LaunchExitSelenium {

        @Test
        public void SeleniumTest() throws InterruptedException {

            //launchs the selenium test
            driver.get("https://cushon_1.com");

            HomePage homePage = new HomePage(driver);
            homePage.clickStoreMenuLink();
            StorePage storePage = new StorePage(driver);
            storePage.ClickEnterAmount();
            storePage.enterAmount("50");
            storePage.EnterPercent("35%");


        }
    }
