package tests.billPayment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import tests.BaseTest;

public class PayBillStepDef extends BaseTest {


    @And("Click on Bill Pay page link")
    public void clickOnBillPayPageLink() {
        paraBank.billPayPage.goToPayBillPage();
    }

    @When("Enter {string} and {string} and {string} and {string}")
    public void enterBillDetails(String name, String address, String city, String state) {
        paraBank.billPayPage.enterName(name);
        paraBank.billPayPage.enterAddress(address);
        paraBank.billPayPage.enterCity(city);
        paraBank.billPayPage.enterState(state);

    }

    @And("Enter {string}and {string} and {string}")
    public void enterRestOfBillDetails(String zipcode, String phoneNumber, String accountNumber) {

        paraBank.billPayPage.enterZipCode(zipcode);
        paraBank.billPayPage.enterPhoneNumber(phoneNumber);
        paraBank.billPayPage.enterAccount(accountNumber);


    }

    @And("Verify {string}")
    public void verifyAccountNumber(String accountNumber) {
        paraBank.billPayPage.verifyAccount(accountNumber);
    }

    @And("enter bill {string}")
    public void enterBillAmount(String amount) {
        paraBank.billPayPage.enterAmount(amount);
    }

    @And("Select sender {string}")
    public void selectSender(/*String account*/) {
        paraBank.billPayPage.selectSenderAccount(/*account*/);
    }

    @Then("Click on send payment button")
    public void clickOnSendPaymentButton() {
        paraBank.billPayPage.clickOnSendPaymentButton();
    }

    @And("get payment status {string}")
    public void getPaymentStatus(String paymentStatus , String paymentExpectedStatus) {
        paraBank.billPayPage.getBillStatus(paymentStatus);

        Assert.assertEquals(paraBank.billPayPage.getBillStatus(paymentStatus), paymentExpectedStatus);

    }
//     Assert.assertEquals(paraBank.billPayPage.getBillStatus(),"Bill Payment Failed") ;
//        Assert.assertEquals(paraBank.billPayPage.getBillResult(),"You can not pay more than balance in your account");


}
