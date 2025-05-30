package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends ReusableCode {
	public void logintest() throws InterruptedException, IOException
	{
		assertEquals(driver.getTitle(),"Automation Exercise"); 
		xp("xp").click(); // Login Hyperlink
		// Verify that Login to your account is showing on the page Xlogin
		assertEquals(xp("xlog").getText(),"Login to your account");
		
		xp("xe").sendKeys(obj.getProperty("emailid")); // Email Field
		xp("xpd").sendKeys(obj.getProperty("pwd")); // Password Field
		xp("xl").click(); // Login Button
		assertEquals(xp("xz").isDisplayed(),true,"not existed");
		
		//Click 'Delete Account' button
		xp("del").click();
		//Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
		assertEquals(xp("dc").getText(),"ACCOUNT DELETED!");
		xp("cc").click();
		
		//timeout(2);
		//screenshot("login");// Screenshot
	}
	
	public void logout() throws InterruptedException, IOException {
		timeout(2);
		assertEquals(driver.getTitle(),"Automation Exercise"); 
		xp("xp").click(); // Login Hyperlink
		// Verify that Login to your account is showing on the page Xlogin
		assertEquals(xp("xlog").getText(),"Login to your account");
		
		xp("xe").sendKeys(obj.getProperty("email1")); // Email Field
		xp("xpd").sendKeys(obj.getProperty("pwd")); // Password Field
		xp("xl").click(); // Login Button
		assertEquals(xp("xz").isDisplayed(),true,"not existed");
		
		xp("logout").click();//Logout
		screenshot("incorrectlogin");
		assertEquals(xp("xlog").getText(),"Login to your account");
	}
	
	public void inclogin() throws InterruptedException, IOException 
	{
		
		timeout(1);
		assertEquals(driver.getTitle(),"Automation Exercise - Signup / Login");
		xp("xp").click(); // Login Hyperlink
		// Verify that Login to your account is showing on the page Xlogin
		assertEquals(xp("xlog").getText(),"Login to your account");
		
		xp("xe").sendKeys(obj.getProperty("incemail")); //Incorrect Email Field
		xp("xpd").sendKeys(obj.getProperty("incpwd")); // Password Field
		timeout(1);
		xp("xl").click(); // Login Button
		
		//incpwdv
		assertEquals(xp("incpwdv").getText(),"Your email or password is incorrect!");
		screenshot("incorrectlogin");
	}
	
}
