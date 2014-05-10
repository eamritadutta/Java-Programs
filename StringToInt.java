import java.lang.Math;

public class StringToInt {
    public static void main(String[] args) {
	String input = "123";
	int res = 0;
	int p = input.length() - 1;

	for (int i=0; i<input.length(); i++)
	{
	    // for 0
	    // the char we get with input.charAt(0)
	    // is '1' with int value of 49
	    // so we have to do '1' - '0' i.e. 49 -48 to 
	    // get a real 1
	    
	    System.out.println("p: " + p); // 2, 1, 0
	    res += (input.charAt(i) - '0') * ((int)Math.pow(10, p--));
	    
	    System.out.println("int val: " + (input.charAt(i) - '0'));
	}

	System.out.println("The integer is: " + res);

	// verify by doing integer calculations on 'res'
	res ++;
	// should print 124
	System.out.println("The integer is: " + res);
    }
}
