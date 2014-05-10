public class PrivateClassInJava {
    
    // a nested static class behaves just like a class declared in some other file ! 
    public static class ReturnClass {
	
	int x; 
	int y;

	public ReturnClass(int a, int b) {
	    x = a;
	    y = b;
	}

	//public void print
    }

    public static void main(String[] args) {
	called();
    }

    public static void called() {
	PrivateClassInJava pcj = new PrivateClassInJava();
	

	ReturnClass ret = new ReturnClass(-1, 1);

	System.out.println(ret.x);
	System.out.println(ret.y);

	/*ReturnClass ret2 = new ReturnClass(-100, 100);

	System.out.println(ret2.x);
	System.out.println(ret2.y);*/
    }
}
