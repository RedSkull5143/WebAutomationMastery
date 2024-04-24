package com.omshinde.webautomastery.pages.account;

import com.omshinde.webautomastery.actions.WebActions;
import com.omshinde.webautomastery.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"MainContent\"]/div/div[2]/div[2]/p")
    private WebElement accountDetailsEle;
    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getAccountDetails() {
        return webActions.getText(accountDetailsEle);
    }
}
