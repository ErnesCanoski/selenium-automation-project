package org.example.Base.CartTests;


import base.BaseTest;
import org.example.CartPage;
import org.example.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest {

    @Test
    public void testAddSingleItem(){

        login.login("standard_user","secret_sauce");

        InventoryPage inventory = new InventoryPage(driver);

        inventory.addBackpack();

        Assert.assertEquals(inventory.getCartBadge(),"1");
    }

    @Test
    public void testAddMultipleItems(){

        login.login("standard_user","secret_sauce");

        InventoryPage inventory = new InventoryPage(driver);

        inventory.addBackpack();
        inventory.addBikeLight();
        inventory.addBoltShirt();

        Assert.assertEquals(inventory.getCartBadge(),"3");
    }

    @Test
    public void testRemoveFromCart(){

        login.login("standard_user","secret_sauce");

        InventoryPage inventory = new InventoryPage(driver);
        CartPage cart = new CartPage(driver);

        inventory.addBackpack();
        inventory.openCart();

        cart.removeBackpack();

        Assert.assertFalse(cart.isCartBadgePresent());
    }
}
