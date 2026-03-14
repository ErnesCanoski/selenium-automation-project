package org.example.Base.LogInTests;


import base.BaseTest;
import org.example.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(groups = "smoke")
    public void testValidLogin(){

        LogInPage logInPage = new LogInPage(driver);
        logInPage.login("standard_user","secret_sauce");

        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    }

    @Test(groups = "regression")
    public void testInvalidLogin(){

        login.login("invalid_user","wrong_password");

        Assert.assertTrue(login.isErrorMessageDisplayed());
    }

    @Test(groups = "regression")
    public void testLockedUser(){

        login.login("locked_out_user","secret_sauce");

        Assert.assertTrue(login.getErrorMessageText().contains("locked out"));
    }
}