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
        resultSearchPage.selectVideoByIndex(2);
        VideoPage videoPage = new VideoPage(driver);
        videoPage.isVideoRunning();
    }
    @Test
    public void logInTest(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateToSignIn();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("emailfortest90876@gmail.com");
        FillPasswordPage fillPasswordPage = new FillPasswordPage(driver);
        fillPasswordPage.fillPassword("21022003ducanh");
        homePage.isLoggedIn();
    }
    @Test
    public void saveVideoToWatchLater() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToSignIn();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("emailfortest90876@gmail.com");
        FillPasswordPage fillPasswordPage = new FillPasswordPage(driver);
        fillPasswordPage.fillPassword("21022003ducanh");
        homePage.isLoggedIn();
        homePage.findVideo("anh trai vuot ngan chong gai ");
        ResultSearchPage resultSearchPage = new ResultSearchPage(driver);
        resultSearchPage.selectVideoByIndex(1);
        VideoPage videoPage = new VideoPage(driver);
        videoPage.addVideoToWatchLater();
    }


}
