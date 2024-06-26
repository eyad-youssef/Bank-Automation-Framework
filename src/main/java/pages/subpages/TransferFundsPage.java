package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class TransferFundsPage extends BasePage {

    private final By transferFundsPageLink = By.linkText("Transfer Funds");
    private final By amountTransferredTextField = By.id("amount");
    private final By fromAccount = By.id("fromAccountId");
    private final By toAccount = By.id("toAccountId");
    private final By transferButton = By.xpath("//input[@value='Transfer']");
    private final By transferStatus = By.xpath("//*[@id='showResult']/child::h1[@class='title']");
    private final By transferResult = By.xpath("//div[@id='showResult']/child::p[1][contains(.,' has been transferred from account #')]");


    //    parent
    //*[@id="showResult"]
//    child
    //*[@id="showResult"]/p[1]
    public void goToTransferFundsPage() {
        waitUntilElementIsPresent(transferFundsPageLink).click();
    }

    public void enterTransferredAmount(String amount) {
        waitUntilElementIsPresent(amountTransferredTextField).sendKeys(amount);
    }

    public void enterTransferAccounts(int senderAccountNum, int reciverAccountNum) {
        Select selectSrc = new Select(waitUntilElementIsPresent(fromAccount));
        selectSrc.selectByIndex(senderAccountNum - 1);


        Select selectDest = new Select(waitUntilElementIsPresent(toAccount));
        selectDest.selectByIndex(reciverAccountNum - 1);

    }

    public void clickOnTransferButton() {
        waitUntilElementIsClickable(transferButton).click();
    }

    public String getTransferFundsStatus(String transferFundsStatus) {


        return transferFundsStatus = waitUntilElementIsPresent(transferStatus).getText();

    }

    public String getTransferFundsResult(String transferFundsResult) {

        return transferFundsResult = waitUntilElementIsPresent(transferResult).getText();

    }


    public RequestLoanPage goToRequestLoanPage() {
        return new RequestLoanPage();
    }
}
