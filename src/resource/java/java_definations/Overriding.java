package java_definations;

class Overriding_father 
{
	String a="Father's class level variable";
	public void father_method()
	{
		System.out.println("Father'smethod is called of father class");
	}


}
public class Overriding extends Overriding_father
{
	String a="Son leve; variable called = Son's class level variable with same name as father varriable";
	 public void father_method()
		{
		 String  a="Mthod variable called = Method level variable with same name as class level variable";
			System.out.println("Sons's method with same name as father method is called");
			System.out.println("a = "+a);
			System.out.println("super.a = "+super.a);
			System.out.println("this.a = "+this.a);
			
			
		}
	 public void call_fathermethod()
	 {
		 System.out.println(" Father method with same name as son is called in sons xclass/ otrrerided father method is called");
		 super.father_method();
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(" In case of inharitance if both class have same method/ varible than father's /In harited class method/variale are overrided with son's methos/variable");
		 Overriding ob= new Overriding();
		 ob.father_method();
		 
		 
		 
	}


}

