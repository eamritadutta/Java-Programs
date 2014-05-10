public class Suffix {
    public static void main(String[] args) {
	String str = "the best";

	String[] substrings = new String[str.length()];
	for (int i =0; i< str.length(); i++) {
	    substrings[i] = str.substring(i);
	}

	for (String s : substrings) 
	    System.out.println(s);
    }
}
