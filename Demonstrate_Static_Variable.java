// Java program to demonstrate static variable.

package Anudeep_Java_Ass2.java;

public class Demonstrate_Static_Variable {

	// initializing static variable.
	static int var = 10;
	
	Demonstrate_Static_Variable(){
	
	// incrementing static value.	
	var++;
	
	// Print variable.
	System.out.println(var);
		
	}
	
	public static void main(String[] args) {
	
		// creating constructor objects single copy is shared by all objects.
		Demonstrate_Static_Variable sv1 = new Demonstrate_Static_Variable();
		Demonstrate_Static_Variable sv2 = new Demonstrate_Static_Variable();
		Demonstrate_Static_Variable sv3 = new Demonstrate_Static_Variable();
		
			
		
	}

}

/*
  Output :-
11
12
13
*/