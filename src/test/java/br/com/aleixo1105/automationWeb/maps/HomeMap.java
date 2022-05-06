package br.com.aleixo1105.automationWeb.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeMap {
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]//a")
    public WebElement btnSingInHome;
}
