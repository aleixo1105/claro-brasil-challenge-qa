package br.com.aleixo1105.automationWeb.pages;

import br.com.aleixo1105.automationWeb.maps.SignInMap;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
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
    public void inputEmailSignIn(String email) {

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

    public String checkInvalidAccount(){

        Assert.assertEquals("Authentication failed.", signInMap.authenticationFailed.getText());
        return null;
    }
    public String checkRegisteredEmail(){

        Assert.assertEquals("An account using this email address has already been registered. Please enter a valid password or request a new one.",
                signInMap.authenticationEmailAlreadyRegistered.getText());
        return null;
    }
}
