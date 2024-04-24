package com.omshinde.webautomastery.featuretests;

import com.omshinde.webautomastery.BaseTest;
import com.omshinde.webautomastery.components.HeaderComponent;
import com.omshinde.webautomastery.models.User;
import com.omshinde.webautomastery.pages.HomePage;
import com.omshinde.webautomastery.pages.account.LoginPage;
import com.omshinde.webautomastery.pages.account.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void userIsAbleToLoginAndRedirectToHomePage() throws InterruptedException {

        User user=new User("Om","Shinde","omshinde@gmail.com","OmShinde@1234");
        HomePage homePage = new HomePage(getWebDriver());
        LoginPage loginPage = homePage.getHeader().navToLogin();

        loginPage.navToProfilePage();
        HeaderComponent headerComponent=new HeaderComponent(getWebDriver());
        headerComponent.navToHomePage();
        ProfilePage profilePage=new ProfilePage(getWebDriver());
        String accountDetails=profilePage.getAccountDetails();

        Assert.assertEquals(user.getFirstName(),"Om");
    }
}