package tests;

import org.testng.annotations.Test;

public class BankTest extends  BaseTest{


    @Test
    public void loginTest() throws InterruptedException {
//        webDriver.navigateTo("https://parabank.parasoft.com/parabank/index.htm");
        paraBank.login.login("username","password");
     }










}
