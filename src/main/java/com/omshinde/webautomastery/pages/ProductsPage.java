package com.omshinde.webautomastery.pages;

import com.omshinde.webautomastery.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    @FindBy(id = "ProductCountDesktop")
    private WebElement resultCountEle;

    public ProductsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public int getResultsCount(){
        String originalCount=webActions.getText(resultCountEle).trim();
        String updatedCount=originalCount.replace(" results","").trim();
        Integer count=Integer.parseInt(updatedCount);
        return count;
    }

}
