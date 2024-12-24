package test;

import base.TestBase;
import org.testng.annotations.Test;
import page.LoginPage;

public class TestLogin extends TestBase {
    @Test
    public void logintest(){
        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("catsleducanhducanh@gmail.com","26052000Yeji");

    }
}
