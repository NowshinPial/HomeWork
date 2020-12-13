package ClassDay2;

public class StaticMethod {

	public static void main(String[] args) {
		
		//StaticMethod sm=new StaticMethod(); we do not need this cause it is static
		
		
		m2();
		m2("print string");
		
	}
		
///Any kind of static property direct connection

		public static void m2() {
			System.out.println("i am m2 ");
			}
		
		public static void m2(String name) {
			System.out.println("I am a string");
			
		}
	

}
