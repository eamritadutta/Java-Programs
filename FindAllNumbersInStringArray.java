import java.util.*;
import java.lang.*;

public class FindAllNumbersInStringArray {
    public static void main(String args[]) {
	
	System.out.println("Enter a line of text");
	Scanner s = new Scanner(System.in);
	String inputString = "";
	if (s.hasNextLine())
	    inputString = s.nextLine();

	System.out.println("The entered input is: " + inputString);
	inputString.trim();
	String[] splitInput = inputString.split("\\s+");

	List<Number> numberList = new ArrayList<Number>();
	for (int i = 0; i < splitInput.length; i++) {
	    try{
		
		if (splitInput[i].startsWith("0x") | splitInput[i].startsWith("0X")) {
		    //numberList.add((Integer.decode(splitInput[i])).intValue());
		    numberList.add((Float.parseFloat(splitInput[i].substring(2))));
		}
		else if (splitInput[i].startsWith("0b") | splitInput[i].startsWith("0B")) {
		    String bin = splitInput[i].substring(2);
		    numberList.add(Integer.parseInt(bin, 2));
		}
		else if (splitInput[i].startsWith("0"))
		    numberList.add((Integer.decode(splitInput[i])).intValue());
		else if (splitInput[i].contains("."))
		    numberList.add(Float.parseFloat(splitInput[i]));
		else
		    numberList.add(Integer.parseInt(splitInput[i]));
	    }
	    catch (NumberFormatException nfe){
		System.out.println("Caught !!");
	    }
	}
	Iterator<Number> iterator = numberList.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
    }
}
