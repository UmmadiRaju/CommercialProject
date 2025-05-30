package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

public class Testcasepage extends ReusableCode {
	public void tpage()throws InterruptedException, IOException {
		//Steps 1&2 are covered in the Base Class
		//Step-3 Checking Home page Title
		timeout(2);
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), "Automation Exercise");
		//Click on 'Test Cases' button
		xp("tsx").click();
		// Verify user is navigated to test cases page successfully
		assertEquals(xp("test").getText(), "TEST CASES");
		//direct to home page
		xp("home").click();
		
		

	
	}

}
