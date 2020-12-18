package Constructor;

public class returnType {

	static String companyName;//contructopr wont generate for this as this is a static variable
	
	public returnType(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	int salary;
	String name;

	returnType(){};
	
	public static void main (String[] args) {
		returnType d=new returnType();
		if (d.m2()==50) {
			System.out.println("Hello return");
			
		}
		
	//	if (d.m1()*50) //this will always throw an error because the return type of m1 method i
		
		if (d.m2()==60) {
			System.out.println("return type");
		}
		
		
	}
	//This is a void type method, so you can write anything inside the void method, and can not use it anywhere else
	public void m1() {
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);

	}
	
	///We here are using a return method, thats why we need to have return at the end. You can take this method and use it anywhere else
	public int m2() {
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
		return c;
	}
}



//Constructor name and class name must be same. Method calling and etc. acts exactly like constructor. However, constructor have few different rules
/*1. Constructor works only with instance properties, so here we wont be able to use static string companyName for constructor
 * To generate constructor, select the variables, after that do right click and then go to source and create constructor for field
 * Select variables--> right click--> source--> create constructor
 *2.  Constructor doesnt have any return type. */


