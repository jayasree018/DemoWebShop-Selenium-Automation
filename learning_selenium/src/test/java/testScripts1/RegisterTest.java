
package testScripts1;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilities.BaseTest;
import objectRepository.HomePage;
import objectRepository.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUser() {

        HomePage homePage = new HomePage(driver);
        homePage.clickRegister();

        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.selectMale();
        registerPage.enterFirstName("Jaya");
        registerPage.enterLastName("Sree");

        registerPage.enterEmail(
            "jaya" + System.currentTimeMillis() + "@gmail.com"
        );

        registerPage.enterPassword("Jaya@12345");
        registerPage.enterConfirmPassword("Jaya@12345");

        registerPage.clickRegister();

        String actualMessage = registerPage.getSuccessMessage();

        Assert.assertEquals(
            actualMessage,
            "Your registration completed"
        );
    }
}
