package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class VideoPage extends BasePage {
    public VideoPage(WebDriver driver) {
        super(driver);
    }

    private final By pauseButton = By.xpath("//button[@aria-label='Pause keyboard shortcut k']");
    private final WebElement videoArea = driver.findElement(By.cssSelector("video"));
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void isVideoRunning() throws InterruptedException {
            Thread.sleep(5000);
            Boolean isPaused = (Boolean) js.executeScript("return arguments[0].paused;", videoArea);
            System.out.println("Video đang chạy: " + !isPaused);
            Assert.assertTrue(!isPaused);
    }

}
