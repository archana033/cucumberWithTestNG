package org.newFrmwrk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logInPage {
    private WebDriver driver;

    //By locators
    WebElement username = driver.findElement(By.id("username"));
    WebElement password = driver.findElement(By.id("password"));
    WebElement logIn_Btn = driver.findElement(By.id("login-submit"));

    public logInPage(WebDriver driver){
        this.driver = this.driver;
    }

    public void enteruser(String username){


    }

    public void enterPassword(){

    }




}
