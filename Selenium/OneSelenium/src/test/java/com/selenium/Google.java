package com.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;
@Deprecated
public class Google {
    private WebDriver driver;

    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\matia\\OneDrive\\Escritorio\\Selenium Web Driver\\Selenium Web Driver #P1\\Selenium\\OneSelenium\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    @Test
    public  void google(){
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.clear();
        searchBox.sendKeys("mineacraft");
        searchBox.submit();
        //Implicit Wait
        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

        //Explicit Wait : Recomendada
        //WebDriverWait eWait=new WebDriverWait(driver, Duration.ofSeconds(10));
        //eWait.until(ExpectedConditions.titleContains("mineacraft"));

        //Fluent Wait


        assertEquals("mineacraft - Buscar con Google",driver.getTitle());
    }
}
