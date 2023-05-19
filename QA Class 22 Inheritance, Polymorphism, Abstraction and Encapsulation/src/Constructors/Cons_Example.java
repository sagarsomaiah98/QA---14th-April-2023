package Constructors;

public class Cons_Example {
	String name="John";
	

	
	public Cons_Example() {
		
		System.out.println("Default Constructor");
		System.out.println(name);
	}
	public  Cons_Example(int a) {
		
		System.out.println(a);
		
	}
	public Cons_Example(double d) {
		
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		Cons_Example c = new Cons_Example(2.3);
		
		
		

	}

}
