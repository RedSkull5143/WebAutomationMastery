package com.omshinde.webautomastery.featuretests;

import com.omshinde.webautomastery.BaseTest;
import com.omshinde.webautomastery.models.User;
import com.omshinde.webautomastery.pages.HomePage;
import com.omshinde.webautomastery.pages.account.LoginPage;
import com.omshinde.webautomastery.pages.account.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void userIsAbleToLoginAndRedirectToHomePage() {
        //arrange
        User user= User.builder().build().userWithValidCredentials();
        HomePage homePage=new HomePage(getWebDriver());

        //act
        LoginPage loginPage = homePage.getHeader().navToLogin();
        ProfilePage profilePage = loginPage.login(user);
        String accountDetails = profilePage.getAccountDetails();

        //assert
        Assert.assertTrue(accountDetails.contains(user.getFirstName().toLowerCase()));
        Assert.assertTrue(accountDetails.contains(user.getLastName().toLowerCase()));
    }

    @Test
    public void verifyThatUserIsAbleToLoginWithIncorrectCrediantials(){
        //arrange
        User user= User.builder().build().userWithInvalidCredentials();
        HomePage homePage=new HomePage(getWebDriver());

        //act
        LoginPage loginPage = homePage.getHeader().navToLogin();
        loginPage.login(user);
        String errorMessage = loginPage.getErrorMessage();

        //assert
        Assert.assertTrue(errorMessage.contains("Incorrect email or password."));

    }
}