package ClassDay2;

public class staticVariable {

	int age; //This is an instance variable
	
	static String LastName = "MOLLA"; //This is a static variable cause we declared it as a static. 
	
	public static void main(String[] args) {
		
		staticVariable v2= new staticVariable();//we create only for static method, instance variable method. 
		v2.faruq();
		v2.khaled(); //we can not call khaled method here because that method is private static
		
		
	//	age = 35; //we can not use this inside the static method because we declared age variable as an instance
		
		//Using our static variable
		System.out.println(LastName);

	
		
	}
	
	private void faruq() {
		age = 35;
		System.out.println("faruq is " + age);
		
		/*We declare static variable on instance method. As it is static, you do not need to 
		use a reference */
		
		System.out.println(LastName);
		
		
		
	
	}
	
	private static void khaled() {
		staticVariable v3=new staticVariable();
		v3.age=30;
		
		System.out.println("khaled's age is " + v3.age);
		
		//Static variable
		System.out.println(LastName);

	}

}
