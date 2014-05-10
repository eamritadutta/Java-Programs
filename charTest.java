public class charTest {
    public static void main (String[] args) {
	String s = "123";
	int count = 0;

	char c = s.charAt(0);
	System.out.println(Character.toString(c));

	c++;
	System.out.println(Character.toString(c));

	int i = s.charAt(0);
	// prints 49
	System.out.println("" + i);

	i++;
	// prints 50
	System.out.println("" + i);

	/*for (char i = 0; i < 300000; i++) {
	    //System.out.println("" + i);
	    count ++;
	}


	System.out.println(count);
	/*for (int i = 0; i < 256; i++) {
	    System.out.println(Integer.toString(i));
	    //System.out.print(s + i); 
	    }*/
    }
}
