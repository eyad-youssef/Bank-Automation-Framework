package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class AccountOverviewPage extends BasePage {


    private final By accountOverviewPageLink = By.linkText("Accounts Overview");
    private final By accountsTable = By.xpath("//table[@id='accountTable']/child::tbody/tr[contains(td[2], '$3500000.00')]");
    private final By table = By.xpath("//table[@id='accountTable']/child::tbody");

    public void openAccountOverviewPageLink() {
        waitUntilElementIsPresent(accountOverviewPageLink).click();
    }

    public String getAmount() {

       List<WebElement>cells =  waitUntilElementIsPresent(accountsTable).findElements(By.xpath("//td[contains(.,'$3500000.00')]"));
        String cellData  = null;
        for (WebElement cellElement : cells) {
             cellData = cellElement.getText();
//            cellData.
//            System.out.print(cellData + "\t");
        }
        return cellData;
    }

    public int getAccountsCount() {

//        System.out.println(waitUntilElementIsPresent(accountsTable).getSize());
        List<WebElement> rows = waitUntilElementIsPresent(table).findElements(By.tagName("tr"));
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
