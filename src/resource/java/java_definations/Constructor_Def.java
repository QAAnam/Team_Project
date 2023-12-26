package java_definations;

public class Constructor_Def
{ int a;
	public Constructor_Def() {
		System.out.println(" Constructor is called while creating the object ,mainly used to initilize elements");
		System.out.println(" Constructor have same methosd nme as class");
		a=10;
	}
	
	public void casualmethod() {
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		Constructor_Def ob = new Constructor_Def();
		
		ob.casualmethod();
		}

}
