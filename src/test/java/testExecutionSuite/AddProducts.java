package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;

public class AddProducts extends ReusableCode {

	public void AP() throws InterruptedException {

		// Steps 1&2 are covered in the Base Class
		driver.get(obj.getProperty("URL"));
		// Step-3 Checking Home page Title

		assertEquals(driver.getTitle(), "Automation Exercise");
		// Step-4 Clicking on Products
		xp("XPCLK").click();
		
		// Scroll down by 1000 pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		
		
		//Hover over first product and click 'Add to cart
		xp("XFP").click();
		timeout(2);
		//Click 'Continue Shopping' button
		xp("XCS").click();
		timeout(2);
		//Hover over second product and click 'Add to cart'
		xp("XDP").click();
		timeout(2);
		//Click 'View Cart' button
		xp("XVC").click();
		timeout(2);
		
		//Verify both products are added to Cart
		
		assertEquals(xp("XAP").isDisplayed(),true, "Products not displayed");
		
		// Verify their prices, quantity and total price
		
		assertEquals(xp("XPCP").isDisplayed(),true,"Prices Not displayed");
		assertEquals(xp("XPCQ").isDisplayed(),true,"quantity Not displayed");
		assertEquals(xp("XPCT").isDisplayed(),true,"quantity Not displayed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
