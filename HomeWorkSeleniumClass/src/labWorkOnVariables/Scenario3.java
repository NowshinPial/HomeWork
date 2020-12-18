package labWorkOnVariables;

public class Scenario3 {
	
	static int a=20;
	String b="I am ";

	public static void main(String[] args) {

		//Scenario 3: Create two instance variables with different data types and use  their value in static and instance  methods.
		
		Scenario3 abc= new Scenario3();
		
		System.out.println(abc.b+" "+a);
		abc.instanceMethod();
	}
	
	public void instanceMethod () {
		
		System.out.println(a+b);
	}

}
