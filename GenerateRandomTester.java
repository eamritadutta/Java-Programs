import java.util.Scanner;

public class GenerateRandomTester {
    public static void main(String args[]) {
	
	int n = 0;
	System.out.println("Enter a number N to generate a random integer b/w 1 and N");

	Scanner s = new Scanner(System.in);
	if (s.hasNextInt())
	    n = s.nextInt();
	
	int randomNumber = GenerateRandom.uniform(n);

	System.out.println("The generated random number is: " + randomNumber);
    }
}
