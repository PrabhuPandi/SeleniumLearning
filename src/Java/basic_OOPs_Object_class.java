package Java;

import java.util.Scanner;

public class basic_OOPs_Object_class {
	
	int i;
	String s;
	
	public static void main(String[] args) throws Throwable {
		
		// Create an object
		basic_OOPs_Object_class obj1= new basic_OOPs_Object_class();
		System.out.println(obj1);
		// basic_OOPs_Object_class
		
		obj1.i=200;
		
		Scanner sci = new Scanner(System.in);
		System.out.println("Enter the value "+sci.nextLine());
		System.out.println(obj1.s);
		
		System.out.println(obj1.i);
			
		System.out.println(obj1.toString());
		
		System.out.println(obj1.hashCode());
		
		System.out.println(obj1.getClass());
		
		obj1.finalize();
		
		System.out.println(obj1.s);
		
		System.out.println(obj1.i);
		
		
	}

}
