import java.util.Random;

public class RandomNumTester {
    public static void main(String[] args) {
	Random randGen = new Random();

	// get a random integer without specifying the range using the random num generator 'randGen'
	int rand1 = randGen.nextInt();
	System.out.println("The generated random number is: " + rand1);
	
	// generate a bounded random number
	// nextInt(n) generates a random number b/w 0(inc) and n(exclusive) !! 
	int rangeRand = randGen.nextInt(5);

	// expecting something b/w 0 and 4
	System.out.println("The random number b/w 0 and 5(exclusive) is: " + rangeRand);

	// to see the real magic put generate the random # within a loop
	// so as to see the array of generated random numbers !
	
	// 10 random Integers b/w 0 and 9
	int numOfRands = 10;
	for (int i = 0; i < numOfRands; i++) 
	    System.out.println("The generated random num # " + i + " is: " + randGen.nextInt(10));
    }
}
