package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By userName = By.name("username");
    private final By passWord = By.name("password");
    private final By loginButton = By.xpath("//input[@value='Log In']");


    public void login(String username, String password ){
        driver.findElement(userName).sendKeys(username);
        driver.findElement(passWord).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
