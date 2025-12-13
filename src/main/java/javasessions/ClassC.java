package javasessions;

public class ClassC {
	public static void main(String[] args) {
		//ParentClass objName = new ParentClass();
		ClassA classA = new ClassA();
		classA.commonMethod();
		
		//ChildClass objName = new ChildClass();
		ClassB classB = new ClassB();
		classB.commonMethod();
		
		//ParentClass objName = new ChildClass();
		
		//Shopping mall - Common place - Common/Same Method
		//Parent Child 
		//Override
		ClassA classAB = new ClassB();
		classAB.commonMethod();
	}
}
