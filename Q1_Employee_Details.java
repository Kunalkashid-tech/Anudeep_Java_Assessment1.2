// Java program to create string name and integer id variable and create two objects and initialize with details.

package Anudeep_Java_Ass2.java;

public class Q1_Employee_Details {

	// creating variables integer and string.
	int eid;
	String ename;
	
	//creating parameterized constructor.
	Q1_Employee_Details(int eid,  String ename){
		
		// Using this keyword to refer constructor variables.
		this.eid = eid;
		this.ename = ename;
	}
	
	// User define method to display employee information.
	public void display() {
		
	System.out.println("Employee Id is : "+eid+" Employee Name is : "+ename);
	
	}
	
	public static void main(String[] args) {
	
		// Initializing constructor variables. 
		Q1_Employee_Details e1 = new Q1_Employee_Details(101, "Kunal");
		Q1_Employee_Details e2 = new Q1_Employee_Details(102, "Sagar");
		
		// calling display method.
		e1.display();
		e2.display();

	}

}

/*
  Output :-
  Employee Id = 101 Employee Name = Kunal
  Employee Id = 102 Employee Name = Sagar
*/
