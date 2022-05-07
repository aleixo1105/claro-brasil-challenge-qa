package br.com.aleixo1105.automationWeb.maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountMap {

    @FindBy(xpath="//div/div[2]/input")
    public WebElement tbFirstName;

    @FindBy(xpath="//*[@id='customer_lastname']")
    public WebElement tbLastName;

    @FindBy(xpath="//*[@id='passwd']")
    public  WebElement tbPassword;

    @FindBy(xpath="//div[2]/p[1]/input")
    public  WebElement tbAddressFirstName;

    @FindBy(xpath="//*[@id='lastname']")
    public  WebElement tbAddressLastName;

    @FindBy(xpath="//*[@id='address1']")
    public  WebElement tbAddress;

    @FindBy(xpath="//*[@id='city']")
    public  WebElement tbCity;

    @FindBy(xpath="//*[@id='id_state']")
    public  WebElement tbState;

    @FindBy(xpath="//*[@id='postcode']")
    public  WebElement tbPostalCode;

    @FindBy(xpath="//*[@id='id_country']")
    public  WebElement tbCountry;

    @FindBy(xpath="//*[@id='phone_mobile']")
    public  WebElement tbMobilePhone;

    @FindBy(xpath="//*[@id='submitAccount']/span")
    public  WebElement btnSubmitAccount;
}


