// Java program to demonstrate  methods in string and string builder classes

package Anudeep_Java_Ass2.java;

public class Q8_Demonstrate_String_StringBuilder {

	public static void main(String[] args) {
		
		String str = "Hello Kunal!";
		String str1 = "Hello World!";
		
		// using length method.
		System.out.println("Length of string is : "+str.length());
		
		// using contains method.
		System.out.println("kunal is present in following string : "+str+" = "+str.contains("Kunal"));
		
		// using chartAt method.
		System.out.println("Character at position 6th in following string : "+str.charAt(6));
		
		// using equals method.
		System.out.println("Is strings are equal : "+str.equals(str1));
		
		// using compareTo method.
		System.out.println("Compare string difference : "+str.compareTo(str1));
		
		// using hashCode method.
		System.out.println("Hash code of string str : "+str.hashCode()+" Hash code of string str1 : "+str1.hashCode());
	
		// using toLowerCase method.
		System.out.println("Make string to lower case : "+str1.toLowerCase());
		
		// using toUppercase method.
		System.out.println("Make string to upper case : "+str.toUpperCase());
	
		// Initiate String Builder Class.
		
		StringBuilder sb = new StringBuilder("Hello");
		
		// using append method.
		System.out.println("Appending ',' to string : "+sb.append(", "));
		
		// using capacity method.
		System.out.println("Find string capacity : "+sb.capacity());
		
		// using append method to insert name in string.
		System.out.println("Append name to string : "+sb.append("Kunal"));
		
		// using indexOf method.
		System.out.println("Check indexOf string Kunal : "+sb.indexOf("Kunal"));
		
		// using delete method.
		System.out.println("Delete Hello in string : "+sb.delete(0, 7));
		
		// using reverse method.
		System.out.println("Reverse string : "+sb.reverse());
	}

}

/*
  Output :- 
Length of string is : 12
kunal is present in following string : Hello Kunal! = true
Character at position 6th in following string : K
Is strings are equal : false
Compare string difference : -12
Hash code of string str : -1307237920 Hash code of string str1 : -969099747
Make string to lower case : hello world!
Make string to upper case : HELLO KUNAL!
Appending ',' to string : Hello, 
Find string capacity : 21
Append name to string : Hello, Kunal
Check indexOf string Kunal : 7
Kunal
Reverse string : lanuK
*/
