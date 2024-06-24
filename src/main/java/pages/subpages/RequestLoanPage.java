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
    private final By loanStatus  = By.xpath("//*[@id='loanStatus']");
    private final By loanResult = By.xpath("//*[@id='loanRequestApproved']/child::p[1]");



    public void requestLoan(String loanAmount, String downPaymentAmount) {
        waitUntilElementIsPresent(requestLoanLinkPage).click();
        waitUntilElementIsClickable(loanAmountTextField).sendKeys(loanAmount);
        waitUntilElementIsClickable(downPaymentAmountTextField).sendKeys(downPaymentAmount);

        Select selectFromAccount = new Select(waitUntilElementIsClickable(fromAccount));
        selectFromAccount.selectByIndex(0);

        waitUntilElementIsPresent(applyButton).click();

    }

    public String getLoanStatus(){
      return   waitUntilElementIsPresent(loanStatus).getText();
    }

    public  String getLoanResult(){
      return  waitUntilElementIsPresent(loanResult).getText();
    }

    public  BillPayPage goToBillPayPage(){
        return  new BillPayPage();
    }

}
