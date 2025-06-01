package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

public class Testcasepage extends ReusableCode {
<<<<<<< HEAD
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

=======
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
		
		

	
>>>>>>> 2fad1e1a14f85d46db2f90850589400c18c49839
	}

}
