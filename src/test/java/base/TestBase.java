package base;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
    driver = DriverFactory.getDriver(DriverFactory.BrowserType.chrome);
    driver.get("https://shopee.vn/buyer/login?next=https%3A%2F%2Fshopee.vn%2F");;

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
