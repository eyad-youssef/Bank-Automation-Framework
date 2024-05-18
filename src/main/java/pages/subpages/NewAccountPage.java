package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class NewAccountPage extends BasePage {
    private final By openNewAccountPageLink = By.linkText("Open New Account");
    private final By accountTypeList = By.id("type");
    private final By newAccountAmountList = By.id("fromAccountId");
    private final By openNewAccountButton = By.xpath("//*[@id=\"openAccountForm\"]/form/div/input");
//*[@id="openAccountForm"]/form/div/input

 public void clickOnNewAccountPageLink(){
     waitUntilElementIsClickable(openNewAccountPageLink).click();

 }
    public  void enterNewAccountType(){
        Select selectType = new Select(waitUntilElementIsPresent(accountTypeList));
        selectType.selectByIndex(1);
    }

    public  void enterNewAccountAmount(){
        Select selectAmount = new Select(waitUntilElementIsPresent(newAccountAmountList));
        selectAmount.selectByIndex(0);
    }

    public void clickOnOpenNewAccountButton (){
        waitUntilElementIsClickable(openNewAccountButton).click();
    }

}
