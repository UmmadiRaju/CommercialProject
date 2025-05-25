package testExecutionSuite;


import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Contact_us extends ReusableCode {
	
	public void contact() throws IOException, InterruptedException, AWTException {
		//Verify that home page is visible successfully
		assertEquals(driver.getTitle(),"Automation Exercise");
		System.out.println(driver.getTitle());
	
		//Click on the Contact US
		xp("contact_us").click();
		timeout(2);
		//Verify 'GET IN TOUCH' is visible
		assertEquals(xp("get_in_touch").getText(),"GET IN TOUCH");
		System.out.println(xp("get_in_touch").getText());
		
		//Enter name, email, subject and message
		xp("contact_name").sendKeys(obj.getProperty("cname"));
		xp("contact_email").sendKeys(obj.getProperty("cemail"));
		xp("contact_subject").sendKeys(obj.getProperty("csubject"));
		xp("contact_message").sendKeys(obj.getProperty("cmessage"));
		timeout(2);
		xp("contact_upload").sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\dummy.pdf");
		timeout(2);
		screenshot("_Contact_Form");
		xp("contact_submit").click();
		timeout(2);
		screenshot("_Submit_popup");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println("Alert text: " + alert.getText());
//		alert.accept(); 
		try {
		 Alert alert = driver.switchTo().alert();
         // Accept the alert (click OK)
         alert.accept();
		}catch(UnhandledAlertException e){
		System.out.println(e.getMessage());	
		}
		
		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
		timeout(2);
		assertEquals(xp("success").getText(),"Success! Your details have been submitted successfully.");
		System.out.println(xp("success").getText());
		timeout(2);
		xp("contact_home").click();
		screenshot("_Return_home_page_");
		
	}

}
