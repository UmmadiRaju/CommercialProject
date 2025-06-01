
package testExecutionSuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PlaceOrderRBC extends ReusableCode {

	public void placeOrderRBC() throws InterruptedException {
		// Steps 1 is covered in the Base Class
		// Step 2 Navigate to url 'http://automationexercise.com'
		driver.get(obj.getProperty("URL"));
		// Step 3 Verify that home page is visible successfully
		assertEquals(driver.getTitle(), "Automation Exercise");
		// Step 4 click on login/Signup button
		xp("xp").click();
		// Step 5 Fill all details in Signup and create account
		xp("xn").sendKeys(obj.getProperty("uname"));
		xp("xemail").sendKeys(obj.getProperty("email"));
		xp("xsign").click();
		timeout(3);
		assertEquals(xp("info").getText(), "ENTER ACCOUNT INFORMATION");
		xp("xradio").click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");
		xp("xpwd").sendKeys(obj.getProperty("pwd"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.id("your-element-id")));
		xp("xday").click();
		xp("xmonth").click();
		xp("xyear").click();
		xp("xcheck").click();
		xp("xc").click();
		xp("aname").sendKeys(obj.getProperty("name"));
		xp("alast").sendKeys(obj.getProperty("last"));
		xp("cm").sendKeys(obj.getProperty("com"));
		xp("ad").sendKeys(obj.getProperty("address"));
		xp("ad2").sendKeys(obj.getProperty("address2"));
		xp("country").click();// select country
		xp("st").sendKeys(obj.getProperty("state"));
		xp("ctx").sendKeys(obj.getProperty("city"));
		xp("zp").sendKeys(obj.getProperty("zipcode"));
		xp("ph").sendKeys(obj.getProperty("phone"));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)");
		xp("create").click();
		timeout(3);
		// Step 6 Verify 'ACCOUNT CREATED!' and click 'Continue' button
		assertEquals(xp("verify").getText(), "ACCOUNT CREATED!");
		xp("cnt").click();
		timeout(3);
		// Step 7 Verify ' Logged in as username' at top
		assertEquals(xp("xz").isDisplayed(), true, "not existed");
		// Step 8 Add products to cart
		xp("XPCLK").click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		timeout(2);
		xp("XPVCLK").click();
		xp("XACart").click();
		// Step 9 Click 'Cart' button
		xp("XVCart").click();
		// Step 10 Verify that cart page is displayed
		assertEquals(xp("XEQty").isDisplayed(), true, "Product Quantity is not displayed");
		// Step 11 Click Proceed To Checkout
		xp("XPCO").click();
		// Step 12 Verify Address Details and Review Your Order
		assertTrue(xp("XADRYO").isDisplayed(),"Address Details and Review Your Order are not displayed");
		// Step 13 Enter description in comment text area and click 'Place Order'
		xp("XMsg").sendKeys(obj.getProperty("XCmt"));
		timeout(2);
		xp("XPO").click();
		// Step 14 Enter payment details: Name on Card, Card Number, CVC, Expiration date
		xp("XNCard").sendKeys(obj.getProperty("NCard"));
		xp("XCNum").sendKeys(obj.getProperty("CNum"));
		xp("XCVC").sendKeys(obj.getProperty("CVC"));
		xp("XExp").sendKeys(obj.getProperty("Exp"));
		xp("XYrs").sendKeys(obj.getProperty("Yrs"));
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,150)");
		timeout(2);
		// Step 15 Click 'Pay and Confirm Order' button
		xp("XPCOCLK").click();
		// Step 16 Verify success message 'Your order has been placed successfully!'
		assertEquals(xp("XOP").getText(), "Congratulations! Your order has been confirmed!");
		// Step 17 Click 'Delete Account' button
		xp("XDA").click();
		// Step 18 Verify 'ACCOUNT DELETED!' and click 'Continue' button
		xp("cc").click();
	}
}
