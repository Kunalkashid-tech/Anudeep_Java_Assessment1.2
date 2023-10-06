// Java program to create methods constructor and check if two objects are overlapping.

package Anudeep_Java_Ass2.java;

public class Q7__Point_Comparing_Objects_If_Overlapping {

	int x, y;
	
	// create default constructor.
	public Q7__Point_Comparing_Objects_If_Overlapping() {
		
	// set value to 0.	
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
	
	// use this keyword.	
	this.x = x;
	
	}
	
	// creating method setY.
	public void setY(int y) {
	
	// use this keyword.
	this.y = y;
	
	}
	
	public void setXY(int x, int y) {
	
	// use this keyword.	
	this.x = x;
	this.y = y;
		
	}
	
	// create method to return value of x.
	public int getX() {
		
		return x;
	}
	
	// create method to return value of y.
	public int getY() {
		
		return y;
	}
	
	// creating method to return overlapping points.
	public boolean IsOverlapping(Q7__Point_Comparing_Objects_If_Overlapping pointlap) {
		
		return this.x == pointlap.x && this.y == pointlap.y;
	}
	public static void main(String[] args) {
		
		// creating constructor objects.
		Q7__Point_Comparing_Objects_If_Overlapping p1 = new Q7__Point_Comparing_Objects_If_Overlapping(1,2);
		Q7__Point_Comparing_Objects_If_Overlapping p2 = new Q7__Point_Comparing_Objects_If_Overlapping(4,1);
	
        // creating boolean variable to check overlapping points.	
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