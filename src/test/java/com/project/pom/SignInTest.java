package com.project.pom;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInTest {

    private WebDriver driver;
    SignInPage signInPage;

    @BeforeTest
    public void setUp() throws Exception{
        signInPage = new SignInPage(driver);
        driver = signInPage.chromeDriverConnection();
        signInPage.visit("https://demo.guru99.com/test/newtours/register.php");
    }

    @Test
    public void test() throws InterruptedException{
        signInPage.signIn();
        Thread.sleep(2000);
        Assert.assertTrue(signInPage.isHomePageDisplayed());
    }

    @AfterTest
    public void tearDown() throws Exception{
        driver.quit();
    }

}
