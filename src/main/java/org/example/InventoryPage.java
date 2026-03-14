package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    WebDriver driver;

    By cartBadge = By.className("shopping_cart_badge");

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    public void addBackpack(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    public void addBikeLight(){
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    }

    public void addBoltShirt(){
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
    }

    public String getCartBadge(){
        return driver.findElement(cartBadge).getText();
    }

    public void openCart(){
        driver.findElement(By.className("shopping_cart_link")).click();
    }
}