// tester for Stack.java

import java.util.Scanner;
import java.util.Iterator;

public class StackTester {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String[] input;
	Stack<String> stack = new Stack<String>();

	if (s.hasNextLine()) {
	    input = s.nextLine().split("\\s+");
	}
	else {
	    System.out.println("Input does not match the expected input. Terminating");
	    return;
	}
	for (int i = 0; i < input.length; i++) {
	    stack.push(input[i]);
	}

	// I can the for(:) since Stack<T> have implements Iterable<T> which comes
	// from java.lang.Iterable

	// using for (:) is a shorter version of the following
	
	System.out.println("Displaying the contents of the stack by using the stack's iterator...");
	System.out.println("The number of items in the stack is: " + stack.size());

	Iterator<String> stackIterator = stack.iterator();
	while(stackIterator.hasNext()) {
	    String content = stackIterator.next();
	    System.out.println(content);
	}
	
	System.out.println("Displaying the contents of the stack by using the for shortcut...");
	System.out.println("The number of items in the stack is: " + stack.size());
	
	for (String stackContent: stack) {
	    System.out.println(stackContent);
	}

	System.out.println("Now popping the contents of the stack...");
	while(!stack.isEmpty()) {
	    System.out.println("Popped "+stack.pop());
	}

	System.out.println("The number of items in the stack is: " + stack.size());
    }
}
