package testExecutionSuite;

import java.io.IOException;

import org.testng.annotations.Test;
import basePack.BaseClass;

public class TestExecute extends BaseClass {
	@Test
	public void Login() throws IOException, InterruptedException {
		//TestScript test = new TestScript();
		//test.register();
		Login l = new Login();
		l.logintest();
		
	}  
}
