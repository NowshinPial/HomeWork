package labWorkOnVariables;

public class Scenario4 {
	
	 static String a="Earth radius is";
	 static double b=3958.8;

	public static void main(String[] args) {

		//Scenario 4: Create two static variables with different data types and use their value in a static method and in an instance method.
		
		Scenario4 s4= new Scenario4();
		
		System.out.println(a+" "+b);
		s4.InstanceMethod2();
	
		
	}
	
	public void InstanceMethod2() {
		
		if (b<=4000) {
			
			System.out.println("Radius of Earth is less than 4000");
		}
		else if (b>=4000) {
			System.out.println("Thats wrong information");
		}
		
	}

}
