package Constructors;

public class Cons_Eg1 {
	String name;
	
	public Cons_Eg1(String name) {
		
		this.name=name;
		
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		Cons_Eg1 c1 = new Cons_Eg1("Mark");
	    
		System.out.println(c1.name);

	}

}
