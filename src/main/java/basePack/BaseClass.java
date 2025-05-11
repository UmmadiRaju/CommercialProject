package basePack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties obj;
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  //System.setProperty("webdriver.chrome.driver", "D:/JavaPracticeCodes2025/orangehrm/Drivers/chromedriver.exe");
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/testData/TestDataFile");
	  obj = new Properties();
	  obj.load(file);
  }
 

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
