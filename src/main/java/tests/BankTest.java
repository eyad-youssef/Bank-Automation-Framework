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
//            paraBank.register = paraBank.login.goToRegisterPage();
//            paraBank.register.register(
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
//            paraBank.register.getRegisterStatus();
//            paraBank.newAccountPage=paraBank.register.openNewAccountPage();
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
//        paraBank.accountOverviewPage.getAmount();
//        Assert.assertEquals(paraBank.accountOverviewPage.getAmount(),"$3500000.00");
//        Assert.assertEquals(paraBank.accountOverviewPage.getAccountsCount(),1);
    }

    @Test(priority = 3)
    public void createNewAccountTest() throws InterruptedException {
        paraBank.newAccountPage = paraBank.accountOverviewPage.openNewAccountPage();
//        paraBank.newAccountPage.createNewAccount();
//        paraBank.newAccountPage.createNewAccount();
//        paraBank.newAccountPage.createNewAccount();

        paraBank.accountOverviewPage = paraBank.newAccountPage.openAccountOverviewPage();
//        Assert.assertEquals(paraBank.accountOverviewPage.getAmount(),"$3500000.00");
//        Thread.sleep(4000);
//        Assert.assertEquals(paraBank.accountOverviewPage.getAccountsCount(),5);

    }

//    //
//    @Test(priority = 3)
//    public void getOverviewTest() {
//        paraBank.accountOverviewPage = paraBank.newAccountPage.openAccountOverviewPage();
////
//        paraBank.accountOverviewPage.openAccountOverviewPageLink();
//        paraBank.accountOverviewPage.getAmount();
////        paraBank.accountOverviewPage.getTotalAmount("");
////        paraBank.accountOverviewPage.getAccountsCount();
//    }

    @Test(priority = 4)
    public void transferFundTest() throws InterruptedException {
        paraBank.transferFundsPage = paraBank.accountOverviewPage.goToTransferFundsPage();
//        paraBank.transferFundsPage.transferFunds(1,1,"20");
//        Thread.sleep(8000);
//        Assert.assertEquals(paraBank.transferFundsPage.getTransferFundsStatus(),"Transfer Failed !");
//        Assert.assertEquals(paraBank.transferFundsPage.getTransferFundsResult(),"You can not transfer the amount to same account.");
//        Thread.sleep(5000);
//        paraBank.transferFundsPage.transferFunds(1,1,"5000000");
//        Assert.assertEquals(paraBank.transferFundsPage.getTransferFundsResult(),"You can not transfer more than the balance in your account.");



    }


    @Test(priority = 5)
    public void requestLoanPageTest() throws InterruptedException {
        paraBank.requestLoanPage = paraBank.transferFundsPage.goToRequestLoanPage();

//        paraBank.requestLoanPage.requestLoan("5000", "1000");
//        Thread.sleep(8000);
//        Assert.assertEquals( paraBank.requestLoanPage.getLoanStatus(),"Approved");
//        Assert.assertEquals(paraBank.requestLoanPage.getLoanResult(),"Congratulations, your loan has been approved.");
//        Thread.sleep(8000);
//        paraBank.requestLoanPage.requestLoan("1000", "7000");
//        Assert.assertEquals( paraBank.requestLoanPage.getLoanStatus(),"Denied");
//        Assert.assertEquals(paraBank.requestLoanPage.getLoanResult(),"down payment can not be more than loan amount.");

    }
//
    @Test(priority = 6)
    public void billPaymentTest() throws InterruptedException {

//    Assert.assertEquals(paraBank.accountOverviewPage.getAmount(),"$3500000.00");

        paraBank.billPayPage = paraBank.requestLoanPage.goToBillPayPage();

        paraBank.billPayPage.payBill("new user",
                " 21 hoffman St",
                "cairo",
                "Great Cairo",
                "13511",
                "01222222222",
                "135111",
                "135111",
                "3500000"
        );
        Thread.sleep(5000);
        Assert.assertEquals(paraBank.billPayPage.getBillStatus(),"Bill Payment Complete") ;

        Assert.assertEquals(paraBank.accountOverviewPage.getAmount(),"$3500000.00");

         Thread.sleep(8000);


        paraBank.billPayPage.payBill("new user 2",
                " 22 hoffman St",
                "cairo",
                "Great Cairo",
                "13511",
                "01222222222",
                "135111",
                "135111",
                "4500000"
        );
        Thread.sleep(5000);
        Assert.assertEquals(paraBank.billPayPage.getBillStatus(),"Bill Payment Failed") ;
        Assert.assertEquals(paraBank.billPayPage.getBillResult(),"You can not pay more than balance in your account");

    }


}
