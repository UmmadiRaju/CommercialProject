package testExecutionSuite;

import java.io.IOException;

import org.testng.annotations.Test;
import basePack.BaseClass;

public class TestExecute extends BaseClass {
	Register r;

	//@Test(priority=1)
	public void Register() throws IOException, InterruptedException {
		r = new Register();
		r.registertest();
	}
	
	//@Test(priority=2)
	public void loginTest() throws IOException, InterruptedException {
		Login l = new Login();
		l.logintest();
	}

	//@Test(priority=3, dependsOnMethods={"Register"})
	public void Existingmail() throws IOException, InterruptedException {
		r = new Register();
		r.existing();

	}

	//@Test(priority=4)
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
	public void contactUs() throws InterruptedException {
		ContactUs c = new ContactUs();
		c.contactUs();
	}

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
}
