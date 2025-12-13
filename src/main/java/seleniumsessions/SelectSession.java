package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelectSession {

	@Test
	public static void testMethod() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.google.com");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@aria-label='Day']")));
				
		
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		
		Select daySelect = new Select(day);
		Select monthSelect = new Select(month);
		
//		daySelect.selectByIndex(2);
		daySelect.selectByValue("29");
		
		monthSelect.selectByVisibleText("Dec");
		

		
	}
}
