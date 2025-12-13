package javasessions;

public class ClassB extends ClassA{
	
	public static void main(String[] args) {
//		ClassA classA = new ClassA();
//		classA.methodA();
		methodA();
	}

	public static void methodB() {
		System.out.println("Method B");
	}
	
	//static - fixed - Non-access modifier
	public void commonMethod() {
		System.out.println("Common Method In Class B");
	}
}
