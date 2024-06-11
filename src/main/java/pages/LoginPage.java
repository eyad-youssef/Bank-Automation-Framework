package pages;

import org.openqa.selenium.By;
import pages.subpages.AccountOverviewPage;
import pages.subpages.NewAccountPage;

//import static com.sun.tools.javac.jvm.ByteCodes.ret;

public class LoginPage extends BasePage {


//    ("//form[@name='login']/child::div[1][@name='username']")
//            ("//form[@name='login']/child::div[2][@name='password']")
//            ("//form[@name='login']/child::div[3][@value='Log In']")
//

    private final By userName = By.xpath("//div[@class='login']/child::input[1][@name='username']");
    private final By passWord = By.xpath("//div[@class='login']/child::input[1][@name='password']");
    private final By loginButton = By.xpath("//input[@value='Log In']");
    private final By statusMessage = By.xpath("//div[@id='rightPanel']/child::p[1]");
    private final By registerLink= By.linkText("Register");





    public void enterUsername(String username) {
        waitUntilElementIsPresent(userName).sendKeys(username);

    }

    public void enterPassword(String password) {
        waitUntilElementIsPresent(passWord).sendKeys(password);

    }



    public void clickOnLoginButton() {

        waitUntilElementIsPresent(loginButton).click();

    }
    public Boolean getMessage(){
       return  waitUntilElementIsPresent(statusMessage).isDisplayed();

    }

    public  void clickOnRegisterButton(){
        waitUntilElementIsPresent(registerLink).click();
    }



    public  RegisterPage goToRegisterPage(){
        return new RegisterPage();
 }

 public AccountOverviewPage openAccountOverviewPage( ){return new AccountOverviewPage();}
    public NewAccountPage openNewAccountPage(){
        return new NewAccountPage();
    }
}
