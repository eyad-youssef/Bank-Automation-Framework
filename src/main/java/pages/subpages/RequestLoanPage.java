package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class RequestLoanPage extends BasePage {


    private final By requestLoanLinkPage = By.linkText("Request Loan");
    private final By loanAmountTextField = By.id("amount");
    private final By downPaymentAmountTextField = By.id("downPayment");
    private final By fromAccount = By.id("fromAccountId");
    private final By applyButton = By.xpath("//input[@value='Apply Now']");
    private final By loanStatus = By.xpath("//*[@id='loanStatus']");
    private final By loanResult = By.xpath("//*[@id='loanRequestApproved']/child::p[1]");


    public void goToRequestLoanPage() {
        waitUntilElementIsPresent(requestLoanLinkPage).click();
    }

    public void enterLoanAmount(String loanAmount) {
        waitUntilElementIsClickable(loanAmountTextField).sendKeys(loanAmount);
    }

    public void enterDownPaymentAmount(String downPaymentAmount) {


        waitUntilElementIsClickable(downPaymentAmountTextField).sendKeys(downPaymentAmount);
    }

    public void chooseAccount() {
        Select selectFromAccount = new Select(waitUntilElementIsClickable(fromAccount));
        selectFromAccount.selectByIndex(0);
    }

    public void clickOnApplyButton() {
        waitUntilElementIsPresent(applyButton).click();

    }

    public String getLoanStatus(String loanRequestStatus) {

        loanRequestStatus = waitUntilElementIsPresent(loanStatus).getText();
        return loanRequestStatus;
    }

    public String getLoanResult(String loanRequestResult) {

        loanRequestResult = waitUntilElementIsPresent(loanResult).getText();
        return loanRequestResult;
    }

    public BillPayPage goToBillPayPage() {
        return new BillPayPage();
    }

}
