package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;

<<<<<<< HEAD:src/test/java/testExecutionSuite/scroll.java
public class scroll extends ReusableCode {

	public void sc() throws InterruptedException {
		// Steps 1 is covered in the Base Class
		// Step 2 Navigate to url 'http://automationexercise.com'
		driver.get(obj.getProperty("URL"));
		// Step-3 Checking Home page Title
=======
public class Scroll extends ReusableCode{

	public void sc() throws InterruptedException {
		//Steps 1&2 are covered in the Base Class
		//Step-3 Checking Home page Title
		timeout(2);
		System.out.println(driver.getTitle());
>>>>>>> 2fad1e1a14f85d46db2f90850589400c18c49839:src/test/java/testExecutionSuite/Scroll.java
		assertEquals(driver.getTitle(), "Automation Exercise");
		// 4. Scroll down page to bottom
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,10000)");
		// 5. Verify 'SUBSCRIPTION' is visible
		assertEquals(xp("sub").getText(), "SUBSCRIPTION");
		timeout(2);
		// 6. Click on arrow at bottom right side to move upward
		// xp("su").click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");

		timeout(2);
<<<<<<< HEAD:src/test/java/testExecutionSuite/scroll.java
		// 7. Verify that page is scrolled up and 'Full-Fledged practice website for
		// Automation Engineers' text is visible on screen
		assertEquals(xp("sp").getText(), "Full-Fledged practice website for Automation Engineers");

	}
=======
		//7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
		assertEquals(xp("sp").getText(),"Full-Fledged practice website for Automation Engineers");
		xp("home").click();
		
		}
>>>>>>> 2fad1e1a14f85d46db2f90850589400c18c49839:src/test/java/testExecutionSuite/Scroll.java
}
