package com.UI_Automation.pages;


import com.UI_Automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CartPage extends BasePage {
    // @FindBy(className = "inventory_item_price")private static WebElement itemPrice;
    String itemPrice = "inventory_item_price";

    /**
     * Initialise page factory
     */
    public CartPage() throws Exception {
    }

    public void selectmaxPriceItem() throws InterruptedException {

        List<WebElement> list = driver.findElements(By.className(itemPrice));

        List<String> li = new ArrayList<>();
        for (WebElement e : list) {
            li.add(e.getText().replace("$", ""));
        }
        String[] item = li.toArray(new String[0]);
        for (WebElement e : list) {
            if (e.getText().contains(item[0])) {
                String className = e.getAttribute("class");
                driver.findElement(By.xpath("//*[contains(@class, className)]/../../a")).click();
            }
        }
    }
}
