package br.com.aleixo1105.automationWeb.tests;

import br.com.aleixo1105.automationWeb.core.Driver;
import br.com.aleixo1105.automationWeb.pages.CreateAccountPage;
import br.com.aleixo1105.automationWeb.pages.HomePage;
import br.com.aleixo1105.automationWeb.pages.MyAccountPage;
import br.com.aleixo1105.automationWeb.pages.SignInPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CreateAccount {
    WebDriver webDriver;
    Driver driver;
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    MyAccountPage myAccountPage;
    String newEmail = "newemail07051c@gmail.com";


    @Before
    public void startTest(){
        driver = new Driver("chrome");
        webDriver = driver.getDriver();
        webDriver.get("http://automationpractice.com/");
        homePage = new HomePage(webDriver);
        signInPage = new SignInPage(webDriver);
        createAccountPage = new CreateAccountPage(webDriver);
        myAccountPage = new MyAccountPage(webDriver);
    }
    @Test
    public void createAccount() {
        homePage.clickBtnSignIn();

        try {
            Thread.sleep(2000);
        } catch (Exception erro) {
        }

        signInPage.inputEmailCreate(newEmail);
        signInPage.clickBtnCreateAccount();

        try {
            Thread.sleep(2000);
        } catch (Exception erro) {
        }


        createAccountPage.inputFirstName("Marcel");
        createAccountPage.inputLastName("Aleixo");
        createAccountPage.inputPassword("123456");
        createAccountPage.inputAddressFirstName("Avenida Maria Marreira");
        createAccountPage.inputAddressLastName("Conjunto");
        createAccountPage.inputAddress("Nova Cidade");
        createAccountPage.inputCity("Manaus");
        createAccountPage.inputState("Virginia");
        createAccountPage.inputPostalCode("88888");
        createAccountPage.inputCountry("United States");
        createAccountPage.inputMobilePhone("929292992");
        createAccountPage.clickSubmitAccount();

        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
        }

        myAccountPage.validateMyAccountPage();
    }

    @After
    public void closeTest(){
        webDriver.quit();
    }
}