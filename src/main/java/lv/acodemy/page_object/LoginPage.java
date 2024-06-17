package lv.acodemy.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * the login page class provides all login page element
 * and it`s avaliable methods
 *
 * @author: irina
 * @version: 1.0
 */

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//input{@data-test='login-button']")
    private WebElement LoginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginButton() {
        return LoginButton;
    }

    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Authorize user by name and password
     * @param username valid or invalid username for web page
     * @param password valid or invalid password for web page
     */

    public void authorize(String username, String password) {
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }
}
