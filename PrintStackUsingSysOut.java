// prints in the format 

// [I, am, Amrita, and, I, will, make, it, big]

import java.util.Stack;

public class PrintStackUsingSysOut {
    public static void main(String[] args) {
	Stack<String> st = new Stack<String>();

	st.push("I");
	st.push("am");
	st.push("Amrita");
	st.push("and");
	st.push("I");
	st.push("will");
	st.push("make");
	st.push("it");
	st.push("big");

	// now try to print the sentence

	// this can be applied any type in Java
	// basically anything that derives from Object !
	System.out.println(st);
	System.out.println();
    }
}
