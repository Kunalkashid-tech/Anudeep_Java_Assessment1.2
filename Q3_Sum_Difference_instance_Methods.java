// Java program to create two instance variable and two instance method to find sum and difference.

package Anudeep_Java_Ass2.java;

public class Q3_Sum_Difference_instance_Methods {

	int a, b;
	
	// creating instance method sum.
	public int sum(int a, int b) {
		
		return  a + b;
	}
	
	// creating instance method diff.
	public int diff(int a, int b) {
		
		return  a - b;
	}
	
	public static void main(String[] args) {
	
		Q3_Sum_Difference_instance_Methods sd1 = new Q3_Sum_Difference_instance_Methods();
		
		System.out.println("Sum of two variable using instance method is :"+sd1.sum(1, 8));
		System.out.println("Difference between two variable using instance method is :"+sd1.diff(17, 8));
		
   
	}

}

/*
  Output :-
  Sum of two variable using instance method is :9
 Difference between two variable using instance method is :25
*/