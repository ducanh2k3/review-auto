package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultSearchPage extends BasePage {
    public ResultSearchPage(WebDriver driver) {
        super(driver);
    }

    private final String videoTitlexpath = "(//a[@id='video-title'])";


    public void selectVideoByIndex(int n) {
        By videoTitleXpathIndex = By.xpath(videoTitlexpath + "[" + n + "]");
        click(videoTitleXpathIndex);
    }
}
