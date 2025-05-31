package testExecutionSuite;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;
import basePack.BaseClass;

public class TestExecute extends BaseClass {
	Register r;


	Login l;
	//@Test(priority=1)

	//@Test(priority=1)

	//Login l;
	Contact_us c;
	Subscription_homepage sh; 
	Subscription_cartpage sc;

	
	//@Test(priority=1)

	public void Register() throws IOException, InterruptedException {
	 r = new Register();
		r.registertest();
	}
	
	//@Test(priority=2, dependsOnMethods={"Register"})
	public void Existingmail()throws IOException, InterruptedException {
		 r= new Register();
		 r.existing();
		
	}
	
	//@Test(priority=3)
	public void Testcasepage()throws IOException, InterruptedException{
		Testcasepage t=new Testcasepage();
		t.tpage();
	}
	//@Test(priority=4)
	public void Categoryproducts()throws IOException, InterruptedException{
		Categoryproducts cp =new Categoryproducts();
		cp.cproducts();
		
	}

	//@Test(priority=5)
<<<<<<< HEAD
	//public void scroll()throws IOException, InterruptedException{
		//scroll s= new scroll(); 

=======
=======
<<<<<<< HEAD
	//@Test(priority=5)
	public void scroll()throws IOException, InterruptedException{
		scroll s= new scroll(); 
=======
<<<<<<< HEAD
>>>>>>> e6d07def5b0411323acc6c0206ca0eaadb2b1d6a
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
>>>>>>> 348236317209849f943f9733c3ba0e54f55ce3ef
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
<<<<<<< HEAD

=======
<<<<<<< HEAD
	//@Test(priority=8)
=======
<<<<<<< HEAD
>>>>>>> e6d07def5b0411323acc6c0206ca0eaadb2b1d6a
	
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
>>>>>>> 348236317209849f943f9733c3ba0e54f55ce3ef
	public void contactUs() throws InterruptedException {
		ContactUs c = new ContactUs();
		c.contactUs();
	}

<<<<<<< HEAD

=======
<<<<<<< HEAD
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
=======
>>>>>>> 7922af434f89e044c10b96935cdc14b30865262e
>>>>>>> 70ba564051a3e5baa165309948978f07e8cdfdf9
>>>>>>> 348236317209849f943f9733c3ba0e54f55ce3ef
>>>>>>> e6d07def5b0411323acc6c0206ca0eaadb2b1d6a
}
