package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By registerLink = By.linkText("Register");

    public void clickRegister() {
        driver.findElement(registerLink).click();
    }
    By loginLink = By.linkText("Log in");

    public void clickLogin() {
        driver.findElement(loginLink).click();
    }
}