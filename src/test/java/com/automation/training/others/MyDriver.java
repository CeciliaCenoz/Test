package com.automation.training.others;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MyDriver {
    private WebDriver driver;

    public MyDriver(String browser) {
        switch (browser) {
            case "edge":
                System.setProperty("webdriver.edge.driver", "C:/Users/cecilia.cenoz/IdeaProjects/Test/src/test/java/Drivers/msedgedriver.exe");
                EdgeOptions optionsedge = new EdgeOptions();
                optionsedge.setBinary("C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe");
                driver = new EdgeDriver(optionsedge);
                System.out.println("inicia edge");
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:/Users/cecilia.cenoz/IdeaProjects/Test/src/test/java/Drivers/geckodriver.exe");
                FirefoxOptions optionsfox = new FirefoxOptions();
                optionsfox.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
                driver = new FirefoxDriver(optionsfox);
                System.out.println("inicia firefox");
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:/Users/cecilia.cenoz/IdeaProjects/Test/src/test/java/Drivers/chromedriver.exe");
                driver = new ChromeDriver();
                System.out.println("inicia chrome");
                break;
//            case "remoteFirefox":
//                try {
//                    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),DesiredCapabilities.firefox);
//                }catch(MalformedURLException e){
//                    e.printStackTrace();
//                }
            default:
                break;
        }
    }
        public WebDriver getDriver() {
            return this.driver;
        }
    }
