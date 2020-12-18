package AccessModifier;

public class testApp {

	public static void main(String[] args) {

		typesOfModifiers pm=new typesOfModifiers ();
		//you can call m1,m2,m3 using pm, however you can not access m4 
		
		pm.m3(7); //default access modifier, can be called here as this is a class in the same package
		
		pm.m2("Faruq");
		pm.m2("Nowshin");
	}
	

}

