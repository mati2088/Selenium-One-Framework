package com.selenium.GuruPages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrapper.BaseWrapper;

public class SingInPage  extends BaseWrapper {
    By signUpUsernameLocator= By.name("userName");

    By signUpPasswordLocator=By.name("password");

    By signUpPageSelector=By.xpath("//img [@src='images/hdr_findflight.gif']");

    By signUpSubmit=By.name("submit");

    public SingInPage(WebDriver driver) {
        super(driver);
    }

    public void singIn(){
        if (isDisplayed(signUpUsernameLocator)){
            type("admin",signUpUsernameLocator);
            type("password",signUpPasswordLocator);
            click(signUpSubmit);
        }else {
            System.out.println("Username textBox not present");
        }
    }

    public boolean isHomePageDisplayed(){
        return isDisplayed(signUpPageSelector);
    }
}
