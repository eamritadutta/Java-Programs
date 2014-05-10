import java.util.Comparator;

public class RevComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
	    
	if (Integer.valueOf(a) < Integer.valueOf(b))
	    return 1;
	else if (Integer.valueOf(a) == Integer.valueOf(b)) 
	    return 0;
	else
	    return -1;
    }
}
