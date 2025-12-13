package javasessions;

import org.testng.annotations.Test;

public class SwitchCase {

	@Test
	public void testMethod() {
		// Switch

		String switchName = "WashingMachine";

		switch (switchName) {
			case "Fan":
				System.out.println("Turn on the fan");
				break;
			case "Light":
				System.out.println("Turn on the light");
				break;
			case "TV":
				System.out.println("Turn on the TV");
				break;
			default:
				System.out.println("There is no matching switch - " + switchName);
		}
	}
}
