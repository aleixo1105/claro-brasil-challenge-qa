package br.com.aleixo1105.automationWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;

public class TesteWeb {

    ChromeDriver driver;
    String email = "teste20221234567899s@gmail.com";
    String password = "123456";

    @Before
    public void startTest(){
        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");
    }


    @Test
    public void createAccountTest() {


        String xpathSingInHome = "//*[@id=\"header\"]/div[2]//a";

        driver.findElement(By.xpath(xpathSingInHome)).click();

        String xpathEmailCreate = "//*[@id=\"email_create\"]";
        String xpathCreateAccount = "//*[@id=\"SubmitCreate\"]";

        driver.findElement(By.xpath(xpathEmailCreate)).sendKeys(email);
        driver.findElement(By.xpath(xpathCreateAccount)).click();

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

        driver.findElement(By.xpath(xpathFirstName)).sendKeys("Marcel");
        driver.findElement(By.xpath(xpathLastName)).sendKeys("Aleixo");
        /*driver.findElement(By.xpath(xpathEmail)).sendKeys(email);*/
        driver.findElement(By.xpath(xpathPassword)).sendKeys(password);
        driver.findElement(By.xpath(xpathAddressFirstName)).clear();
        driver.findElement(By.xpath(xpathAddressFirstName)).sendKeys("Avenida Maria Marreira");
        driver.findElement(By.xpath(xpathAddressLastName)).clear();
        driver.findElement(By.xpath(xpathAddressLastName)).sendKeys("Conjunto");
        driver.findElement(By.xpath(xpathAddress)).sendKeys("Nova Cidade");
        driver.findElement(By.xpath(xpathCity)).sendKeys("Manaus");
        driver.findElement(By.xpath(xpathState)).sendKeys("Virginia");
        driver.findElement(By.xpath(xpathCountry)).sendKeys("United States");
        driver.findElement(By.xpath(xpathPostalCode)).sendKeys("88888");
        driver.findElement(By.xpath(xpathMobilePhone)).sendKeys("92981033265");
        driver.findElement(By.xpath(xpathRegister)).click();

        String textAccount = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();

        Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", textAccount);

    }

    @Test
    public void loginAccountTest() {

        String xpathSingInHome = "//*[@id=\"header\"]/div[2]//a";

        driver.findElement(By.xpath(xpathSingInHome)).click();

        String xpathEmailAddress = "//*[@id=\"email\"]";
        String xpathPassword = "//*[@id=\"passwd\"]";
        String xpathSubmitLogin = "//*[@id=\"SubmitLogin\"]";

        driver.findElement(By.xpath(xpathEmailAddress)).sendKeys(email);
        driver.findElement(By.xpath(xpathPassword)).sendKeys(password);
        driver.findElement(By.xpath(xpathSubmitLogin)).click();

        try {
            Thread.sleep(5000);
        } catch (Exception erro) {
        }

        String textAccount = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();

        Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", textAccount);

    }

    @After
    public void closeTest(){

        driver.quit();
    }

}