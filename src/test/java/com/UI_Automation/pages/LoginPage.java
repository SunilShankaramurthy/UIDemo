package com.UI_Automation.pages;


import com.UI_Automation.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    private static WebElement userName;
    @FindBy(id = "password")
    private static WebElement password;
    @FindBy(id = "login-button")
    private static WebElement login;


    Properties p = new Properties();
    String configFilePath = Paths.get("src", "test", "resources", "config.properties").toString();
    FileReader reader;

    /**
     * Initialise page factory
     */
    public LoginPage() throws IOException {


    }

    public LoginPage openWebPage() throws IOException {
        reader = new FileReader(configFilePath);
        p.load(reader);
        driver.get(p.getProperty("url"));
        return this;
    }

    public Products logIn() throws Exception {

        userName.sendKeys(p.getProperty("username"));
        password.sendKeys(p.getProperty("password"));
        login.click();
        return new Products();
    }
}
