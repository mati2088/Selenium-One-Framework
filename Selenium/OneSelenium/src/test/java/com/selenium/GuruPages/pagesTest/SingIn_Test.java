package com.selenium.GuruPages.pagesTest;

import com.selenium.GuruPages.pages.SingInPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertTrue;

public class SingIn_Test {
    private WebDriver driver;
    SingInPage singInPage;


    @Before
    public void setUp()throws Exception{
    singInPage=new SingInPage(driver);
    driver=singInPage.chromeConexion();
    singInPage.visitPage("https://demo.guru99.com/test/newtours/");
    }



    @After
    public void tearDown()throws Exception{
        //driver.quit();
    }

    @Test
    public void test()throws InterruptedException{
    singInPage.singIn();
        Thread.sleep(2000);

    }
}
