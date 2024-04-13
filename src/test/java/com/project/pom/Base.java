package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.NoSuchElementException;

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

    public List<WebElement> findElements(By locator){ //metodo propio personalizado
        return driver.findElements(locator); //metodo de selenium webDriver
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public String getText(WebElement element){  // sobrecarga/overload del metodo con distinto tipo de argumento de entrada
        return element.getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public boolean isDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        }catch (NoSuchElementException e){
            return false; //retorna falso cuando el elemento no esta, no existe o fue modificado
        }

    }

    public void visit(String url){
        driver.get(url);
    }

}







