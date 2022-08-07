package com.UI_Automation.pages;


import com.UI_Automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class Products extends BasePage {
    @FindBy(className = "inventory_list")
    private static WebElement inventryList;
    @FindBy(className = "inventory_item")
    private static WebElement inventryItem;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private static WebElement addToCarts;
    @FindBy(className = "shopping_cart_link")
    private static WebElement cartLink;
    String addToCart = "Add to cart";

    /**
     * Initialise page factory
     */
    public Products() throws Exception {
    }


    public String pageTitle() {
        System.out.println("get title" + driver.getTitle());
        return driver.getTitle();
    }

    public CartPage selectRandomProducts() throws Exception {
        List invList = driver.findElements(By.xpath("//button[text()='Add to cart']"));
        Random random = new Random();
        int randomItemToSelect = random.nextInt(invList.size());
        System.out.println(invList.size());
        System.out.println(randomItemToSelect);
        for (int i = 1; i <= 3; i++) {
            driver.findElement(By.xpath("//div[contains(@class,'inventory_item')][" + i + "]/div[2]/div[2]/button")).click();
        }

        cartLink.click();
        return new CartPage();

    }
}
