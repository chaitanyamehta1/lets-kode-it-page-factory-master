package com.learn.letskodeit.pages;

import com.learn.letskodeit.Utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Chaitanya
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[@class='navbar-link fedora-navbar-link']")
    WebElement _loginLink;
    @FindBy(partialLinkText = "Practi")
    WebElement _practiceLink;
    @FindBy(id = "header-sign-up-btn")
    WebElement _signUpLink;


    public void clickOnLoginLink() {
        Reporter.log("Clicking on login button " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on login button " + _loginLink.toString());

    }

    public void clickOnPracticePage() {
        Reporter.log("Clicking on practice button " + _practiceLink.toString() + "<br>");
        clickOnElement(_practiceLink);
        log.info("Clicking on practice button " + _practiceLink.toString());
    }

    public void clickOnSignUpLink() {
        Reporter.log("Clicking on signUp button " + _signUpLink.toString() + "<br>");
        clickOnElement(_signUpLink);
        log.info("Clicking on signUp button " + _signUpLink.toString());
    }


}
