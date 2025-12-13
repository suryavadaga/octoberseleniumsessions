package javasessions;

public class ConstructorSession {
	//Constructor is a method which has same name as class name
	//A constructor will not have a return type
	String name;
	
	public ConstructorSession(String studentName) {
		this.name = studentName;
	}

	public void methodOne() {
		System.out.println(name);
	}
	
	public void methodTwo() {
		System.out.println(name);
	}
	
	public void methodThree() {
		System.out.println(name);
	}
}
