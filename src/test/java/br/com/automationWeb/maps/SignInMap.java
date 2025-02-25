package br.com.automationWeb.maps;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInMap {
    @FindBy(xpath="//*[@id=\"email\"]")
    public WebElement tbEmailAddress;

    @FindBy(xpath="//*[@id=\"passwd\"]")
    public WebElement tbPassword;

    @FindBy(xpath="//*[@id=\"SubmitLogin\"]")
    public WebElement btnSubmitLogin;

    @FindBy(xpath="//*[@id=\"email_create\"]")
    public WebElement tbCreateAccountEmail;

    @FindBy(xpath ="//*[@id=\"SubmitCreate\"]")
    public WebElement btnCreateAccount;

    @FindBy(xpath="//*[@id=\"center_column\"]/div[1]/ol/li")
    public WebElement authenticationFailed;

    @FindBy(xpath="//*[@id=\"create_account_error\"]/ol/li")
    public WebElement authenticationEmailAlreadyRegistered;
}
