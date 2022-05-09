package br.com.automationWeb.tests;

import br.com.automationWeb.core.Driver;
import br.com.automationWeb.pages.CreateAccountPage;
import br.com.automationWeb.pages.HomePage;
import br.com.automationWeb.pages.MyAccountPage;
import br.com.automationWeb.pages.SignInPage;
import com.github.javafaker.Faker;
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
    public void createAccount() {
        homePage.clickBtnSignIn();

        try {
            Thread.sleep(2000);
        } catch (Exception erro) {
        }

        signInPage.inputEmailCreate(faker.internet().emailAddress());
        signInPage.clickBtnCreateAccount();

        try {
            Thread.sleep(4000);
        } catch (Exception erro) {
        }

        createAccountPage.inputFirstName(faker.name().firstName());
        createAccountPage.inputLastName(faker.name().lastName());
        createAccountPage.inputPassword(faker.internet().password());
        createAccountPage.inputAddressFirstName(faker.address().firstName());
        createAccountPage.inputAddressLastName(faker.address().lastName());
        createAccountPage.inputAddress(faker.address().streetAddress());
        createAccountPage.inputCity(faker.address().city());
        createAccountPage.inputState(faker.address().state());
        createAccountPage.inputPostalCode(faker.address().zipCode());
        createAccountPage.inputCountry("United States");
        createAccountPage.inputMobilePhone(faker.phoneNumber().cellPhone());
        createAccountPage.clickSubmitAccount();

        try {
            Thread.sleep(2000);
        } catch (Exception erro) {
        }

        myAccountPage.validateMyAccountPage();
    }

    @After
    public void closeTest(){
        webDriver.quit();
    }
}
