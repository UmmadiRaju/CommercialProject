package testExecutionSuite;


import java.io.IOException;

import org.testng.Assert;


public class TestScript extends ReusableCode {

	public void login() throws IOException, InterruptedException {
		driver.get(obj.getProperty("URL"));
		try {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM - New Level of HR Management");
		}catch(Exception e) {
			System.out.println("Landing page actual title is mismatched with expected title");
		}
		screenshot("HomePage");
		timeout(2);
		xp("XUN").sendKeys(obj.getProperty("UN"));
		xp("XPWD").sendKeys(obj.getProperty("PWD"));
		screenshot("UsernamePassword");
		timeout(2);
		xp("XCLK").click();
		try {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		}catch(Exception e) {
			System.out.println("Home page actual title is mismatched with expecte title");
		}
		screenshot("AfterLogin");
		timeout(2);
	}
}
