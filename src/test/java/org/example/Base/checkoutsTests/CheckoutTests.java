package org.example.Base.checkoutsTests;


import base.BaseTest;
import org.example.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTests extends BaseTest {

    @Test
    public void testCheckoutButtonVisible(){

        login.login("standard_user","secret_sauce");

        InventoryPage inventory = new InventoryPage(driver);

        inventory.addBackpack();
        inventory.openCart();

        Assert.assertTrue(driver.getPageSource().contains("Checkout"));
    }

    @Test
    public void testCartPageTitle(){

        login.login("standard_user","secret_sauce");

        InventoryPage inventory = new InventoryPage(driver);

        inventory.openCart();

        Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
    }

    @Test
    public void testInventoryPageLoaded(){

        login.login("standard_user","secret_sauce");

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @Test
    public void testPageTitle(){

        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    }
}