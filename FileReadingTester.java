import java.util.ArrayList;
import java.util.Iterator;

public class FileReadingTester {
    public static void main(String[] args) {
	String fileName = args[0];
	FileReading fr = new FileReading(fileName);
	ArrayList<Integer> ints = fr.getNumbersFromFile();
	
	// use an iterator to print the numbers
	Iterator<Integer> it = ints.iterator();
	while (it.hasNext())
	    System.out.print(it.next() + " ");
	System.out.println();
    }
}
