package com.learn.letskodeit.testbase;

import com.learn.letskodeit.basepage.BasePage;
import com.learn.letskodeit.browserselector.BrowserSelector;
import com.learn.letskodeit.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chaitanya
 */
public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");


    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    @AfterMethod(groups = {"smoke","regression","sanity"})
    public void tearDown(){
        driver.quit();
    }
}
