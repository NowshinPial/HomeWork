package AccessModifier;


public class typesOfModifiers {

	public static void main(String [] args) {
		typesOfModifiers pm=new typesOfModifiers ();
		pm.m4(20);
		pm.m3(5);
	}

	

	public void m1(long salary) {
		if (salary >=30000l) {
			System.out.println("keep working");/*we are using L after 30000, we can use L when we are using long data type
												this is because long is a very long digit
												so we are saying that this digit in the future can go bigger than this*/
			
		}

	}
	
///Protected access modifier
	protected static void m2(String name) {

		if (name.equalsIgnoreCase("Faruq")) {
			System.out.println("Lets connect");
			}
		else
		{
			System.out.println("Do not connect");
		}
	}

	 void m3(int n) {
		 for (int i= 0; i < n; i++) {
			 System.out.println(n);
		 }

	}
	 
///Default access modifier
	private void m4(int age) {
		if (age >= 18) {
			System.out.println("yes you can vote");
		}

	}

}

