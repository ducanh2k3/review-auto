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
    driver = DriverFactory.getDriver(DriverFactory.BrowserType.edge);
    driver.get("https://www.youtube.com/");;

    }
    @AfterMethod
    public void tearDown(){
//        driver.quit();
    }


}
