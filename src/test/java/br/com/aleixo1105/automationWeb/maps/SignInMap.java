package br.com.aleixo1105.automationWeb.maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInMap {
    @FindBy(xpath ="//*[@id=\"email\"]")
    public WebElement tbEmailAddress;

    @FindBy(xpath="//*[@id=\"passwd\"]")
    public WebElement tbPassword;

    @FindBy(xpath="//*[@id=\"SubmitLogin\"]")
    public WebElement btnSubmitLogin;

}
