package labWorkOnMethod;

public class Scenario2 {


	public static void main(String[] args) {
		//Scenario 2. Create a static method and call it from an instance method .
	}

	
	public static void staticMethod () {
		
		System.out.println("I am a static method");
	}
	
	public void instanceMethod3() {
		
		staticMethod();
	}
}
