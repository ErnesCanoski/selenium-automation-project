package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void removeBackpack(){
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }

    public boolean isCartBadgePresent(){
        return driver.findElements(By.className("shopping_cart_badge")).size() > 0;
    }
}