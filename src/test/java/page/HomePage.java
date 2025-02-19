package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By signinButton = By.xpath("//div[@id='buttons']//yt-button-shape");
    private final By searchText = By.xpath("//input[@role='combobox']");
    private final By findButton = By.xpath("//button[@class='ytSearchboxComponentSearchButton ytSearchboxComponentSearchButtonDark']");
    private final By inforButton = By.xpath("//button[@id='avatar-btn']");

    public void navigateToSignIn() {
        click(signinButton);
    }

    public void findVideo(String nameVideo) {
        sendKeys(searchText, nameVideo);
        click(findButton);
    }

    public void isLoggedIn() {
        Assert.assertTrue(isDisplayed(inforButton));
    }

}
