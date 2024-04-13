package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class RegisterPage extends Base{

    By registerLinkLocator= By.linkText("REGISTER");
    By registerPageLocator= By.xpath("//img[@src='images/mast_register.gif']");
    By pageLocator= By.tagName("h3");
    By userNameLocator= By.id("email");
    By passwordLocator= By.name("password");
    By confirmPasswordLocator= By.cssSelector("input[name='confirmPassword']");
    By registerBtnLocator= By.name("submit");

    By registeredMessageLocator= By.tagName("font");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void registerUser() throws InterruptedException{

        click(registerLinkLocator);
        Thread.sleep(2000);

        if(isDisplayed(registerPageLocator)){
            type("Julieta",userNameLocator);
            type("1234",passwordLocator);
            type("1234",confirmPasswordLocator);
            click(registerBtnLocator);

        }else {
            System.out.print("Página no encontrada!");
        }

    }

    public String registeredMessage(){

        List<WebElement> fonts = findElements(registeredMessageLocator);

        return getText(fonts.get(5));
    }
}





