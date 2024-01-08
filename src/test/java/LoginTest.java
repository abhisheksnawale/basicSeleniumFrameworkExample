package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void enterEmail(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnSignInBtn();

        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.verifyLoginPage();
        loginPageEvents.signIn();
    }
}
