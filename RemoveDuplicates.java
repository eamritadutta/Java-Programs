import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
	StringBuilder str = new StringBuilder("google goes to golla   ");
	int len = str.length();
	Map<Character, Integer> uniqueChars = new HashMap<Character, Integer>();

	for (int i=0; i<len;) {
	    if (uniqueChars.containsKey(str.charAt(i))) {
		    // remove char from str    
		    str.deleteCharAt(i);
		    len = str.length();
	    } else {
		    uniqueChars.put(str.charAt(i), 1);
		    i++;
	    }
	}

	    System.out.println("String with only unique chars is: " + str);
    }
}
