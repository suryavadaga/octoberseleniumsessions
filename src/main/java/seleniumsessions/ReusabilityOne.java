package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReusabilityOne {

	WebDriver webby;
	int listSize;
	List<String> textData = new ArrayList();
	List<String> webData = new ArrayList();

	@BeforeMethod
	public void setUp() {
		webby = new ChromeDriver();
		webby.get("https://www.google.com/");
		webby.manage().window().maximize();
	}

	@AfterMethod
	public void shutDown() {
		if (webby != null)
			webby.quit();
	}

	@Test
	public void findWebElements() {
		List<WebElement> eleList = webby
				.findElements(By.xpath("//div[@id = 'SIvCob']/a[starts-with(@href, 'https://')]"));
		webData = getText(eleList);
		showText(webData);
	}

	@Test
	public List<String> getText(List<WebElement> wb) {
		try {
			Thread.sleep(2000);
			listSize = wb.size();
			for (int i = 0; i < listSize; i++)
				textData.add(i, wb.get(i).getText());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (textData);
	}
	// @Test // Error at this point -- Error: Cannot inject @Test annotated Method
	// [showText] with [interface java.util.List, int].

	@Test
	public void showText(List st) {
		listSize = st.size();
		for (int i = 0; i < listSize; i++)
			System.out.println(st.get(i));
	}
}