package com.omshinde.webautomastery.pages.account;

import com.omshinde.webautomastery.models.User;
import com.omshinde.webautomastery.pages.BasePage;
import com.omshinde.webautomastery.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(id = "RegisterForm-FirstName")
    private WebElement firstNameEle;

    @FindBy(id = "RegisterForm-LastName")
    private WebElement lastNameEle;

    @FindBy(id = "RegisterForm-email")
    private WebElement emailIdEle;

    @FindBy(id = "RegisterForm-password")
    private WebElement passwordEle;

    @FindBy(xpath = "//*[@id=\"create_customer\"]/button")
    private WebElement createButtonEle;

    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage createAccount(User user) {
        textBox.typing(firstNameEle, user.getFirstName());
//        firstNameEle.sendKeys(user.getFirstName());
        textBox.typing(lastNameEle, user.getLastName());
//        lastNameEle.sendKeys(user.getLastName());
        textBox.typing(emailIdEle, user.getEmail());
//        emailIdEle.sendKeys(user.getEmail());
        textBox.typing(passwordEle, user.getPassword());
//        passwordEle.sendKeys(user.getPassword());
        buttonAction.click(createButtonEle);
//        createButtonEle.click();
        return new HomePage(webDriver);
    }
}
