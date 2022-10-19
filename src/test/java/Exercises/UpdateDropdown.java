package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/cecilia.cenoz/IdeaProjects/Test/src/test/java/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount"));//too long
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement((By.id("Div1"))).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement((By.id("Div1"))).getAttribute("style"));
        //if(driver.findElement((By.id("Div1"))).getAttribute("style").contains("0.5"))
        if(driver.findElement((By.id("Div1"))).getAttribute("style").contains("1"))
        {
            System.out.println("It's enabled");
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }



        //count the number of the checkboxes
        driver.findElements(By.cssSelector("input[type='checkbox']")).size();


        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
//        int i = 1;
//        while(i<5)
//        {
//            driver.findElement(By.id("hrefIncAdt")).click();
//            i++;
//        }
//        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        for(int i=1;i<5;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
