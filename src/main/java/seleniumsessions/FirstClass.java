package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javasessions.AccessModifiers;

public class FirstClass {

	@Test
	public void testMethod() {
		AccessModifiers accMod = new AccessModifiers();
		accMod.testMethod();	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		List<WebElement> myntraTabList = driver.findElements(By.xpath("//div[@class='desktop-navBars']/div/div/a"));		
		SeleniumActions actions = new SeleniumActions(driver);
		
		List<String> myntraTabTexts =  actions.getElementsTextValues(myntraTabList);	
		
		if(myntraTabTexts.contains("Men")) {
			System.out.println("IF");
		}
		
		List<WebElement> shopLinksList = driver.findElements(By.xpath("//div[@class='desktop-shopLinks']/a"));
		
		actions.getElementsTextValues(shopLinksList);
		
		String name = "Alekhya";
	}

}
