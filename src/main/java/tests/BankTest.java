package tests;

import org.testng.annotations.Test;

public class BankTest extends  BaseTest{


    @Test (priority = 1)
    public void loginTest() throws InterruptedException {
//
        webDriver.navigateTo("https://parabank.parasoft.com/parabank/index.htm");

        paraBank.login.enterUsername("Tester");
        Thread.sleep(500);
        paraBank.login.enterPassword("Tester2024");
        Thread.sleep(900);
        paraBank.login.clickOnLoginButton();
     }

@Test(priority = 2)
     public void createNewAccountTest(){
        paraBank.newAccountPage= paraBank.login.openNewAccountPage();
        paraBank.newAccountPage.clickOnNewAccountPageLink();
        paraBank.newAccountPage.enterNewAccountType();
        paraBank.newAccountPage.enterNewAccountAmount();
        paraBank.newAccountPage.clickOnOpenNewAccountButton();
     }










}
