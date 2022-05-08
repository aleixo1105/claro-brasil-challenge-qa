package br.com.aleixo1105.automationWeb.tests;

import br.com.aleixo1105.automationWeb.core.Driver;
import br.com.aleixo1105.automationWeb.pages.CreateAccountPage;
import br.com.aleixo1105.automationWeb.pages.HomePage;
import br.com.aleixo1105.automationWeb.pages.MyAccountPage;
import br.com.aleixo1105.automationWeb.pages.SignInPage;
import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.lang.Thread;

public class CreateAccountEmailRegistered {

    WebDriver webDriver;
    Driver driver;
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    MyAccountPage myAccountPage;
    Faker faker;
    String oldEmail = "teste20221234567899s@gmail.com";

    @Before
    public void startTest(){
        driver = new Driver("chrome");
        webDriver = driver.getDriver();
        webDriver.get("http://automationpractice.com/");
        homePage = new HomePage(webDriver);
        signInPage = new SignInPage(webDriver);
        createAccountPage = new CreateAccountPage(webDriver);
        myAccountPage = new MyAccountPage(webDriver);
        faker = new Faker();
    }

    @Test
    public void createAccountEmailRegistered() {
        homePage.clickBtnSignIn();

        try {
            Thread.sleep(3000);
        } catch (Exception erro) {
        }

        signInPage.inputEmailCreate(oldEmail);
        signInPage.clickBtnCreateAccount();

        try {
            Thread.sleep(6000);
        } catch (Exception erro) {
        }
        signInPage.checkRegisteredEmail();
    }

    @After
    public void closeTest(){
        webDriver.quit();
    }
}
