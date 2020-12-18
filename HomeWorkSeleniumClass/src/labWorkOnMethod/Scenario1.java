package labWorkOnMethod;

public class Scenario1 {

	public static void main(String[] args) {

		//Scenario 1: Create an instance method and a static method in a class and call them from the main method.
		
		Scenario1 s1=new Scenario1 ();
		
		staticMouse1 ();
		s1.Mouse2();
		
	}

	
	public static void staticMouse1 () {
		
		System.out.println("Basic Mouse");
		System.out.println("I have wire");
		System.out.println("I am blue");
		
	}
	
	public void Mouse2 () {
		
		System.out.println("I have bluetooth");
		System.out.println("Rollerballllll");
		System.out.println("Laser pew pew pew");
	}
}
