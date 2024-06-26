package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class CommonStepDef extends  BaseTest{

    @Given("User login with {string} and {string}")
    public void userLoginWithAnd(String username, String password) {
        paraBank.login.enterUsername(username);
        paraBank.login.enterPassword(password);
        paraBank.login.clickOnLoginButton();
    }
    @And("get total {string}")
    public void getTotalAmount(String amount) {
        paraBank.accountOverviewPage.getAmount();
        Assert.assertEquals(paraBank.accountOverviewPage.getAmount(),amount/*"$3500000.00"*/);}

    @And("get accounts count{string}")
    public void getAccountsCount(int count){
        paraBank.accountOverviewPage.getAccountsCount();
        Assert.assertEquals(paraBank.accountOverviewPage.getAccountsCount(),count);
    }

}
