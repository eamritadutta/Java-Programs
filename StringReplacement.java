import java.util.Scanner;
import java.util.HashSet;
import java.io.File;

public class StringReplacement {
    public static void replace(StringBuilder inputStr, String[] chunks) {
	int i = 0;
	int start = 0;
	
	int chunkNumber = 0;
	
	String chunk = chunks[chunkNumber];
	String repBy = chunks[chunkNumber+1];
	
	int chunkChar = 0;
	
	// store all replaced indices so that we do not replace an already replaced index
	HashSet<Integer> replaced = new HashSet<Integer>();
	
	boolean misM = false;
	
	do {
	    if (chunk.charAt(chunkChar) == inputStr.charAt(i)) {
		int j = i;
		for (; i<= chunk.length(); i++) {
		    if (chunk.charAt(chunkChar++) != inputStr.charAt(i) ) {
			misM = true;
			break;
		    }
		}
		if (!misM) {
		    boolean canRep = true;
		    // check if not already replaced 
		    for (int k = start; k < start+repBy.length(); k++) {
			if (replaced.contains(new Integer(k)))
			    canRep = false;
		    }
		    if (canRep) {
			// we are ready to replace from start to i in 'inputStr' by chunk 
			inputStr.replace(start, start+repBy.length(), repBy);
			// add the replaced indices to 'replaced'
			for (int k = start; k < start+repBy.length(); k++) 
			    replaced.add(new Integer(k));
			
			repBy = chunks[chunkNumber+1+2];
			chunkNumber += 2;
			chunkChar = 0;
		    }
		    // could not replace already replaced, start matching the same chunk again
		    else {
			i = j+1;
			chunkChar = 0;
		    }	
		}
		// could not match, start matching the same chunk again
		else {
		    i = j+1;
		    chunkChar = 0;
		}		
	    }
	    // check next char of inputStr with 1st char of 'chunk'
	    else {
		i++;
	    }

	    // wrap around inputStr is we have chunks remaining
	    if (i == inputStr.length()) {
		i = 0;
		start = 0;
	    }

	} while (chunkNumber < chunks.length);
    }

    public static void main(String[] args) {
	String fileName = args[0];
	Scanner sc = new Scanner(System.in);
	try {
	    sc = new Scanner(new File(fileName));
	}
	catch (Exception e) {
	    System.out.println(e.getMessage());
	}
	
	while(sc.hasNextLine()) {
	    String[] input = sc.nextLine().split(";");
	    String[] chunks = input[1].split(",");
	    StringBuilder inp = new StringBuilder("");
	    if (input.length > 1 && !input[0].equals("")) 	
		inp = new StringBuilder(input[0]);
	    if (input.length > 1 && !input[0].equals("") && input[0].length() > 0 && chunks.length %2 == 0)
		replace(inp, chunks);
	}
	
    }
}
