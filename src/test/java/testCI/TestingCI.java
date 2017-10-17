package testCI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingCI {
WebDriver driver;

    @BeforeTest
    public void setup1(){
        System.setProperty("webdriver.chrome.driver","C:/Users/anshu/IdeaProjects/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");}


    @Test
    public void testValidSearch() throws InterruptedException {
                  driver.findElement(By.id("email")).sendKeys("Success Story");
        Assert.assertTrue(true);
    }
    @Test
    public void Test2(){
        Assert.assertTrue(true);
    }

    @Test
    public void test3(){
        Assert.assertTrue(true);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
