package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage extends BasePage {

    // locators
    private final By usernameField = By.xpath("(//input[@class='X0Jdtz'])[1]");
    private final By passwordField = By.xpath("(//input[@class='X0Jdtz'])[2]");
    private final By loginButton = By.xpath("//button[@class=\"b5aVaf PVSuiZ Gqupku qz7ctP qxS7lQ Q4KP5g\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void login(String username, String password){
        sendKeys(usernameField,username);
        sendKeys(passwordField,password);
        click(loginButton);

    }
}
