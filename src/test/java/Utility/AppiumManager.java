package Utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class AppiumManager {

    //main appium driver function here to connection for android and Ios is created
        public static AppiumDriver initializeDriver(String platformName)throws Exception {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
            caps.setCapability("newCommandTimeout", 300);

            URL url = new URL("http://127.0.0.1:4723");
            //switch case that stores either Android or Ios
            switch (platformName) {
                case "Android":

                    //SetCapabilitys for appium determine how the appium APi will find and launch the emulator for android
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6");
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");

                    //setCapability appPackage will find existing application in the emulator
                    caps.setCapability("appPackage", "io.appium.android.apis");

                    //SetCapability appActivity will find possible page to open in a application
                    caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

                    return new AndroidDriver(url, caps);
                case "iOS":

                    //SetCapabilitys for appium determine how the appium APi will find and launch the emulator for iOS
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iphone 11");
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITTest");
                    caps.setCapability(MobileCapabilityType.UDID, "77F6BBF0-8877-4EDF-8CBC-((DBE64A93FF");

                    //String assignment will find and download resource of a apk app in to the emulator
                    String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +
                            File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
                    caps.setCapability("bundleId", "com.example.apple-samplecode.UiCatalog");
                    return new IOSDriver(url, caps);
                default:
                    throw new Exception("invalid platform");
            }
        }
    }