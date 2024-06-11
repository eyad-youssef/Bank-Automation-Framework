package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class BillPayPage extends BasePage {


    private final By billPayPageLink =                    By.linkText("Bill Pay");
    private final By payeeNameTextField =                 By.name("payee.name");
    private final By addressTextField =                   By.name("payee.address.street");
    private final By cityTextField =                      By.name("payee.address.city");
    private final By stateTextField =                     By.name("payee.address.state");
    private final By zipCodeTextField =                   By.name("payee.address.zipCode");
    private final By phoneNumberTextField =               By.name("payee.phoneNumber");
    private final By accountNumberTextField =             By.name("payee.accountNumber");
    private final By accountNumberVerificationTextField = By.name("verifyAccount");
    private final By amountTextField =                    By.name("amount");
    private final By fromAccountSelectList =              By.name("fromAccountId");
    private final By sendPaymentButton =                  By.xpath("//*[@value='Send Payment']");


    public void payBill(
            String name,
            String address,
            String city,
            String state,
            String zipCode,
            String phoneNumber,
            String account,
            String verifyAccount,
            String amount
    ) {
        waitUntilElementIsPresent(billPayPageLink).click();
        waitUntilElementIsPresent(payeeNameTextField).sendKeys(name);
        waitUntilElementIsPresent(addressTextField).sendKeys(address);
        waitUntilElementIsPresent(cityTextField).sendKeys(city);
        waitUntilElementIsPresent(stateTextField).sendKeys(state);
        waitUntilElementIsPresent(zipCodeTextField).sendKeys(zipCode);
        waitUntilElementIsPresent(phoneNumberTextField).sendKeys(phoneNumber);
        waitUntilElementIsPresent(accountNumberTextField).sendKeys(account);
        waitUntilElementIsPresent(accountNumberVerificationTextField).sendKeys(verifyAccount);
        waitUntilElementIsPresent(amountTextField).sendKeys(amount);

        Select selectFromAccount = new Select(waitUntilElementIsClickable(fromAccountSelectList));
        selectFromAccount.selectByIndex(0);

        waitUntilElementIsClickable(sendPaymentButton).click();


    }

    public void v(String x){
        


    }
}




