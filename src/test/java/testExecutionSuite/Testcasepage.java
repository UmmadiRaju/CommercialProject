package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

public class Testcasepage extends ReusableCode {
	public void tpage() throws InterruptedException, IOException {
		// Steps 1 is covered in the Base Class
		// Step 2 Navigate to url 'http://automationexercise.com'
		driver.get(obj.getProperty("URL"));
		// Step-3 Checking Home page Title
		assertEquals(driver.getTitle(), "Automation Exercise - Signup / Login");
		// Click on 'Test Cases' button
		xp("ts").click();
		// Verify user is navigated to test cases page successfully
		assertEquals(xp("test").getText().trim(), "TEST CASES");
		timeout(2);

	}

}
