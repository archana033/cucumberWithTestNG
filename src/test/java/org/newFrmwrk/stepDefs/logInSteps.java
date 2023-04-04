package org.newFrmwrk.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.newFrmwrk.pages.logInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logInSteps {

    private WebDriver driver;
    private logInPage LogInPage;

    @Before
    public void setUp(){
        //launch chrome
        WebDriver driver = new ChromeDriver();
    }
    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
            // we can also use driver.close() but it will terminate the current window only,
            // so to end the complete browser session we use quit method.
        }
    }

    @Given("I am on the app's login page")
    public void i_am_on_the_app_s_login_page() {
       driver.get("https://www.saucedemo.com/");
        LogInPage = new logInPage(driver);

    }
    @When("I enter the {string} and {string}")
    public void i_enter_the_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
