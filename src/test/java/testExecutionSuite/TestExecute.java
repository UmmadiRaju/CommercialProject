package testExecutionSuite;

import java.io.IOException;

import org.testng.annotations.Test;
import basePack.BaseClass;

public class TestExecute extends BaseClass {
	@Test
	public void Testing() throws IOException, InterruptedException {
		TestScript test = new TestScript();
		//test.register();
	}  
}
