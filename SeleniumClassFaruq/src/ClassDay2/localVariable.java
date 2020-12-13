package ClassDay2;

public class localVariable {

		
	public localVariable() {

		
	}
	
	public static void main(String[] args) {

		localVariable v1= new localVariable();
		v1.m1(35);
		
		
		
		
	}
	
	public void m1(int age) {
		
		int age1=35; /*it is local variable, and it is only local to m1 method.
		this variable have no control on any other methods in the class, like m2 or main */
		
				System.out.println(age1);
		
	}

}
