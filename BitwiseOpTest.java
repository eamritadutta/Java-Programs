import java.util.*;

public class BitwiseOpTest {
    public static void main(String args[]) {
	System.out.println("Enter a non-negative integer to test bitwise operations");
	Scanner s = new Scanner(System.in);
	int number = -1;
	if (s.hasNextInt())
	    number = s.nextInt();
	if (number < 0) {
	    System.out.println("Invalid input. Terminating...");
	    return;
	}
	int result = 1 << number;
	System.out.println("Left shifting 1 by " + number + " gives : " + result);
    }
}
