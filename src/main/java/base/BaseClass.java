package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver(); // one test case instance 9349132741238479kasfnkashiouwof
		driver.manage().window().maximize();
		//adfa
		//adfafa	
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}
