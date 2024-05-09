package com.omshinde.webautomastery.featuretests;

import com.omshinde.webautomastery.BaseTest;
import com.omshinde.webautomastery.components.HeaderComponent;
import com.omshinde.webautomastery.components.SearchModal;
import com.omshinde.webautomastery.models.SearchContext;
import com.omshinde.webautomastery.models.User;
import com.omshinde.webautomastery.pages.HomePage;
import com.omshinde.webautomastery.pages.ProductsPage;
import com.omshinde.webautomastery.pages.account.LoginPage;
import com.omshinde.webautomastery.pages.account.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchProduct extends BaseTest {
    @Test
    public void userIsAbleToSearchProductAfterLogin() throws InterruptedException {
        //arrange
        User user= User.builder().build().userWithValidCredentials();
        SearchContext searchContext=SearchContext.builder().build().init();

        //act
        HomePage homePage=new HomePage(getWebDriver());
        Thread.sleep(2000);
        LoginPage loginPage = homePage.getHeader().navToLogin();
        Thread.sleep(2000);
        ProfilePage profilePage = loginPage.login(user);
        Thread.sleep(2000);
        profilePage.getHeader().openSearchModal();
        Thread.sleep(2000);

        SearchModal searchModal=new SearchModal(getWebDriver());
        Thread.sleep(2000);
        ProductsPage productsPage = searchModal.input(searchContext.getKey());
        Thread.sleep(2000);

        int resultsCount = productsPage.getResultsCount();

        //assert
        Assert.assertTrue(resultsCount>0);

    }
}
