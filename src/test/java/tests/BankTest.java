package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertEquals;
//import sun.jvm.hotspot.utilities.AssertionFailure;

public class BankTest extends HooksHandler {


    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        paraBank.login.enterUsername("Tester");
        paraBank.login.enterPassword("Tester2024");
        paraBank.login.clickOnLoginButton();


//      Assert.assertEquals(paraBank.login.clickOnLoginButton(),"ASDC");
//      assertEquals(paraBank.login.clickOnLoginButton(), "ASDC", "Error message mismatch");

// Perform other assertions using softAssert


//
//        if (paraBank.login.getMessage()) {
//            paraBank.login.clickOnRegisterButton();
//            paraBank.register = paraBank.login.goToRegisterPage();
//            paraBank.register.enterNameDetails(
//                    "new",
//                    "user");
//            paraBank.register.enterAddressDetails(
//                    "new street",
//                    "city",
//                    "state");
//            paraBank.register.enterZipCode(
//                    "12488");
//            paraBank.register.enterPhoneNumber(
//                    "01156987425");
//
//            paraBank.register.enterSSN(
//                    "588987456235555");
//
//            paraBank.register.enterNewUserNameAndPassword(
//                    "Tester",
//                    "Tester2024");
//
//            paraBank.register.getRegisterStatus();
//            paraBank.newAccountPage=paraBank.register.openNewAccountPage();
//
//        }
//        else {
//            paraBank.newAccountPage = paraBank.login.openNewAccountPage();
////            paraBank.accountOverviewPage = paraBank.login.openAccountOverviewPage();
//
//        }
//

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
