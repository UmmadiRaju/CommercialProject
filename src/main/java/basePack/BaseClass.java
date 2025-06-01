package basePack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v132.filesystem.model.File;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties obj;

	@BeforeTest
	public void beforeTest() throws IOException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		// Turn off Chrome's save password and autofill popups
		Map<String, Object> obj1 = new HashMap<>();
		obj1.put("credentials_enable_service", false);
		obj1.put("profile.password_manager_enabled", false);
		obj1.put("autofill.profile_enabled", false);

		options.setExperimentalOption("prefs", obj1);

		// Start Chrome in incognito mode and disable notifications
		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-save-password-bubble");
		//C:\Users\Admin\git\CommercialProject/crx
		 //File file1= new File("C:\\Users\\Admin\\git\\CommercialProject/crx.crx");
	   
	    //options.addExtensions(file1);
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/testData/TestDataFile");
		obj = new Properties();
		obj.load(file);

		driver.get(obj.getProperty("URL"));
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

}
