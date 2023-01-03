package com.selenium.GuruPages.pagesTest;

import com.selenium.GuruPages.pages.RegisterPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertEquals;

public class register_Test {
    private WebDriver driver;
    RegisterPage registerPage;

    @Before
    public void setUp()throws Exception{
        registerPage=new RegisterPage(driver);
        driver=registerPage.chromeConexion();
        registerPage.visitPage("https://demo.guru99.com/test/newtours/");
    }

    @After
    public void tearDown()throws Exception{
        //driver.quit();
    }

    @Test
    public void test()throws InterruptedException{
        registerPage.registerUser();



    }




}
