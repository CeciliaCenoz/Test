package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WikiHomePage extends BasePage {

    public WikiHomePage(WebDriver driver) {
        super(driver);
        driver.get("https://wikipedia.org");
    }

    @FindBy(linkText = "Español")
    private WebElement linkEspanol;

    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(css = "button.pure-button[type='submit']")
    private WebElement searchButton;

    public ArticlePage search(String searching){
        searchInput.sendKeys(searching);
        getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
        return new ArticlePage(getDriver());
    }
}

