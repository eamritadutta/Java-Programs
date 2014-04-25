public class AllPermutationsOfString {
    protected static char[] stringToPermute = new char[100];
    protected static int size;
    
    public static void findPermutations(int newSize) {
        if (newSize == 1)
            return;
        for (int i = 0; i < newSize; i++) {
            findPermutations(newSize - 1);
            
            if (newSize == 2) {
                displayWord();
            }
            
            rotate(newSize);
        }    
    }
    
    public static void rotate(int newSize) {
        int j;
        int position = size-newSize;
        char temp = stringToPermute[position];
        
        for (j=position+1; j<size; j++)
            // shifting to left by one
            stringToPermute[j-1] = stringToPermute[j];
        stringToPermute[j-1] = temp;
    }
    
    public static void displayWord() {
        System.out.println("---");
	for (int j=0; j<size; j++)
            System.out.print(stringToPermute[j]);
	System.out.println("\n---");
    }
    
    public static void main(String args[]) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String inputString = "";
        if (scanner.hasNext())
             inputString = scanner.next();
        size = inputString.length();
               
        for (int i =0; i<size ; i++) {
            stringToPermute[i] = inputString.charAt(i);        
        }
        
        findPermutations(size);
    }
}
