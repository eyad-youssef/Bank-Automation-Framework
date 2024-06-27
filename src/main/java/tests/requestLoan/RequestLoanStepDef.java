package tests.requestLoan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import tests.BaseTest;

public class RequestLoanStepDef extends BaseTest {
    @And("Click on request loan page link")
    public void clickOnRequestLoanPageLink() {
        paraBank.requestLoanPage= paraBank.login.openRequestLoanPage();
        paraBank.requestLoanPage.goToRequestLoanPage();
    }

    @When("enter loan {string}")
    public void enterLoan(String amount) {
        paraBank.requestLoanPage.enterLoanAmount(amount);
    }

    @And("enter down payment{string}")
    public void enterDownPayment(String downPaymentAmount) {
        paraBank.requestLoanPage.enterDownPaymentAmount(downPaymentAmount);
    }

    @And("select the sender account")
    public void selectTheSenderAccount() {
        paraBank.requestLoanPage.chooseAccount();
    }

    @Then("click on apply button")
    public void clickOnApplyButton() {
        paraBank.requestLoanPage.clickOnApplyButton();
    }

    @And("get  loan request status{string}")
    public void getTheLoanRequestStatus(String loanRequestStatus, String loanRequestExpectedStatus) {
        paraBank.requestLoanPage.getLoanStatus(loanRequestStatus);
        Assert.assertEquals( paraBank.requestLoanPage.getLoanStatus(loanRequestStatus),loanRequestExpectedStatus);
//
    }

    @And("get  loan request result {string}")
    public void getTheLoanRequestResult(String loanRequestResult,String loanRequestExpectedResult) {
        paraBank.requestLoanPage.getLoanResult(loanRequestResult);
        Assert.assertEquals(paraBank.requestLoanPage.getLoanResult(loanRequestResult),loanRequestExpectedResult);

    }
//      Assert.assertEquals( paraBank.requestLoanPage.getLoanStatus(),"Denied");
//        Assert.assertEquals(paraBank.requestLoanPage.getLoanResult(),"down payment can not be more than loan amount.");
//Assert.assertEquals( paraBank.requestLoanPage.getLoanStatus(),"Approved");
//        Assert.assertEquals(paraBank.requestLoanPage.getLoanResult(),"Congratulations, your loan has been approved.");
//

}
