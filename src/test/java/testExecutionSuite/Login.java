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
}