package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class NewAccountPage extends BasePage {


    private final By openNewAccountPageLink = By.linkText("Open New Account");
    private final By accountTypeList = By.id("type");
    private final By newAccountAmountList = By.id("fromAccountId");
    private final By openNewAccountButton = By.xpath("//*[@id='openAccountForm']/form/div/input");


   public void goToOpenNewAccountPage(){
       waitUntilElementIsPresent(openNewAccountPageLink).click();

   }

   public void chooseAccountType(String type){
       Select selectType = new Select(waitUntilElementIsPresent(accountTypeList));
       selectType.selectByVisibleText(type);

   }
    public void chooseAccount() {
       Select selectAmount = new Select(waitUntilElementIsPresent(newAccountAmountList));
        selectAmount.selectByIndex(0);
   }
    public void clickOnOpenNewAccountButton(){
        waitUntilElementIsClickable(openNewAccountButton).click();
    }

    public AccountOverviewPage openAccountOverviewPage() {
        return new AccountOverviewPage();
    }


}
