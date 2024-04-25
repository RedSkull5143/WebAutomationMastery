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
    public void userIsAbleToSearchProductAfterLogin() {
        //arrange
        User user= User.builder().build().userWithValidCredentials();
        SearchContext searchContext=SearchContext.builder().build().init();

        //act
        HomePage homePage=new HomePage(getWebDriver());
        LoginPage loginPage = homePage.getHeader().navToLogin();
        ProfilePage profilePage = loginPage.login(user);
        profilePage.getHeader().openSearchModal();

        SearchModal searchModal=new SearchModal(getWebDriver());
        ProductsPage productsPage = searchModal.input(searchContext.getKey());

        int resultsCount = productsPage.getResultsCount();

        //assert
        Assert.assertTrue(resultsCount>0);

    }
}
