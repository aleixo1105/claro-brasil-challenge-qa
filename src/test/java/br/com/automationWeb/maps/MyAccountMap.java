package br.com.automationWeb.maps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountMap {
    @FindBy(xpath ="//*[@id=\"center_column\"]/p")
    public WebElement textAccount;

}
