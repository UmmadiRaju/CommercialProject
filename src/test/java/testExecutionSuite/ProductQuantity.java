package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ProductQuantity extends ReusableCode {
	public void pQuantity() throws InterruptedException {
		// Steps 1 is covered in the Base Class
		// Step 2 Navigate to url 'http://automationexercise.com'
		driver.get(obj.getProperty("URL"));
		// Step-3 Checking Home page Title
		assertEquals(driver.getTitle(), "Automation Exercise");
		// Step-4 Clicking on Products
		xp("XPCLK").click();
		// Step-4a Checking All Product page
		assertEquals(driver.getTitle(), "Automation Exercise - All Products");
		// Scrolling page
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		timeout(2);
		// step-4b Clicking on View Product
		xp("XPVCLK").click();
		// Step-5 Checking Product detail page
		assertEquals(driver.getTitle(), "Automation Exercise - Product Details");
		// Step-6 Increase quantity to 4
		xp("XQty").clear();
		timeout(1);
		xp("XQty").sendKeys(obj.getProperty("Qty"));
		// Step-7 Click 'Add to cart' button
		xp("XACart").click();
		timeout(2);
		// Step-8 Click 'View Cart' button
		xp("XVCart").click();
		timeout(2);
		// Step-9 Verify that product is displayed in cart page with exact quantity
		assertEquals(xp("XEQty").isDisplayed(), true, "Product Quantity is not displayed");
	}
}