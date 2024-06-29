package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class BillPayPage extends BasePage {


    private final By billPayPageLink = By.linkText("Bill Pay");
    private final By payeeNameTextField = By.name("payee.name");
    private final By addressTextField = By.name("payee.address.street");
    private final By cityTextField = By.name("payee.address.city");
    private final By stateTextField = By.name("payee.address.state");
    private final By zipCodeTextField = By.name("payee.address.zipCode");
    private final By phoneNumberTextField = By.name("payee.phoneNumber");
    private final By accountNumberTextField = By.name("payee.accountNumber");
    private final By accountNumberVerificationTextField = By.name("verifyAccount");
    private final By amountTextField = By.name("amount");
    private final By fromAccountSelectList = By.name("fromAccountId");
    private final By sendPaymentButton = By.xpath("//*[@value='Send Payment']");
    private final By billStatus = By.xpath("//*[@id='billpayResult']/child::h1[@class='title']");
    private final By billResult = By.xpath("//div[@id='billpayResult']/child::p[1][contains(.,'Bill Payment to ')]");

    public void goToPayBillPage() {
        waitUntilElementIsPresent(billPayPageLink).click();

    }

    public void enterName(String name
    ) {
        waitUntilElementIsPresent(payeeNameTextField).sendKeys(name);
    }

    public void enterAddress(String address
    ) {
        waitUntilElementIsPresent(addressTextField).sendKeys(address);
    }

    public void enterCity(String city
    ) {
        waitUntilElementIsPresent(cityTextField).sendKeys(city);
    }

    public void enterState(String state
    ) {
        waitUntilElementIsPresent(stateTextField).sendKeys(state);
    }

    public void enterZipCode(String zipCode
    ) {
        waitUntilElementIsPresent(zipCodeTextField).sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber
    ) {
        waitUntilElementIsPresent(phoneNumberTextField).sendKeys(phoneNumber);
    }

    public void enterAccount(String account
    ) {
        waitUntilElementIsPresent(accountNumberTextField).sendKeys(account);
    }

    public void verifyAccount(String verifyAccount
    ) {
        waitUntilElementIsPresent(accountNumberVerificationTextField).sendKeys(verifyAccount);
    }


    public void enterAmount(String amount) {
        waitUntilElementIsPresent(amountTextField).sendKeys(amount);
    }

    public void
    selectSenderAccount() {


        Select selectFromAccount = new Select(waitUntilElementIsClickable(fromAccountSelectList));
        selectFromAccount.selectByIndex(0);
    }

    public void clickOnSendPaymentButton() {
        waitUntilElementIsClickable(sendPaymentButton).click();
    }

    public String getBillStatus(String paymentStatus) {
        System.out.println(waitUntilElementIsPresent(billStatus).getText());
        paymentStatus = waitUntilElementIsPresent(billStatus).getText();
        return paymentStatus;
    }

    public String getBillResult(String paymentResult) {
        System.out.println(waitUntilElementIsPresent(billResult).getText());
        paymentResult = waitUntilElementIsPresent(billResult).getText();
        return paymentResult;
    }
}




