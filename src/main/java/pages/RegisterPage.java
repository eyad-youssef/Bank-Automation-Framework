package pages;

import org.openqa.selenium.By;
import pages.subpages.AccountOverviewPage;
import pages.subpages.NewAccountPage;

public class RegisterPage extends BasePage {

    private final By firstNameTextField = By.id("customer.firstName");
    private final By lastNameTextField = By.id("customer.lastName");
    private final By addressTextField = By.id("customer.address.street");
    private final By cityTextField = By.id("customer.address.city");
    private final By stateTextField = By.id("customer.address.state");
    private final By zipCodeTextField = By.id("customer.address.zipCode");
    private final By phoneNumberTextField = By.id("customer.phoneNumber");
    private final By SSNTextField = By.id("customer.ssn");
    private final By userNameTextField = By.id("customer.username");
    private final By passwordTextField = By.id("customer.password");
    private final By confirmPasswordTextField = By.id("repeatedPassword");
    private final By registerButton = By.xpath("//input[@value='Register']");
    private final By statusMessage = By.xpath("//div[@id='rightPanel']/child::p[1]");

    public void register(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String SSN, String username, String password) {
        waitUntilElementIsPresent(firstNameTextField).sendKeys(firstName);
        waitUntilElementIsPresent(lastNameTextField).sendKeys(lastName);
        waitUntilElementIsPresent(addressTextField).sendKeys(address);
        waitUntilElementIsPresent(cityTextField).sendKeys(city);
        waitUntilElementIsPresent(stateTextField).sendKeys(state);
        waitUntilElementIsPresent(zipCodeTextField).sendKeys(zipCode);
        waitUntilElementIsPresent(phoneNumberTextField).sendKeys(phoneNumber);
        waitUntilElementIsPresent(SSNTextField).sendKeys(SSN);
        waitUntilElementIsPresent(userNameTextField).sendKeys(username);
        waitUntilElementIsPresent(passwordTextField).sendKeys(password);
        waitUntilElementIsPresent(confirmPasswordTextField).sendKeys(password);
        waitUntilElementIsClickable(registerButton).click();

    }

    public void getRegisterStatus() {
         waitUntilElementIsPresent(statusMessage).isDisplayed();
    }

    public NewAccountPage openNewAccountPage() {
        return new NewAccountPage();
    }


}
