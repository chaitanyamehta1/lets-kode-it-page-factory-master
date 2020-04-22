package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.SignUpPage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Chaitanya
 */
public class SignUpTest extends TestBase {
    HomePage homePage;
    SignUpPage signUpPage;


    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void setUp(){
        new HomePage();
        new SignUpPage();
    }
    @Test(groups = {"sanity","smoke","regression"}, priority = 2)
    public void verifyUserShouldNavigateToSignUpPage(){
        homePage.clickOnSignUpLink();
        String expectedResult = "Sign Up to Let's Kode It";
        String actualResult = signUpPage.getSignUpText();
        Assert.assertEquals(expectedResult,actualResult);
    }



}
