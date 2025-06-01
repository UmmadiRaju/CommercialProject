package testExecutionSuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;

public class PlaceOrderLBC extends ReusableCode {
	public void placeorderLBC() throws InterruptedException {
		// Steps 1 is covered in the Base Class
		// Step 2 Navigate to url 'http://automationexercise.com'
		driver.get(obj.getProperty("URL"));
		// Step 3 Verify that home page is visible successfully
		assertEquals(driver.getTitle(), "Automation Exercise");
		// Step 4 Click 'Signup / Login' button
		xp("xp").click();
		// Step 5 Fill email, password and click 'Login' button
		xp("xe").sendKeys(obj.getProperty("email"));
		xp("xpd").sendKeys(obj.getProperty("password"));
		xp("xl").click();
		// Step 6 Verify 'Logged in as username' at top
		assertEquals(xp("xz").isDisplayed(), true, "not existed");
		// Step 7 Add products to cart
		xp("XPCLK").click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		timeout(2);
		xp("XPVCLK").click();
		xp("XACart").click();
		// Step 8 Click 'Cart' button
		xp("XVCart").click();
		// Step 9 Verify that cart page is displayed
		assertEquals(xp("XEQty").isDisplayed(), true, "Product Quantity is not displayed");
		// Step 10 Click Proceed To Checkout
		xp("XPCO").click();
		// Step 11 Verify Address Details and Review Your Order
		assertTrue(xp("XADRYO").isDisplayed(), "Address Details and Review Your Order are not displayed");
		// Step 12 Enter description in comment text area and click 'Place Order'
		xp("XMsg").sendKeys(obj.getProperty("XCmt"));
		timeout(2);
		xp("XPO").click();
		// Step 13 Enter payment details: Name on Card, Card Number, CVC, Expiration date
		xp("XNCard").sendKeys(obj.getProperty("NCard"));
		xp("XCNum").sendKeys(obj.getProperty("CNum"));
		xp("XCVC").sendKeys(obj.getProperty("CVC"));
		xp("XExp").sendKeys(obj.getProperty("Exp"));
		xp("XYrs").sendKeys(obj.getProperty("Yrs"));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150)");
		timeout(2);
		// Step 14 Click 'Pay and Confirm Order' button
		xp("XPCOCLK").click();
		// Step 15 Verify success message 'Your order has been placed successfully!'
		assertEquals(xp("XOP").getText(), "Congratulations! Your order has been confirmed!");
		// Step 16 Click 'Delete Account' button
		xp("XDA").click();
		// Step 17 Verify 'ACCOUNT DELETED!' and click 'Continue' button
		xp("cc").click();
	}

}
