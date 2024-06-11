package tests;

import org.testng.annotations.Test;
//import sun.jvm.hotspot.utilities.AssertionFailure;

public class BankTest extends HooksHandler {


    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        paraBank.login.enterUsername("Tester");
        paraBank.login.enterPassword("Tester2024");
        paraBank.login.clickOnLoginButton();

        if (paraBank.login.getMessage()) {

            paraBank.login.clickOnRegisterButton();
            paraBank.register = paraBank.login.goToRegisterPage();
            paraBank.register.register(
                    "new",
                    "user",
                    "new street",
                    "city",
                    "state",
                    "12488",
                    "01156987425",
                    "588987456235555",
                    "Tester",
                    "Tester2024"
            );
            paraBank.register.getRegisterStatus();
            paraBank.newAccountPage=paraBank.register.openNewAccountPage();


        } else {
            paraBank.newAccountPage = paraBank.login.openNewAccountPage();
        }


    }

    @Test(priority = 2)
    public void createNewAccountTest() {

//        paraBank.newAccountPage.createNewAccount();
//        paraBank.newAccountPage.createNewAccount();
//        paraBank.newAccountPage.createNewAccount();
    }

    //
    @Test(priority = 3)
    public void getOverviewTest() {
        paraBank.accountOverviewPage = paraBank.newAccountPage.openAccountOverviewPage();
//
//        paraBank.accountOverviewPage.openAccountOverviewPageLink();
//        paraBank.accountOverviewPage.getTotalAmount("$3500000.00");
//        paraBank.accountOverviewPage.getAccountsCount();
    }

    @Test(priority = 4)
    public void transferFundTest() {
        paraBank.transferFundsPage = paraBank.accountOverviewPage.goToTransferFundsPage();

//        paraBank.transferFundsPage.transferFunds("20");
    }

    @Test(priority = 5)
    public void requestLoanPageTest() {
        paraBank.requestLoanPage = paraBank.transferFundsPage.goToRequestLoanPage();

//        paraBank.requestLoanPage.requestLoan("5000", "1000");
//        paraBank.requestLoanPage.requestLoan("1000", "7000");

    }

    @Test(priority = 6)
    public void billPaymentTest() {
        paraBank.billPayPage = paraBank.requestLoanPage.goToBillPayPage();

//        paraBank.billPayPage.payBill("new user",
//                " 21 hoffman St",
//                "cairo",
//                "Great Cairo",
//                "13511",
//                "01222222222",
//                "135111",
//                "135111",
//                "3600000"
//        );

//        paraBank.billPayPage.payBill("new user 2",
//                " 22 hoffman St",
//                "cairo",
//                "Great Cairo",
//                "13511",
//                "01222222222",
//                "135111",
//                "135111",
//                "2500000"
//        );


    }


}
