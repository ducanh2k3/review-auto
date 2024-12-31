package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FillPasswordPage extends BasePage {
    public FillPasswordPage(WebDriver driver) {
        super(driver);
    }

    private final By passwordField = By.xpath("//input[@name='Passwd']");
    private final By nextBtn = By.xpath("(//button)[2]");

    public void fillPassword(String pw){
        sendKeys(passwordField,pw);
        click(nextBtn);
    }

}
