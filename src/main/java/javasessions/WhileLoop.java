package javasessions;

import org.testng.annotations.Test;

public class WhileLoop {

	@Test
	public void testSuccessfulLoginScenario() {
		int i = 1;
		
		while(i<10) {
			System.out.println(i);
			i=i+1;
		}
	}
}
