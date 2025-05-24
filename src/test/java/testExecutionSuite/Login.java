package testExecutionSuite;

import java.io.IOException;

public class Login extends ReusableCode {
	public void logintest() throws InterruptedException, IOException
	{
		xp("xp").click(); // Login Hyperlink
		xp("xe").sendKeys(obj.getProperty("emailid")); // Email Field
		xp("xpd").sendKeys(obj.getProperty("pwd")); // Password Field
		xp("xl").click(); // Login Button
		timeout(2);
		screenshot("login");// Screenshot
	}
	
	public void logout() throws InterruptedException, IOException {
		timeout(1);
		xp("logout").click();//Logout
		screenshot("incorrectlogin");
	}
	
	public void inclogin() throws InterruptedException, IOException 
	{
		timeout(2);
		xp("xp").click(); // Login Hyperlink
		xp("xe").sendKeys(obj.getProperty("incemail")); //Incorrect Email Field
		xp("xpd").sendKeys(obj.getProperty("incpwd")); // Password Field
		timeout(1);
		xp("xl").click(); // Login Button
		screenshot("incorrectlogin");
	}
	
}
