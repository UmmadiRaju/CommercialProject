package testExecutionSuite;

import java.io.IOException;

public class Login extends ReusableCode {
	public void logintest() throws InterruptedException, IOException {
		// Steps 1 is covered in the Base Class
		// Step 2 Navigate to url 'http://automationexercise.com'
		driver.get(obj.getProperty("URL"));
		xp("xp").click(); // Login Hyperlink
		xp("xe").sendKeys(obj.getProperty("email")); // Email Field
		xp("xpd").sendKeys(obj.getProperty("password")); // Password Field
		xp("xl").click(); // Login Button
		timeout(2);
		screenshot("login");// Screenshot
	}
}