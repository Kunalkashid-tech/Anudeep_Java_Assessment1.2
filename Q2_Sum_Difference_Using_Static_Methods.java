// Java program to find sum and difference of two numbers using static methods.

package Anudeep_Java_Ass2.java;

public class Q2_Sum_Difference_Using_Static_Methods {

	// creating static method sum.
	static int sum(int a, int b) {
		
		return a + b; 
	}
	
	// creating static method diff.
	static int diff(int a, int b) {
		
		return a - b;
	}
	
	public static void main(String[] args) {
	
		Q2_Sum_Difference_Using_Static_Methods sd= new Q2_Sum_Difference_Using_Static_Methods();
		
		// Print sum and difference.
		System.out.println("Sum of two number is : "+sd.sum(6,3));
		System.out.println("Difference between to number is : "+sd.diff(18, 9));
	}

}
