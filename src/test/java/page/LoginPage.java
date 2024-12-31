package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage extends BasePage {

    // locators
    private final By usernameField = By.id("identifierId");
    private final By nextBtn = By.xpath("(//span[@class=\"VfPpkd-vQzf8d\"])[2]");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username) {
        sendKeys(usernameField, username);
        click(nextBtn);
    }
}
