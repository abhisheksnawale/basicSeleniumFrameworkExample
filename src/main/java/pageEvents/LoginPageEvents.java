package main.java.pageEvents;

import main.java.pageObjects.LoginPageElements;
import main.java.utils.ElementFetch;
import org.testng.Assert;
import test.java.BaseTest;

public class LoginPageEvents {
    ElementFetch elementFetch = new ElementFetch();
    public void verifyLoginPage(){
        BaseTest.logger.info("Verifying the Sign-In page");
        Assert.assertFalse(elementFetch.getListWebElements("XPATH", LoginPageElements.signInHeader).isEmpty(),
                "The page is not loaded!");
    }

    public void signIn(){
        BaseTest.logger.info("Entering the email address");
        elementFetch.getWebElement("ID", LoginPageElements.signInTxtBox).sendKeys("abhisheksnawale@gmail.com");
    }
}
