package testExecutionSuite;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;

public class Subscription_cartpage extends ReusableCode {

	public void subscription_cartpage() throws InterruptedException, IOException {
		// Step 2 Navigate to url 'http://automationexercise.com'
		driver.get(obj.getProperty("URL"));
		// Verify that home page is visible successfully
		assertEquals(driver.getTitle(), "Automation Exercise");
		System.out.println(driver.getTitle());

//				Click 'Cart' button
		xp("subscribe_cart").click();
		screenshot("_Subscription_cart_page");

//			 Scroll down to footer
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", xp("subscribe_email"));
		timeout(2);

//			Verify text 'SUBSCRIPTION'
		assertEquals(xp("subscription").getText(), "SUBSCRIPTION");
		System.out.println(xp("subscription").getText());

//			Enter email address in input and click arrow button
		xp("subscribe_email").sendKeys(obj.getProperty("semail"));
		timeout(2);
		screenshot("_Subscribe_cart_email");
		xp("submit").click();

		// Verify success message 'You have been successfully subscribed!' is visible
		assertEquals(xp("subscribe_message").getText(), "You have been successfully subscribed!");
		System.out.println(xp("subscribe_message").getText());
		screenshot("_Subscribe_cart_message");

	}
}
