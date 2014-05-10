import java.util.Stack;
import java.util.Iterator;

public class StackIteratorTest {
    public static void main(String[] args) {
	Stack<Integer> st = new Stack<Integer>();
	st.push(1);
	st.push(2);
	st.push(3);
	st.push(4);

	Iterator<Integer> it = st.iterator();
	while (it.hasNext())
	    System.out.print(it.next() + " ");
	System.out.println();

	int len = st.size();
	for (int i = len-1; i >= 0; i--) {
	    System.out.print(st.elementAt(i) + " ");
	}
	System.out.println();
    }
}
