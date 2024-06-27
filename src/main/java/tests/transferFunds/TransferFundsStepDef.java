package tests.transferFunds;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import tests.BaseTest;

public class TransferFundsStepDef extends BaseTest {
    @And("Click on transfer funds  page link")
    public void clickOnTransferFundsPageLink() {
        paraBank.transferFundsPage= paraBank.newAccountPage.openTransferFundsPage();
        paraBank.transferFundsPage.goToTransferFundsPage();

    }

    @When("Enter transferred {string}")
    public void enterTransferred(String amount) {
        paraBank.transferFundsPage.enterTransferredAmount(amount);
    }

    @And("Choose sender {string}and receiver {string}")
    public void chooseSenderAndReceiver(int senderAccount, int receiverAccount) {
        paraBank.transferFundsPage.enterTransferAccounts(senderAccount,receiverAccount);
    }

    @Then("click on apply transfer button")
    public void clickOnApplyTransferButton() {
        paraBank.transferFundsPage.clickOnTransferButton();
    }

    @And("get transfer funds status {string}")
    public void getTransferFundsStatus(String transferFundsStatus ,String transferFundsExpectedStatus) {
        paraBank.transferFundsPage.getTransferFundsStatus(transferFundsStatus);
        Assert.assertEquals(paraBank.transferFundsPage.getTransferFundsStatus(transferFundsStatus),transferFundsExpectedStatus);

    }

    @And("get transfer funds result {string}")
    public void getTransferFundsResult(String transferFundsResult, String resultExpectedMessage) {
        paraBank.transferFundsPage.getTransferFundsResult(transferFundsResult);
        Assert.assertEquals(paraBank.transferFundsPage.getTransferFundsResult(transferFundsResult),resultExpectedMessage);

    }
}
