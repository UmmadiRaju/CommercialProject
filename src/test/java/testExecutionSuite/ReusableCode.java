package testExecutionSuite;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ReusableCode extends TestExecute{
	public WebElement xp(String a) {
		return driver.findElement(By.xpath(obj.getProperty(a)));
	}
	
	public int timeout(int t) throws InterruptedException {
		int x = 1000*t;
		Thread.sleep(x);
		return x;
	}
	
	public static void screenshot(String i) throws IOException {
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File t = new File(System.getProperty("user.dir")+ "/TestEvidences/"+i+".png");
		FileHandler.copy(s, t);
	}

}
