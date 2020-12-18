package labWorkOnMethod;

public class Scenario4 {


	public static void main(String[] args) {
		Scenario4 s4=new Scenario4();
		
		s4.Ins1();

		
		//Scenario 4. Create three instance methods and call the second and third method  from the first method .
		
		
	}
	
	public void Ins1 () {
		
		Scenario4 s4=new Scenario4();
		
		s4.Ins2();
		s4.Ins3();
		
	}
	
	public void Ins2 () {
		System.out.println("I am first");
	}
	
	public void Ins3 () {
		System.out.println("I am second");
		
	}

}
