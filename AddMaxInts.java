public class AddMaxInts {
    public static void main(String[] args) {
	long res =  (long) Integer.MAX_VALUE +  (long) Integer.MAX_VALUE;

	//long res =  (long) 2147483646 + 10;
	
	System.out.println("The result of adding 2 max int values is: " + res);

	// auto type cast by the java compiler !! 
	int r = res;

	System.out.println("The result of adding 2 max int values is: " + r);
    }
}
