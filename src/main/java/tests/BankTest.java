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
    }

    //
    @Test(priority = 3)
    public void getOverviewTest() {
        paraBank.accountOverviewPage = paraBank.newAccountPage.openAccountOverviewPage();

        paraBank.accountOverviewPage.openAccountOverviewPageLink();
        paraBank.accountOverviewPage.getTotalAmount("$3500000.00");
        paraBank.accountOverviewPage.getAccountsCount();
    }

    @Test(priority = 4)
    public void transferFundTest() {
        paraBank.transferFundsPage = paraBank.accountOverviewPage.goToTransferFundsPage();

        paraBank.transferFundsPage.transferFunds("20");
    }

    @Test(priority = 5)
    public void requestLoanPageTest() {
        paraBank.requestLoanPage = paraBank.transferFundsPage.goToRequestLoanPage();

        paraBank.requestLoanPage.requestLoan("5000", "1000");
        paraBank.requestLoanPage.requestLoan("1000", "7000");

    }

    @Test(priority = 6)
    public void billPaymentTest() {
        paraBank.billPayPage = paraBank.requestLoanPage.goToBillPayPage();

        paraBank.billPayPage.payBill("new user",
                " 21 hoffman St",
                "cairo",
                "Great Cairo",
                "13511",
                "01222222222",
                "135111",
                "135111",
                "3600000"
        );

        paraBank.billPayPage.payBill("new user 2",
                " 22 hoffman St",
                "cairo",
                "Great Cairo",
                "13511",
                "01222222222",
                "135111",
                "135111",
                "2500000"
        );


    }


}
