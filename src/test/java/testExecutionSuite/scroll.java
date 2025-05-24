package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;

public class scroll extends ReusableCode{

	public void sc() throws InterruptedException {
		//Steps 1&2 are covered in the Base Class
		//Step-3 Checking Home page Title
		assertEquals(driver.getTitle(), "Automation Exercise");
		//4. Scroll down page to bottom
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,10000)");
		//5. Verify 'SUBSCRIPTION' is visible
		 assertEquals(xp("sub").getText(),"SUBSCRIPTION");
		timeout(2);
		//6. Click on arrow at bottom right side to move upward
		//xp("su").click();
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, 0)");
		

		timeout(2);
		//7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
		assertEquals(xp("sp").getText(),"Full-Fledged practice website for Automation Engineers");
		
		}
}


