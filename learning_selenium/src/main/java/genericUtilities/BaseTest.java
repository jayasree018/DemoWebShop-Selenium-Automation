
package genericUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;

    @Parameters("browser")
    @BeforeClass
    public void openBrowser(@Optional("chrome") String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } 
        else {
            throw new IllegalArgumentException(
                "Unsupported browser: " + browser);
        }

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        wait = new WebDriverWait(
            driver, Duration.ofSeconds(20));

        driver.get("https://demowebshop.tricentis.com/");
    }

    // Login method - call only when needed
    public void loginToDWS() {

        driver.findElement(By.linkText("Log in")).click();

        driver.findElement(By.id("Email"))
              .sendKeys("YOUR_TEST_EMAIL");

        driver.findElement(By.id("Password"))
              .sendKeys("YOUR_TEST_PASSWORD");

        driver.findElement(By.cssSelector(
            "input.button-1.login-button")).click();
    }

    // Logout method - call only when needed
    public void logoutFromDWS() {

        driver.findElement(By.linkText("Log out")).click();
    }

    @AfterClass
    public void closeBrowser() {

        if (driver != null) {
            driver.quit();
        }
    }
}
