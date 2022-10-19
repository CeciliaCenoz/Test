package Exercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/cecilia.cenoz/IdeaProjects/Test/src/test/java/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("https://rahulshettyacademy.com");
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        //driver.navigate().forward();
    }
}

