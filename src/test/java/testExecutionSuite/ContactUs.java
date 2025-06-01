package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ContactUs extends ReusableCode {

	public void contactUs() throws InterruptedException {
		// Steps 1 is covered in the Base Class
		// Step 2 Navigate to url 'http://automationexercise.com'
		driver.get(obj.getProperty("URL"));
		// Step-3 Checking Home page Title
		assertEquals(driver.getTitle(), "Automation Exercise");
		// Step-4 Click on 'Contact Us' button
		xp("XCUCLK").click();
		// Step-5 Verify 'GET IN TOUCH' is visible
		assertEquals(xp("XGIT").isDisplayed(), true, "Get in touch is not visible");
		// Step-6 Enter name, email, subject and message
		xp("XName").sendKeys(obj.getProperty("CName"));
		xp("XEmail").sendKeys(obj.getProperty("CEmail"));
		xp("XSubject").sendKeys(obj.getProperty("CSubject"));
		xp("XMsg").sendKeys(obj.getProperty("CMsg"));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150)");
		// Step-7 Upload file
		xp("XUFile").sendKeys("C:\\Users\\appal\\OneDrive\\Pictures\\Screenshots\\Screenshot (18).png");
		// Step-8 Click 'Submit' button
		xp("XSubmit").click();
		timeout(2);
		// Click OK button
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// Verify success message 'Success! Your details have been submitted
		// successfully.' is visible
		assertEquals(xp("XSuccess").getText(), "Success! Your details have been submitted successfully.");
		// Click 'Home' button and verify that landed to home page successfully
		xp("XHome").click();
	}

}
