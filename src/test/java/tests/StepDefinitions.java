package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseTest {


    @And("Click on open new account page link")
    public void clickOnOpenNewAccountPageLink() {
        paraBank.newAccountPage = paraBank.login.openNewAccountPage();
        paraBank.newAccountPage.goToOpenNewAccountPage();
    }

    @When("choose new account type {string}")
    public void chooseNewAccountType(String type ) {
        paraBank.newAccountPage.chooseAccountType(type);
    }

    @And("enter new account")
    public void enterNewAccountAmount() {
        paraBank.newAccountPage.chooseAccount();
    }


    @Then("click on create new account button")
    public void clickOnCreateNewAccountButton() {
        paraBank.newAccountPage.clickOnOpenNewAccountButton();
    }
}
