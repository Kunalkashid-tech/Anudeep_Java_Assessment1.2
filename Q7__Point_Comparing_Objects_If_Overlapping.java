// Java program to create methods constructor and check if two objects are overlapping.

package Anudeep_Java_Ass2.java;

public class Q7__Point_Comparing_Objects_If_Overlapping {

	int x, y;
	
	// creating parameterized constructor.
	public Q7__Point_Comparing_Objects_If_Overlapping(int x, int y) {
		
	// using this keyword	
	this.x = x;
	this.y = y;
	
	}
	
	// creating method setX.
	public void setX(int x) {
		 
	System.out.println("value of x point is "+x);
	
	}
	
	// creating method setY.
	public void setY(int y) {
		
	System.out.println("value of y point is "+y);
	
	}
	
	public void setXY(int x, int y) {
		
	System.out.println("Value of x : "+x+" Value of y : "+y);
		
	}
	public static void main(String[] args) {
		
		Q7__Point_Comparing_Objects_If_Overlapping p1 = new Q7__Point_Comparing_Objects_If_Overlapping(1,2);
		Q7__Point_Comparing_Objects_If_Overlapping p2 = new Q7__Point_Comparing_Objects_If_Overlapping(4,1);
	
		// calling methods.
		p1.setX(1);
		p1.setY(2);
		p2.setXY(4, 1);
		
		// using if-else statement.
		if(p1 != p2) {
			System.out.println("Point is overlapping");
		} else {
			System.out.println("Error occured invalid point initialization");
		}
		
		
	}

}

/* 
  Output :-
value of x point is 1
value of y point is 2
Value of x : 4 Value of y : 1
Point is overlapping
*/