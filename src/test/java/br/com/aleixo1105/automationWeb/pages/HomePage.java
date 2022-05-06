package br.com.aleixo1105.automationWeb.pages;

import br.com.aleixo1105.automationWeb.maps.HomeMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
