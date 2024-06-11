package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class AccountOverviewPage extends BasePage {


    private final By accountOverviewPageLink = By.linkText("Accounts Overview");
    private final By accountsTable = By.xpath("/div[@id='accountTable']//child::table[1]");
    private final By totalAmount = By.xpath("//table[@id='accountTable']/tbody/tr[contains(td[2], '$3500000.00')]");

    public void openAccountOverviewPageLink() {
        waitUntilElementIsPresent(accountOverviewPageLink).click();
    }

    public String getAmount() {
        return  waitUntilElementIsPresent(totalAmount).getText();
    }

    public int getAccountsCount() {
        List<WebElement> rows = driver.findElements(accountsTable);
        System.out.println(rows.size());
        return rows.size();
    }

    public TransferFundsPage goToTransferFundsPage() {
        return new TransferFundsPage();
    }
    public NewAccountPage openNewAccountPage(){
        return new NewAccountPage();
    }

}
