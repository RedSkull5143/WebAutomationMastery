package com.omshinde.webautomastery.featuretests;

import com.omshinde.webautomastery.BaseTest;
import com.omshinde.webautomastery.components.HeaderComponent;
import com.omshinde.webautomastery.components.SearchModal;
import com.omshinde.webautomastery.models.User;
import com.omshinde.webautomastery.pages.HomePage;
import com.omshinde.webautomastery.pages.account.LoginPage;
import org.testng.annotations.Test;


public class SearchProduct extends BaseTest {
    @Test
    public void userIsAbleToSearchProductAfterLogin() throws InterruptedException {
        User user=new User("Om","Shinde","omshinde@gmail.com","OmShinde@1234");
        HomePage homePage=new HomePage(getWebDriver());
        HeaderComponent headerComponent=new HeaderComponent(getWebDriver());
        LoginPage loginPage = homePage.getHeader().navToLogin();
        loginPage.login(user);
        headerComponent.navToHomePage();
        homePage.getHeader().openSearchModal();
        SearchModal searchModal=new SearchModal(getWebDriver());
        searchModal.input();
        Thread.sleep(5000);
    }
}
