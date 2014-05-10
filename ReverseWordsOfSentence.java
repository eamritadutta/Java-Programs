// class which reverses the position of words of a sentence

// lesson to learn: the length of the string does not include the '\n' at the end of the string

import java.util.*;

public class ReverseWordsOfSentence {
    
    public static void main(String args[]) {
	StringBuffer input;
	int start = 0, end = 0, length;
	
	Scanner s = new Scanner(System.in);
	if (s.hasNextLine()) {
	    input = new StringBuffer(s.nextLine());
	    // because array indexes start at 0
	    length = input.length() -1;
	}
	else {
	    System.out.println("Invalid input");
	    return;
	}
	System.out.println("The length of the input string is: " + length);
	reverseInPlace(input, start, length);
	
	while(end < length) {
	    // scanning the reversed string for a charcter which is not space
	    if (input.charAt(end) != ' ') {
		start = end;

		// increment end till we find a " "
		while(end < length && input.charAt(end) != ' ')
		    end++;

		end--;
		reverseInPlace(input, start, end);
	    }
	    end++;
	}
	System.out.println(input);
    }

    private static void reverseInPlace(StringBuffer input, int start, int end) {
	char temp;
	while (end > start) {
	    temp = input.charAt(start);
	    input.setCharAt(start++, input.charAt(end));
	    input.setCharAt(end--, temp); 
	}
	//System.out.println(input);
    }
} 
