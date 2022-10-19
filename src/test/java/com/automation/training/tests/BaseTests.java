package com.automation.training.tests;

import com.automation.training.others.MyDriver;
import com.automation.training.pages.WikiHomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTests {
    MyDriver myDriver;
    WikiHomePage wikiHome;
    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser"})

    public void beforeSuite(String browser){
        System.out.println(browser);
        myDriver = new MyDriver(browser);
        wikiHome = new WikiHomePage(myDriver.getDriver());
    }
    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        wikiHome.dispose();
    }
    public WikiHomePage getWikiHomePage(){
        return wikiHome;
    }
}
