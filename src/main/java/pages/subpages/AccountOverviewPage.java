package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class AccountOverviewPage extends BasePage {


    private final By accountOverviewPageLink = By.xpath("//div[@id='leftPanel']/child::li[2][contains(text(),'Accounts Overview')]");
    private final By accountsTable =           By.xpath("//div[@id='showOverview']/child::table");


    public void openAccountOverviewPageLink()
    {

        waitUntilElementIsPresent(accountOverviewPageLink).click();
    }

    public void getTotalAmount(String amount) {

        final By totalAmount = By.xpath("//table[@id='accountTable']/tbody/tr[contains(td[2], '" + amount + "')]");
        System.out.println(
                waitUntilElementIsPresent(totalAmount).getText());
    }

    public void getAccountsCount() {

        List<WebElement> rows = driver.findElements(accountsTable);
        System.out.println(rows.size());

    }

    public TransferFundsPage goToTransferFundsPage() {
        return new TransferFundsPage();
    }

}
