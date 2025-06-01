package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;

public class RemoveProduct extends ReusableCode {
	public void removeProduct() throws InterruptedException {
		// Steps 1 is covered in the Base Class
		// Step 2 Navigate to url 'http://automationexercise.com'
		driver.get(obj.getProperty("URL"));
		// Step 3 Verify that home page is visible successfully
		assertEquals(driver.getTitle(), "Automation Exercise");
		// Step 4 Add products to cart
		xp("XPCLK").click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		timeout(2);
		xp("XPVCLK").click();
		xp("XACart").click();
		// Step 5 Click 'Cart' button
		xp("XVCart").click();
		// Step 6 Verify that cart page is displayed
		assertEquals(xp("XEQty").isDisplayed(), true, "Product Quantity is not displayed");
		// Step 7 Click 'X' button corresponding to particular product
		xp("XRP").click();
		// Step 8 Verify that product is removed from the cart
		xp("XVRP").click();
		}

}
