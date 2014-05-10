public class FindMedianTester {
    public static void main(String[] args) {
	FindMedian fm = new FindMedian();

	fm.insert(5);
	fm.insert(15);
	fm.insert(2);
	fm.insert(17);
	fm.insert(9);
	fm.insert(12);
	fm.insert(4);

	// 2 4 5 9 12 15 17

	System.out.println("The median is: " + fm.getMedian());
    }
}
