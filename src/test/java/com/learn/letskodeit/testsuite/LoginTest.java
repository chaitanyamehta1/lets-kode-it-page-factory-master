package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.LoginPage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Chaitanya
 */
public class LoginTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","regression"},priority = 0)
    public void verifyUserCanNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedResult = "Log In to Let's Kode It";
        String actualResult = loginPage.getLoginMessage();
        Assert.assertEquals(expectedResult, actualResult);


    }
}
