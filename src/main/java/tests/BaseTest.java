package tests;

//import browser.Browser;
import driver.WebDriverSingleton;
import platform.ParaBank;
//import waits.Waits;

public class BaseTest  {
    protected static WebDriverSingleton webDriver;
    protected static ParaBank paraBank = new ParaBank();



    public BaseTest(){
        webDriver = WebDriverSingleton.getDriverSingleton();
    }

}
