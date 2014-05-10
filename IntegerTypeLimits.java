public class IntegerTypeLimits {
    public static void main(String[] args) {
	int x = 2; 

	for (int i = 1; i <= 30; i++) {
	    x *= 2;
	}

	System.out.println("This is the value of 2 to the power 30: " + x);

	System.out.println("Max value of an integer in Java: " + Integer.MAX_VALUE);

	int res = (int) Math.pow(2, 30);
	System.out.println("The power of 2 calculated using Math.pow(...) is: " + res);
    }
}
