package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }


    protected void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void sendKeys(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }


    protected boolean isDisplayed(By locator) {
        try {
            return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    protected String getText(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
    }
    protected WebElement waitForElementVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected String getClassAttribute(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return element.getAttribute("class");
        } catch (Exception e) {
            System.err.println("Không thể lấy giá trị thuộc tính 'class': " + e.getMessage());
            return null;
        }
    }

    protected void navigateToUrl(String url) {
        driver.navigate().to(url);
    }

    protected String getPageTitle() {
        return driver.getTitle();
    }

    protected String getCurrentUrl() {
        return driver.getCurrentUrl();
    }


}
