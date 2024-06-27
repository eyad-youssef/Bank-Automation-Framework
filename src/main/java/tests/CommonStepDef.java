package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CommonStepDef extends  BaseTest{

    @Given("User login with {string} and {string}")
    public void userLoginWithAnd(String username, String password) {
        paraBank.login.enterUsername(username);
        paraBank.login.enterPassword(password);
        paraBank.login.clickOnLoginButton();
    }

    @When("Click on accounts overview page link")
    public void goToAccountsOverviewPage(){

     paraBank.accountOverviewPage=   paraBank.login.openAccountOverviewPage() ;
     paraBank.accountOverviewPage.openAccountOverviewPageLink();
    }
    @And("get total {string}")
    public void getTotalAmount(String totalAmount) {
        paraBank.accountOverviewPage.getAmount();
        Assert.assertEquals(paraBank.accountOverviewPage.getAmount(), totalAmount/*"$3500000.00"*/);}

    @And("get accounts count{string}")
    public void getAccountsCount(int count){
        paraBank.accountOverviewPage.getAccountsCount();
        Assert.assertEquals(paraBank.accountOverviewPage.getAccountsCount(),count);
    }

}
