package javasessions;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TryCatchBlock {
	@Test
	public void testMethod() {
		try {
			ConstructorSession cs = new ConstructorSession("Test");
			cs.methodOne();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();

			List<WebElement> tabList = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div/div/a"));

			for (int i = 0; i < tabList.size(); i++) {
				WebElement element = tabList.get(i);
				String tabText = element.getText();
				System.out.println(tabText);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	}
}
