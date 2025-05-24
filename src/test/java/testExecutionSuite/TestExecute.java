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
	
	//@Test(priority=2, dependsOnmethods={"Register"})
	public void Existingmail()throws IOException, InterruptedException {
		 r= new Register();
		 r.existing();
		
	}
	//@Test(priority=3)
	public void Testcasepage()throws IOException, InterruptedException{
		Testcasepage t=new Testcasepage();
		t. tpage();
		
	}
	//@Test(priority=4)
	public void categoryproducts()throws IOException, InterruptedException{
		categoryproducts cp =new categoryproducts();
		cp.cproducts();
		
	}
	//@Test(priority=5)
	public void scroll()throws IOException, InterruptedException{
		scroll s= new scroll();
		s.sc();
	}
	@Test(priority=6)
	public void sub_cart_page()throws IOException, InterruptedException{
		sub_cart_page c = new sub_cart_page();
		c.cp();
	}
	
}
