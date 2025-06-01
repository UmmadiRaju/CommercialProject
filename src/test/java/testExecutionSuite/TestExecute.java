package testExecutionSuite;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;
import basePack.BaseClass;

public class TestExecute extends BaseClass {
	Register r;
<<<<<<< HEAD

	//@Test(priority=1)
=======
	Login l;
	
	
	//@Test(priority=1)

	//@Test(priority=1)

	//Login l;
	Contact_us c;
	Subscription_homepage sh; 
	Subscription_cartpage sc;

	
	//@Test(priority=1)

>>>>>>> 2fad1e1a14f85d46db2f90850589400c18c49839
	public void Register() throws IOException, InterruptedException {
		r = new Register();
		r.registertest();
	}
	
<<<<<<< HEAD
	//@Test(priority=2)
	public void loginTest() throws IOException, InterruptedException {
		Login l = new Login();
		l.logintest();
	}

	//@Test(priority=3, dependsOnMethods={"Register"})
	public void Existingmail() throws IOException, InterruptedException {
		r = new Register();
		r.existing();

=======
	//@Test(priority=2, dependsOnMethods={"Register"})
	public void Existingmail()throws IOException, InterruptedException {
		 r= new Register();
		 r.existing();
		
	}
	
	//@Test(priority=3)
	public void Testcasepage()throws IOException, InterruptedException{
		Testcasepage t=new Testcasepage();
		t.tpage();
>>>>>>> 2fad1e1a14f85d46db2f90850589400c18c49839
	}

	//@Test(priority=4)
<<<<<<< HEAD
	public void Testcasepage() throws IOException, InterruptedException {
		Testcasepage t = new Testcasepage();
		t.tpage();

	}

	//@Test(priority=5)
	public void categoryproducts() throws IOException, InterruptedException {
		categoryproducts cp = new categoryproducts();
		cp.cproducts();

	}

	//@Test(priority=6)
	public void scroll() throws IOException, InterruptedException {
		scroll s = new scroll();
		s.sc();
	}

	//@Test(priority=7)
	public void sub_cart_page() throws IOException, InterruptedException {
		sub_cart_page c = new sub_cart_page();
		c.cp();
	}

	@Test
	public void productDetails() throws InterruptedException {
		ProductDetails p = new ProductDetails();
		p.pDetails();
	}

	@Test
=======
	public void Categoryproducts()throws IOException, InterruptedException{
		Categoryproducts cp =new Categoryproducts();
		cp.cproducts();
		
	}

	//@Test(priority=5)

	//public void scroll()throws IOException, InterruptedException{
		//scroll s= new scroll(); 


	//@Test(priority=5)
	//public void scroll()throws IOException, InterruptedException{
		//scroll s= new scroll(); 

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
	

	@Test(priority=5)

	public void Scroll()throws IOException, InterruptedException{
		Scroll s= new Scroll();
		s.sc();
	}
	//@Test(priority=6)
	public void sub_cart_page()throws IOException, InterruptedException{
		Sub_cart_page c = new Sub_cart_page();
		c.cp();
	}
	//@Test(priority=7)
	public void productQuantity() {
		ProductQuantity p = new ProductQuantity();
		p.productQuantity();
	}

	//@Test(priority=8)

	
	@Test(priority=5)
	public void Logout() throws InterruptedException, IOException {
		l = new Login();
		l.logout();
	}
	
	@Test(priority=6)
	public void Incorrectlogin() throws InterruptedException, IOException {
		l = new Login();
		l.inclogin();
	}

	@Test(priority=8)

>>>>>>> 2fad1e1a14f85d46db2f90850589400c18c49839
	public void contactUs() throws InterruptedException {
		ContactUs c = new ContactUs();
		c.contactUs();
	}
<<<<<<< HEAD

	@Test
	public void productQuantity() throws InterruptedException {
		ProductQuantity p = new ProductQuantity();
		p.pQuantity();
	}
	
	@Test
	public void placeOrderRWC() throws InterruptedException {
		PlaceOrderRWC p = new PlaceOrderRWC();
		p.placeorderRWC();
	}
	
	@Test
	public void placeOrderRBC() throws InterruptedException {
		PlaceOrderRBC p = new PlaceOrderRBC();
		p.placeOrderRBC();
	}
	@Test
	public void placeOrderLBC() throws InterruptedException {
		PlaceOrderLBC p = new PlaceOrderLBC();
		p.placeOrderLBC();
	}
	@Test
	public void removeProduct() throws InterruptedException {
		RemoveProduct r = new RemoveProduct();
		r.removeProduct();
	}
=======
	
	@Test
	public void SearchProduct() {
		
		SearchProduct s = new SearchProduct();
		s.sp();
		
	}
	
	
	@Test
	public void AllProducts() throws InterruptedException {
		
		AddProducts A = new AddProducts();
		A.AP();
	
}
>>>>>>> 2fad1e1a14f85d46db2f90850589400c18c49839
}
