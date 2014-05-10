import java.util.Set;
import java.util.HashSet;

public class DelimitSentenceByWords {
    public static void main(String[] args) {
	StringBuilder str = new StringBuilder("iamastudent");
	String[] strings = {"from", "waterloo", "hi", "am", "yes", "i", "a", "student"};

	Set<String> dict = new HashSet<String>();
	for (String s : strings) {
	    dict.add(s);
	}
	String ret = "";
	boolean done = getSpacedString(ret, str, dict); 
	
	if (done) 
	    System.out.println(new String(ret));
    }

    public static boolean getSpacedString(String ret, StringBuilder str, Set<String> dict) {
	
	if (str == null) 
	    return true;

	for (int i = 1; i <= str.length(); i++) {
	    String sub = str.substring(0, i);
	    String rest = str.substring(i);
	    
	    String s = ret + " " + sub;
	    if (dict.contains(sub) && getSpacedString(s, new StringBuilder(rest), dict)) {
		ret += " " + sub;
		return true;
	    }
	}

	return false;
    }
}
