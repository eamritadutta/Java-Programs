public class Interleave2strings {
    public static void main(String[] args) {
	StringBuilder str = new StringBuilder("    ");

	String s1 = new String("ab");
	String s2 = new String("12");

	int i1 = 0;
	int lenStr1 = s1.length();
	int i2 = 0;
	int lenStr2 = s2.length();

	interleave(s1, i1, lenStr1, s2, i2, lenStr2, str, 0);
    }

    public static void interleave(String s1, int i1, int len1, String s2, int i2, int len2, StringBuilder str, int indexFinalStr) {
	// base case of recursion
	if (i1 == len1 && i2 == len2) {
	    System.out.println(str);
	    return;
	}

	// if we have not reached end of s1
	if (i1 < len1) {
	    str.setCharAt(indexFinalStr, s1.charAt(i1));
	    interleave(s1, i1+1, len1, s2, i2, len2, str, indexFinalStr+1);
	}

	// if we have not reached end of s2
	if (i2 < len2) {
	    str.setCharAt(indexFinalStr, s2.charAt(i2));
	    interleave(s1, i1, len1, s2, i2+1, len2, str, indexFinalStr+1);
	}
    }
}
