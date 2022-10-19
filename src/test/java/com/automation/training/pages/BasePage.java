package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver pDriver){
        PageFactory.initElements(pDriver,this);
        wait = new WebDriverWait(pDriver, Duration.ofSeconds(10));
        driver = pDriver;
    }
    protected WebDriverWait getWait(){
        return wait;
    }
    protected WebDriver getDriver(){
        return driver;
    }
    public void dispose(){
        if (driver != null){
            driver.quit();
        }
    }
}
