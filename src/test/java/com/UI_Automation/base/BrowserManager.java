package com.UI_Automation.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;

/*
 * This class helps us to initiate the browsers according the browser which we provide while running the test.
 * As of now this contains details about Chrome and Firefox. We can expand it to other browsers if require.
 * */
public class BrowserManager {
    public WebDriver OpenBrowser(String browserName) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("Chrome")) //Chrome browser
        {
            String chromePath = Paths.get("src", "test", "resources", "chromedriver").toString();
            System.setProperty("webdriver.chrome.driver", chromePath);
            ChromeOptions opt = new ChromeOptions();
            opt.setHeadless(Boolean.parseBoolean(System.getProperty("headless")));
            driver = new ChromeDriver(opt);

        } else if (browserName.equalsIgnoreCase("Firefox"))  // Firefox browser
        {
            //Yet to implement
        }
        return driver;
    }
}