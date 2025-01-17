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


    private final WebElement videoArea = driver.findElement(By.cssSelector("video"));
    private final By expandButton = By.xpath("(//button[@class=\"yt-spec-button-shape-next yt-spec-button-shape-next--tonal yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m yt-spec-button-shape-next--icon-button\"])[1]");
    private final By saveButton = By.xpath("//yt-formatted-string[normalize-space()='Save']");
    private final By choosePlayList = By.xpath("(//div[@id=\"checkbox\"])[1]");
    private final By choosePlayListToClick = By.xpath("(//div[@id='checkbox'])[1]/parent::*");
    public String videoTitleXpath  = By.xpath("")


    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void isVideoRunning() throws InterruptedException {
        Thread.sleep(5000);
        Boolean isPaused = (Boolean) js.executeScript("return arguments[0].paused;", videoArea);
        System.out.println("Video đang chạy: " + !isPaused);
        Assert.assertTrue(!isPaused);
    }

    public void addVideoToWatchLater() throws InterruptedException {
        click(expandButton);
        click(saveButton);
        System.out.println(getClassAttribute(choosePlayList));
        if(getClassAttribute(choosePlayList).contains("checked")){
            System.out.println("video da duoc them vao danh sach phat tu truoc ");
        }else {
            click(choosePlayListToClick);
            Thread.sleep(1000);
        }
    }
}
