package com.omshinde.webautomastery.components;

import com.omshinde.webautomastery.pages.BasePage;
import com.omshinde.webautomastery.pages.account.LoginPage;
import com.omshinde.webautomastery.pages.account.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends BasePage {

    @FindBy(xpath = "//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[1]")
    private WebElement AccountLoginEle;

    @FindBy(xpath = "//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[1]")
    private WebElement profileLoginEle;

   public HeaderComponent(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage navToLogin() {
       buttonAction.click(AccountLoginEle);
        return new LoginPage(webDriver);
    }

    public ProfilePage navToUserProfile() {
        buttonAction.click(profileLoginEle);
        return new ProfilePage(webDriver);
   }
}
