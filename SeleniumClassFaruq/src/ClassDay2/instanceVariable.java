package ClassDay2;

public class instanceVariable {

	int age; //This is an instance variable
	
	public static void main(String[] args) {
		
		instanceVariable v2= new instanceVariable();//we create only for static method, instance variable method. 
		v2.faruq();
		v2.khaled(); //we can not call khaled method here because that method is private static
		
		
	//	age = 35; //we can not use this inside the static method because we declared age variable as an instance
		
	
		
	}
	
	private void faruq() {
		age = 35;
		System.out.println("faruq is " + age);
		
	
	}
	
	private static void khaled() {
		instanceVariable v3=new instanceVariable();
		v3.age=30;
		
		System.out.println("khaled's age is " + v3.age);
	}

}
