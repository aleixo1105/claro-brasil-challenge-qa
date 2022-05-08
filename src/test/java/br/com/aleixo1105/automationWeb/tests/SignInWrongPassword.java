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


public class SignInWrongPassword {
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
    public void signInWrongPassword() {

        homePage.clickBtnSignIn();

        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
        }

        signInPage.inputEmailSignIn(oldEmail);
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
