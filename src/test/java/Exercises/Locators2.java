package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {

        String name = "rahul";

//        System.setProperty("webdriver.chrome.driver", "C:/Users/cecilia.cenoz/IdeaProjects/Test/src/test/java/Drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:/Users/cecilia.cenoz/IdeaProjects/Test/src/test/java/Drivers/geckodriver.exe");
//        FirefoxOptions optionsfox = new FirefoxOptions();
//        optionsfox.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
//        WebDriver driver = new FirefoxDriver(optionsfox);
//        System.out.println("inicia firefox");

        System.setProperty("webdriver.edge.driver", "C:/Users/cecilia.cenoz/IdeaProjects/Test/src/test/java/Drivers/msedgedriver.exe");
        EdgeOptions optionsedge = new EdgeOptions();
        optionsedge.setBinary("C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe");
        WebDriver driver = new EdgeDriver(optionsedge);
        System.out.println("inicia edge");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();
    }
    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        // Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray = passwordText.split("'");
        //Please use temporary password
        //rahulshettyacademy' to Login.
//        String[] passwordArray2 = passwordArray[1].split("'");
//        passwordArray2[0];   //rahulshettyacademy
        String password = passwordArray[1].split("'")[0];   //rahulshettyacademy
        return password;
    }
}
