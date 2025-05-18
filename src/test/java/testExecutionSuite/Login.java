package testExecutionSuite;

import java.io.IOException;

public class Login extends ReusableCode {
	public void logintest() throws InterruptedException, IOException
	{
		xp("xp").click(); // Add comments
		xp("xe").sendKeys(obj.getProperty("email"));
		xp("xpd").sendKeys(obj.getProperty("password"));
		xp("xl").click();
		timeout(2);
		screenshot("login");
	}
}