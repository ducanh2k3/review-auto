package test;

import base.TestBase;
import org.testng.annotations.Test;
import page.FillPasswordPage;
import page.HomePage;
import page.LoginPage;
import page.ResultSearchPage;

public class TestLogin extends TestBase {
    @Test
    public void logintest() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToSignIn();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("emailfortest90876@gmail.com");
        FillPasswordPage fillPasswordPage = new FillPasswordPage(driver);
        fillPasswordPage.fillPassword("21022003ducanh");
        homePage.findVideo("illit");
        ResultSearchPage resultSearchPage = new ResultSearchPage(driver);
        resultSearchPage.selectVideoByIndex(1);

    }
}
