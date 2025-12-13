package javasessions;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AccessModifiers {

	public static void main(String[] args) {
		testMethod();
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonObj = mapper.createObjectNode()
		                         .put("firstName", "Alekhya");

		String firstName = jsonObj.get("firstName").asText();
		System.out.println(firstName);
	}
	
	public static void testMethod() {
		System.out.println("Test Method");
	}
}
