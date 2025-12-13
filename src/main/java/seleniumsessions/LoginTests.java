package seleniumsessions;

import org.testng.annotations.Test;
import base.BaseClass;

public class LoginTests extends BaseClass{

	@Test
	public void testMethod() {
		driver.get("https://www.myntra.com");
	}
}
