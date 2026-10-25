package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By email = By.id("Email");
    By password = By.id("Password");
    By loginButton = By.xpath("//input[@value='Log in']");

    public void enterEmail(String mail) {
        driver.findElement(email).sendKeys(mail);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    By logoutLink = By.linkText("Log out");

    public boolean isLogoutDisplayed() {
        return driver.findElement(logoutLink).isDisplayed();
    }
}