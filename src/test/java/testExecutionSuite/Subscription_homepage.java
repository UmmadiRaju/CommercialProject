package testExecutionSuite;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;


public class Subscription_homepage extends ReusableCode {
	
	
	public void subscription_homepage() throws InterruptedException, IOException {
		//Verify that home page is visible successfully
				assertEquals(driver.getTitle(),"Automation Exercise");
				System.out.println(driver.getTitle());
		
//				 Scroll down to footer
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();",xp("subscribe_email") );
				timeout(2);
				screenshot("_Subscription_page");
				
//				Verify text 'SUBSCRIPTION'
				assertEquals(xp("subscription").getText(),"SUBSCRIPTION");
				System.out.println(xp("subscription").getText());
				
//				Enter email address in input and click arrow button
				xp("subscribe_email").sendKeys(obj.getProperty("semail"));
				timeout(2);
				screenshot("_Subscribe_email");
				xp("submit").click();
				
//				Verify success message 'You have been successfully subscribed!' is visible
				assertEquals(xp("subscribe_message").getText(),"You have been successfully subscribed!");
				System.out.println(xp("subscribe_message").getText());
				screenshot("_Subscribe_message");
				
	}
}
