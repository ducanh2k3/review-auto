package test;

import base.TestBase;
import org.testng.annotations.Test;
import page.*;

public class TestFile extends TestBase {
    @Test
    public void findVideoTest() {
        String searchKeyword = "sontungmtp";

        HomePage homePage = new HomePage(driver);
        homePage.findVideo(searchKeyword);
        ResultSearchPage resultSearchPage = new ResultSearchPage(driver);
        resultSearchPage.checkResultByUrl(searchKeyword);
        resultSearchPage.checkTitle(searchKeyword);
    }

    @Test
    public void isVideoRunningTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.findVideo("vtv24");
        ResultSearchPage resultSearchPage = new ResultSearchPage(driver);
        resultSearchPage.selectVideoByIndex(1);
        VideoPage videoPage = new VideoPage(driver);
        videoPage.isVideoRunning();
    }


}
