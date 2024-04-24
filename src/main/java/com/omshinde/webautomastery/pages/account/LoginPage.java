package com.omshinde.webautomastery.pages.account;

import com.omshinde.webautomastery.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"customer_login\"]/a[2]")
    private WebElement createAccountLinkEle;
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public RegistrationPage navToCreateAccount() {
        buttonAction.click(createAccountLinkEle);
        return new RegistrationPage(webDriver);
    }
}
