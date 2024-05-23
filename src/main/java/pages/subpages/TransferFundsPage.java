package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class TransferFundsPage extends BasePage {

    private final By transferFundsPageLink = By.linkText("Transfer Funds");
    private  final By amountTransferedTextField = By.id("amount");
    private final By fromAccount= By.id("fromAccountId");
    private final By toAccount= By.id("toAccountId");
    private final  By transferButton =By.xpath("//input[@value='Transfer']");



//    parent
    //*[@id="showResult"]
//    child
    //*[@id="showResult"]/p[1]


public  void transferFunds(String amount){


    waitUntilElementIsPresent(transferFundsPageLink).click();

    waitUntilElementIsPresent(amountTransferedTextField).sendKeys(amount);

    Select selectSrc = new Select(waitUntilElementIsPresent(fromAccount));
    selectSrc.selectByIndex(0);


    Select selectDest = new Select(waitUntilElementIsPresent(toAccount));
    selectDest.selectByIndex(0);


    waitUntilElementIsClickable(transferButton).click();


}

public RequestLoanPage goToRequestLoanPage(){
    return new RequestLoanPage();
}
}
