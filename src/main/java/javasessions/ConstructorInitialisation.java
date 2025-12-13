package javasessions;

public class ConstructorInitialisation {

	public static void main(String[] args) {
		ConstructorSession cs = new ConstructorSession("Alekhya");
		ConstructorSession cs1 = new ConstructorSession("Teja");
		ConstructorSession cs2 = new ConstructorSession("Pavani");
		
		cs.methodOne();
		cs1.methodTwo();
		cs2.methodOne();
	}
}
