package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumActions {
	public WebDriver driver;
	public SeleniumActions(WebDriver driver) {
		this.driver = driver;
	}

	public List getElementsTextValues(List<WebElement> element) {
		List<String> list = new ArrayList();
		for(int i=0; i<element.size(); i++) {
			WebElement tab = element.get(i);
			String tabText = tab.getText();
			list.add(tabText);
			System.out.println(tabText);
		}
		
		return list;
	}
	
	public String getElementTextValue(WebElement element) {	
		return element.getText();
	}
}
