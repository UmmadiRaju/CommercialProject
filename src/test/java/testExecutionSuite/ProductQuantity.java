package testExecutionSuite;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ProductQuantity extends ReusableCode {
	public void PQuantity() throws InterruptedException {
		//Steps 1&2 are covered in the Base Class
		//Step-3 Checking Home page Title
		assertEquals(driver.getTitle(), "Automation Exercise");
		//Step-4 Clicking on Products
		xp("XPCLK").click();
		//Step-5 Checking All Product page
		assertEquals(driver.getTitle(), "Automation Exercise - All Products");
		//Scrolling page 
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		timeout(2);
		//Step-6 Products list is visible
		assertEquals(xp("XPCLK").isDisplayed(), true, "Product list is not visible");
		//step-7 Clicking on View Product
		xp("XPVCLK").click();
		//Step-8 Checking Product detail page
		assertEquals(driver.getTitle(), "Automation Exercise - Product Details");
		//Step-9(a) Checking product model
		assertEquals(xp("XPPM").getText(), "Blue Top");
		//Step-9(b) Checking product details
		List<WebElement> pDetails = driver.findElements(By.xpath("//div[@class = 'product-information']//p"));
		ArrayList <Object> ProductList = new ArrayList<Object>();
		ProductList.add("Category: Women > Tops");
		ProductList.add("Availability: In Stock");
		ProductList.add("Condition: New");
		ProductList.add("Brand: Polo");
		for(int i =0; i< pDetails.size(); i++) {
			assertEquals(pDetails.get(i).getText(), ProductList.get(i));
		}
		}
}