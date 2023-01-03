package com.selenium.GuruPages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrapper.BaseWrapper;

public class RegisterPage extends BaseWrapper {

    //Register Variables
    By registerLinkLocator=By.linkText("REGISTER");
    By registerPageSelector=By.xpath("//img[@src='images/mast_register.gif']");
    By firstNameLocator=By.name("email");
    By passwordLocator=By.name("password");
    By passwordConfirmLocator=By.name("confirmPassword");
    By submitLocator= By.name("submit");

     public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void registerUser() throws InterruptedException {
        click(registerLinkLocator);
        Thread.sleep(2000);
        if (isDisplayed(registerPageSelector)){
            type("admin",firstNameLocator);
            type("password",passwordLocator);
            type("password",passwordConfirmLocator);

            click(submitLocator);
        }else {
            System.out.println("Register pages was not found");
        }
    }

}
