package javasessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ListSession {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		list.add("Pavani");
		System.out.println(list);
		
		list.add("Teja");
		System.out.println(list);
		
		list.add("Sai");
		System.out.println(list);
		
		list.add(1, "TechSeedLabs");
		System.out.println(list);
		
		list.add(6);
		
		list.add(34);
		
		list.get(344);
		
		System.out.println(list.size());
		
		AccessModifiers accMod = new AccessModifiers();
		accMod.testMethod();
		
		
	}
}
