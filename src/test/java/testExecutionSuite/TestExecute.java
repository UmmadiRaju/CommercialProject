package testExecutionSuite;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;
import basePack.BaseClass;

public class TestExecute extends BaseClass {
	Register r;
	Login l;
	Contact_us c;
	Subscription_homepage sh; 
	Subscription_cartpage sc;
	
	@Test(priority=1)
	public void Register() throws IOException, InterruptedException {
	 r = new Register();
		r.registertest();
	}
	
	@Test(priority=2)
	public void Existingmail()throws IOException, InterruptedException {
		 r= new Register();
		 r.existing();
		
	}
	
	@Test(priority=3)
	public void Testcasepage()throws IOException, InterruptedException{
		Testcasepage t=new Testcasepage();
		t. tpage();
	}
	
	@Test(priority=4)
	public void Login() throws InterruptedException, IOException {
		l = new Login();
		l.logintest();
	}
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
	
}
