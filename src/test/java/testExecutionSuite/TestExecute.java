package testExecutionSuite;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;
import basePack.BaseClass;

public class TestExecute extends BaseClass {
	Register r;
<<<<<<< HEAD
	Login l;
	Contact_us c;
	Subscription_homepage sh; 
	Subscription_cartpage sc;
=======


>>>>>>> 7922af434f89e044c10b96935cdc14b30865262e
	
	@Test(priority=1)


	
	public void Register() throws IOException, InterruptedException {
	 r = new Register();
		r.registertest();
	}
	
	@Test(priority=2, dependsOnMethods={"Register"})
	public void Existingmail()throws IOException, InterruptedException {
		 r= new Register();
		 r.existing();
		
	}
	
	@Test(priority=3)
	public void Testcasepage()throws IOException, InterruptedException{
		Testcasepage t=new Testcasepage();
		t.tpage();
	}
	@Test(priority=4)
	public void Categoryproducts()throws IOException, InterruptedException{
		Categoryproducts cp =new Categoryproducts();
		cp.cproducts();
		
	}
<<<<<<< HEAD
	@Test(priority=6)
	public void Contact_us() throws InterruptedException, IOException, AWTException {
		c = new Contact_us();
		c.contact();
	}
	
	@Test(priority=10)
	public void Subscription_homepage() throws InterruptedException, IOException, AWTException {
		sh = new Subscription_homepage();
		sh.subscription_homepage();
	}
	
	@Test(priority=11)
	public void Subscription_cartpage() throws InterruptedException, IOException, AWTException {
		sc = new Subscription_cartpage();
		sc.subscription_cartpage();
	}
	
=======
	@Test(priority=5)
	public void Scroll()throws IOException, InterruptedException{
		Scroll s= new Scroll();
		s.sc();
	}
	@Test(priority=6)
	public void sub_cart_page()throws IOException, InterruptedException{
		Sub_cart_page c = new Sub_cart_page();
		c.cp();
	}
	@Test(priority=7)
	public void productQuantity() {
		ProductQuantity p = new ProductQuantity();
		p.productQuantity();
	}
	@Test(priority=8)
	public void contactUs() throws InterruptedException {
		ContactUs c = new ContactUs();
		c.contactUs();
	}

>>>>>>> 7922af434f89e044c10b96935cdc14b30865262e
}
