package javasessions;

public class MethodOverLoadingSession {

	public static void main(String[] args) {
		
		addition(234, 345, 2342);
		
	}
	
	public static void addition(int i, int j) {
		System.out.println("Method with two inputs");
	}
	
	public static void addition(int i, int j, int k) {
		System.out.println("Method with three inputs");
	}
}
