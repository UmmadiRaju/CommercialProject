package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

public class Cartbrand extends ReusableCode {
	public void cb() throws InterruptedException, IOException{
		//Steps 1&2 are covered in the Base Class
				//Step-3 Checking Home page Title
				System.out.println(driver.getTitle());
				assertEquals(driver.getTitle(), "Automation Exercise");
				//3. Click on 'Products' button
				xp("prod").click();
				//4. Verify that Brands are visible on left side bar
				assertEquals(xp("brand").getText(),"BRANDS");
				//5. Click on any brand name
				xp("hm").click();
				//6. Verify that user is navigated to brand page and brand products are displayed
				assertEquals(xp("bd").getText(),"BRAND - H&M PRODUCTS");
				//7. On left side bar, click on any other brand link
				xp("polo").click();
				//8. Verify that user is navigated to that brand page and can see products
				assertEquals(xp("pl").getText(),"BRAND - POLO PRODUCTS");
				timeout(3);
				xp("home").click();
		
	}

}
