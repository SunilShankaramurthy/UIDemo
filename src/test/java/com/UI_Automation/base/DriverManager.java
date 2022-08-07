package com.UI_Automation.base;

import org.openqa.selenium.WebDriver;


/*
This class will set the WebDriver to run the test. It configured with Java Threadlocal
in order to synchronise the parallel sessions created while running the test concurrently.
 */
public class DriverManager {
    // public WebDriver driver;

    public static ThreadLocal<WebDriver> localDriver = new ThreadLocal<WebDriver>();
    public WebDriver driver;
    public DriverManager() {

    }

    public static synchronized WebDriver getDriver() {
        return localDriver.get();
    }

    public void setDriver(String browser) throws InterruptedException {
        localDriver.set(new BrowserManager().OpenBrowser(browser));
        getDriver().manage().deleteAllCookies();
    }

}
