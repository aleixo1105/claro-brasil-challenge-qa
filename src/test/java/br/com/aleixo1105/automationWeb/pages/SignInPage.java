package br.com.aleixo1105.automationWeb.pages;

import br.com.aleixo1105.automationWeb.maps.SignInMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public WebDriver webDriver;
    private SignInMap signInMap;

    String email = "teste20221234567899s@gmail.com";
    String password = "123456";

    public SignInPage(WebDriver webDriver) {

        this.webDriver = webDriver;
        signInMap = new SignInMap();
        PageFactory.initElements(webDriver,signInMap);
    }

    public void inputEmailAddress() {
        signInMap.tbEmailAddress.sendKeys(email);
    }

    public void inputPassword() {
        signInMap.tbPassword.sendKeys(password);
    }

    public void clickBtnSubmitLogin() {
        signInMap.btnSubmitLogin.click();
    }
}
