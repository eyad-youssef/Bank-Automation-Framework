package tests;


import driver.WebDriverSingleton;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.testng.annotations.BeforeTest;
import platform.ParaBank;

public class HooksHandler extends BaseTest {

    @BeforeTest
    public void initialize() throws InterruptedException {
//        webDriver.getWebDriver().navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        webDriver.navigateTo("https://parabank.parasoft.com/parabank/index.htm");

    }



}
