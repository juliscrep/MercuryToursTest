package com.project.pom;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest {

    private WebDriver driver;
    RegisterPage registerPage;
    @BeforeTest
    public void setUp() throws Exception{
        registerPage = new RegisterPage(driver);
        driver = registerPage.chromeDriverConnection();
        registerPage.visit("https://demo.guru99.com/test/newtours/register.php");
    }

    @Test
    public void test() throws InterruptedException{
        registerPage.registerUser();
        Assert.assertEquals("Note: Your user name is Julieta.",registerPage.registeredMessage());

    }

    @AfterTest
    public void tearDown() throws Exception{
        driver.quit();
    }

}
