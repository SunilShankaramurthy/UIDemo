package com.UI_Automation.stepdef;

import com.UI_Automation.pages.LoginPage;
import com.UI_Automation.pages.Products;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();
    Products products = new Products();

    public LoginStepDef() throws Exception {
    }

    @Given("User is SouceLab login Page")
    public void User_is_in_souceLab_login_page() throws Exception {
        loginPage.openWebPage();
    }

    @When("User login using valid credentials from config file")
    public void login() throws Exception {
        loginPage.logIn();
    }


}
