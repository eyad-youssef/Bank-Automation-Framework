package tests;

import org.testng.annotations.Test;

public class BankTest extends BaseTest {


    @Test(priority = 1)
    public void loginTest() throws InterruptedException {

        webDriver.navigateTo("https://parabank.parasoft.com/parabank/index.htm");

        paraBank.login.enterUsername("Tester");
        Thread.sleep(500);
        paraBank.login.enterPassword("Tester2024");
        Thread.sleep(900);
        paraBank.login.clickOnLoginButton();
    }

    @Test(priority = 2)
    public void createNewAccountTest() {
        paraBank.newAccountPage = paraBank.login.openNewAccountPage();
//        paraBank.newAccountPage.createNewAccount();
//        paraBank.newAccountPage.createNewAccount();
//        paraBank.newAccountPage.createNewAccount();
//
        paraBank.accountOverviewPage= paraBank.newAccountPage.openAccountOverviewPage();
//        paraBank.accountOverviewPage.openAccountOverviewPageLink();
//        paraBank.accountOverviewPage.getTotalAmount("$3500000.00");
//        paraBank.accountOverviewPage.getAccountsCount();


        paraBank.transferFundsPage=paraBank.accountOverviewPage.goToTransferFundsPage();
//        paraBank.transferFundsPage.transferFunds("200");


        paraBank.requestLoanPage=paraBank.transferFundsPage. goToRequestLoanPage();
        paraBank.requestLoanPage.requestLoan("500","100");

    }


}
