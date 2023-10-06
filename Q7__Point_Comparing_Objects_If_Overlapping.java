// Java program to create methods constructor and check if two objects are overlapping.

package Anudeep_Java_Ass2.java;

public class Q7__Point_Comparing_Objects_If_Overlapping {

	int x, y;
	
	public Q7__Point_Comparing_Objects_If_Overlapping() {
		
		x = 0;
		y = 0;
	}
	
	// creating parameterized constructor.
	public Q7__Point_Comparing_Objects_If_Overlapping(int x, int y) {
		
	// using this keyword	
	this.x = x;
	this.y = y;
	
	}
	
	// creating method setX.
	public void setX(int x) {
		 
	this.x = x;
	
	}
	
	// creating method setY.
	public void setY(int y) {
		
	this.y = y;
	
	}
	
	public void setXY(int x, int y) {
		
	this.x = x;
	this.y = y;
		
	}
	
	public int getX() {
		
		return x;
	}
	
	public int getY() {
		
		return y;
	}
	
	public boolean IsOverlapping(Q7__Point_Comparing_Objects_If_Overlapping pointlap) {
		
		return this.x == pointlap.x && this.y == pointlap.y;
	}
	public static void main(String[] args) {
		
		Q7__Point_Comparing_Objects_If_Overlapping p1 = new Q7__Point_Comparing_Objects_If_Overlapping(1,2);
		Q7__Point_Comparing_Objects_If_Overlapping p2 = new Q7__Point_Comparing_Objects_If_Overlapping(4,1);
	
		// calling methods.
		
		boolean overlapping = p1.IsOverlapping(p2);
		
		System.out.println("Point1 : "+p1.getX()+" , "+p1.getY());
		
		System.out.println("Point1 : "+p2.getX()+" , "+p2.getY());
		
		System.out.println("Is points are overlapping "+overlapping);
	}

}

/* 
  Output :-
value of x point is 1
value of y point is 2
Value of x : 4 Value of y : 1
Point is overlapping
*/