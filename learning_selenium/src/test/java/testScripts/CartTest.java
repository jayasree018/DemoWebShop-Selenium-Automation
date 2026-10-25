package testScripts;

import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import genericUtilities.BaseTest;
public class CartTest extends BaseTest {
@Test(priority = 1, groups = "smoke")
public void addToCartTest() {
	driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
	driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	driver.findElement(By.partialLinkText("Shopping")).click();
	
}
@Test(priority = 2, groups ="sanity")
public void removeFromCartTest() {
	driver.findElement(By.partialLinkText("Shopping")).click();
	driver.findElement(By.name("removefromcart")).click();
	driver.findElement(By.name("updatecart")).click();
}
}
