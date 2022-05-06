package br.com.aleixo1105.automationWeb;

import br.com.aleixo1105.automationWeb.core.Driver;
import br.com.aleixo1105.automationWeb.pages.HomePage;
import br.com.aleixo1105.automationWeb.pages.SignInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;

public class TesteWeb {

    WebDriver webDriver;
    Driver driver;
    HomePage homePage;
    SignInPage signInPage;


    @Before
    public void startTest(){

        driver = new Driver("chrome");

        webDriver = driver.getDriver();

        webDriver.get("http://automationpractice.com/");
        homePage = new HomePage(webDriver);
        signInPage = new SignInPage(webDriver);
    }

    @Test
    public void createAccountTest() {

        homePage.clickBtnSignIn();

        String xpathEmailCreate = "//*[@id=\"email_create\"]";
        String xpathCreateAccount = "//*[@id=\"SubmitCreate\"]";

        webDriver.findElement(By.xpath(xpathEmailCreate)).sendKeys("email");
        webDriver.findElement(By.xpath(xpathCreateAccount)).click();

        String xpathFirstName = "//div/div[2]/input";
        String xpathLastName = "//*[@id='customer_lastname']";
        String xpathEmail = "//*[@id='email']";
        String xpathPassword = "//*[@id='passwd']";
        String xpathAddressFirstName = "//div[2]/p[1]/input";
        String xpathAddressLastName = "//*[@id='lastname']";
        String xpathAddress = "//*[@id='address1']";
        String xpathCity = "//*[@id='city']";
        String xpathState = "//*[@id='id_state']";
        String xpathPostalCode = "//*[@id='postcode']";
        String xpathCountry = "//*[@id='id_country']";
        String xpathMobilePhone = "//*[@id='phone_mobile']";
        String xpathRegister = "//*[@id='submitAccount']/span";

        try {
            Thread.sleep(5000);
        } catch (Exception erro) {
        }

        webDriver.findElement(By.xpath(xpathFirstName)).sendKeys("Marcel");
        webDriver.findElement(By.xpath(xpathLastName)).sendKeys("Aleixo");
        webDriver.findElement(By.xpath(xpathPassword)).sendKeys("password");
        webDriver.findElement(By.xpath(xpathAddressFirstName)).clear();
        webDriver.findElement(By.xpath(xpathAddressFirstName)).sendKeys("Avenida Maria Marreira");
        webDriver.findElement(By.xpath(xpathAddressLastName)).clear();
        webDriver.findElement(By.xpath(xpathAddressLastName)).sendKeys("Conjunto");
        webDriver.findElement(By.xpath(xpathAddress)).sendKeys("Nova Cidade");
        webDriver.findElement(By.xpath(xpathCity)).sendKeys("Manaus");
        webDriver.findElement(By.xpath(xpathState)).sendKeys("Virginia");
        webDriver.findElement(By.xpath(xpathCountry)).sendKeys("United States");
        webDriver.findElement(By.xpath(xpathPostalCode)).sendKeys("88888");
        webDriver.findElement(By.xpath(xpathMobilePhone)).sendKeys("92981033265");
        webDriver.findElement(By.xpath(xpathRegister)).click();

        String textAccount = webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();

        Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", textAccount);

    }

    @Test
    public void loginAccountTest() {

        homePage.clickBtnSignIn();

        try {
            Thread.sleep(5000);
        } catch (Exception erro) {
        }

        signInPage.inputEmailAddress();

        signInPage.inputPassword();

        signInPage.clickBtnSubmitLogin();


        try {
            Thread.sleep(5000);
        } catch (Exception erro) {
        }

        String textAccount = webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();

        Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", textAccount);
    }




    @After
    public void closeTest(){
        webDriver.quit();
    }
}