package com.UI_Automation.stepdef;

import com.UI_Automation.pages.CartPage;
import com.UI_Automation.pages.Products;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class ProductPageSteDef {
    Products products = new Products();
    CartPage cartPage = new CartPage();

    public ProductPageSteDef() throws Exception {
    }

    @Given("User is in Products page")
    public void inProductPage() throws IOException {
        products.pageTitle();
    }

    @When("User add random items cart")
    public void addToCart() throws Exception {
        products.selectRandomProducts();
    }

    @Then("User should able to see those items in cart and select the maximum price item")
    public void maxPriceItem() throws InterruptedException {
        cartPage.selectmaxPriceItem();

    }

    @Then("User will be navigated to Product page")
    public void validateProductPage() {
        Assert.assertEquals(products.pageTitle(), "Swag Labs", "User not landed in Product Page");
    }
}
