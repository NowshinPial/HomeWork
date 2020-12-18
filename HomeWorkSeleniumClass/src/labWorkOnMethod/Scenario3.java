package labWorkOnMethod;

public class Scenario3 {

	public static void main(String[] args) {

		Scenario3 s3=new Scenario3();

		s3.instanceMethod4();
		staticMethod1(); 
		//Scenario 3. Create an instance method and call it from a static  method .
	}

	
	public static void staticMethod1() {
		
		Scenario3 s3=new Scenario3();
		
		s3.instanceMethod4();
		
	}
	
	public void instanceMethod4() {
		
		System.out.println("Call me instance Method from static Method maybe");
		
		
	}
}
