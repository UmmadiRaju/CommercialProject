package testExecutionSuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class PlaceOrderRWC extends ReusableCode {
	
	public void placeorderRWC() throws InterruptedException{
		// Steps 1 is covered in the Base Class
		// Step 2 Navigate to url 'http://automationexercise.com'
		driver.get(obj.getProperty("URL"));
		// Step-3 Checking Home page Title
		assertEquals(driver.getTitle(), "Automation Exercise");
		// Step-4 Add products to cart
		xp("XPCLK").click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		timeout(2);
		xp("XPVCLK").click();
		xp("XACart").click();
		// Step-5 Click 'Cart' button
		xp("XVCart").click();
		// Step-6 Verify that cart page is displayed
		assertEquals(xp("XEQty").isDisplayed(), true, "Product Quantity is not displayed");
		// Step-7 Click Proceed To Checkout
		xp("XPCO").click();
		// Step-8 Click 'Register / Login' button
		xp("XRL").click();
		// Step-9 Fill all details in Signup and create account
		xp("xn").sendKeys(obj.getProperty("uname"));
		// enter email
		xp("xemail").sendKeys(obj.getProperty("email"));
		// Click 'Signup' button
		xp("xsign").click();
		timeout(3);
		// Verify that 'ENTER ACCOUNT INFORMATION' is visible
		assertEquals(xp("info").getText(), "ENTER ACCOUNT INFORMATION");
		// after login
		xp("xradio").click();// click on title
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");
		xp("xpwd").sendKeys(obj.getProperty("pwd"));// enter password
		xp("xday").click();// enter day;
		xp("xmonth").click();// enter month
		xp("xyear").click();// enter year
		xp("xcheck").click();// select checkboxes
		xp("xc").click();// select checkboxes
		// Address information
		xp("aname").sendKeys(obj.getProperty("name"));// enter First name
		xp("alast").sendKeys(obj.getProperty("last"));// enter last name
		xp("cm").sendKeys(obj.getProperty("com"));// Enter password
		xp("ad").sendKeys(obj.getProperty("address"));// enter address1
		xp("ad2").sendKeys(obj.getProperty("address2"));// enter address2
		xp("country").click();// select country
		xp("st").sendKeys(obj.getProperty("state"));// enter the state
		xp("ctx").sendKeys(obj.getProperty("city"));// enter the city
		xp("zp").sendKeys(obj.getProperty("zipcode"));// enter the zipcode
		xp("ph").sendKeys(obj.getProperty("phone"));// enter the phoneno
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)");
		xp("create").click();// click on create
		timeout(3);
		// Step-10 Verify that 'ACCOUNT CREATED!' is visible
		assertEquals(xp("verify").getText(), "ACCOUNT CREATED!");
		xp("cnt").click();// click on continue button
		timeout(3);
		// Step-11 Verify that 'Logged in as username' is visible
		assertEquals(xp("xz").isDisplayed(), true, "not existed");
		// Step-12 Click 'Cart' button
		xp("XCCLK").click();
		// Step-13 Click 'Proceed To Checkout' button
		xp("XPCO").click();
		timeout(2);
		// Step-14 Verify Address Details and Review Your Order
		assertTrue(xp("XADRYO").isDisplayed(),"Address Details and Review Your Order are not displayed");
		// Step-15 Enter description in comment text area and click 'Place Order'
		xp("XMsg").sendKeys(obj.getProperty("XCmt"));
		timeout(2);
		xp("XPO").click();
		// Step-16 Enter payment details: Name on Card, Card Number, CVC, Expiration date
		xp("XNCard").sendKeys(obj.getProperty("NCard"));
		xp("XCNum").sendKeys(obj.getProperty("CNum"));
		xp("XCVC").sendKeys(obj.getProperty("CVC"));
		xp("XExp").sendKeys(obj.getProperty("Exp"));
		xp("XYrs").sendKeys(obj.getProperty("Yrs"));
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,150)");
		timeout(2);
		// Step-17 Click 'Pay and Confirm Order' button
		xp("XPCOCLK").click();
		// Step-18 Verify success message 'Your order has been placed successfully!'
		assertEquals(xp("XOP").getText(), "Congratulations! Your order has been confirmed!");
		// Step-19 Click 'Delete Account' button
		xp("XDA").click();
		// Step-20 Verify 'ACCOUNT DELETED!' and click 'Continue' button
		xp("cc").click();
	}

}
