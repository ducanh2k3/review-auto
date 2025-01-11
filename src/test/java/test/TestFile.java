package test;

import base.TestBase;
import org.testng.annotations.Test;
import page.FillPasswordPage;
import page.HomePage;
import page.LoginPage;
import page.ResultSearchPage;

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


}
