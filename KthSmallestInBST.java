public class KthSmallestInBST {
    
    private static class Node {
	Node left; 
	Node right; 
	int val;

	// const
	public Node(int val, Node left, Node right) {
	    this.left = left; 
	    this.right = right;
	    this.val = val;
	}
    }

    public static findKthSmallest(Node root, int k) {
	if (k == 0 || root == null) {
	    return;
	}
    }

    public static void main(String[] args) {
	// create a tree with 5 nodes !! 
	Node two = new Node(2, null, null);
	Node one = new Node(1, null, null);

	Node three = new Node(3, one, two);

	Node seven = new Node(7, null, null);

	Node five = new Node(5, three, seven);

	// find ith smallest in each iteration
	for (int i=1; i<=5; i++) {
	    Node ret = findKthSmallest(five, i);
	    System.out.println("The " + i + "th smallest node in BST is: " + ret.val);
	}
    }
}
