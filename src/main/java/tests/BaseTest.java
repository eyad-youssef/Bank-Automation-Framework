package tests;

//import browser.Browser;
import driver.WebDriverSingleton;
import platform.ParaBank;

import java.util.Properties;
//import waits.Waits;

public class BaseTest  {
    protected static WebDriverSingleton webDriver;
    protected static ParaBank paraBank = new ParaBank();
    protected static Properties properties;



    public BaseTest(){
        webDriver = WebDriverSingleton.getDriverSingleton();
       }

}
