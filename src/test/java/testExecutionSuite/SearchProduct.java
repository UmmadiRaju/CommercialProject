package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;

public class SearchProduct extends ReusableCode {

	public void sp() {

		// Steps 1&2 are covered in the Base Class
		driver.get(obj.getProperty("URL"));
		// Step-3 Checking Home page Title

		assertEquals(driver.getTitle(), "Automation Exercise");
		// Step-4 Clicking on Products
		xp("XPCLK").click();
		// Step-5 Checking All Product page
		assertEquals(driver.getTitle(), "Automation Exercise - All Products");

		// Scroll down by 1000 pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		xp("XSP").sendKeys(obj.getProperty("SearchProduct"));

		xp("XSB").click();

		assertEquals(xp("XSPV").isDisplayed(), true, "Not Visible");

		assertEquals(xp("XASPV").isDisplayed(), true, "All Products are not Visible");

	}

}
