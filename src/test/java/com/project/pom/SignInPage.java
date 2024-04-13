package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base{

    By userLocator= By.name("userName");
    By passLocator = By.name("password");
    By signInBtnLocator = By.name("submit");
    By pageLocator= By.tagName("h3");
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void signIn() {
        if(isDisplayed(userLocator)){
            type("Julieta",userLocator);
            type("1234",passLocator);
            click(signInBtnLocator);
        } else {
            System.out.print("El usuario no existe!");
        }
    }

    public boolean isHomePageDisplayed(){
        return isDisplayed(pageLocator);
    }
}



