package tests;


import driver.WebDriverSingleton;
import platform.ParaBank;

import java.util.Properties;


public class BaseTest  {
    protected static WebDriverSingleton webDriver;
    protected static ParaBank paraBank = new ParaBank();
    protected static Properties properties;



    public BaseTest(){
        webDriver = WebDriverSingleton.getDriverSingleton();
       }

}
