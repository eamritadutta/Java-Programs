public class ThisTester {
    private int dog = 4;
    
    public void printValues() {
        int dog = 3;
        
        System.out.println("The value of the dog field is: " + this.dog);
        System.out.println("The value of the dog private variable is: " + dog);
    }
    
    public static void main(String args[]) {
        ThisTester myTester = new ThisTester();
        myTester.printValues();
    }
}
