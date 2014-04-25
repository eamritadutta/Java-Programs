import java.util.LinkedList;
import java.util.Scanner;

public class ShuffleTester {
    public static void main(String args[]) {
	
	Scanner s = new Scanner(System.in);
	int n = -1;

	System.out.println("Enter a positive integer as the size of the array to shuffle");
	if (s.hasNextInt())
	    n = s.nextInt();

	if (n == -1) {
	    System.out.println("Incorrect input as the size of the array. Terminating....");
	    return;
	}
	String[] numbersToShuffle = new String[n];
	    
	int count = 0;
	while (count++ < n) {
	    if (s.hasNext())
		numbersToShuffle[count-1] = s.next();
	}
	
	//Shuffle shuffler = new Shuffle(numbersToShuffle);

	Shuffle.shuffleArray(numbersToShuffle);

	System.out.println("Shuffled contents are: ");
	for (int i = 0; i < numbersToShuffle.length; i++)
	    System.out.print(numbersToShuffle[i] + " ");
    }
}
