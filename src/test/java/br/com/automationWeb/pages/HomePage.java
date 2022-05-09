package br.com.automationWeb.pages;

import br.com.automationWeb.maps.HomeMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver webDriver;
    private HomeMap homeMap;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        homeMap = new HomeMap();
        PageFactory.initElements(webDriver, homeMap);
    }
    public void clickBtnSignIn() {
        homeMap.btnSingInHome.click();
    }
}
