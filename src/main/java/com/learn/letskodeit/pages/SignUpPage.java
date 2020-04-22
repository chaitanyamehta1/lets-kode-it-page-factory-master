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
public class SignUpPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());


    @FindBy(xpath = "//h1[contains(text(),Sign Up to Let's Kode It)]")
    WebElement _getSignUpMessage;

    public String getSignUpText(){
        Reporter.log("Getting sign up text message " + _getSignUpMessage.toString()+"<br>");
        log.info("Geting sign up text message " + _getSignUpMessage.toString());
        return getTextFromElement(_getSignUpMessage);
    }




}
