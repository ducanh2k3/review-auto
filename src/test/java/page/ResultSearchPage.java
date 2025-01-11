package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.text.Normalizer;

public class ResultSearchPage extends BasePage {
    public ResultSearchPage(WebDriver driver) {
        super(driver);
    }

    private final String videoTitlexpath = "(//a[@id='video-title'])";


    public void selectVideoByIndex(int n) {
        By videoTitleXpathIndex = By.xpath(videoTitlexpath + "[" + n + "]");
        click(videoTitleXpathIndex);
    }

    public void checkResultByUrl(String findText) {
        String url = getCurrentUrl();
        Assert.assertTrue(url.contains(findText));
    }

    public void checkTitle(String findText) {
        By videoTitleXpathIndex = By.xpath("(//a[@id='video-title'])[1]");
        getText(videoTitleXpathIndex);
        String normalized = Normalizer.normalize(getText(videoTitleXpathIndex), Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
//        System.out.println(normalized.toLowerCase().replaceAll("[\\s\\W_]+", ""));
        String realTitle = normalized.toLowerCase().replaceAll("[\\s\\W_]+", "");
        Assert.assertTrue(realTitle.contains(findText));
    }
}
