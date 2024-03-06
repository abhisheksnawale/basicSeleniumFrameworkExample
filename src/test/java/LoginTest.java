package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test(priority = 0)
    public void enterEmail(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnSignInBtn();

        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.verifyLoginPage();
        loginPageEvents.signIn();
    }
    @Test(priority = 1)
    public void postAPI(){
        PostExample.postAPI();
    }

    @Test(priority = 2)
    public void getAPI(){
        GetExample.getAPI();
    }
}
