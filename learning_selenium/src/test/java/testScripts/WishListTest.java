package testScripts;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import genericUtilities.BaseTest;



public class WishListTest extends BaseTest{
	@Test(priority=1,groups = "smoke")
	public void addToWishlistTest() {
		driver.findElement(By.linkText("APPAREL & SHOES")).click();
		driver.findElement(By.partialLinkText("50's Rockabilly Polka Dot Top JR Plus Size")).click();
		driver.findElement(By.id("add-to-wishlist-button-5")).click();
		driver.findElement(By.partialLinkText("Wishlist")).click();
	}
	@Test(priority = 2,groups = "sanity")
	public void removeFromWishListTest() {
		driver.findElement(By.partialLinkText("Wishlist")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
}
}