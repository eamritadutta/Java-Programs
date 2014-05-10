import java.io.*;

public class stringInput {
    public static String getString() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);

    BufferedReader br = new BufferedReader(isr);

    String s = br.readLine();
    return s;
    }

    public static void main(String[] args) {
	String str="";
	System.out.print("Enter your name: ");
	try{
	str = getString();
	}
	catch(IOException e){
	    System.out.println("Exception Occured !!");
	    //exit(0);
	}
	System.out.println("Your name is: " + str);
	}
}
