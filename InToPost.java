public class InToPost {
    private class StackX {
	private int maxSize;
	private char[] stackArray;
	private int top;

	private StackX(int s) {
	    maxSize = s;
	    stackArray = new char[maxSize];
	    top = -1;
	}
	
	public void push(char j) {
	    stackArray[++top] = j;
	}

	public char pop() {
	    return stackArray[top--];
	}

	public char peek() {
	    return stackArray[top];
	}

	public boolean isEmpty() {
	    return (top == -1);
	}

	public int size() {
	    return top+1;
	}
	
	public char peekN(int n) {
	    return stackArray[n];
	}

	public void displayStack(String s) {
	    System.out.print(s);
	    System.out.print("Stack (bottom -> top): ");
	    for (int j=0; j<size(); j++) {
		System.out.print(peekN(j));
		System.out.print(" ");
	    }
	    System.out.println();
	}
    }

    private StackX theStack;
    private String input;
    private String output= "";

    public InToPost(String in) {
	input = in;
	int stackSize = input.length();
	theStack = new StackX(stackSize);
    }

    public String doTrans() {
	for (int j=0; j<input.length(); j++) {
	    char ch = input.charAt(j);
	    theStack.displayStack("For " + ch + " ");
	
	    switch(ch) {
	    case '+':
	    case '-':
		gotOper(ch, 1);
		break;
	    case '*':
	    case '/':
		gotOper(ch, 2);
		break;
	    case '(':
		theStack.push(ch);
		break;
	    case ')':
		gotParen(ch);
		break;
	    default:
		output = output + ch;
		break;
	    }
	}
	while (!theStack.isEmpty()) {
	    theStack.displayStack("While ");
	    output = output + theStack.pop();
	}
	theStack.displayStack("End ");
	return output;
    }

    public void gotOper(char opThis, int prec1) {
	while (!theStack.isEmpty()) {
	    char opTop = theStack.pop();
	    if (opTop == '(') {
		theStack.push(opTop);
		break;
	    }
	    else {
		int prec2;
		if (opTop == '+' || opTop == '-')
		    prec2 = 1;
		else
		    prec2 = 2;
		
		if (prec2 < prec1) {
		    theStack.push(opTop);
		    break;
		}
		else 
		    output = output + opTop;
	    } 
	} // end of while
	theStack.push(opThis);
     }
    
    // for right parens viz. ')'
    public void gotParen(char ch) {
	while (!theStack.isEmpty()) {
	    char chx = theStack.pop();
	    if (chx == '(')
		break;
	    else // popped operator since the stack only contains operators and (
		output = output + chx;
	}
    }

    public static void main(String[] args) {
	String input="", output;
	while(true) {
	    System.out.println("Enter infix: ");
	    java.util.Scanner s = new java.util.Scanner(System.in);
	    if (s.hasNextLine())
		input = s.nextLine();
	    if (input.equals(""))
		break;
	    
	    InToPost theTrans = new InToPost(input);
	    output = theTrans.doTrans();
	    System.out.println("Postfix is " + output + "\n");
	}
    }
}
