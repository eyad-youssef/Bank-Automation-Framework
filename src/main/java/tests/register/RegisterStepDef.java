package tests.register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import tests.BaseTest;

public class RegisterStepDef extends BaseTest {


    @And("click on register button")
    public void clickOnRegisterButton() {
    paraBank.login.clickOnRegisterButton();
    }

    @When("enter his firstname {string} and lastname {string}")
    public void enterHisFirstnameAndLastname(String userName, String lastName) {
       paraBank.register= paraBank.login.goToRegisterPage();
       paraBank.register.enterNameDetails(userName,lastName);
    }

    @And("enter his address {string} and city {string} and state {string}")
    public void enterHisAddressAndCityAndState(String address, String city, String state) {
         paraBank.register.enterAddressDetails(address,city,state);
    }

    @And("enter his zipcode {string} and phone number {string} and SSN {string}")
    public void enterHisZipcodeAndPhoneNumberAndSSN(String zipCode, String phoneNumber, String SSN) {
        paraBank.register.enterZipCode(zipCode);
        paraBank.register.enterPhoneNumber(phoneNumber);
        paraBank.register.enterSSN(SSN);
    }

    @And("enter his new username {string} and password {string}")
    public void enterHisNewUsernameAndPassword(String userName, String password) {
        paraBank.register.enterNewUserNameAndPassword(userName,password);
    }


}
