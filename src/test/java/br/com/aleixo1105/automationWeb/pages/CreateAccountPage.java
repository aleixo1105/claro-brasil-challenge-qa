package br.com.aleixo1105.automationWeb.pages;

import br.com.aleixo1105.automationWeb.maps.CreateAccountMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
    WebDriver webDriver;

    CreateAccountMap createAccountMap;

    public CreateAccountPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        createAccountMap = new CreateAccountMap();
        PageFactory.initElements(webDriver, createAccountMap);
    }

    public void inputFirstName(String firstName) {
        createAccountMap.tbFirstName.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        createAccountMap.tbLastName.sendKeys(lastName);
    }

    public void inputPassword(String password) {
        createAccountMap.tbPassword.sendKeys(password);
    }

    public void inputAddressFirstName(String addressFirstName) {
        createAccountMap.tbAddressFirstName.clear();
        createAccountMap.tbAddressFirstName.sendKeys(addressFirstName);
    }

    public void inputAddressLastName(String addressLastName) {
        createAccountMap.tbAddressLastName.clear();
        createAccountMap.tbAddressLastName.sendKeys(addressLastName);
    }

    public void inputAddress(String address) {
        createAccountMap.tbAddress.sendKeys(address);
    }

    public void inputCity(String city) {
        createAccountMap.tbCity.sendKeys(city);
    }

    public void inputState(String state) {
        createAccountMap.tbState.sendKeys(state);
    }

    public void inputPostalCode(String postalCode) {
        createAccountMap.tbPostalCode.sendKeys(postalCode);
    }

    public void inputCountry(String country) {
        createAccountMap.tbCountry.sendKeys(country);
    }

    public void inputMobilePhone(String mobilePhone) {
        createAccountMap.tbMobilePhone.sendKeys(mobilePhone);
    }

    public void clickSubmitAccount() {
        createAccountMap.btnSubmitAccount.click();
    }
}
