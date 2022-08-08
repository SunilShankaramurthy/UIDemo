package com.UI_Automation.pages;


import com.UI_Automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
        List<Double> li = new ArrayList<>();
        for (WebElement e : list) {
            li.add(Double.parseDouble(e.getText().replace("$", "")));
        }
        li.sort(Collections.reverseOrder());
        Double[] item = li.toArray(new Double[0]);
        for (WebElement e : list) {
            if (e.getText().contains(item[0].toString())) {
                String className = e.getAttribute("class");
                driver.findElement(By.xpath("//*[contains(@class, className)]/../../a")).click();
            }
        }
    }
}
