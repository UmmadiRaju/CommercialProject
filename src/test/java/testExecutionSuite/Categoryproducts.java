package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;

public class Categoryproducts extends ReusableCode {
	public void cproducts() throws InterruptedException, IOException {
		// Steps 1 are covered in the Base Class
		// Step 2 Navigate to url 'http://automationexercise.com'
		driver.get(obj.getProperty("URL"));
		// Step-3 Verify that categories are visible on left side bar
		timeout(2);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");
		assertEquals(xp("ctp").getText(), "CATEGORY");
		// System.out.println("Text found: '" + xp("ct").getText() + "'");
		timeout(2);
		// Click on 'Women' category
		xp("xw").click();
		timeout(2);
		// Click on any category link under 'Women' category, for example: Dress
		xp("cp").click();
		timeout(2);
		// Verify that category page is displayed and confirm text 'WOMEN - TOPS
		// PRODUCTS'
		assertEquals(xp("pd").getText(), "WOMEN - DRESS PRODUCTS");
		timeout(2);
		// On left side bar, click on any sub-category link of 'Men' category
		xp("pm").click();
		xp("ps").click();
		// Verify that user is navigated to that category page
		assertEquals(xp("pw").getText(), "MEN - TSHIRTS PRODUCTS");

	}
}
