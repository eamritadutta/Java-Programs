// this program is written to boost my confidance for dealing with strings in java

// per me, the most imp methods of StringBuffer are: 

// deleteCharAt(int index, char ch)
// setCharAt(int index, char ch)
// charAt(int index)

// insert(int index, string str)

import java.util.Scanner;
import java.io.BufferedInputStream;

public class ReverseSentence {
    public static void main (String[] args) {
	System.out.println("Enter a string");
	// how to read c/l input in java
	Scanner sc = new Scanner(new BufferedInputStream(System.in));
	StringBuffer str = null;
	try {
	    if (sc.hasNextLine()) {
		str = new StringBuffer(sc.nextLine());
		reverse(str);
		//System.out.println(str);
	    }
	}
	catch(Exception e) {
	    System.out.println("Unable to process input");
	}
    }
    
    public static void reverse(StringBuffer str) {
	// str = amrita dutta;
	// basic string buffer tests
	
        // add my last name "poddar" to it 
	int len = str.length();
	str = str.insert(len, " poddar");
	System.out.println("The string after inserting new string is: " + str);

	// set some chars in string buffer to xxxx
	// here 4 and 5 are both inclusive => unlike in substring
	str = str.insert(4, "xx");
	System.out.println("The string after inserting xx is: " + str);
	
	// testing delete for StringBuffer 
	
	// deletes till end if the end index > length of string
	// 100 is exclusive, just like substring....
	str = str.delete(4, 100);
	System.out.println("The string after deleting xx is: " + str);
	
    }
}
