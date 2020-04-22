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
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(id = "user_email")
    WebElement _emailField;
    @FindBy(id = "user_password")
    WebElement _passwordField;
    @FindBy(name = "commit")
    WebElement _clickOnCommitButton;
    @FindBy(xpath = "//h1[@class='text-center']")
    WebElement _getLoginText;
    @FindBy(xpath = "//a[contains(text(),'All Courses')]")
    WebElement _allCourseText;

    public void enterEmailId(String email) {
        Reporter.log("Enter email field " +email+ "Email field"+ _emailField.toString() + "<br>");
        sendTextToElement(_emailField, email);
        log.info("Enter email field " +email+ "Email field" +_emailField.toString());
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password field " +password+ "Password field"+ _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("Enter password field " +password+ "Password field"+ _passwordField.toString());
    }

    public void clickOnCommitFeature() {
        Reporter.log("Clicking on commit button " + _clickOnCommitButton.toString() + "<br>");
        clickOnElement(_clickOnCommitButton);
        log.info("Clicking on commit button " + _clickOnCommitButton.toString());
    }

    public String getLoginMessage() {
        Reporter.log("Getting login confirm message " + _getLoginText.toString() + "<br>");
        log.info("Getting login confirm message " + _getLoginText.toString());
        return getTextFromElement(_getLoginText);
}

    public String getAllCourseMessage() {
        Reporter.log("Getting all course text message " + _allCourseText.toString() + "<br>");
        log.info("Getting all course text message " + _allCourseText.toString());
        return getTextFromElement(_allCourseText);
    }


}
