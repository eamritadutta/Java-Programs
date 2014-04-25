public class ConvertNumberToDecimalEquivalent {
    private int base = 0;
    private char[] arrayOfDigits = new char[100];

    //public ConvertNumberToDecimalEquivalent(char[] arrayOfDigits) {
	//this.arrayOfDigits = arrayOfDigits;
    //}

    public static void main(String args[]) {
	String input = "";
	java.util.Scanner s = new java.util.Scanner(System.in);
	// to only read 1 token from input stream
	if (s.hasNext())
	    input = s.next();

	System.out.println("The entered inpput is: "+ input);
    }
}
