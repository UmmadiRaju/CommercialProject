package testExecutionSuite;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;

public class Sub_cart_page extends ReusableCode {
	public void cp() throws InterruptedException, IOException {
		// Steps 1 is covered in the Base Class
		// Step 2 Navigate to url 'http://automationexercise.com'
		driver.get(obj.getProperty("URL"));
		// Step-3 Checking Home page Title
		assertEquals(driver.getTitle(), "Automation Exercise");
		// 4. Click 'Cart' button
		xp("cart").click();
		// 5. Scroll down to footer
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", xp("footer"));
		// 6. Verify text 'SUBSCRIPTION'
		assertEquals(xp("ts").isDisplayed(), true, "'SUBSCRIPTION' text is not visible!");
		timeout(2);
		// 7. Enter email address in input and click arrow button
		xp("ck").sendKeys(obj.getProperty("ml"));
		xp("ar").click();
		//8. Verify success message 'You have been successfully subscribed!' is visible
		assertEquals(xp("al").isDisplayed(),true,"'You have been successfully'not allowed");		
	}
}
