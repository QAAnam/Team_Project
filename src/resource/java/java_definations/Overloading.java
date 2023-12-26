package java_definations;

public class Overloading {
	
	public static void A()
	{
		System.out.println("I have noo arg");
		
	}
	public static void A(int a)
	{
		System.out.println("I have same name as above method but having different argument i.e why it is method overloading");
		
	}
	
	
	
	public static void main(String[] args) {
		A();
		A(1);
	}

}
