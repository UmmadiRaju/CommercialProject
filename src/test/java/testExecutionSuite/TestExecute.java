package testExecutionSuite;

import java.io.IOException;

import org.testng.annotations.Test;
import basePack.BaseClass;

public class TestExecute extends BaseClass {
	Register r;
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
	//@Test(priority=3)
	public void Testcasepage()throws IOException, InterruptedException{
		Testcasepage t=new Testcasepage();
		t. tpage();
		
	}
	
}
