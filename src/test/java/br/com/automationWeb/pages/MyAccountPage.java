package br.com.automationWeb.pages;

import br.com.automationWeb.maps.MyAccountMap;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    public WebDriver webDriver;
    private MyAccountMap myAccountMap;

    public MyAccountPage(WebDriver webDriver) {

        this.webDriver = webDriver;
        myAccountMap = new MyAccountMap();
        PageFactory.initElements(webDriver, myAccountMap);
    }

    public String validateMyAccountPage() {

        Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", myAccountMap.textAccount.getText());
        return null;
    }
}
