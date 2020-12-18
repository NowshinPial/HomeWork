package ClassDay2;

import AccessModifier.typesOfModifiers;

public class testingAcsModifier extends typesOfModifiers{
	
	public static void main (String[] args) {

		// TODO Auto-generated method stub
///This is a class in a different package, I am going to call different type of methods with different access modifier
		
		typesOfModifiers pm=new typesOfModifiers ();
		
		pm.m1(); //I can only access m1 which is public Access modifier
		
		/*Protected access modifier method can be accessed by 
		 * a subclass of the AccessModifier package. We can create
		 * this subclass relationship by inheritance. For this we
		 * use the word "extends" and the class name to become a subclass of the typesOfModifier class*/
		
		

	}
	
	public void nowshin() {
	//ypesOfModifiers pm=new typesOfModifiers();
		typesOfModifiers.m2("Nowshin");
		typesOfModifiers.m2("Faruq");
	
	}
}

