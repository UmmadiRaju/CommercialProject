
package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Register extends ReusableCode {


	public  void registertest() throws InterruptedException, IOException
	{   
		
		//Verify that home page is visible successfully
		assertEquals(driver.getTitle(),"Automation Exercise");
		//click on login 
		xp("xp").click();
		//Verify 'New User Signup!' is visible
		assertEquals(xp("xp").getText(),"Signup / Login");
		//enter username
		xp("xn").sendKeys(obj.getProperty("uname"));
		//enter email
		xp("xemail").sendKeys(obj.getProperty("email"));
		//Click 'Signup' button
		xp("xsign").click();
		timeout(3);
		//Verify that 'ENTER ACCOUNT INFORMATION' is visible
		assertEquals(xp("info").getText(),"ENTER ACCOUNT INFORMATION");
	
		//after login
        xp("xradio").click();// click on title
		xp("xpwd").sendKeys(obj.getProperty("pwd"));//enter password
		xp("xday").click();//enter day;
		xp("xmonth").click();//enter month
		xp("xyear").click();//enter year
		xp("xcheck").click();//select checkboxes
		xp("xc").click();//select checkboxes
		//Address information
		xp("aname").sendKeys(obj.getProperty("name"));//enter First name
		xp("alast").sendKeys(obj.getProperty("last"));// enter last name
		xp("cm").sendKeys(obj.getProperty("com"));//Enter password
		xp("ad").sendKeys(obj.getProperty("address"));//enter address1
		xp("ad2").sendKeys(obj.getProperty("address2"));//enter address2
		xp("country").click();//select country
		xp("st").sendKeys(obj.getProperty("state"));//enter the state
		xp("ct").sendKeys(obj.getProperty("city"));//enter the city
		xp("zp").sendKeys(obj.getProperty("zipcode"));//enter the zipcode
		xp("ph").sendKeys(obj.getProperty("phone"));//enter the phoneno
		xp("create").click();//click on create
		timeout(3);
		//Verify that 'ACCOUNT CREATED!' is visible
		assertEquals(xp("verify").getText().trim(),"ACCOUNT CREATED!");
		xp("cnt").click();//click on continue button
		timeout(3);
		//Verify that 'Logged in as username' is visible
		//WebElement login =driver.findElement(By.xpath("//a[contains(., 'Logged in as') and .//b]"));
		//System.out.println(login.getText());
        assertEquals(xp("xz").isDisplayed(),true,"not existed");
		

		//Click 'Delete Account' button
		xp("del").click();
		//Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
		assertEquals(xp("dc").getText(),"ACCOUNT DELETED!");
		xp("cc").click();	
		//screenshot("register");
		
		
	}

	public void existing()throws InterruptedException, IOException {
		//Steps 1&2 are covered in the Base Class
				//Step-3 Checking Home page Title
		        timeout(3);
				assertEquals(driver.getTitle(), "Automation Exercise");
				// Click on 'Signup / Login' button
				xp("xp").click();
				//Verify 'New User Signup!' is visible
				assertEquals(xp("xp").getText(),"Signup / Login");
				//Enter name and already registered email address
				//enter username
				xp("xn").sendKeys(obj.getProperty("uname"));
				//enter already register email
				xp("xemail").sendKeys(obj.getProperty("em"));
				//Click 'Signup' button
				xp("xsign").click();
				//Verify error 'Email Address already exist!' is visible
				assertEquals(xp("vr").getText(),"Email Address already exist!");
				timeout(3);
		
		
	}
	
	
}