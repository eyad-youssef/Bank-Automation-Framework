package pages;

import org.openqa.selenium.By;
import pages.subpages.NewAccountPage;

public class LoginPage extends BasePage {

    private final By userName = By.name("username");
    private final By passWord = By.name("password");
    private final By loginButton = By.xpath("//input[@value='Log In']");



    public void enterUsername(String username) {
        waitUntilElementIsPresent(userName).sendKeys(username);

    }

    public void enterPassword(String password) {
        waitUntilElementIsPresent(passWord).sendKeys(password);

    }



    public void clickOnLoginButton() {

        waitUntilElementIsPresent(loginButton).click();

    }


    public NewAccountPage openNewAccountPage(){
        return new NewAccountPage();
    }
}
