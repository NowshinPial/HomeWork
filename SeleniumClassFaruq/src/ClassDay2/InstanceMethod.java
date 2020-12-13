package ClassDay2;

public class InstanceMethod {

	public static void main(String[] args) {
		
		InstanceMethod ins = new InstanceMethod();
		ins.m1();
		ins.m1(25);
		ins.m1(25, "DHAKA");
		
		
	
	}
	
	
	///This is called method overloading, same method name "m1" but different parameter argument
	//Method Signature = method name + parameter argument
	
	public void m1() {
		System.out.println("i am m1 with 0 argument");
	}
	
	public void m1(int age) {
		System.out.println("I am m1 with 1 argument");
		
	}
	
	public void m1(int age, String city) {
		System.out.println("I am m1 with 2 argument");
		
	}
	
	
}
