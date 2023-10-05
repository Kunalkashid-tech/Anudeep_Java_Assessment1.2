// Java program to find area of rectangle using constructor and two methods.

package Anudeep_Java_Ass2.java;

public class Q4_Rectangle_Area {

	double  length, breadth;
	
	// Creating parameterized constructor.
	public Q4_Rectangle_Area(double length, double breadth){
		
		// Using this keyword.
		this.length = length;
		this.breadth = breadth;
	}
	
	// Creating user defined method.
	public double  getArea() {
		
		return length * breadth;
		
	}
	
	
	public static void main(String[] args) {
		
		// Creating constructor object.
		 Q4_Rectangle_Area ra = new  Q4_Rectangle_Area(5, 4);

		 // Print area of rectangle.
		 System.out.println("Area of rectangle is : "+ra.getArea());
	}

}

/*
  Output :- 
  Area of rectangle is : 20.0
*/