package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import static org.testng.asserts.SoftAssert.*;
//import sun.jvm.hotspot.utilities.AssertionFailure;

public class BankTest extends HooksHandler {


    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        paraBank.login.enterUsername("Tester");
        paraBank.login.enterPassword("Tester2024");
        paraBank.login.clickOnLoginButton();

//        if (paraBank.login.getMessage()) {
//            paraBank.login.clickOnRegisterButton();
//            paraBank.register.feature = paraBank.login.goToRegisterPage();
//            paraBank.register.feature.register.feature(
//                    "new",
//                    "user",
//                    "new street",
//                    "city",
//                    "state",
//                    "12488",
//                    "01156987425",
//                    "588987456235555",
//                    "Tester",
//                    "Tester2024"
//            );
//            paraBank.register.feature.getRegisterStatus();
//            paraBank.newAccountPage=paraBank.register.feature.openNewAccountPage();
//
//        }
//        else {
//            paraBank.newAccountPage = paraBank.login.openNewAccountPage();
////            paraBank.accountOverviewPage = paraBank.login.openAccountOverviewPage();
//
//        }


    }

    @Test(priority = 2)
    public void getOverviewTest() {
        paraBank.accountOverviewPage = paraBank.login.openAccountOverviewPage();
        paraBank.accountOverviewPage.openAccountOverviewPageLink();

    }

    @Test(priority = 3)
    public void createNewAccountTest() throws InterruptedException {
        paraBank.newAccountPage = paraBank.accountOverviewPage.openNewAccountPage();

        paraBank.accountOverviewPage = paraBank.newAccountPage.openAccountOverviewPage();

    }



    @Test(priority = 4)
    public void transferFundTest() throws InterruptedException {
        paraBank.transferFundsPage = paraBank.accountOverviewPage.goToTransferFundsPage();

    }


    @Test(priority = 5)
    public void requestLoanPageTest() throws InterruptedException {
        paraBank.requestLoanPage = paraBank.transferFundsPage.goToRequestLoanPage();

    }

    @Test(priority = 6)
    public void billPaymentTest() throws InterruptedException {


        paraBank.billPayPage = paraBank.requestLoanPage.goToBillPayPage();
    }
}
