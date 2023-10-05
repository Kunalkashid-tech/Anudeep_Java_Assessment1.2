// Java program to demonstrate static variable.

package Anudeep_Java_Ass2.java;

public class Q6_Demonstrate_Static_Variable {

	// initializing static variable.
	static int var = 10;
	
	Q6_Demonstrate_Static_Variable(){
	
	// incrementing static value.	
	var++;
	
	// Print variable.
	System.out.println(var);
		
	}
	
	public static void main(String[] args) {
	
		// creating constructor objects single copy is shared by all objects.
		Q6_Demonstrate_Static_Variable sv1 = new Q6_Demonstrate_Static_Variable();
		Q6_Demonstrate_Static_Variable sv2 = new Q6_Demonstrate_Static_Variable();
		Q6_Demonstrate_Static_Variable sv3 = new Q6_Demonstrate_Static_Variable();
		
			
		
	}

}

/*
  Output :-
11
12
13
*/