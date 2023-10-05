// Java program to increase employee salary by percentage.

package Anudeep_Java_Ass2.java;

public class Q5_Employee_Salary_Increment {

	    int eid;
	    String ename;
	    double salary;
	
	    // creating parameterized constructor.
	public Q5_Employee_Salary_Increment(int eid, String ename, double salary) {
		
		// Using this keyword.
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	    // creating user defined method to increase salary percentage.
	public void increaseSalary(double percent) {
		
		double increasePercent = (percent / 100) * salary;
		salary = salary + increasePercent;
	}
	
	    // creating method to display1 previous salary.
	public void display1() {
		
		System.out.println("Previous employee salary detail :");
		System.out.println("\n Employee id is : "+eid+"\n Employee name is : "+ename+"\n Previous Salary is : "+salary);
	}
	
	    // creating method to display2 increment salary.
	public void display2() {
	
		System.out.println("\nIncrement in employee salary detail :");
		System.out.println("\n Employee id is : "+eid+"\n Employee name is : "+ename+"\n Increase Salary is : "+salary);
	    
    }
	
	public static void main(String[] args) {
		
		Q5_Employee_Salary_Increment esi1 = new Q5_Employee_Salary_Increment(101, "Kunal", 50000);
		
		// calling methods through constructor objects.
		esi1.display1();
		esi1.increaseSalary(10.0);
		esi1.display2();
		
	}

}


/*
  Output :-
  Previous employee salary detail :
 
  Employee id is : 101
  Employee name is : Kunal
  Previous Salary is : 50000.0

  Increment in employee salary detail :

  Employee id is : 101
  Employee name is : Kunal
  Increase Salary is : 55000.0
*/
