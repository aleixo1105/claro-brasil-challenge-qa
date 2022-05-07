package br.com.aleixo1105.automationWeb.pages;

import br.com.aleixo1105.automationWeb.maps.SignInMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public WebDriver webDriver;
    private SignInMap signInMap;

    public SignInPage(WebDriver webDriver) {

        this.webDriver = webDriver;
        signInMap = new SignInMap();
        PageFactory.initElements(webDriver,signInMap);
    }

       /*-----------Login------------*/
    public void inputEmailAddress(String email) {
        signInMap.tbEmailAddress.sendKeys(email);
    }
    public void inputPassword(String password) {
        signInMap.tbPassword.sendKeys(password);
    }
    public void clickBtnSubmitLogin() {
        signInMap.btnSubmitLogin.click();
    }


    /*--------New Account------------*/
    public void inputEmailCreate(String email) {
        signInMap.tbCreateAccountEmail.sendKeys(email);
    }
    public void clickBtnCreateAccount() {
        signInMap.btnCreateAccount.click();
    }
}
