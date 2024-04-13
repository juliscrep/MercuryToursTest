package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    private WebDriver driver;
    public Base (WebDriver driver){

        this.driver= driver;
    }

    public WebDriver chromeDriverConnection(){

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();

        return driver;
    }

    //Hago un wrapping de los metodos de selenium webDriver
    public WebElement findElement(By locator){
        return  driver.findElement(locator);
    }

}







