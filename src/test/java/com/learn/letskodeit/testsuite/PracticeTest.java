package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.PracticePage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Chaitanya
 */
public class PracticeTest extends TestBase {
    HomePage homePage;
    PracticePage practicePage;

    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void setUp(){
        new HomePage();
        new PracticePage();
    }

    @Test(groups = {"smoke","regression"},priority = 1)
    public void verifyUserCanNavigateToPracticePage(){
        homePage.clickOnPracticePage();
        String expectedResult = "Practice Page";
        String actualResult =practicePage.getTextFromElement();
        Assert.assertEquals(expectedResult,actualResult);


    }

}
