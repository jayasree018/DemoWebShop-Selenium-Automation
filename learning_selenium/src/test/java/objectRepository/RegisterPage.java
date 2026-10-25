package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	By maleRadioButton = By.id("gender-male");
	By femaleRadioButton = By.id("gender-female");

	By firstName = By.id("FirstName");
	By lastName = By.id("LastName");
	By email = By.id("Email");
	By password = By.id("Password");
	By confirmPassword = By.id("ConfirmPassword");

	By registerButton = By.id("register-button");

	public void selectMale() {
		driver.findElement(maleRadioButton).click();
	}

	public void selectFemale() {
		driver.findElement(femaleRadioButton).click();
	}

	public void enterFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}

	public void enterLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	}

	public void enterEmail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}

	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void enterConfirmPassword(String confirmPass) {
		driver.findElement(confirmPassword).sendKeys(confirmPass);
	}

	public void clickRegister() {
		driver.findElement(registerButton).click();
	}

	public String getSuccessMessage() {
		return driver.findElement(By.className("result")).getText();

	}

}