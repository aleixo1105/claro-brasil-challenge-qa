package br.com.aleixo1105.automationWeb.tests;

import br.com.aleixo1105.automationWeb.core.Driver;
import br.com.aleixo1105.automationWeb.pages.CreateAccountPage;
import br.com.aleixo1105.automationWeb.pages.HomePage;
import br.com.aleixo1105.automationWeb.pages.MyAccountPage;
import br.com.aleixo1105.automationWeb.pages.SignInPage;
import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.lang.Thread;


public class SignInUnregisteredUser {
    WebDriver webDriver;
    Driver driver;
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    MyAccountPage myAccountPage;
    Faker faker;

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
    public void signInUnregisteredUser() {

        homePage.clickBtnSignIn();

        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
        }

        signInPage.inputEmailSignIn(faker.internet().emailAddress());
        signInPage.inputPassword(faker.internet().password());
        signInPage.clickBtnSubmitLogin();

        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
        }
        signInPage.checkInvalidAccount();
    }

    @After
    public void closeTest(){
        webDriver.quit();
    }

}
