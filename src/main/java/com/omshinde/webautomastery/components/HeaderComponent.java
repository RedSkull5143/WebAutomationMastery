package com.omshinde.webautomastery.components;

import com.omshinde.webautomastery.pages.BasePage;
import com.omshinde.webautomastery.pages.HomePage;
import com.omshinde.webautomastery.pages.account.LoginPage;
import com.omshinde.webautomastery.pages.account.ProfilePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends BasePage {

    @FindBy(xpath = "//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[1]")
    private WebElement AccountLoginEle;

    @FindBy(xpath = "//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[1]")
    private WebElement profileLoginEle;

    @FindBy(xpath = "//*[@id=\"shopify-section-header\"]/sticky-header/header/nav/ul/li[1]/a/span")
    private WebElement homeLinkEle;

    @FindBy(xpath = "//*[@id=\"shopify-section-header\"]/sticky-header/header/div/details-modal/details/summary/span")
    private WebElement searchBtnEle;

   public HeaderComponent(WebDriver webDriver) {
        super(webDriver);
    }

    @Step("Nagivate to Login")
    public LoginPage navToLogin() {
        buttonAction.click(AccountLoginEle);
        return new LoginPage(webDriver);
    }

    @Step("Navigate to Profile")
    public ProfilePage navToUserProfile() {
        buttonAction.click(profileLoginEle);
        return new ProfilePage(webDriver);
   }

   public HomePage navToHomePage(){
       buttonAction.click(homeLinkEle);
       return new HomePage(webDriver);
   }

   public SearchModal openSearchModal(){
       buttonAction.click(searchBtnEle);
       return new SearchModal(webDriver);
   }

}
