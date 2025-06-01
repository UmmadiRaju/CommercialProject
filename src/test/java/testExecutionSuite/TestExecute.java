package testExecutionSuite;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;
import basePack.BaseClass;

public class TestExecute extends BaseClass {
	Register r;
	Login l;
	Subscription_homepage sh; 
	Subscription_cartpage sc;

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
	
	//@Test(priority=3)
	public void loginTest() throws IOException, InterruptedException {
		Login l = new Login();
		l.logintest();
	}
	
	//@Test(priority=4)
	public void Logout() throws InterruptedException, IOException {
		l = new Login();
		l.logout();
	}
	
	//@Test(priority=5)
	public void Incorrectlogin() throws InterruptedException, IOException {
		l = new Login();
		l.inclogin();
	}
	
	@Test(priority=6)
	public void Testcasepage()throws IOException, InterruptedException{
		Testcasepage t=new Testcasepage();
		t.tpage();
	}

	@Test(priority=7)
	public void categoryproducts() throws IOException, InterruptedException {
		Categoryproducts cp = new Categoryproducts();
		cp.cproducts();
	}

	@Test(priority=8)
	public void scrollWC() throws IOException, InterruptedException {
		Scroll s = new Scroll();
		s.scrollWClK();
	}
	
	@Test(priority=9)
	public void scrollWTC() throws IOException, InterruptedException {
		Scroll s = new Scroll();
		s.scrollWTCLK();
	}

	@Test(priority=10)
	public void productDetails() throws InterruptedException {
		ProductDetails p = new ProductDetails();
		p.pDetails();
	}
	
	@Test(priority=11)
	public void Subscription_homepage() throws InterruptedException, IOException, AWTException {
		sh = new Subscription_homepage();
		sh.subscription_homepage();
	}
	
	@Test(priority=12)
	public void Subscription_cartpage() throws InterruptedException, IOException, AWTException {
		sc = new Subscription_cartpage();
		sc.subscription_cartpage();
	}
	
	@Test(priority=13)
	public void sub_cart_page()throws IOException, InterruptedException{
		Sub_cart_page c = new Sub_cart_page();
		c.cp();
	}

	@Test(priority=14)
	public void contactUs() throws InterruptedException {
		ContactUs c = new ContactUs();
		c.contactUs();
	}
	@Test(priority=9)
	public void Cartbrand()throws InterruptedException, IOException{
		Cartbrand c= new Cartbrand();
		 c.cb();
	}

	@Test(priority=15)
	public void productQuantity() throws InterruptedException {
		ProductQuantity p = new ProductQuantity();
		p.pQuantity();
	}
	
	@Test(priority=16)
	public void placeOrderRWC() throws InterruptedException {
		PlaceOrderRWC p = new PlaceOrderRWC();
		p.placeorderRWC();
	}
	
	@Test(priority=17)
	public void placeOrderRBC() throws InterruptedException {
		PlaceOrderRBC p = new PlaceOrderRBC();
		p.placeOrderRBC();
	}
	
	@Test(priority=18)
	public void placeOrderLBC() throws InterruptedException {
		PlaceOrderLBC p = new PlaceOrderLBC();
		p.placeorderLBC();
	}
	
    @Test(priority=19)
	public void removeProduct() throws InterruptedException {
		RemoveProduct r = new RemoveProduct();
		r.removeProduct();
	}
	
	@Test(priority=20)
	public void SearchProduct() {
		SearchProduct s = new SearchProduct();
		s.sp();	
	}
		
	@Test(priority=21)
	public void AllProducts() throws InterruptedException {
		AddProducts A = new AddProducts();
		A.AP();	
	}
}
