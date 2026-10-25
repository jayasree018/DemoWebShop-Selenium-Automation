
package testScripts1;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilities.BaseTest;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginUser() {

        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();

        LoginPage loginPage = new LoginPage(driver);
loginPage.enterEmail(System.getenv("DEMOWEBSHOP_EMAIL"));
loginPage.enterPassword(System.getenv("DEMOWEBSHOP_PASSWORD"));
        loginPage.clickLogin();

        Assert.assertTrue(
            loginPage.isLogoutDisplayed(),
            "Login failed - Logout link is not displayed"
        );
    }
}
